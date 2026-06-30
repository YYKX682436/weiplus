package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes10.dex */
public final class r5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 f179714d;

    public r5(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 activityC13326xc73ec7a9) {
        this.f179714d = activityC13326xc73ec7a9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity$setupButtons$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preview_deselector_button: currentIndex=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 activityC13326xc73ec7a9 = this.f179714d;
        sb6.append(activityC13326xc73ec7a9.K);
        sb6.append(", mediaList size before=");
        sb6.append(((java.util.ArrayList) activityC13326xc73ec7a9.f179416J).size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiEmojiEditorActivity", sb6.toString());
        boolean z17 = true;
        if (((java.util.ArrayList) activityC13326xc73ec7a9.f179416J).size() <= 1) {
            yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity$setupButtons$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int i17 = activityC13326xc73ec7a9.K;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9.p7(activityC13326xc73ec7a9, i17 >= ((java.util.ArrayList) activityC13326xc73ec7a9.f179416J).size() - 1 ? 0 : i17 + 1);
        ((java.util.ArrayList) activityC13326xc73ec7a9.f179416J).remove(i17);
        java.util.List list = activityC13326xc73ec7a9.L;
        if (list == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("reportDataList");
            throw null;
        }
        list.remove(i17);
        int i18 = activityC13326xc73ec7a9.K;
        if (i18 > i17) {
            activityC13326xc73ec7a9.K = i18 - 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.x4 x4Var = activityC13326xc73ec7a9.G;
        if (x4Var != null) {
            x4Var.f180092f = kz5.n0.S0(activityC13326xc73ec7a9.f179416J);
            x4Var.m8155x27702c4(i17);
            if (activityC13326xc73ec7a9.K != i17) {
                x4Var.m8147xed6e4d18(i17);
                x4Var.m8147xed6e4d18(activityC13326xc73ec7a9.K);
            }
        }
        if (((java.util.ArrayList) activityC13326xc73ec7a9.f179416J).size() == 1 && (c22699x3dcdb352 = activityC13326xc73ec7a9.H) != null) {
            c22699x3dcdb352.setVisibility(8);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = activityC13326xc73ec7a9.F;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q5(activityC13326xc73ec7a9));
        }
        java.lang.String str = activityC13326xc73ec7a9.Q;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            or.d.c(str, 6, activityC13326xc73ec7a9.s7(), 0, 0, or.c.c("cancel_selection_button", str, java.lang.Integer.valueOf(((java.util.ArrayList) activityC13326xc73ec7a9.f179416J).size()), or.c.d(activityC13326xc73ec7a9.r7()), null, 16, null), 16, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity$setupButtons$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
