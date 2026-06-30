package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class z9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fa f196842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f196843e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fa faVar, java.lang.String str) {
        super(0);
        this.f196842d = faVar;
        this.f196843e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fa faVar = this.f196842d;
        faVar.K0(0);
        java.lang.String str = this.f196843e;
        if (com.p314xaae8f345.mm.vfs.w6.j(str == null ? "" : str)) {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str != null ? str : "");
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            java.io.InputStream D = com.p314xaae8f345.mm.vfs.w6.D(a17, com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D, "openRead(...)");
            android.graphics.Bitmap O = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.O(D);
            faVar.f194059q.setImageDrawable(new android.graphics.drawable.BitmapDrawable(faVar.f446856d.getContext().getResources(), O));
            ((mm2.c1) faVar.P0(mm2.c1.class)).I4 = O;
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            wo0.c a18 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.j0(str != null ? str : ""));
            a18.f529406d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.y9(faVar);
            a18.f();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(faVar.f194058p, "liveCoverUrl:" + str + ", business(LiveCommonSlice::class.java).audioModeHolderBm:" + ((mm2.c1) faVar.P0(mm2.c1.class)).I4);
        return jz5.f0.f384359a;
    }
}
