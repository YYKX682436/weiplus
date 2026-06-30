package com.tencent.mm.plugin.finder.feed.ui;

@db5.a(288)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "Landroid/view/View;", org.chromium.base.BaseSwitches.V, "Landroid/view/View;", "getIdGroup", "()Landroid/view/View;", "setIdGroup", "(Landroid/view/View;)V", "idGroup", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FinderLiveMoreOptionSettingUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public android.view.View idGroup;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: X6 */
    public java.lang.String getF109545t() {
        return "FinderLiveMoreOptionSettingUI";
    }

    public final void d7() {
        java.lang.Object obj;
        java.util.LinkedList a17 = com.tencent.mm.plugin.finder.live.util.n2.f115640a.a();
        int integer = g92.b.f269769e.k2().getInteger(4);
        android.view.View view = this.idGroup;
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ruj) : null;
        if (textView == null) {
            return;
        }
        java.util.Iterator it = a17.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.of1) obj).getInteger(2) == integer) {
                    break;
                }
            }
        }
        r45.of1 of1Var = (r45.of1) obj;
        textView.setText(of1Var != null ? of1Var.getString(0) : null);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.avm;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{id2.s4.class, id2.o.class, id2.f5.class, id2.b2.class, pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.r8.class)), pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.q8.class)), pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.s8.class))});
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1001 && i18 == -1) {
            d7();
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.LinkedList<r45.z63> list;
        android.view.View view;
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.dyl);
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.va(this));
        this.idGroup = findViewById(com.tencent.mm.R.id.ruh);
        if (zl2.q4.f473933a.g()) {
            android.view.View view2 = this.idGroup;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            d7();
            android.view.View view3 = this.idGroup;
            if (view3 != null) {
                view3.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.wa(this));
            }
        } else {
            android.view.View view4 = this.idGroup;
            if (view4 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (getIntent().getBooleanExtra("intent_status_from_privacy_to_video_setting", false) && (view = this.idGroup) != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ru8);
        r45.a73 a73Var = (r45.a73) g92.b.f269769e.k2().e().getCustom(11);
        r45.a73 a73Var2 = null;
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.t8.l(a73Var != null ? a73Var.toByteArray() : null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(l17)) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        r45.a73 a73Var3 = new r45.a73();
        try {
            a73Var3.parseFrom(com.tencent.mm.sdk.platformtools.t8.h(l17));
            a73Var2 = a73Var3;
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
        }
        if (a73Var2 != null && (list = a73Var2.getList(0)) != null) {
            for (r45.z63 z63Var : list) {
                if (z63Var != null) {
                    zl2.r.f473938a.a(z63Var, "SimpleUIComponent_get");
                }
            }
        }
        if (a73Var2 != null) {
            java.util.LinkedList list2 = a73Var2.getList(0);
            if ((list2 == null || list2.isEmpty()) ? false : true) {
                if (findViewById != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                    arrayList5.add(0);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(findViewById, arrayList5.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (findViewById != null) {
                    findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.xa(this));
                    return;
                }
                return;
            }
        }
        if (findViewById == null) {
            return;
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(findViewById, arrayList6.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMoreOptionSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void setIdGroup(android.view.View view) {
        this.idGroup = view;
    }
}
