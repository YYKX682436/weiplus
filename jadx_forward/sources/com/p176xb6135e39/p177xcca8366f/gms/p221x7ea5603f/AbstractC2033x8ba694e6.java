package com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f;

/* renamed from: com.google.android.gms.dynamic.RemoteCreator */
/* loaded from: classes13.dex */
public abstract class AbstractC2033x8ba694e6<T> {
    private final java.lang.String zza;
    private java.lang.Object zzb;

    /* renamed from: com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException */
    /* loaded from: classes13.dex */
    public static class RemoteCreatorException extends java.lang.Exception {
        public RemoteCreatorException(java.lang.String str) {
            super(str);
        }

        public RemoteCreatorException(java.lang.String str, java.lang.Throwable th6) {
            super(str, th6);
        }
    }

    public AbstractC2033x8ba694e6(java.lang.String str) {
        this.zza = str;
    }

    /* renamed from: getRemoteCreator */
    public abstract T mo18399x19672150(android.os.IBinder iBinder);

    /* renamed from: getRemoteCreatorInstance */
    public final T m18686xf09ca05(android.content.Context context) {
        if (this.zzb == null) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(context);
            android.content.Context m17676x14cfd6d3 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17676x14cfd6d3(context);
            if (m17676x14cfd6d3 == null) {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.AbstractC2033x8ba694e6.RemoteCreatorException("Could not get remote context.");
            }
            try {
                this.zzb = mo18399x19672150((android.os.IBinder) m17676x14cfd6d3.getClassLoader().loadClass(this.zza).newInstance());
            } catch (java.lang.ClassNotFoundException e17) {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.AbstractC2033x8ba694e6.RemoteCreatorException("Could not load creator class.", e17);
            } catch (java.lang.IllegalAccessException e18) {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.AbstractC2033x8ba694e6.RemoteCreatorException("Could not access creator.", e18);
            } catch (java.lang.InstantiationException e19) {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.AbstractC2033x8ba694e6.RemoteCreatorException("Could not instantiate creator.", e19);
            }
        }
        return (T) this.zzb;
    }
}
