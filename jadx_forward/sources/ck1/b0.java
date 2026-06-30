package ck1;

/* loaded from: classes4.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck1.y0 f123840d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ck1.y0 y0Var) {
        super(0);
        this.f123840d = y0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ck1.u0 u0Var = (ck1.u0) this.f123840d;
        int y17 = ((int) u0Var.f123921g.getY()) + u0Var.f123921g.getMeasuredHeight();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "invoke#measuredHeightResolver, titleHeight: " + y17);
        return java.lang.Integer.valueOf(y17);
    }
}
