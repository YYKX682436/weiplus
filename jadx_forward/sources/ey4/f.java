package ey4;

/* loaded from: classes4.dex */
public class f implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19493xb618544c f339153d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19493xb618544c c19493xb618544c) {
        this.f339153d = c19493xb618544c;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19493xb618544c c19493xb618544c = this.f339153d;
        if (c19493xb618544c.f268818o.getText() == null) {
            return;
        }
        c19493xb618544c.f268818o.requestFocus();
        boolean z17 = editable.length() > 0 && editable.toString().trim().length() > 0;
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(c19493xb618544c.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559376d1);
        android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(c19493xb618544c.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559381d6);
        loadAnimation.setDuration(150L);
        loadAnimation2.setDuration(150L);
        android.view.View view = c19493xb618544c.f268816m;
        if (view == null || c19493xb618544c.f268817n == null) {
            return;
        }
        if (z17) {
            if (view.getVisibility() == 8 || c19493xb618544c.f268816m.getVisibility() == 4) {
                return;
            }
            c19493xb618544c.f268817n.startAnimation(loadAnimation);
            android.view.View view2 = c19493xb618544c.f268817n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter", "canSend", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter", "canSend", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c19493xb618544c.f268816m.startAnimation(loadAnimation2);
            android.view.View view3 = c19493xb618544c.f268816m;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter", "canSend", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter", "canSend", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            if (view.getVisibility() == 0 || c19493xb618544c.f268816m.getVisibility() == 0) {
                return;
            }
            c19493xb618544c.f268816m.startAnimation(loadAnimation);
            android.view.View view4 = c19493xb618544c.f268816m;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter", "canSend", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter", "canSend", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c19493xb618544c.f268817n.startAnimation(loadAnimation2);
            android.view.View view5 = c19493xb618544c.f268817n;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter", "canSend", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter", "canSend", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        c19493xb618544c.f268817n.getParent().requestLayout();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
