package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes10.dex */
public final class l5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 f179620d;

    public l5(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 activityC13326xc73ec7a9) {
        this.f179620d = activityC13326xc73ec7a9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.graphics.Rect rect;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity$setupButtons$$inlined$onClicked$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 activityC13326xc73ec7a9 = this.f179620d;
        activityC13326xc73ec7a9.B.f137504l++;
        activityC13326xc73ec7a9.n7(l12.a.f396515g);
        activityC13326xc73ec7a9.Z6().setAlpha(0.0f);
        activityC13326xc73ec7a9.Z6().animate().setStartDelay(300L).alpha(1.0f).setDuration(300L).start();
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2 g2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2) kz5.n0.a0(activityC13326xc73ec7a9.f179416J, activityC13326xc73ec7a9.K);
        activityC13326xc73ec7a9.b7().m54750xa0e1083e(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.ScaleGestureDetectorOnScaleGestureListenerC13256x346a1468 a76 = activityC13326xc73ec7a9.a7();
        a76.f178989h.setEmpty();
        a76.invalidate();
        if ((g2Var != null && g2Var.f179567f) && g2Var.f179564c == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.ScaleGestureDetectorOnScaleGestureListenerC13256x346a1468 a77 = activityC13326xc73ec7a9.a7();
            android.graphics.Rect rect2 = a77.f178989h;
            boolean isEmpty = rect2.isEmpty();
            android.graphics.Rect rect3 = a77.f178990i;
            if (isEmpty) {
                a77.e();
                rect2.set(rect3.centerX() - (rect3.width() / 2), rect3.centerY() - (rect3.height() / 2), rect3.centerX() + (rect3.width() / 2), rect3.centerY() + (rect3.height() / 2));
                a77.c();
            } else {
                a77.c();
            }
            a77.invalidate();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiEditorClipView", "resetToFullSize, viewport: " + rect2 + ", surface: " + rect3);
        } else {
            activityC13326xc73ec7a9.a7().d();
        }
        if (g2Var != null) {
            g2Var.f179567f = true;
        }
        if (g2Var != null && (rect = g2Var.f179564c) != null) {
            activityC13326xc73ec7a9.a7().m54739xcededd37(rect);
        }
        activityC13326xc73ec7a9.a7().m54737x3c1d5425(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(g2Var != null ? java.lang.Boolean.valueOf(g2Var.f179566e) : null, java.lang.Boolean.TRUE));
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.ScaleGestureDetectorOnScaleGestureListenerC13256x346a1468 a78 = activityC13326xc73ec7a9.a7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiEditorClipView", "store states");
        a78.f178992n.set(a78.f178990i);
        a78.f178991m.set(a78.f178989h);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity$setupButtons$$inlined$onClicked$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
