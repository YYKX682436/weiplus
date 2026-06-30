package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes10.dex */
public final class k5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 f179612d;

    public k5(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 activityC13326xc73ec7a9) {
        this.f179612d = activityC13326xc73ec7a9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity$setupButtons$$inlined$onClicked$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 activityC13326xc73ec7a9 = this.f179612d;
        boolean z17 = true;
        boolean z18 = (activityC13326xc73ec7a9.d7().m54753xffdfa48d().isEmpty() ^ true) || activityC13326xc73ec7a9.b7().getVideoClipBounds() != null;
        if (!z18) {
            java.util.Iterator it = ((java.util.ArrayList) activityC13326xc73ec7a9.f179416J).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2 g2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2) it.next();
                if ((!g2Var.f179565d.isEmpty()) || g2Var.f179564c != null) {
                    z18 = true;
                    break;
                }
            }
        }
        java.lang.String str = activityC13326xc73ec7a9.Q;
        java.lang.String d17 = or.c.d(activityC13326xc73ec7a9.r7());
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = "";
        if (!(str == null || str.length() == 0)) {
            h0Var.f391656d = or.c.c("clk_edit_exit_button", str, java.lang.Integer.valueOf(((java.util.ArrayList) activityC13326xc73ec7a9.f179416J).size()), d17, null, 16, null);
        }
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 activityC13326xc73ec7a92 = this.f179612d;
            db5.e1.A(activityC13326xc73ec7a92, "", activityC13326xc73ec7a92.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ocu), activityC13326xc73ec7a9.getString(com.p314xaae8f345.mm.R.C30867xcad56011.od7), activityC13326xc73ec7a9.getString(com.p314xaae8f345.mm.R.C30867xcad56011.od8), new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.o5(str, activityC13326xc73ec7a9, h0Var), com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p5.f179674d);
        } else {
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                or.d.c(str, 3, activityC13326xc73ec7a9.s7(), 0, 0, (java.lang.String) h0Var.f391656d, 16, null);
            }
            activityC13326xc73ec7a9.setResult(0);
            activityC13326xc73ec7a9.finish();
            activityC13326xc73ec7a9.f179307y = 3L;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity$setupButtons$$inlined$onClicked$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
