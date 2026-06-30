package o14;

/* loaded from: classes.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17361x5f3fcbd4 f423811d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17361x5f3fcbd4 activityC17361x5f3fcbd4) {
        this.f423811d = activityC17361x5f3fcbd4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/fixtools/FixToolsFileListUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17361x5f3fcbd4 activityC17361x5f3fcbd4 = this.f423811d;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17361x5f3fcbd4.f241596e;
        activityC17361x5f3fcbd4.getClass();
        android.os.CancellationSignal cancellationSignal = new android.os.CancellationSignal();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(activityC17361x5f3fcbd4, activityC17361x5f3fcbd4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC17361x5f3fcbd4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new o14.l(cancellationSignal));
        ((ku5.t0) ku5.t0.f394148d).a(new o14.k(cancellationSignal, Q, activityC17361x5f3fcbd4));
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsFileListUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
