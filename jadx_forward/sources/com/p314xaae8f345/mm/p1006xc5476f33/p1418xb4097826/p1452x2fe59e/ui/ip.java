package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class ip implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14121xff3e46f f191697d;

    public ip(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14121xff3e46f activityC14121xff3e46f) {
        this.f191697d = activityC14121xff3e46f;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 6) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14121xff3e46f.C;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14121xff3e46f activityC14121xff3e46f = this.f191697d;
            activityC14121xff3e46f.e7().clearFocus();
            java.lang.String obj = r26.n0.u0(activityC14121xff3e46f.e7().getText().toString()).toString();
            if (!(!r26.n0.N(obj))) {
                obj = null;
            }
            if (obj != null) {
                java.lang.Object systemService = activityC14121xff3e46f.getSystemService("input_method");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(activityC14121xff3e46f.e7().getWindowToken(), 0);
                activityC14121xff3e46f.e7().setText("");
                bm2.w7 w7Var = activityC14121xff3e46f.f191152z;
                w7Var.getClass();
                java.util.ArrayList arrayList = (java.util.ArrayList) w7Var.f103950e;
                arrayList.add(obj);
                w7Var.m8149x8b456734(arrayList.size());
                activityC14121xff3e46f.g7(w7Var.mo1894x7e414b06());
                p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(activityC14121xff3e46f), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.dp(activityC14121xff3e46f, obj, null), 3, null);
                return true;
            }
        }
        return false;
    }
}
