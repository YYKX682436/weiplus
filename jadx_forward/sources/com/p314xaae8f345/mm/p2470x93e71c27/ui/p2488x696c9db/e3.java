package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes12.dex */
public final class e3 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f f273137d;

    public e3(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f) {
        this.f273137d = activityC19730xa7b9756f;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f = this.f273137d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a2 a2Var = activityC19730xa7b9756f.f272907n;
        if (a2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f2 item = a2Var.getItem(i17);
        if (activityC19730xa7b9756f.G) {
            yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (item == null) {
            yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        int i18 = item.f273156a;
        if (i18 == 2) {
            yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (i18 == 3) {
            activityC19730xa7b9756f.f272914u.f273057a.f141728i = 1L;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d2 d2Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d2) item;
            java.lang.String str = d2Var.f273098i;
            int P = r26.n0.P(d2Var.f273097h, ".", 0, false, 6, null) + 1;
            if (P >= d2Var.f273097h.length()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileSelectorUI", "open file error : file path error");
                db5.t7.g(activityC19730xa7b9756f, activityC19730xa7b9756f.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ibj));
                yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            java.lang.CharSequence charSequence = d2Var.f273097h;
            java.lang.String obj = charSequence.subSequence(P, charSequence.length()).toString();
            if (3 == activityC19730xa7b9756f.f272900d && !d2Var.f273101l) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a2 a2Var2 = activityC19730xa7b9756f.f272907n;
                if (a2Var2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                    throw null;
                }
                if (1 == a2Var2.f273042n) {
                    if (r26.i0.p(obj, "ppt", true) || r26.i0.p(obj, "pdf", true) || r26.i0.p(obj, "doc", true) || r26.i0.p(obj, "docx", true) || r26.i0.p(obj, "pptx", true)) {
                        activityC19730xa7b9756f.d7(d2Var.f273093d, d2Var.f273094e);
                    } else {
                        db5.t7.g(activityC19730xa7b9756f, activityC19730xa7b9756f.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ibk));
                    }
                    yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                    return;
                }
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a2 a2Var3 = activityC19730xa7b9756f.f272907n;
            if (a2Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            if (2 == a2Var3.f273042n && !com.p314xaae8f345.mm.vfs.w6.j(d2Var.f273098i) && !activityC19730xa7b9756f.h7()) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c2 c2Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c2) item;
                activityC19730xa7b9756f.e7(c2Var.f273072r, c2Var.f273070p);
                yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            } else if (activityC19730xa7b9756f.h7()) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a2 a2Var4 = activityC19730xa7b9756f.f272907n;
                if (a2Var4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                    throw null;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
                a2Var4.m(view, i17);
            } else {
                activityC19730xa7b9756f.k7(str, d2Var.f273097h.toString());
            }
        } else if (i18 == 4) {
            activityC19730xa7b9756f.f272914u.f273057a.f141728i = 1L;
            try {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e2 e2Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e2) item;
                if (e2Var.f273135q) {
                    if (activityC19730xa7b9756f.h7()) {
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a2 a2Var5 = activityC19730xa7b9756f.f272907n;
                        if (a2Var5 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                            throw null;
                        }
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
                        a2Var5.m(view, i17);
                    } else {
                        activityC19730xa7b9756f.k7(e2Var.f273098i, e2Var.f273097h.toString());
                    }
                } else {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e2Var.f273098i)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileSelectorUI", "can not open sub path because current path not exist");
                        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                        return;
                    }
                    java.lang.String str2 = e2Var.f273098i;
                    if (str2 != null) {
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a2 a2Var6 = activityC19730xa7b9756f.f272907n;
                        if (a2Var6 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                            throw null;
                        }
                        a2Var6.p(str2);
                    }
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a2 a2Var7 = activityC19730xa7b9756f.f272907n;
                    if (a2Var7 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                        throw null;
                    }
                    a2Var7.notifyDataSetChanged();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileSelectorUI", "error:" + e17.getMessage());
                yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
