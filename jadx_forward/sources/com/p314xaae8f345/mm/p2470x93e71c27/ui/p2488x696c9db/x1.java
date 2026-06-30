package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes12.dex */
public final class x1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a2 f273509d;

    public x1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a2 a2Var) {
        this.f273509d = a2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$FileSelectorAdapter$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a2 a2Var = this.f273509d;
        a2Var.getClass();
        java.lang.Object tag = view.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) tag).intValue();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f2 item = a2Var.getItem(intValue);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a2Var.f273035d, "onMoreClick: pos:" + intValue + ",item:" + item);
        if (item instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d2) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d2 listFileItem = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d2) item;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f = a2Var.f273043o;
            activityC19730xa7b9756f.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listFileItem, "listFileItem");
            activityC19730xa7b9756f.f272914u.f273057a.f141728i = 1L;
            java.lang.String str = listFileItem.f273098i;
            int P = r26.n0.P(listFileItem.f273097h, ".", 0, false, 6, null) + 1;
            if (P >= listFileItem.f273097h.length()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileSelectorUI", "open file error : file path error");
                db5.t7.g(activityC19730xa7b9756f, activityC19730xa7b9756f.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ibj));
            } else {
                java.lang.CharSequence charSequence = listFileItem.f273097h;
                java.lang.String obj = charSequence.subSequence(P, charSequence.length()).toString();
                if (3 == activityC19730xa7b9756f.f272900d && !listFileItem.f273101l) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a2 a2Var2 = activityC19730xa7b9756f.f272907n;
                    if (a2Var2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                        throw null;
                    }
                    if (1 == a2Var2.f273042n) {
                        if (r26.i0.p(obj, "ppt", true) || r26.i0.p(obj, "pdf", true) || r26.i0.p(obj, "doc", true) || r26.i0.p(obj, "docx", true) || r26.i0.p(obj, "pptx", true)) {
                            activityC19730xa7b9756f.d7(listFileItem.f273093d, listFileItem.f273094e);
                        } else {
                            db5.t7.g(activityC19730xa7b9756f, activityC19730xa7b9756f.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ibk));
                        }
                    }
                }
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a2 a2Var3 = activityC19730xa7b9756f.f272907n;
                if (a2Var3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                    throw null;
                }
                if (2 != a2Var3.f273042n || com.p314xaae8f345.mm.vfs.w6.j(listFileItem.f273098i)) {
                    activityC19730xa7b9756f.k7(str, listFileItem.f273097h.toString());
                } else {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c2 c2Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c2) listFileItem;
                    activityC19730xa7b9756f.e7(c2Var.f273072r, c2Var.f273070p);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$FileSelectorAdapter$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
