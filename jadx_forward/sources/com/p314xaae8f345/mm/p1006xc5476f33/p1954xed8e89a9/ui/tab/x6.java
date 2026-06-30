package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes8.dex */
public final class x6 implements t25.b {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 f236228d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f236229e;

    public x6(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f236228d = context;
    }

    @Override // t25.a
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = this.f236228d;
        if (activityC16840x4302a3e2.isFinishing()) {
            return true;
        }
        android.view.View findViewById = activityC16840x4302a3e2.findViewById(com.p314xaae8f345.mm.R.id.jlv);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetUnsupportedProfile", "hideOriginContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetUnsupportedProfile", "hideOriginContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ListView m79335xcc101dd9 = activityC16840x4302a3e2.m79335xcc101dd9();
        if (m79335xcc101dd9 != null) {
            m79335xcc101dd9.setVisibility(8);
        }
        android.view.View findViewById2 = activityC16840x4302a3e2.findViewById(com.p314xaae8f345.mm.R.id.l2v);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetUnsupportedProfile", "hideOriginContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetUnsupportedProfile", "hideOriginContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f236229e == null) {
            this.f236229e = android.view.LayoutInflater.from(activityC16840x4302a3e2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e3z, (android.view.ViewGroup) null);
        }
        activityC16840x4302a3e2.setContentView(this.f236229e);
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        return false;
    }

    @Override // t25.a
    /* renamed from: onActivityResult */
    public void mo67449x9d4787cb(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.b
    /* renamed from: onBackPress */
    public boolean mo67617x4ceae47d() {
        return false;
    }

    @Override // t25.b
    /* renamed from: onCreate */
    public boolean mo67618x3e5a77bb() {
        return true;
    }

    @Override // t25.b
    /* renamed from: onDestroy */
    public boolean mo67619xac79a11b() {
        this.f236229e = null;
        return true;
    }

    @Override // t25.a
    /* renamed from: onDetach */
    public boolean mo67450x3f5eee52() {
        return true;
    }

    @Override // t25.b
    /* renamed from: onPause */
    public void mo67620xb01dfb57() {
    }

    @Override // t25.b
    /* renamed from: onResume */
    public void mo67621x57429eec() {
    }
}
