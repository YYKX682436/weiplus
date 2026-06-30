package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes10.dex */
public final class m5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 f179628d;

    public m5(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 activityC13326xc73ec7a9) {
        this.f179628d = activityC13326xc73ec7a9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity$setupButtons$$inlined$onClicked$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 activityC13326xc73ec7a9 = this.f179628d;
        activityC13326xc73ec7a9.b7().m54748x79a68fe4(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2 g2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2) kz5.n0.a0(activityC13326xc73ec7a9.f179416J, activityC13326xc73ec7a9.K);
        activityC13326xc73ec7a9.b7().m54750xa0e1083e(g2Var != null ? g2Var.f179564c : null);
        activityC13326xc73ec7a9.n7(l12.a.f396514f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.ScaleGestureDetectorOnScaleGestureListenerC13256x346a1468 a76 = activityC13326xc73ec7a9.a7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiEditorClipView", "restore states");
        a76.f178990i.set(a76.f178992n);
        a76.f178989h.set(a76.f178991m);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity$setupButtons$$inlined$onClicked$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
