package d33;

/* loaded from: classes10.dex */
public final class e1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Matrix f307753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d33.t0 f307754e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d f307755f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(android.graphics.Matrix matrix, d33.t0 t0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d c15652xb39b5f9d) {
        super(1);
        this.f307753d = matrix;
        this.f307754e = t0Var;
        this.f307755f = c15652xb39b5f9d;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa m63695x22f21e20;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa m63695x22f21e202;
        boolean z17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa m63695x22f21e203;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa m63695x22f21e204;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa m63695x22f21e205;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa m63695x22f21e206;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa m63695x22f21e207;
        android.graphics.Matrix it = (android.graphics.Matrix) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.graphics.Matrix matrix = this.f307753d;
        boolean isIdentity = matrix.isIdentity();
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d c15652xb39b5f9d = this.f307755f;
        d33.t0 t0Var = this.f307754e;
        if (isIdentity) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxMediaCropLayout", "previousMatrix isIdentity");
            t0Var.f307810e.set(it);
            m63695x22f21e203 = c15652xb39b5f9d.m63695x22f21e20();
            t0Var.f307812g.set(m63695x22f21e203.getContentCenterRect());
            m63695x22f21e204 = c15652xb39b5f9d.m63695x22f21e20();
            t0Var.f307813h.set(m63695x22f21e204.getContentOriginalRect());
            m63695x22f21e205 = c15652xb39b5f9d.m63695x22f21e20();
            z17 = false;
            float f17 = m63695x22f21e205.m81888xc7b108a2()[0];
            m63695x22f21e206 = c15652xb39b5f9d.m63695x22f21e20();
            t0Var.f307815j = m63695x22f21e206.getMaxScaleValue();
            m63695x22f21e207 = c15652xb39b5f9d.m63695x22f21e20();
            t0Var.f307816k = m63695x22f21e207.getMinScaleValue();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxMediaCropLayout", "set previousMatrix");
            it.set(matrix);
            m63695x22f21e20 = c15652xb39b5f9d.m63695x22f21e20();
            m63695x22f21e20.m81920x7c800d89(t0Var.f307815j);
            m63695x22f21e202 = c15652xb39b5f9d.m63695x22f21e20();
            m63695x22f21e202.m81922xe91e3cf7(t0Var.f307816k);
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
