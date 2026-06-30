package p10;

/* loaded from: classes7.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 f432489d;

    public i(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 c10541x905158a3) {
        this.f432489d = c10541x905158a3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/ecs/nirvana/ui/MagicDebugPanelView$createHeapSnapshotButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 c10541x905158a3 = this.f432489d;
        iq0.c cVar = c10541x905158a3.f147351h;
        if (cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicDebugPanelView", "takeHeapSnapshot failed: bizHandle is null");
            db5.t7.m123883x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "bizHandle is null", 0).show();
        } else {
            java.lang.String path = "wxfile://usr/test_" + java.lang.System.currentTimeMillis() + ".heapsnapshot";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
            java.lang.String format = java.lang.String.format(";(function() {var path = %s;try {mb.JSBridge.invoke('takeHeapSnapshot', { path: path });} catch (e) { console.error('takeHeapSnapshot invoke failed', e); }return path;})();", java.util.Arrays.copyOf(new java.lang.Object[]{"\"" + r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(path, "\\", "\\\\", false), "\"", "\\\"", false), "\n", "\\n", false), "\r", "\\r", false) + '\"'}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicDebugPanelView", "takeHeapSnapshot: wxPath=".concat(path));
            db5.t7.m123883x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "Taking heap snapshot: ".concat(path), 0).show();
            ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).bj(cVar, format, new p10.v(c10541x905158a3));
        }
        yj0.a.h(this, "com/tencent/mm/feature/ecs/nirvana/ui/MagicDebugPanelView$createHeapSnapshotButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
