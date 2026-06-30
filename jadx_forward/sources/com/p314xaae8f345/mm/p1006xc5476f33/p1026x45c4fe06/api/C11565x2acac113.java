package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/api/WeAppOpenDeclarePromptBundle;", "Landroid/os/Parcelable;", "protocol-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle */
/* loaded from: classes7.dex */
public final /* data */ class C11565x2acac113 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11565x2acac113> f33407x681a0c0c = new l81.c1();

    /* renamed from: d, reason: collision with root package name */
    public int f156519d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f156520e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f156521f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f156522g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f156523h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f156524i;

    public C11565x2acac113() {
        this(0, null, null, null, null, false, 63, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m48863xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11565x2acac113)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11565x2acac113 c11565x2acac113 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11565x2acac113) obj;
        return this.f156519d == c11565x2acac113.f156519d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f156520e, c11565x2acac113.f156520e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f156521f, c11565x2acac113.f156521f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f156522g, c11565x2acac113.f156522g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f156523h, c11565x2acac113.f156523h) && this.f156524i == c11565x2acac113.f156524i;
    }

    /* renamed from: hashCode */
    public int m48864x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f156519d) * 31;
        java.lang.String str = this.f156520e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f156521f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f156522g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f156523h;
        return ((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f156524i);
    }

    /* renamed from: toString */
    public java.lang.String m48865x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WeAppOpenDeclarePromptBundle(bizType=");
        sb6.append(this.f156519d);
        sb6.append(", funcI=");
        sb6.append(this.f156520e);
        sb6.append(", promptTitle=");
        java.lang.String str = this.f156521f;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(", promptMessage=");
        java.lang.String str2 = this.f156522g;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(", promptOkBtnText=");
        java.lang.String str3 = this.f156523h;
        sb6.append(str3 != null ? str3 : "");
        sb6.append(", cancelabl=");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(java.lang.Boolean.valueOf(this.f156524i), false));
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f156519d);
        out.writeString(this.f156520e);
        out.writeString(this.f156521f);
        out.writeString(this.f156522g);
        out.writeString(this.f156523h);
        out.writeInt(this.f156524i ? 1 : 0);
    }

    public C11565x2acac113(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17) {
        this.f156519d = i17;
        this.f156520e = str;
        this.f156521f = str2;
        this.f156522g = str3;
        this.f156523h = str4;
        this.f156524i = z17;
    }

    public /* synthetic */ C11565x2acac113(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17, (i18 & 2) != 0 ? null : str, (i18 & 4) != 0 ? null : str2, (i18 & 8) != 0 ? null : str3, (i18 & 16) == 0 ? str4 : null, (i18 & 32) != 0 ? false : z17);
    }
}
