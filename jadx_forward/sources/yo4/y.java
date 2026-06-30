package yo4;

/* loaded from: classes10.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a f545863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f545864e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 f545865f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p f545866g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f545867h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.util.Size f545868i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f545869m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f545870n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f545871o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f545872p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yz5.q f545873q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a c18794x5f9cad3a, java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p pVar, java.lang.String str, android.util.Size size, android.graphics.Rect rect, android.graphics.Rect rect2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, boolean z17, yz5.q qVar) {
        super(0);
        this.f545863d = c18794x5f9cad3a;
        this.f545864e = arrayList;
        this.f545865f = h1Var;
        this.f545866g = pVar;
        this.f545867h = str;
        this.f545868i = size;
        this.f545869m = rect;
        this.f545870n = rect2;
        this.f545871o = h0Var;
        this.f545872p = z17;
        this.f545873q = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a.T1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a c18794x5f9cad3a = this.f545863d;
        c18794x5f9cad3a.getClass();
        pm0.v.L("MultiVideoPluginLayout_report", true, new yo4.d0(c18794x5f9cad3a, 1L));
        uo4.a aVar = uo4.a.f511207a;
        java.util.ArrayList arrayList = this.f545864e;
        aVar.d(arrayList);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var = this.f545865f;
        aVar.c(h1Var);
        if (c18794x5f9cad3a.H1) {
            aVar.b(116L);
            yo4.p pVar = c18794x5f9cad3a.f257388w;
            if (pVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addMusicPlugin");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = pVar.f545820r;
            if (c16997xb0aa383a != null && c16997xb0aa383a.f237255s) {
                aVar.b(117L);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p pVar2 = this.f545866g;
        java.lang.String outPath = this.f545867h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(outPath, "$outPath");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = c18794x5f9cad3a.F;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc19624);
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d videoParam = c16993xacc19624.f237209n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(videoParam, "videoParam");
        android.util.Size size = this.f545868i;
        android.graphics.Rect rect = this.f545869m;
        bp4.c2 c2Var = c18794x5f9cad3a.f257396z1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.g0.a(pVar2, outPath, videoParam, size, rect, false, !c2Var.f104667z, 16, null);
        float[] fArr = (float[]) this.f545871o.f391656d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p pVar3 = this.f545866g;
        pVar3.b(this.f545870n, fArr, arrayList);
        bp4.m1 m1Var = c18794x5f9cad3a.U;
        if (m1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editMagicPlugin");
            throw null;
        }
        pVar3.c(m1Var.f104800r.f479656a);
        if (c18794x5f9cad3a.G1) {
            c18794x5f9cad3a.f257375l1.z();
            pVar3.d(null);
            throw null;
        }
        r45.h70 f17 = pVar3.f();
        f17.f457442s = c18794x5f9cad3a.K1;
        bp4.k0 m72537x67c60a58 = c18794x5f9cad3a.m72537x67c60a58();
        f17.f457443t = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m72537x67c60a58.C(), m72537x67c60a58.f104760z);
        boolean z17 = this.f545872p;
        yz5.q qVar = this.f545873q;
        if (z17) {
            if (c2Var.f104667z) {
                android.graphics.Rect rect2 = new android.graphics.Rect();
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.f(f17.f457435i.f458311g, rect2);
                h1Var.t(rect2);
            }
            zv3.c e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.e(f17);
            ((zv3.f) e17).e();
            h1Var.p(e17);
            h1Var.l(f17.f457435i.f458313i, new yo4.v(e17, qVar, f17));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n();
            nVar.f257216b = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196242 = c18794x5f9cad3a.F;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc196242);
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d videoParam2 = c16993xacc196242.f237209n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(videoParam2, "videoParam");
            nVar.i(true, videoParam2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f0.a(nVar, f17, false, new yo4.x(qVar), 2, null);
        }
        return jz5.f0.f384359a;
    }
}
