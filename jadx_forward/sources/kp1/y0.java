package kp1;

/* loaded from: classes11.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12883xfb6c00a4 f392486d;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12883xfb6c00a4 c12883xfb6c00a4) {
        this.f392486d = c12883xfb6c00a4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarViewV5$initClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12883xfb6c00a4.f174561z;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12883xfb6c00a4 c12883xfb6c00a4 = this.f392486d;
        c12883xfb6c00a4.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPanelTaskBarViewV4", "onClickTaskBarIcon enterAudioTab: false");
        np1.a currentPlayInfo = c12883xfb6c00a4.getCurrentPlayInfo();
        pv.z zVar = (pv.z) i95.n0.c(pv.z.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_enter_tab", 1);
        ((ov.b) zVar).N9(1, currentPlayInfo, 3, bundle, new kp1.e1(false, c12883xfb6c00a4));
        yj0.a.h(this, "com/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarViewV5$initClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
