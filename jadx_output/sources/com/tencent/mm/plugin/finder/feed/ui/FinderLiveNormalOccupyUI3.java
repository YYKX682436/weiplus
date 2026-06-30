package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveNormalOccupyUI3;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FinderLiveNormalOccupyUI3 extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {
    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.eb_;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.o1.c(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.u7.class)));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.nu9);
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.ya(this));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        jz5.f0 f0Var;
        super.onResume();
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.tnm);
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.z2.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        frameLayout.removeAllViews();
        r45.lc1 u47 = g92.b.f269769e.u4();
        r45.s02 s02Var = new r45.s02();
        s02Var.set(3, 2);
        s02Var.set(4, java.lang.Long.valueOf(c01.id.a()));
        android.view.View Q6 = ((com.tencent.mm.plugin.finder.live.viewmodel.z2) a17).Q6(u47, s02Var, true, false, false);
        if (Q6 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(frameLayout, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(frameLayout, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveNormalOccupyUI3", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            frameLayout.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(frameLayout, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveNormalOccupyUI3", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(frameLayout, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            frameLayout.addView(Q6);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            frameLayout.setVisibility(8);
        }
    }
}
