package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes.dex */
public final class l7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f183893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183894e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f183895f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(android.content.Intent intent, java.lang.String str, p3325xe03a0797.p3326xc267989b.q qVar) {
        super(3);
        this.f183893d = intent;
        this.f183894e = str;
        this.f183895f = qVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        ((java.lang.Number) obj3).intValue();
        p3325xe03a0797.p3326xc267989b.q qVar = this.f183895f;
        if (booleanValue) {
            android.content.Intent intent = this.f183893d;
            intent.putExtra("Retr_MsgQuickShare", true);
            intent.putExtra("Select_Conv_User", this.f183894e);
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(java.lang.Boolean.TRUE, str)));
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(java.lang.Boolean.FALSE, null)));
        }
        return jz5.f0.f384359a;
    }
}
