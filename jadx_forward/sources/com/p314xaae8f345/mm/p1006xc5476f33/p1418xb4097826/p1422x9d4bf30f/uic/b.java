package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes2.dex */
public final class b extends x92.f {
    @Override // x92.f
    public java.lang.String a() {
        java.lang.String str;
        r45.e21 e21Var;
        r45.r03 r03Var = (r45.r03) this.f534224a;
        if (r03Var == null || (e21Var = (r45.e21) r03Var.m75936x14adae67(16)) == null || (str = e21Var.m75945x2fec8307(5)) == null) {
            str = this.f534225b;
        }
        return str == null ? "" : str;
    }

    @Override // x92.f
    public void b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        android.content.Intent intent = activity.getIntent();
        if (intent == null || (str = intent.getStringExtra("key_cover_url")) == null) {
            str = "";
        }
        this.f534225b = str;
    }
}
