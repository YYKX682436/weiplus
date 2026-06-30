package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes12.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f237007d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f237008e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f237009f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf f237010g;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf activityC16972xc3ec91bf, java.util.List list, java.lang.String str, java.lang.Runnable runnable) {
        this.f237010g = activityC16972xc3ec91bf;
        this.f237007d = list;
        this.f237008e = str;
        this.f237009f = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String t17;
        for (java.lang.String str : this.f237007d) {
            c01.h7 h7Var = new c01.h7();
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf activityC16972xc3ec91bf = this.f237010g;
            int selectedItemPosition = activityC16972xc3ec91bf.f236847h.getSelectedItemPosition();
            if (-1 == selectedItemPosition) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShowImageUI", "error position");
                t17 = null;
            } else {
                t17 = activityC16972xc3ec91bf.f236848i.getItem(selectedItemPosition).t();
            }
            h7Var.f118764f = t17;
            h7Var.f118760b = activityC16972xc3ec91bf.f236850n;
            h7Var.f118762d = activityC16972xc3ec91bf.f236851o;
            tg3.a1 a17 = tg3.t1.a();
            ((dk5.s5) a17).Vi(activityC16972xc3ec91bf.mo55332x76847179(), str, activityC16972xc3ec91bf.f236852p, 0, "", "", h7Var);
            ((dk5.s5) tg3.t1.a()).Ui(this.f237008e, str);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(this.f237009f);
    }

    /* renamed from: toString */
    public java.lang.String m67876x9616526c() {
        return super.toString() + "|onActivityResult";
    }
}
