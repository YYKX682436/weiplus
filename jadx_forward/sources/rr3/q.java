package rr3;

/* loaded from: classes3.dex */
public final class q implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rr3.r f480741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f480742e;

    public q(rr3.r rVar, int i17) {
        this.f480741d = rVar;
        this.f480742e = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        rr3.r rVar = this.f480741d;
        rr3.z zVar = rVar.f480744e;
        java.lang.Object obj = rVar.f480743d.get(this.f480742e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.tc5 tc5Var = (r45.tc5) obj;
        zVar.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = zVar.f480757g;
        if (u3Var != null) {
            u3Var.dismiss();
            zVar.f480757g = null;
        }
        zVar.f480757g = db5.e1.Q(zVar.m80379x76847179(), null, zVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, rr3.y.f480753d);
        java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.p1962x2ddda8.ActivityC16886xa16edb76) ((jz5.n) zVar.f480758h).mo141623x754a37bb()).f235726e;
        if (str != null) {
            new nw4.b(3, str, "", tc5Var.f467843d, 7).l().K(new rr3.x(zVar, tc5Var, 7));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appId");
            throw null;
        }
    }
}
