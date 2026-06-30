package uc1;

/* loaded from: classes13.dex */
public class c2 implements vc1.j2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f507833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f507834b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vc1.a3 f507835c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc1.d2 f507836d;

    public c2(uc1.d2 d2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, vc1.a3 a3Var) {
        this.f507836d = d2Var;
        this.f507833a = lVar;
        this.f507834b = i17;
        this.f507835c = a3Var;
    }

    @Override // vc1.j2
    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiTranslateMapMarker", "onMarkerTranslate result::%b", java.lang.Boolean.valueOf(z17));
        vc1.a3 a3Var = this.f507835c;
        int i17 = this.f507834b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f507833a;
        uc1.d2 d2Var = this.f507836d;
        if (z17) {
            vc1.p1 p1Var = (vc1.p1) a3Var;
            p1Var.getClass();
            d2Var.G(lVar, i17, "ok", p1Var instanceof dg1.h);
        } else {
            vc1.p1 p1Var2 = (vc1.p1) a3Var;
            p1Var2.getClass();
            d2Var.G(lVar, i17, "fail", p1Var2 instanceof dg1.h);
        }
    }

    @Override // vc1.j2
    public void b() {
    }
}
