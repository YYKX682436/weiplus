package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder$UpdateTask */
/* loaded from: classes7.dex */
public final class C12336x7905a21e extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12336x7905a21e> f35054x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.m2();

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12335xaf2ac8cb f165935f;

    public C12336x7905a21e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12335xaf2ac8cb c12335xaf2ac8cb) {
        this.f165935f = c12335xaf2ac8cb;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f165935f = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12335xaf2ac8cb) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12335xaf2ac8cb.class.getClassLoader());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f165935f, i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        java.lang.String str;
        bi1.e a17;
        if (!gm0.j1.b().f354787q || gm0.m.r()) {
            return;
        }
        java.util.Objects.requireNonNull(this.f165935f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = this.f165935f.f165926d.D;
        r45.ag7 b17 = qg1.n.b(c11812xa040dc98);
        r45.de7 a18 = qg1.n.a(c11812xa040dc98);
        r45.ac7 ac7Var = new r45.ac7();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12335xaf2ac8cb c12335xaf2ac8cb = this.f165935f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = c12335xaf2ac8cb.f165926d;
        ac7Var.f451459d = c11809xbc286be4.f158814g;
        ac7Var.f451460e = c12335xaf2ac8cb.f165928f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = c12335xaf2ac8cb.f165927e;
        int i17 = c12559xbdae8559.f169323f;
        ac7Var.f451461f = i17;
        ac7Var.f451462g = c11809xbc286be4.f158816i;
        ac7Var.f451463h = 1;
        ac7Var.f451464i = c12559xbdae8559.f169321d;
        java.lang.String str2 = null;
        if (1173 == i17 && (str = c11809xbc286be4.S) != null && (a17 = bi1.e.f102510h.a(str)) != null) {
            str2 = a17.f102511d;
        }
        java.lang.String str3 = str2;
        r45.y50 y50Var = new r45.y50();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12335xaf2ac8cb c12335xaf2ac8cb2 = this.f165935f;
        y50Var.f472330d = c12335xaf2ac8cb2.f165927e.f169323f;
        c12335xaf2ac8cb2.f165926d.W1.a(y50Var);
        if (this.f165935f.f165934o) {
            y50Var.f472332f = 1;
        } else {
            y50Var.f472332f = 102;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12335xaf2ac8cb c12335xaf2ac8cb3 = this.f165935f;
        java.lang.String str4 = c12335xaf2ac8cb3.f165926d.f158811d;
        java.lang.String str5 = c12335xaf2ac8cb3.f165929g;
        int i18 = c12335xaf2ac8cb3.f165931i.i();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12335xaf2ac8cb c12335xaf2ac8cb4 = this.f165935f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 c12566x87f2d8b7 = c12335xaf2ac8cb4.f165930h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be42 = c12335xaf2ac8cb4.f165926d;
        lm5.d.f401134b.a(new qg1.e(new qg1.d(str4, false, ac7Var, b17, a18, str5, i18, c12566x87f2d8b7, "", c11809xbc286be42.f158836p2, str3, y50Var, c11809xbc286be42.K1, c12335xaf2ac8cb4.f165933n, c12335xaf2ac8cb4.f165927e.f169324g, n91.t.c(c11809xbc286be42), false)));
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(this.f165935f.f165926d.f158814g)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12335xaf2ac8cb c12335xaf2ac8cb5 = this.f165935f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be43 = c12335xaf2ac8cb5.f165926d;
            new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x4(c11809xbc286be43, c12335xaf2ac8cb5.f165927e.f169323f, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p7(c12335xaf2ac8cb5.f165932m, c11809xbc286be43.f158811d)).a();
        }
    }

    public C12336x7905a21e(android.os.Parcel parcel) {
        v(parcel);
    }
}
