package com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic;

/* loaded from: classes8.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.z f148912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148914f;

    public w(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.z zVar, java.lang.String str, java.lang.String str2) {
        this.f148912d = zVar;
        this.f148913e = str;
        this.f148914f = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/openmsg/uic/OpenMsgByOtherAppUIC$onCreate$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.z zVar = this.f148912d;
        zh1.w0 w0Var = zVar.f148918e;
        if (w0Var != null) {
            ((di1.f) w0Var).h(3L, null, null, 0L);
        }
        jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = zVar.m158354x19263085();
        java.lang.String str = this.f148913e;
        java.lang.String str2 = this.f148914f;
        ((ht.a) vVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.l(m158354x19263085, str, null, str2, 17, -1);
        yj0.a.h(this, "com/tencent/mm/feature/openmsg/uic/OpenMsgByOtherAppUIC$onCreate$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
