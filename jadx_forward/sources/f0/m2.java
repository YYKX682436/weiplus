package f0;

/* loaded from: classes16.dex */
public final class m2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {
    public final /* synthetic */ rv3.h C;
    public final /* synthetic */ rv3.e D;
    public final /* synthetic */ in5.s0 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(rv3.h hVar, rv3.e eVar, in5.s0 s0Var) {
        super(1);
        this.C = hVar;
        this.D = eVar;
        this.E = s0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.widget.TextView favBtn = (android.widget.TextView) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(favBtn, "favBtn");
        rv3.h hVar = this.C;
        boolean z17 = !hVar.f481928d.L;
        rv3.e eVar = this.D;
        eVar.w(favBtn, z17);
        ev3.b bVar = eVar.f481918f;
        if (bVar != null) {
            in5.s0 s0Var = this.E;
            android.view.View itemView = s0Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            bVar.h(itemView, hVar, s0Var.m8183xf806b362(), z17);
        }
        return jz5.f0.f384359a;
    }
}
