package com.google.android.gms.dynamic;

/* loaded from: classes13.dex */
public abstract class RemoteCreator<T> {
    private final java.lang.String zza;
    private java.lang.Object zzb;

    /* loaded from: classes13.dex */
    public static class RemoteCreatorException extends java.lang.Exception {
        public RemoteCreatorException(java.lang.String str) {
            super(str);
        }

        public RemoteCreatorException(java.lang.String str, java.lang.Throwable th6) {
            super(str, th6);
        }
    }

    public RemoteCreator(java.lang.String str) {
        this.zza = str;
    }

    public abstract T getRemoteCreator(android.os.IBinder iBinder);

    public final T getRemoteCreatorInstance(android.content.Context context) {
        if (this.zzb == null) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
            android.content.Context remoteContext = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext == null) {
                throw new com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException("Could not get remote context.");
            }
            try {
                this.zzb = getRemoteCreator((android.os.IBinder) remoteContext.getClassLoader().loadClass(this.zza).newInstance());
            } catch (java.lang.ClassNotFoundException e17) {
                throw new com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException("Could not load creator class.", e17);
            } catch (java.lang.IllegalAccessException e18) {
                throw new com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException("Could not access creator.", e18);
            } catch (java.lang.InstantiationException e19) {
                throw new com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException("Could not instantiate creator.", e19);
            }
        }
        return (T) this.zzb;
    }
}
