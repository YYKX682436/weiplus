package kp1;

/* loaded from: classes11.dex */
public final class z0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12883xfb6c00a4 f392488d;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12883xfb6c00a4 c12883xfb6c00a4) {
        this.f392488d = c12883xfb6c00a4;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarViewV5$initClickListener$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12883xfb6c00a4.f174561z;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12883xfb6c00a4 c12883xfb6c00a4 = this.f392488d;
        c12883xfb6c00a4.getClass();
        jm4.a0 a17 = jm4.c0.f381910d.a();
        pm0.v.X(new kp1.h1(c12883xfb6c00a4, a17 != null ? p3380x6a61f93.p3381xf512d0a5.C30428x21b2a662.m168785x21b47d68(((jm4.c0) a17).m105978x2737f10()) : false));
        yj0.a.i(true, this, "com/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarViewV5$initClickListener$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
