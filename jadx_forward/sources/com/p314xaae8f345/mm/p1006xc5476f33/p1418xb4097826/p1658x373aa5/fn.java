package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class fn extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.dc f213647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f213648e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.lz0 f213649f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e1 f213650g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 f213651h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f213652i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f213653m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(zy2.dc dcVar, android.os.Bundle bundle, r45.lz0 lz0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e1 e1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var, boolean z17, yz5.l lVar) {
        super(0);
        this.f213647d = dcVar;
        this.f213648e = bundle;
        this.f213649f = lz0Var;
        this.f213650g = e1Var;
        this.f213651h = e3Var;
        this.f213652i = z17;
        this.f213653m = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.cb cbVar;
        r45.cb cbVar2;
        r45.bb bbVar;
        zy2.dc newContact = this.f213647d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newContact, "$newContact");
        android.os.Bundle extra = this.f213648e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        ya2.b2 b2Var = (ya2.b2) newContact;
        extra.putString("Avatar", b2Var.m176700xe5e0d2a0());
        extra.putString("Nickname", b2Var.z0());
        r45.hz0 hz0Var = b2Var.f69309x26b3182a;
        extra.putInt("Sex", hz0Var != null ? hz0Var.m75939xb282bd08(3) : 0);
        extra.putLong("contactId", b2Var.f72763xa3c65b86);
        r45.hz0 hz0Var2 = b2Var.f69309x26b3182a;
        java.lang.String m75945x2fec8307 = hz0Var2 != null ? hz0Var2.m75945x2fec8307(1) : null;
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        extra.putString("Province", m75945x2fec8307);
        r45.hz0 hz0Var3 = b2Var.f69309x26b3182a;
        java.lang.String m75945x2fec83072 = hz0Var3 != null ? hz0Var3.m75945x2fec8307(2) : null;
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        extra.putString("City", m75945x2fec83072);
        r45.hz0 hz0Var4 = b2Var.f69309x26b3182a;
        if (hz0Var4 == null) {
            hz0Var4 = new r45.hz0();
        }
        java.lang.String m75945x2fec83073 = hz0Var4.m75945x2fec8307(0);
        extra.putString("Country", m75945x2fec83073 != null ? m75945x2fec83073 : "");
        extra.putString("Signature", b2Var.A0());
        r45.mz0 mz0Var = b2Var.f69333xc5565091;
        extra.putInt("isNotRec", (mz0Var == null || (bbVar = (r45.bb) mz0Var.m75936x14adae67(1)) == null) ? 0 : bbVar.m75939xb282bd08(0));
        extra.putInt("isBlackList", b2Var.F0());
        r45.mz0 mz0Var2 = b2Var.f69333xc5565091;
        extra.putInt("isShieldHisLike", (mz0Var2 == null || (cbVar2 = (r45.cb) mz0Var2.m75936x14adae67(0)) == null) ? 0 : cbVar2.m75939xb282bd08(0));
        r45.mz0 mz0Var3 = b2Var.f69333xc5565091;
        extra.putInt("isShieldMyLike", (mz0Var3 == null || (cbVar = (r45.cb) mz0Var3.m75936x14adae67(0)) == null) ? 0 : cbVar.m75939xb282bd08(1));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ko koVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ko.f214053a;
        koVar.e(this.f213649f.m75945x2fec8307(0), extra);
        this.f213650g.a();
        android.view.View rootView = this.f213651h.f213492f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rootView, "rootView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ko.a(koVar, rootView, extra, this.f213652i, this.f213653m);
        return jz5.f0.f384359a;
    }
}
