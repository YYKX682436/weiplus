package zo1;

/* loaded from: classes5.dex */
public final class q1 implements ro1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f556276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f556277b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.a f556278c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e f556279d;

    public q1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, yz5.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activityC12868xd8a7d79e) {
        this.f556276a = u3Var;
        this.f556277b = h0Var;
        this.f556278c = aVar;
        this.f556279d = activityC12868xd8a7d79e;
    }

    @Override // ro1.h
    public void a(java.lang.String deviceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 waitDialog = this.f556276a;
        waitDialog.dismiss();
        po1.d e17 = ro1.v.f479547a.e(deviceId);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f556277b;
        h0Var.f391656d = e17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CreatePackageUI", "Bind new device=" + h0Var.f391656d + " successful.");
        this.f556278c.mo152xb9724478();
        po1.d dVar = (po1.d) h0Var.f391656d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(waitDialog, "$waitDialog");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e.U6(this.f556279d, dVar, waitDialog);
    }

    @Override // ro1.h
    /* renamed from: onFailed */
    public void mo162785x428b6afc(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CreatePackageUI", "Bind new device=" + this.f556277b.f391656d + " failed.");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activityC12868xd8a7d79e = this.f556279d;
        android.widget.Button button = activityC12868xd8a7d79e.f174355n;
        if (button == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("createBtn");
            throw null;
        }
        button.setEnabled(true);
        this.f556276a.dismiss();
        this.f556278c.mo152xb9724478();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", "[onFailed] err=" + i17);
        if (i17 != -2) {
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activityC12868xd8a7d79e);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.mxr);
            e4Var.c();
        }
    }
}
