package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes10.dex */
public final class t1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 f179726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f179727e;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 activityC13304x9b00dd62, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352) {
        this.f179726d = activityC13304x9b00dd62;
        this.f179727e = c22699x3dcdb352;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupButtons$$inlined$onClicked$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.ScaleGestureDetectorOnScaleGestureListenerC13256x346a1468 a76 = this.f179726d.a7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiEditorClipView", "clear states");
        a76.m54737x3c1d5425(false);
        a76.e();
        a76.c();
        android.animation.ValueAnimator valueAnimator = a76.f179003y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        o12.m mVar = new o12.m(a76);
        a76.f179003y = n22.p.a(a76.f178989h, a76.f178990i, 300L, mVar);
        this.f179727e.m82040x7541828(-1);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupButtons$$inlined$onClicked$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
