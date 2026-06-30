package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzabz */
/* loaded from: classes16.dex */
public final class C2169x6f02139<M extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138<M>, T> {
    public final int tag;

    /* renamed from: type */
    private final int f6386x368f3a;

    /* renamed from: zzbwx */
    protected final java.lang.Class<T> f6387x6f02783;

    /* renamed from: zzbwy */
    protected final boolean f6388x6f02784;

    /* renamed from: zzbwz */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2403x394e77<?, ?> f6389x6f02785;

    private C2169x6f02139(int i17, java.lang.Class<T> cls, int i18, boolean z17) {
        this(11, cls, null, 810, false);
    }

    public static <M extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138<M>, T extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143> com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2169x6f02139<M, T> zza(int i17, java.lang.Class<T> cls, long j17) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2169x6f02139<>(11, cls, 810, false);
    }

    private final java.lang.Object zzf(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135 c2165x6f02135) {
        java.lang.Class componentType = this.f6388x6f02784 ? this.f6387x6f02783.getComponentType() : this.f6387x6f02783;
        try {
            int i17 = this.f6386x368f3a;
            if (i17 == 10) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143 abstractC2174x6f02143 = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143) componentType.newInstance();
                c2165x6f02135.zza(abstractC2174x6f02143, this.tag >>> 3);
                return abstractC2174x6f02143;
            }
            if (i17 == 11) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143 abstractC2174x6f021432 = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143) componentType.newInstance();
                c2165x6f02135.zza(abstractC2174x6f021432);
                return abstractC2174x6f021432;
            }
            int i18 = this.f6386x368f3a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(24);
            sb6.append("Unknown type ");
            sb6.append(i18);
            throw new java.lang.IllegalArgumentException(sb6.toString());
        } catch (java.io.IOException e17) {
            throw new java.lang.IllegalArgumentException("Error reading extension field", e17);
        } catch (java.lang.IllegalAccessException e18) {
            java.lang.String valueOf = java.lang.String.valueOf(componentType);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(valueOf.length() + 33);
            sb7.append("Error creating instance of class ");
            sb7.append(valueOf);
            throw new java.lang.IllegalArgumentException(sb7.toString(), e18);
        } catch (java.lang.InstantiationException e19) {
            java.lang.String valueOf2 = java.lang.String.valueOf(componentType);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder(valueOf2.length() + 33);
            sb8.append("Error creating instance of class ");
            sb8.append(valueOf2);
            throw new java.lang.IllegalArgumentException(sb8.toString(), e19);
        }
    }

    /* renamed from: equals */
    public final boolean m18923xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2169x6f02139)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2169x6f02139 c2169x6f02139 = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2169x6f02139) obj;
        return this.f6386x368f3a == c2169x6f02139.f6386x368f3a && this.f6387x6f02783 == c2169x6f02139.f6387x6f02783 && this.tag == c2169x6f02139.tag && this.f6388x6f02784 == c2169x6f02139.f6388x6f02784;
    }

    /* renamed from: hashCode */
    public final int m18924x8cdac1b() {
        return ((((((this.f6386x368f3a + 1147) * 31) + this.f6387x6f02783.hashCode()) * 31) + this.tag) * 31) + (this.f6388x6f02784 ? 1 : 0);
    }

    public final T zzi(java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2176x6f02145> list) {
        if (list == null) {
            return null;
        }
        if (!this.f6388x6f02784) {
            if (list.isEmpty()) {
                return null;
            }
            return this.f6387x6f02783.cast(zzf(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135.zzi(list.get(list.size() - 1).f6402x6f026d3)));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < list.size(); i17++) {
            byte[] bArr = list.get(i17).f6402x6f026d3;
            if (bArr.length != 0) {
                arrayList.add(zzf(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135.zzi(bArr)));
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        java.lang.Class<T> cls = this.f6387x6f02783;
        T cast = cls.cast(java.lang.reflect.Array.newInstance(cls.getComponentType(), size));
        for (int i18 = 0; i18 < size; i18++) {
            java.lang.reflect.Array.set(cast, i18, arrayList.get(i18));
        }
        return cast;
    }

    public final int zzv(java.lang.Object obj) {
        int i17 = this.tag >>> 3;
        int i18 = this.f6386x368f3a;
        if (i18 == 10) {
            return (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.m18916x394b70(i17) << 1) + ((com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143) obj).m18953x394df7();
        }
        if (i18 == 11) {
            return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzb(i17, (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143) obj);
        }
        int i19 = this.f6386x368f3a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(24);
        sb6.append("Unknown type ");
        sb6.append(i19);
        throw new java.lang.IllegalArgumentException(sb6.toString());
    }

    private C2169x6f02139(int i17, java.lang.Class<T> cls, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2403x394e77<?, ?> abstractC2403x394e77, int i18, boolean z17) {
        this.f6386x368f3a = i17;
        this.f6387x6f02783 = cls;
        this.tag = i18;
        this.f6388x6f02784 = false;
        this.f6389x6f02785 = null;
    }

    public final void zza(java.lang.Object obj, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 c2166x6f02136) {
        try {
            c2166x6f02136.m18919x394b71(this.tag);
            int i17 = this.f6386x368f3a;
            if (i17 == 10) {
                int i18 = this.tag >>> 3;
                ((com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143) obj).zza(c2166x6f02136);
                c2166x6f02136.zzg(i18, 4);
            } else {
                if (i17 == 11) {
                    c2166x6f02136.zzb((com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143) obj);
                    return;
                }
                int i19 = this.f6386x368f3a;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(24);
                sb6.append("Unknown type ");
                sb6.append(i19);
                throw new java.lang.IllegalArgumentException(sb6.toString());
            }
        } catch (java.io.IOException e17) {
            throw new java.lang.IllegalStateException(e17);
        }
    }
}
