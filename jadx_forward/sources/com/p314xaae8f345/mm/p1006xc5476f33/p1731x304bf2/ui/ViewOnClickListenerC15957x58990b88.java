package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameDropdownView */
/* loaded from: classes5.dex */
public class ViewOnClickListenerC15957x58990b88 extends android.widget.TextView implements android.view.View.OnClickListener, android.widget.PopupWindow.OnDismissListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f222300d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.l3 f222301e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f222302f;

    /* renamed from: g, reason: collision with root package name */
    public int f222303g;

    /* renamed from: h, reason: collision with root package name */
    public int f222304h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.j3 f222305i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f222306m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View.OnClickListener f222307n;

    public ViewOnClickListenerC15957x58990b88(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f222303g = 0;
        this.f222304h = 0;
        this.f222305i = null;
        this.f222306m = null;
        this.f222307n = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i3(this);
        this.f222300d = context;
        this.f222301e = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.l3(context);
        setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCurrentSelection */
    public void m64741x296ee895(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.l3 l3Var = this.f222301e;
        if (l3Var.getContentView() == null || !(l3Var.getContentView() instanceof android.view.ViewGroup)) {
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) l3Var.getContentView();
        int i18 = this.f222304h;
        if (i17 > i18 || this.f222303g > i18 || !(viewGroup.getChildAt(i17) instanceof android.widget.TextView) || !(viewGroup.getChildAt(this.f222303g) instanceof android.widget.TextView)) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.getChildAt(this.f222303g);
        android.content.Context context = this.f222300d;
        textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
        ((android.widget.TextView) viewGroup.getChildAt(i17)).setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        setText((java.lang.CharSequence) this.f222302f.get(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.j3 j3Var = this.f222305i;
        if (j3Var != null && this.f222303g != i17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.l4 l4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.l4) j3Var;
            l4Var.getClass();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15977x7ee4409d activityC15977x7ee4409d = l4Var.f222990a;
            linkedList.addAll(activityC15977x7ee4409d.f222440o.keySet());
            if (i17 <= linkedList.size() - 1) {
                int intValue = ((java.lang.Integer) linkedList.get(i17)).intValue();
                activityC15977x7ee4409d.f222441p = intValue;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLibraryUI", "Selected SortType: %d", java.lang.Integer.valueOf(intValue));
                activityC15977x7ee4409d.f222444s = 0;
                activityC15977x7ee4409d.U6();
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(activityC15977x7ee4409d, 11, 1111, activityC15977x7ee4409d.f222441p + activityC15977x7ee4409d.B, 2, activityC15977x7ee4409d.A, null);
            }
        }
        this.f222303g = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameDropdownView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.l3 l3Var = this.f222301e;
        if (l3Var.isShowing()) {
            l3Var.dismiss();
        } else {
            android.view.View view2 = this.f222306m;
            if (view2 == null) {
                l3Var.showAsDropDown(this);
            } else {
                l3Var.showAsDropDown(view2);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameDropdownView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        setVisibility(8);
    }

    /* renamed from: setAnchorView */
    public void m64742xcf1614fc(android.view.View view) {
        this.f222306m = view;
    }

    /* renamed from: setOnSelectionChangedListener */
    public void m64743x63051b5d(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.j3 j3Var) {
        this.f222305i = j3Var;
    }
}
