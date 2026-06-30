package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
public abstract class zzzq<MessageType extends com.google.android.gms.internal.measurement.zzzq<MessageType, BuilderType>, BuilderType> extends com.google.android.gms.internal.measurement.zzyu<MessageType, BuilderType> {
    private static java.util.Map<java.lang.Object, com.google.android.gms.internal.measurement.zzzq<?, ?>> zzbsa = new java.util.concurrent.ConcurrentHashMap();
    protected com.google.android.gms.internal.measurement.zzabk zzbry = com.google.android.gms.internal.measurement.zzabk.zzuq();
    private int zzbrz = -1;

    /* loaded from: classes13.dex */
    public static abstract class zza<MessageType extends com.google.android.gms.internal.measurement.zzzq.zza<MessageType, BuilderType>, BuilderType> extends com.google.android.gms.internal.measurement.zzzq<MessageType, BuilderType> implements com.google.android.gms.internal.measurement.zzaam {
        protected com.google.android.gms.internal.measurement.zzzm<java.lang.Object> zzbsb = com.google.android.gms.internal.measurement.zzzm.zzti();
    }

    /* loaded from: classes13.dex */
    public enum zzb {
        private static final int zzbsc = 1;
        private static final int zzbsd = 2;
        public static final int zzbse = 3;
        private static final int zzbsf = 4;
        private static final int zzbsg = 5;
        public static final int zzbsh = 6;
        public static final int zzbsi = 7;
        private static final /* synthetic */ int[] zzbsj = {1, 2, 3, 4, 5, 6, 7};
        public static final int zzbsk = 1;
        private static final int zzbsl = 2;
        private static final /* synthetic */ int[] zzbsm = {1, 2};
        private static final int zzbsn = 1;
        private static final int zzbso = 2;
        private static final /* synthetic */ int[] zzbsp = {1, 2};
    }

    public static java.lang.Object zza(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.lang.RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e17);
        } catch (java.lang.reflect.InvocationTargetException e18) {
            java.lang.Throwable cause = e18.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static <T extends com.google.android.gms.internal.measurement.zzzq<?, ?>> T zzf(java.lang.Class<T> cls) {
        T t17 = (T) zzbsa.get(cls);
        if (t17 == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                t17 = (T) zzbsa.get(cls);
            } catch (java.lang.ClassNotFoundException e17) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e17);
            }
        }
        if (t17 != null) {
            return t17;
        }
        java.lang.String name = cls.getName();
        throw new java.lang.IllegalStateException(name.length() != 0 ? "Unable to get default instance for: ".concat(name) : new java.lang.String("Unable to get default instance for: "));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (((com.google.android.gms.internal.measurement.zzzq) zza(6, (java.lang.Object) null, (java.lang.Object) null)).getClass().isInstance(obj)) {
            return com.google.android.gms.internal.measurement.zzaat.zzud().zzt(this).equals(this, (com.google.android.gms.internal.measurement.zzzq) obj);
        }
        return false;
    }

    public int hashCode() {
        int i17 = this.zzbqt;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.google.android.gms.internal.measurement.zzaat.zzud().zzt(this).hashCode(this);
        this.zzbqt = hashCode;
        return hashCode;
    }

    public java.lang.String toString() {
        return com.google.android.gms.internal.measurement.zzaan.zza(this, super.toString());
    }

    public abstract java.lang.Object zza(int i17, java.lang.Object obj, java.lang.Object obj2);
}
