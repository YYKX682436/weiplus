package bj0;

/* loaded from: classes11.dex */
public final class k implements bj0.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263 f102647a;

    public k(com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263 c10717xfba6b263) {
        this.f102647a = c10717xfba6b263;
    }

    @Override // bj0.u
    public void b() {
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263 c10717xfba6b263 = this.f102647a;
        io.p3284xd2ae381c.Log.i(c10717xfba6b263.C, "onEnterAnimBegin");
        c10717xfba6b263.f149679x = true;
    }

    @Override // bj0.u
    public void e() {
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263 c10717xfba6b263 = this.f102647a;
        c10717xfba6b263.f149679x = false;
        io.p3284xd2ae381c.Log.i(c10717xfba6b263.C, "onEnterAnimEnd");
        if (c10717xfba6b263.e()) {
            c10717xfba6b263.j();
        }
    }
}
