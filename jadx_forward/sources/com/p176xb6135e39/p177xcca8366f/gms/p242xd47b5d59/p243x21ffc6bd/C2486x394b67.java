package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzah */
/* loaded from: classes13.dex */
public final class C2486x394b67 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 implements com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2452xeb6b7e06 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2486x394b67> f7549x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2487x394b68();

    /* renamed from: name */
    private final java.lang.String f7551x337a8b;

    /* renamed from: zzca */
    private final java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2623x394c09> f7553x394b9e;

    /* renamed from: lock */
    private final java.lang.Object f7550x32c52b = new java.lang.Object();

    /* renamed from: zzbt */
    private java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2470x252222> f7552x394b92 = null;

    public C2486x394b67(java.lang.String str, java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2623x394c09> list) {
        this.f7551x337a8b = str;
        this.f7553x394b9e = list;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(str);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(list);
    }

    /* renamed from: equals */
    public final boolean m19888xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2486x394b67.class != obj.getClass()) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2486x394b67 c2486x394b67 = (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2486x394b67) obj;
        java.lang.String str = this.f7551x337a8b;
        if (str == null ? c2486x394b67.f7551x337a8b != null : !str.equals(c2486x394b67.f7551x337a8b)) {
            return false;
        }
        java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2623x394c09> list = this.f7553x394b9e;
        java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2623x394c09> list2 = c2486x394b67.f7553x394b9e;
        return list == null ? list2 == null : list.equals(list2);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2452xeb6b7e06
    /* renamed from: getName */
    public final java.lang.String mo19657xfb82e301() {
        return this.f7551x337a8b;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2452xeb6b7e06
    /* renamed from: getNodes */
    public final java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2470x252222> mo19658x74dfb8fb() {
        java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2470x252222> set;
        synchronized (this.f7550x32c52b) {
            if (this.f7552x394b92 == null) {
                this.f7552x394b92 = new java.util.HashSet(this.f7553x394b9e);
            }
            set = this.f7552x394b92;
        }
        return set;
    }

    /* renamed from: hashCode */
    public final int m19889x8cdac1b() {
        java.lang.String str = this.f7551x337a8b;
        int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2623x394c09> list = this.f7553x394b9e;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    /* renamed from: toString */
    public final java.lang.String m19890x9616526c() {
        java.lang.String str = this.f7551x337a8b;
        java.lang.String valueOf = java.lang.String.valueOf(this.f7553x394b9e);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 18 + valueOf.length());
        sb6.append("CapabilityInfo{");
        sb6.append(str);
        sb6.append(", ");
        sb6.append(valueOf);
        sb6.append("}");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 2, mo19657xfb82e301(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18360xcb846b09(parcel, 3, this.f7553x394b9e, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }
}
