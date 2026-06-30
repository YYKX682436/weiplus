package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes10.dex */
public final class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 f179609d;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 activityC13304x9b00dd62) {
        this.f179609d = activityC13304x9b00dd62;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupButtons$$inlined$onClicked$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l12.a aVar = l12.a.f396516h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 activityC13304x9b00dd62 = this.f179609d;
        activityC13304x9b00dd62.n7(aVar);
        activityC13304x9b00dd62.B.f137502j++;
        activityC13304x9b00dd62.f179300r.a(null);
        activityC13304x9b00dd62.d7().setEnabled(false);
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = activityC13304x9b00dd62.f179293h;
        if (f5Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("keyboardHeightProvider");
            throw null;
        }
        f5Var.f();
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupButtons$$inlined$onClicked$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
