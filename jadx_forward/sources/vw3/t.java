package vw3;

/* loaded from: classes10.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI f522645d;

    public t(com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI repairerBlockDetectUI) {
        this.f522645d = repairerBlockDetectUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerBlockDetectUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ix3.f fVar = ix3.i.f376967j;
        ix3.i b17 = fVar.b();
        b17.getClass();
        android.os.Looper.getMainLooper().setMessageLogging(null);
        b17.f376977h = false;
        boolean z17 = fVar.b().f376977h;
        int i17 = com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI.e;
        this.f522645d.V6(z17);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerBlockDetectUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
