package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes10.dex */
public final class r1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 f179711d;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 activityC13304x9b00dd62) {
        this.f179711d = activityC13304x9b00dd62;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupButtons$$inlined$onClicked$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 activityC13304x9b00dd62 = this.f179711d;
        activityC13304x9b00dd62.B.f137504l++;
        activityC13304x9b00dd62.n7(l12.a.f396515g);
        activityC13304x9b00dd62.Z6().setAlpha(0.0f);
        activityC13304x9b00dd62.Z6().animate().setStartDelay(300L).alpha(1.0f).setDuration(300L).start();
        activityC13304x9b00dd62.b7().m54750xa0e1083e(null);
        activityC13304x9b00dd62.a7().d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.ScaleGestureDetectorOnScaleGestureListenerC13256x346a1468 a76 = activityC13304x9b00dd62.a7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiEditorClipView", "store states");
        a76.f178992n.set(a76.f178990i);
        a76.f178991m.set(a76.f178989h);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupButtons$$inlined$onClicked$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
