package kp1;

/* loaded from: classes3.dex */
public final class e implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6 f392427d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6 abstractC12879x228c0db6) {
        this.f392427d = abstractC12879x228c0db6;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarBaseView$initRecentView$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6 abstractC12879x228c0db6 = this.f392427d;
            android.content.Context context = abstractC12879x228c0db6.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            kp1.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6.f174519o;
            abstractC12879x228c0db6.getClass();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
            k0Var.f293405n = kp1.g.f392434d;
            k0Var.f293414s = new kp1.j(abstractC12879x228c0db6);
            k0Var.v();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AudioPanelTaskBarBaseView", th6, "onLongClickTaskBar exception", new java.lang.Object[0]);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarBaseView$initRecentView$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
