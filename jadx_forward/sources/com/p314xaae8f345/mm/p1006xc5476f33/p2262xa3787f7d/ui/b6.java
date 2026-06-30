package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public final class b6 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b f254470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f254471e;

    public b6(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b activityC18590xc3d8bf2b, int i17) {
        this.f254470d = activityC18590xc3d8bf2b;
        this.f254471e = i17;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        o01.a aVar = (o01.a) obj;
        if (aVar.f440817a == q01.f.f440809e) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b activityC18590xc3d8bf2b = this.f254470d;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC18590xc3d8bf2b.f254439m;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            if (aVar.f440819c == 0) {
                ((vh4.t1) i95.n0.c(vh4.t1.class)).f518671h = null;
                ((vh4.t1) i95.n0.c(vh4.t1.class)).f518672i = 1;
                activityC18590xc3d8bf2b.finish();
                db5.t7.h(activityC18590xc3d8bf2b.mo55332x76847179(), activityC18590xc3d8bf2b.getString(this.f254471e == 3 ? com.p314xaae8f345.mm.R.C30867xcad56011.jt7 : com.p314xaae8f345.mm.R.C30867xcad56011.jtr));
                ((vh4.t1) i95.n0.c(vh4.t1.class)).T(19);
            } else {
                activityC18590xc3d8bf2b.l7(aVar.f440820d);
                activityC18590xc3d8bf2b.d7().setText("");
            }
        }
        return jz5.f0.f384359a;
    }
}
