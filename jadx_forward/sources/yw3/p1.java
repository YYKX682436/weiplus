package yw3;

/* loaded from: classes.dex */
public final class p1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterHybridNavigatorDemoUI f548377d;

    public p1(com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterHybridNavigatorDemoUI repairerFlutterHybridNavigatorDemoUI) {
        this.f548377d = repairerFlutterHybridNavigatorDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Class<?> cls;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterHybridNavigatorDemoUI$onCreate$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        try {
            cls = java.lang.Class.forName("com.tencent.mm.plugin.flutter.debug.leak.FlutterLeakActivity");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        if (cls != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(n07, cls.getSimpleName())) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new yw3.o1(this.f548377d, cls, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterHybridNavigatorDemoUI$onCreate$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
