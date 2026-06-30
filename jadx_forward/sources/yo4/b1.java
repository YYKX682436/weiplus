package yo4;

/* loaded from: classes10.dex */
public final class b1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f545714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f545715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18795x62fd7c3f f545716f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z23.f f545717g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f545718h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 f545719i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18795x62fd7c3f c18795x62fd7c3f, z23.f fVar, java.lang.String[] strArr, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046) {
        super(3);
        this.f545714d = h0Var;
        this.f545715e = i17;
        this.f545716f = c18795x62fd7c3f;
        this.f545717g = fVar;
        this.f545718h = strArr;
        this.f545719i = c16991x15ced046;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z17;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        boolean booleanValue2 = ((java.lang.Boolean) obj3).booleanValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("photoEditItemContainer source:");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f545714d;
        sb6.append((java.lang.String) h0Var.f391656d);
        sb6.append(" ret:");
        sb6.append(booleanValue);
        sb6.append(" result:");
        sb6.append(str);
        sb6.append(" index:");
        int i17 = this.f545715e;
        sb6.append(i17);
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiVideoPluginLayout", sb6.toString());
        java.lang.String[] strArr = this.f545718h;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18795x62fd7c3f c18795x62fd7c3f = this.f545716f;
        if (!booleanValue || str == null) {
            z17 = false;
        } else {
            bp4.k0 m72543x67c60a58 = c18795x62fd7c3f.m72543x67c60a58();
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 u0Var = c18795x62fd7c3f.G;
            java.lang.Object obj4 = u0Var.f257263d.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj4, "get(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y D = m72543x67c60a58.D((java.lang.String) obj4);
            e60.h1 a17 = this.f545717g.a(str, 1, new android.graphics.Matrix(D.f257317a), new android.graphics.Rect(D.f257318b), new android.graphics.Rect(D.f257320d), new android.graphics.Rect(D.f257319c));
            android.graphics.Bitmap i07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(a17.f331241b);
            java.lang.Object obj5 = u0Var.f257263d.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj5, "get(...)");
            android.graphics.Bitmap G = c18795x62fd7c3f.f257408r.G((java.lang.String) obj5, i65.a.B(c18795x62fd7c3f.getContext()));
            if (G != null) {
                i07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.e(i07, G, c18795x62fd7c3f.m72543x67c60a58().f104744g.getVisibilityRect());
            }
            android.graphics.Bitmap bitmap = i07;
            dq4.c cVar = dq4.c.f323902a;
            int i18 = c18795x62fd7c3f.f257404p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
            cVar.e(0L, i18, bitmap, a17.f331241b);
            cVar.d(str, a17.f331241b);
            z17 = false;
            strArr[i17] = com.p314xaae8f345.mm.vfs.w6.i(a17.f331241b, false);
            if (booleanValue2 || G != null) {
                dw3.c0.f325715a.r(a17.f331241b);
            }
        }
        int size = c18795x62fd7c3f.G.f257263d.size() - 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046 = this.f545719i;
        if (i17 >= size) {
            ct0.b bVar = c18795x62fd7c3f.F;
            if ((bVar == null || !bVar.f303739c) ? z17 : true) {
                dw3.c0.f325715a.j(bVar != null ? bVar.f303746j : null);
            }
            c16991x15ced046.f237199m.addAll(kz5.z.z0(strArr));
            ut3.f.f512709c.a(c18795x62fd7c3f.getContext(), c16991x15ced046);
        } else {
            com.p314xaae8f345.mm.p647x5a0af82.C10322x22f91ed2.a().g((java.lang.String) h0Var.f391656d);
            c18795x62fd7c3f.z(this.f545717g, strArr, c16991x15ced046, i17 + 1);
        }
        return jz5.f0.f384359a;
    }
}
