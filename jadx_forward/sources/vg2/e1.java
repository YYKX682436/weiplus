package vg2;

/* loaded from: classes3.dex */
public final class e1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.r1 f518037d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(vg2.r1 r1Var) {
        super(0);
        this.f518037d = r1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        vg2.r1 r1Var = this.f518037d;
        android.view.View findViewById = r1Var.f518097e.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(findViewById, "live_gift_color_select");
        ((cy1.a) aVar.ik(findViewById, 32, 25652)).gk(findViewById, kz5.c1.k(new jz5.l("gift_id", r1Var.f518100h.f67814x2c488eb6), new jz5.l("thing_index", vg2.r1.b(r1Var))));
        return findViewById;
    }
}
