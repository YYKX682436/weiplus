package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes3.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 f206321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f206322e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206323f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var, r45.h32 h32Var, java.lang.String str) {
        super(0);
        this.f206321d = s1Var;
        this.f206322e = h32Var;
        this.f206323f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var = this.f206321d;
        boolean z17 = s1Var.f206253d;
        r45.h32 h32Var = this.f206322e;
        if (z17 && zl2.t.d(h32Var, this.f206323f)) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = s1Var.f206251b;
            db5.t7.m(activityC0065xcd7aa112, activityC0065xcd7aa112.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dzx));
        } else if (!zl2.t.e(h32Var)) {
            s1Var.f206261l.performClick();
        }
        return jz5.f0.f384359a;
    }
}
