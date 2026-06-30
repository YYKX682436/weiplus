package p61;

/* loaded from: classes5.dex */
public class f2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11364xda6e5bc5 f433779a;

    public f2(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11364xda6e5bc5 activityC11364xda6e5bc5) {
        this.f433779a = activityC11364xda6e5bc5;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11364xda6e5bc5 activityC11364xda6e5bc5 = this.f433779a;
        if (z17) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11364xda6e5bc5.E;
            activityC11364xda6e5bc5.i7(12905);
            return;
        }
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11364xda6e5bc5.E;
        activityC11364xda6e5bc5.i7(12904);
        final n61.c cVar = new n61.c(3, (java.lang.String) gm0.j1.u().c().l(274436, null), activityC11364xda6e5bc5.C);
        gm0.j1.d().g(cVar);
        if (!activityC11364xda6e5bc5.A) {
            activityC11364xda6e5bc5.V6();
            return;
        }
        gm0.j1.d().a(268, activityC11364xda6e5bc5);
        activityC11364xda6e5bc5.D = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.c(activityC11364xda6e5bc5, activityC11364xda6e5bc5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571926tq), true, 0, new android.content.DialogInterface.OnCancelListener() { // from class: p61.f2$$a
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(android.content.DialogInterface dialogInterface) {
                p61.f2 f2Var = p61.f2.this;
                f2Var.getClass();
                gm0.j1.d().d(cVar);
                gm0.j1.d().q(268, f2Var.f433779a);
            }
        });
        activityC11364xda6e5bc5.D.show();
    }
}
