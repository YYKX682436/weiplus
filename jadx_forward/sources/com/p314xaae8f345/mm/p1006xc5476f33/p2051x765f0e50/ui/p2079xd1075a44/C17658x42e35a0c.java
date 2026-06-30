package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2079xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bB\u0013\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\f¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/widget/PrivacyUpdatePreference;", "Lcom/tencent/mm/ui/base/preference/Preference;", "Lcom/tencent/mm/plugin/newtips/model/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.widget.PrivacyUpdatePreference */
/* loaded from: classes9.dex */
public final class C17658x42e35a0c extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb implements com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a {
    public static boolean R;
    public android.view.View L;
    public android.view.View M;
    public r45.pm6 N;
    public final jz5.g P;
    public final jz5.g Q;

    public C17658x42e35a0c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.P = jz5.h.b(new w24.n(this));
        this.Q = jz5.h.b(new w24.m(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean T1(boolean z17, r45.pm6 pm6Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showRedPointTitle. ");
        sb6.append(pm6Var != null ? pm6Var.f464720e : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PrivacyUpdatePreference", sb6.toString());
        if (!z17) {
            android.view.View view = this.M;
            if (view == null) {
                return true;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/widget/PrivacyUpdatePreference", "showRedPointTitle", "(ZLcom/tencent/mm/protocal/protobuf/TipsInfo;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/widget/PrivacyUpdatePreference", "showRedPointTitle", "(ZLcom/tencent/mm/protocal/protobuf/TipsInfo;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }
        if (pm6Var != null) {
            android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.P).mo141623x754a37bb();
            if (textView != null) {
                textView.setText(pm6Var.f464720e);
            }
            android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.Q).mo141623x754a37bb();
            if (imageView != null) {
                imageView.setVisibility(R ? 8 : 0);
            }
            android.view.View view2 = this.M;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/widget/PrivacyUpdatePreference", "showRedPointTitle", "(ZLcom/tencent/mm/protocal/protobuf/TipsInfo;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/setting/ui/widget/PrivacyUpdatePreference", "showRedPointTitle", "(ZLcom/tencent/mm/protocal/protobuf/TipsInfo;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        this.N = pm6Var;
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean W5() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean Y3(boolean z17) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean Z3(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public void c1(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PrivacyUpdatePreference", "showNewTips");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public void e5(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar, boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    /* renamed from: getPath */
    public java.lang.String mo54844xfb83cc9b() {
        return "privacyUpdate";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public android.view.View h() {
        if (this.L == null) {
            this.L = new android.view.View(this.f279303d);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PrivacyUpdatePreference", "getRoot");
        android.view.View view = this.L;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        return view;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean o0(boolean z17) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean q3(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        T1(true, this.N);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PrivacyUpdatePreference", "onBindView");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        this.M = u17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(u17, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/widget/PrivacyUpdatePreference", "onCreateView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        u17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(u17, "com/tencent/mm/plugin/setting/ui/widget/PrivacyUpdatePreference", "onCreateView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PrivacyUpdatePreference", "onCreateView");
        android.view.View view = this.M;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        return view;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean u6(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean y(boolean z17) {
        return false;
    }

    public C17658x42e35a0c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.P = jz5.h.b(new w24.n(this));
        this.Q = jz5.h.b(new w24.m(this));
    }

    public C17658x42e35a0c(android.content.Context context) {
        super(context);
        this.P = jz5.h.b(new w24.n(this));
        this.Q = jz5.h.b(new w24.m(this));
    }
}
