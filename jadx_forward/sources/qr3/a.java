package qr3;

/* loaded from: classes3.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f447605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qr3.o f447606e;

    public a(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, qr3.o oVar) {
        this.f447605d = c0Var;
        this.f447606e = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f447605d.f391645d) {
            return;
        }
        qr3.o oVar = this.f447606e;
        if (oVar.m158354x19263085().isFinishing()) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = oVar.f447641i;
        if (u3Var != null) {
            u3Var.dismiss();
            oVar.f447641i = null;
        }
        oVar.f447641i = db5.e1.Q(oVar.m80379x76847179(), null, oVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, qr3.n.f447634d);
    }
}
