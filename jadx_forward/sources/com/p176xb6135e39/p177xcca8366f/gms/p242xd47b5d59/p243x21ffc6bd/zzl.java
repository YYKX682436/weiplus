package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* loaded from: classes13.dex */
public final class zzl extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzl> f7812x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzm();

    /* renamed from: id, reason: collision with root package name */
    private int f125810id;

    /* renamed from: packageName */
    private final java.lang.String f7813x362a8ff1;

    /* renamed from: zzbf */
    private final java.lang.String f7814x394b84;

    /* renamed from: zzbg */
    private final java.lang.String f7815x394b85;

    /* renamed from: zzbh */
    private final java.lang.String f7816x394b86;

    /* renamed from: zzbi */
    private final java.lang.String f7817x394b87;

    /* renamed from: zzbj */
    private final java.lang.String f7818x394b88;

    /* renamed from: zzbk */
    private final java.lang.String f7819x394b89;

    /* renamed from: zzbl */
    private final byte f7820x394b8a;

    /* renamed from: zzbm */
    private final byte f7821x394b8b;

    /* renamed from: zzbn */
    private final byte f7822x394b8c;

    /* renamed from: zzbo */
    private final byte f7823x394b8d;

    public zzl(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, byte b17, byte b18, byte b19, byte b27, java.lang.String str7) {
        this.f125810id = i17;
        this.f7814x394b84 = str;
        this.f7815x394b85 = str2;
        this.f7816x394b86 = str3;
        this.f7817x394b87 = str4;
        this.f7818x394b88 = str5;
        this.f7819x394b89 = str6;
        this.f7820x394b8a = b17;
        this.f7821x394b8b = b18;
        this.f7822x394b8c = b19;
        this.f7823x394b8d = b27;
        this.f7813x362a8ff1 = str7;
    }

    /* renamed from: equals */
    public final boolean m19962xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzl.class == obj.getClass()) {
            com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzl zzlVar = (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzl) obj;
            if (this.f125810id != zzlVar.f125810id || this.f7820x394b8a != zzlVar.f7820x394b8a || this.f7821x394b8b != zzlVar.f7821x394b8b || this.f7822x394b8c != zzlVar.f7822x394b8c || this.f7823x394b8d != zzlVar.f7823x394b8d || !this.f7814x394b84.equals(zzlVar.f7814x394b84)) {
                return false;
            }
            java.lang.String str = this.f7815x394b85;
            if (str == null ? zzlVar.f7815x394b85 != null : !str.equals(zzlVar.f7815x394b85)) {
                return false;
            }
            if (!this.f7816x394b86.equals(zzlVar.f7816x394b86) || !this.f7817x394b87.equals(zzlVar.f7817x394b87) || !this.f7818x394b88.equals(zzlVar.f7818x394b88)) {
                return false;
            }
            java.lang.String str2 = this.f7819x394b89;
            if (str2 == null ? zzlVar.f7819x394b89 != null : !str2.equals(zzlVar.f7819x394b89)) {
                return false;
            }
            java.lang.String str3 = this.f7813x362a8ff1;
            java.lang.String str4 = zzlVar.f7813x362a8ff1;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public final int m19963x8cdac1b() {
        int hashCode = (((this.f125810id + 31) * 31) + this.f7814x394b84.hashCode()) * 31;
        java.lang.String str = this.f7815x394b85;
        int hashCode2 = (((((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f7816x394b86.hashCode()) * 31) + this.f7817x394b87.hashCode()) * 31) + this.f7818x394b88.hashCode()) * 31;
        java.lang.String str2 = this.f7819x394b89;
        int hashCode3 = (((((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f7820x394b8a) * 31) + this.f7821x394b8b) * 31) + this.f7822x394b8c) * 31) + this.f7823x394b8d) * 31;
        java.lang.String str3 = this.f7813x362a8ff1;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: toString */
    public final java.lang.String m19964x9616526c() {
        int i17 = this.f125810id;
        java.lang.String str = this.f7814x394b84;
        java.lang.String str2 = this.f7815x394b85;
        java.lang.String str3 = this.f7816x394b86;
        java.lang.String str4 = this.f7817x394b87;
        java.lang.String str5 = this.f7818x394b88;
        java.lang.String str6 = this.f7819x394b89;
        byte b17 = this.f7820x394b8a;
        byte b18 = this.f7821x394b8b;
        byte b19 = this.f7822x394b8c;
        byte b27 = this.f7823x394b8d;
        java.lang.String str7 = this.f7813x362a8ff1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 211 + java.lang.String.valueOf(str2).length() + java.lang.String.valueOf(str3).length() + java.lang.String.valueOf(str4).length() + java.lang.String.valueOf(str5).length() + java.lang.String.valueOf(str6).length() + java.lang.String.valueOf(str7).length());
        sb6.append("AncsNotificationParcelable{, id=");
        sb6.append(i17);
        sb6.append(", appId='");
        sb6.append(str);
        sb6.append("', dateTime='");
        sb6.append(str2);
        sb6.append("', notificationText='");
        sb6.append(str3);
        sb6.append("', title='");
        sb6.append(str4);
        sb6.append("', subtitle='");
        sb6.append(str5);
        sb6.append("', displayName='");
        sb6.append(str6);
        sb6.append("', eventId=");
        sb6.append((int) b17);
        sb6.append(", eventFlags=");
        sb6.append((int) b18);
        sb6.append(", categoryId=");
        sb6.append((int) b19);
        sb6.append(", categoryCount=");
        sb6.append((int) b27);
        sb6.append(", packageName='");
        sb6.append(str7);
        sb6.append("'}");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 2, this.f125810id);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 3, this.f7814x394b84, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 4, this.f7815x394b85, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 5, this.f7816x394b86, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 6, this.f7817x394b87, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 7, this.f7818x394b88, false);
        java.lang.String str = this.f7819x394b89;
        if (str == null) {
            str = this.f7814x394b84;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 8, str, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18316xac252587(parcel, 9, this.f7820x394b8a);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18316xac252587(parcel, 10, this.f7821x394b8b);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18316xac252587(parcel, 11, this.f7822x394b8c);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18316xac252587(parcel, 12, this.f7823x394b8d);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 13, this.f7813x362a8ff1, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }
}
