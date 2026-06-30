package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.ChatCustomTabActionBar */
/* loaded from: classes8.dex */
public class C15993x19b47d91 extends android.widget.FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f222621g = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f222622d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f222623e;

    /* renamed from: f, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff f222624f;

    public C15993x19b47d91(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final void a() {
        this.f222622d = getContext();
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bhw, (android.view.ViewGroup) this, false);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f78238xaeb5384d);
        this.f222623e = findViewById;
        findViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.game.ui.chat_tab.ChatCustomTabActionBar$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C15993x19b47d91.f222621g;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C15993x19b47d91 c15993x19b47d91 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C15993x19b47d91.this;
                c15993x19b47d91.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", c15993x19b47d91, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", c15993x19b47d91, array2);
                ((android.app.Activity) c15993x19b47d91.f222622d).finish();
                yj0.a.h(c15993x19b47d91, "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(c15993x19b47d91, "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.f222624f = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) inflate.findViewById(com.p314xaae8f345.mm.R.id.ofc);
        addView(inflate, new android.widget.FrameLayout.LayoutParams(-1, com.p314xaae8f345.mm.ui.bl.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)));
    }

    public final void b(oa.i iVar, int i17) {
        android.view.View view = iVar.f425316f;
        if (view == null) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bgc);
        android.widget.TextView textView2 = (android.widget.TextView) iVar.f425316f.findViewById(com.p314xaae8f345.mm.R.id.nvo);
        java.lang.String trim = iVar.f425313c.toString().trim();
        java.lang.String trim2 = textView2.getText().toString().trim();
        textView.setText(trim);
        textView.setTypeface(android.graphics.Typeface.defaultFromStyle(i17));
        textView2.setText(trim2);
        textView2.setTypeface(android.graphics.Typeface.defaultFromStyle(i17));
    }

    /* renamed from: getmTabs */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff m64774x76883ff5() {
        return this.f222624f;
    }

    /* renamed from: setBackBtn */
    public void m64775x9c8c0d33(android.view.View.OnClickListener onClickListener) {
        this.f222623e.setOnClickListener(onClickListener);
    }

    public C15993x19b47d91(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }
}
