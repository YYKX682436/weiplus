package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui;

/* loaded from: classes5.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x33.d f220381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f220382e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f220383f;

    public m(x33.d dVar, long j17, long j18) {
        this.f220381d = dVar;
        this.f220382e = j17;
        this.f220383f = j18;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/ui/MentionSomeoneDialogUtil$initMentionSomeoneDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        x33.d dVar = this.f220381d;
        dVar.f533161c.setVisibility(0);
        dVar.f533162d.setVisibility(8);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 etInputName = dVar.f533160b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(etInputName, "etInputName");
        java.lang.Object systemService = etInputName.getContext().getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            etInputName.requestFocus();
            inputMethodManager.showSoftInput(etInputName, 0);
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a.e(700L, 2L, this.f220382e, this.f220383f, null);
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/ui/MentionSomeoneDialogUtil$initMentionSomeoneDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
