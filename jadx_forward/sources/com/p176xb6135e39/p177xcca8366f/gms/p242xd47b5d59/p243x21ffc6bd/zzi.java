package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* loaded from: classes13.dex */
public final class zzi extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzi> f7808x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzj();

    /* renamed from: value */
    private final java.lang.String f7809x6ac9171;

    /* renamed from: zzbd */
    private byte f7810x394b82;

    /* renamed from: zzbe */
    private final byte f7811x394b83;

    public zzi(byte b17, byte b18, java.lang.String str) {
        this.f7810x394b82 = b17;
        this.f7811x394b83 = b18;
        this.f7809x6ac9171 = str;
    }

    /* renamed from: equals */
    public final boolean m19958xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzi.class != obj.getClass()) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzi zziVar = (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzi) obj;
        return this.f7810x394b82 == zziVar.f7810x394b82 && this.f7811x394b83 == zziVar.f7811x394b83 && this.f7809x6ac9171.equals(zziVar.f7809x6ac9171);
    }

    /* renamed from: hashCode */
    public final int m19959x8cdac1b() {
        return ((((this.f7810x394b82 + 31) * 31) + this.f7811x394b83) * 31) + this.f7809x6ac9171.hashCode();
    }

    /* renamed from: toString */
    public final java.lang.String m19960x9616526c() {
        byte b17 = this.f7810x394b82;
        byte b18 = this.f7811x394b83;
        java.lang.String str = this.f7809x6ac9171;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 73);
        sb6.append("AmsEntityUpdateParcelable{, mEntityId=");
        sb6.append((int) b17);
        sb6.append(", mAttributeId=");
        sb6.append((int) b18);
        sb6.append(", mValue='");
        sb6.append(str);
        sb6.append("'}");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18316xac252587(parcel, 2, this.f7810x394b82);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18316xac252587(parcel, 3, this.f7811x394b83);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 4, this.f7809x6ac9171, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }
}
