package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes10.dex */
public final class c7 implements tg3.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f183598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f183599b;

    public c7(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f183598a = activityC0065xcd7aa112;
        this.f183599b = h0Var;
    }

    @Override // tg3.x0
    public final void a(int i17, int i18, java.util.List list, byte[] bArr) {
        r45.ok0 ok0Var;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f183598a;
        if (i17 == 0 && i18 == 0) {
            boolean z17 = false;
            if (list != null && (ok0Var = (r45.ok0) kz5.n0.Z(list)) != null && ok0Var.f463851e == 0) {
                z17 = true;
            }
            if (!z17) {
                db5.t7.g(activityC0065xcd7aa112, activityC0065xcd7aa112.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cwy));
            }
        } else {
            db5.t7.g(activityC0065xcd7aa112, activityC0065xcd7aa112.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cwy));
        }
        ((az2.f) this.f183599b.f391656d).b();
    }
}
