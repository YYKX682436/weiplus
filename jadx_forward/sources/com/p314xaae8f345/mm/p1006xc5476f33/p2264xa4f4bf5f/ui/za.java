package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes5.dex */
public final class za implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 f256015d;

    public za(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078) {
        this.f256015d = activityC18639xf6f98078;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078 = this.f256015d;
        activityC18639xf6f98078.i7().removeTextChangedListener(this);
        android.view.View c76 = activityC18639xf6f98078.c7();
        activityC18639xf6f98078.getClass();
        c76.setEnabled(true);
        if (activityC18639xf6f98078.c7().isEnabled()) {
            android.view.View j76 = activityC18639xf6f98078.j7();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(j76, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$textWatcher$1", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            j76.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(j76, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$textWatcher$1", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View j77 = activityC18639xf6f98078.j7();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(j77, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$textWatcher$1", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            j77.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(j77, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$textWatcher$1", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        h12.m mVar = new h12.m(java.lang.String.valueOf(editable), (int) activityC18639xf6f98078.i7().getPaint().getTextSize());
        com.p314xaae8f345.mm.ui.p2740x696c9db.t4 t4Var = com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2;
        int a17 = mVar.a(t4Var);
        java.lang.String.valueOf(editable);
        if (a17 > 2000) {
            activityC18639xf6f98078.i7().setText(pg5.d.a(activityC18639xf6f98078, mVar.b(2000, t4Var)));
            activityC18639xf6f98078.i7().mo81549xf579a34a(activityC18639xf6f98078.i7().getText().length());
            java.lang.String string = activityC18639xf6f98078.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ith);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            activityC18639xf6f98078.O7(string);
            nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC18639xf6f98078.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            pj4.h2 h2Var = (pj4.h2) ((md0.e) eVar).Ui(mo55332x76847179, 8, pj4.h2.class);
            if (h2Var != null) {
                h2Var.A++;
            }
        }
        activityC18639xf6f98078.i7().addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
