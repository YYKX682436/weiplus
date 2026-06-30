package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzzq */
/* loaded from: classes13.dex */
public abstract class AbstractC2403x394e77<MessageType extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2403x394e77<MessageType, BuilderType>, BuilderType> extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2381x394e5c<MessageType, BuilderType> {

    /* renamed from: zzbsa */
    private static java.util.Map<java.lang.Object, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2403x394e77<?, ?>> f7241x6f026f0 = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: zzbry */
    protected com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2154x6f0212a f7242x6f026e9 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2154x6f0212a.m18881x394ddc();

    /* renamed from: zzbrz */
    private int f7243x6f026ea = -1;

    /* renamed from: com.google.android.gms.internal.measurement.zzzq$zza */
    /* loaded from: classes13.dex */
    public static abstract class zza<MessageType extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2403x394e77.zza<MessageType, BuilderType>, BuilderType> extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2403x394e77<MessageType, BuilderType> implements com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2130x6f0210d {

        /* renamed from: zzbsb */
        protected com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2399x394e73<java.lang.Object> f7244x6f026f1 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2399x394e73.m19395x394db5();
    }

    /* renamed from: com.google.android.gms.internal.measurement.zzzq$zzb */
    /* loaded from: classes13.dex */
    public enum zzb {

        /* renamed from: zzbsc */
        private static final int f7245x6f026f2 = 1;

        /* renamed from: zzbsd */
        private static final int f7246x6f026f3 = 2;

        /* renamed from: zzbse */
        public static final int f7247x6f026f4 = 3;

        /* renamed from: zzbsf */
        private static final int f7248x6f026f5 = 4;

        /* renamed from: zzbsg */
        private static final int f7249x6f026f6 = 5;

        /* renamed from: zzbsh */
        public static final int f7250x6f026f7 = 6;

        /* renamed from: zzbsi */
        public static final int f7251x6f026f8 = 7;

        /* renamed from: zzbsj */
        private static final /* synthetic */ int[] f7252x6f026f9 = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: zzbsk */
        public static final int f7253x6f026fa = 1;

        /* renamed from: zzbsl */
        private static final int f7254x6f026fb = 2;

        /* renamed from: zzbsm */
        private static final /* synthetic */ int[] f7255x6f026fc = {1, 2};

        /* renamed from: zzbsn */
        private static final int f7256x6f026fd = 1;

        /* renamed from: zzbso */
        private static final int f7257x6f026fe = 2;

        /* renamed from: zzbsp */
        private static final /* synthetic */ int[] f7258x6f026ff = {1, 2};
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

    public static <T extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2403x394e77<?, ?>> T zzf(java.lang.Class<T> cls) {
        T t17 = (T) f7241x6f026f0.get(cls);
        if (t17 == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                t17 = (T) f7241x6f026f0.get(cls);
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

    /* renamed from: equals */
    public boolean m19406xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (((com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2403x394e77) zza(6, (java.lang.Object) null, (java.lang.Object) null)).getClass().isInstance(obj)) {
            return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2137x6f02114.m18856x394dcf().zzt(this).mo18848xb2c87fbf(this, (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2403x394e77) obj);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m19407x8cdac1b() {
        int i17 = this.f7205x6f026c5;
        if (i17 != 0) {
            return i17;
        }
        int mo18849x8cdac1b = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2137x6f02114.m18856x394dcf().zzt(this).mo18849x8cdac1b(this);
        this.f7205x6f026c5 = mo18849x8cdac1b;
        return mo18849x8cdac1b;
    }

    /* renamed from: toString */
    public java.lang.String m19408x9616526c() {
        return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2131x6f0210e.zza(this, super.toString());
    }

    public abstract java.lang.Object zza(int i17, java.lang.Object obj, java.lang.Object obj2);
}
