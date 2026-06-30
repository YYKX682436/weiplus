package gk5;

/* loaded from: classes.dex */
public final class l1 implements tg3.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gk5.m1 f354219a;

    public l1(gk5.m1 m1Var) {
        this.f354219a = m1Var;
    }

    @Override // tg3.x0
    public final void a(int i17, int i18, java.util.List resultList, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultList, "resultList");
        gk5.m1 m1Var = this.f354219a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m1Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        cj5.o oVar = (cj5.o) pf5.z.f435481a.a(activity).a(cj5.o.class);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = oVar.f123738d;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        oVar.f123738d = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SendToWeWorkUIC", "onCallback() called with: errorType = [" + i17 + "], errorCode = [" + i18 + "], resultList = [" + resultList + ']');
        if (i17 == 0 && i18 == 0) {
            return;
        }
        db5.t7.g(m1Var.m158354x19263085(), m1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.h0a));
    }
}
