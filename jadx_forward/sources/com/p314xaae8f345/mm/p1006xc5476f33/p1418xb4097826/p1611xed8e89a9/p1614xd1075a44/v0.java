package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes3.dex */
public final class v0 implements i50.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f206330a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 f206331b;

    public v0(r45.h32 h32Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var) {
        this.f206330a = h32Var;
        this.f206331b = s1Var;
    }

    @Override // i50.n
    public void a(boolean z17) {
        r45.h32 h32Var = this.f206330a;
        if (zl2.t.a(h32Var) != null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var = this.f206331b;
        boolean z18 = s1Var.B;
        r45.q65 q65Var = (r45.q65) h32Var.m75936x14adae67(10);
        boolean z19 = q65Var != null && q65Var.m75933x41a8a7f2(0);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = s1Var.f206251b;
        if (z18) {
            db5.t7.m(activityC0065xcd7aa112, activityC0065xcd7aa112.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0o));
            return;
        }
        java.lang.String string = z19 ? activityC0065xcd7aa112.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0k) : activityC0065xcd7aa112.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        db5.t7.m(activityC0065xcd7aa112, string);
    }
}
