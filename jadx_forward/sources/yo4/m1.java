package yo4;

/* loaded from: classes10.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18795x62fd7c3f f545801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f545802e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18795x62fd7c3f c18795x62fd7c3f, java.lang.String str) {
        super(3);
        this.f545801d = c18795x62fd7c3f;
        this.f545802e = str;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        r45.h70 h70Var = (r45.h70) obj2;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj3;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18795x62fd7c3f c18795x62fd7c3f = this.f545801d;
        c18795x62fd7c3f.A.z();
        c18795x62fd7c3f.J();
        if (booleanValue) {
            if (h70Var == null) {
                java.lang.String outPath = this.f545802e;
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69219x922a682f(outPath);
                java.lang.String str = outPath + "_thumb";
                dw3.c0 c0Var = dw3.c0.f325715a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(outPath, "$outPath");
                c0Var.C(outPath, str, -1);
                dw3.d0 a17 = dw3.e0.f325735a.a(outPath);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiVideoPluginLayout", "vlog video output path:" + outPath + " info:" + a17);
                ut3.f.f512709c.a(c18795x62fd7c3f.getContext(), new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046(java.lang.Boolean.valueOf(booleanValue), this.f545802e, str, java.lang.Long.valueOf(a17 != null ? a17.f325725c : 0), java.lang.Boolean.FALSE, nu3.i.f421751a.l()));
                ct0.b bVar = c18795x62fd7c3f.F;
                if (bVar != null && bVar.f303739c) {
                    r3 = true;
                }
                if (r3) {
                    ((ku5.t0) ku5.t0.f394148d).g(new dw3.y(bVar));
                }
                if (c18795x62fd7c3f.H1) {
                    c0Var.s(outPath);
                }
            } else {
                android.graphics.Bitmap.CompressFormat compressFormat = android.graphics.Bitmap.CompressFormat.JPEG;
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = c18795x62fd7c3f.E;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc19624);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 60, compressFormat, c16993xacc19624.C, true);
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196242 = c18795x62fd7c3f.E;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc196242);
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046 = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046(bool, "", c16993xacc196242.C, -1L, java.lang.Boolean.FALSE, nu3.i.f421751a.l());
                r45.g70 g70Var = h70Var.f457437n;
                ct0.b bVar2 = c18795x62fd7c3f.F;
                g70Var.f456473f = bVar2 != null ? bVar2.f303739c : false;
                ut3.f fVar = ut3.f.f512709c;
                fVar.f512711b.putByteArray("video_composition", h70Var.mo14344x5f01b1f6());
                fVar.a(c18795x62fd7c3f.getContext(), c16991x15ced046);
            }
            ut3.f.f512709c.d(true, nu3.i.f421751a.l());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiVideoPluginLayout", " export failed");
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18795x62fd7c3f.G(this.f545801d, false, false, 0L, 7, null);
            c18795x62fd7c3f.f257412v.mo11001x57429eec();
            pm0.v.X(new yo4.l1(c18795x62fd7c3f));
        }
        return jz5.f0.f384359a;
    }
}
