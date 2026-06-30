package vw3;

/* loaded from: classes.dex */
public final class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerChatroomDebugUI f522491e;

    public g0(java.lang.String str, com.tencent.mm.plugin.repairer.ui.RepairerChatroomDebugUI repairerChatroomDebugUI) {
        this.f522490d = str;
        this.f522491e = repairerChatroomDebugUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerChatroomDebugUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fd0.e eVar = (fd0.e) ((gd0.e) i95.n0.c(gd0.e.class));
        java.lang.String str = this.f522490d;
        com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a m17 = eVar.wi(str).m(str);
        m17.f273781d = new vw3.f0(this.f522491e);
        m17.b();
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerChatroomDebugUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
