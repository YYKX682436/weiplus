package uc1;

/* loaded from: classes13.dex */
public class l1 implements vc1.j2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f507865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f507866b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vc1.a3 f507867c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc1.m1 f507868d;

    public l1(uc1.m1 m1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, vc1.a3 a3Var) {
        this.f507868d = m1Var;
        this.f507865a = lVar;
        this.f507866b = i17;
        this.f507867c = a3Var;
    }

    @Override // vc1.j2
    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiMoveMapMarkerAlong", "moveMapMarkerAlong onMarkerTranslate result::%b", java.lang.Boolean.valueOf(z17));
        vc1.a3 a3Var = this.f507867c;
        int i17 = this.f507866b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f507865a;
        uc1.m1 m1Var = this.f507868d;
        if (z17) {
            vc1.p1 p1Var = (vc1.p1) a3Var;
            p1Var.getClass();
            m1Var.F(lVar, i17, "ok", p1Var instanceof dg1.h);
        } else {
            vc1.p1 p1Var2 = (vc1.p1) a3Var;
            p1Var2.getClass();
            m1Var.F(lVar, i17, "fail", p1Var2 instanceof dg1.h);
        }
    }

    @Override // vc1.j2
    public void b() {
        vc1.p1 p1Var = (vc1.p1) this.f507867c;
        p1Var.getClass();
        this.f507868d.F(this.f507865a, this.f507866b, "cancel", p1Var instanceof dg1.h);
    }
}
