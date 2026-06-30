package ni3;

/* loaded from: classes3.dex */
public final class s implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni3.u f419262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 f419263e;

    public s(ni3.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 c16559xedc507d9) {
        this.f419262d = uVar;
        this.f419263e = c16559xedc507d9;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/monitor/FinderStreamMonitorView$TestAdapter$onBindViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("clipboard");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((android.content.ClipboardManager) systemService).setText(this.f419262d.f419275d.getText());
        dp.a.m125854x26a183b(this.f419263e.getContext(), "copy done", 0).show();
        yj0.a.i(true, this, "com/tencent/mm/plugin/monitor/FinderStreamMonitorView$TestAdapter$onBindViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
