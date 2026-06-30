package d33;

/* loaded from: classes10.dex */
public final class d1 implements ru3.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d f307746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f307747b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d33.t0 f307748c;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d c15652xb39b5f9d, long j17, d33.t0 t0Var) {
        this.f307746a = c15652xb39b5f9d;
        this.f307747b = j17;
        this.f307748c = t0Var;
    }

    @Override // ru3.n
    public void b(android.graphics.RectF rectF) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa m63695x22f21e20;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rectF, "rectF");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d.f220026u;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d c15652xb39b5f9d = this.f307746a;
        long j17 = c15652xb39b5f9d.lockCropMediaId;
        if (j17 == this.f307747b || j17 == 0) {
            c15652xb39b5f9d.f220032i.set(rectF);
        }
        rectF.round(this.f307748c.f307811f);
        m63695x22f21e20 = c15652xb39b5f9d.m63695x22f21e20();
        m63695x22f21e20.z(rectF, false);
    }

    @Override // ru3.n
    public void c(boolean z17) {
    }
}
