package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes15.dex */
public class d1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.e1 f265623d;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.e1 e1Var) {
        this.f265623d = e1Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.e1 e1Var = this.f265623d;
        return ((r45.h04) e1Var.f265652f.get(e1Var.f265655i)).f457246h.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c1 c1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c1) k3Var;
        if (i17 == mo1894x7e414b06() - 1) {
            c1Var.f265558g.setVisibility(0);
        } else {
            c1Var.f265558g.setVisibility(8);
        }
        android.widget.TextView textView = c1Var.f265556e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.e1 e1Var = this.f265623d;
        textView.setText(((r45.f14) ((r45.h04) e1Var.f265652f.get(e1Var.f265655i)).f457246h.get(i17)).f455460e);
        android.view.View view = c1Var.f265557f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i17 == ((r45.yv6) e1Var.f265653g.get(e1Var.f265655i)).f472962e - 1) {
            android.view.View view2 = c1Var.f265557f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view3 = c1Var.f265557f;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        c1Var.f265555d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b1(this, i17));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c1(this, android.view.LayoutInflater.from(this.f265623d.f265648b).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cii, viewGroup, false));
    }
}
