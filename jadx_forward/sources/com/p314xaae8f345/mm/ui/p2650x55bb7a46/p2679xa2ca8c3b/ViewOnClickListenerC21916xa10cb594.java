package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemFooter */
/* loaded from: classes9.dex */
public class ViewOnClickListenerC21916xa10cb594 extends android.widget.LinearLayout implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f284741d;

    public ViewOnClickListenerC21916xa10cb594(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f284741d = context;
    }

    public final void a(r01.g0 g0Var) {
        c01.d9.e().g(new r01.g3(null, 1, g0Var.b(), null, getContext() instanceof android.app.Activity ? ((android.app.Activity) getContext()).getIntent().getStringExtra("uinserve_search_click_id") : ""));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag();
        if (!(tag instanceof r01.g0)) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        r01.g0 g0Var = (r01.g0) tag;
        int i17 = g0Var.f449607b;
        if (i17 == 1) {
            g0Var.f449613h = "menu_click";
            a(g0Var);
        } else if (i17 == 2) {
            g0Var.f449613h = "menu_click";
            a(g0Var);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", g0Var.f449610e);
            intent.putExtra("showShare", false);
            intent.putExtra("geta8key_username", (java.lang.String) null);
            intent.putExtra("key_enable_teen_mode_check", true);
            intent.putExtra("key_enable_fts_quick", true);
            j45.l.j(this.f284741d, "webview", ".ui.tools.WebViewUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
