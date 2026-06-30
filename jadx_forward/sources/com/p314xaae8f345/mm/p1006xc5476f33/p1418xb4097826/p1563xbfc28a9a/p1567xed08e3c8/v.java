package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8;

/* loaded from: classes2.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f202820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f202821e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.c0 f202822f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.String str, r45.h32 h32Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.c0 c0Var) {
        super(1);
        this.f202820d = str;
        this.f202821e = h32Var;
        this.f202822f = c0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberPreviewHeaderUIC", "#showNoticeBigCardDialog onClickPay result=" + booleanValue);
        if (booleanValue) {
            i95.m c17 = i95.n0.c(c61.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.zb zbVar = (c61.zb) c17;
            java.lang.String str = this.f202820d;
            r45.h32 h32Var = this.f202821e;
            java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(4);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.c0 c0Var = this.f202822f;
            android.app.Activity context = c0Var.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            gm0.j1.d().g(c61.zb.x3(zbVar, str, m75945x2fec8307, 1, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6(), null, 301, null, null, null, null, null, null, null, 8144, null));
            h32Var.set(1, 0);
            c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String m75945x2fec83072 = h32Var.m75945x2fec8307(4);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            java.lang.String str2 = this.f202820d;
            if (((b92.d1) zbVar2).bj(str2, m75945x2fec83072) == null) {
                c61.zb zbVar3 = (c61.zb) i95.n0.c(c61.zb.class);
                java.lang.String m75945x2fec83073 = h32Var.m75945x2fec8307(4);
                if (m75945x2fec83073 == null) {
                    m75945x2fec83073 = "";
                }
                ((b92.d1) zbVar3).Ai(str2, m75945x2fec83073, h32Var);
            } else {
                c61.zb zbVar4 = (c61.zb) i95.n0.c(c61.zb.class);
                java.lang.String m75945x2fec83074 = h32Var.m75945x2fec8307(4);
                if (m75945x2fec83074 == null) {
                    m75945x2fec83074 = "";
                }
                r45.h32 bj6 = ((b92.d1) zbVar4).bj(str2, m75945x2fec83074);
                if (bj6 != null) {
                    bj6.set(1, java.lang.Integer.valueOf(h32Var.m75939xb282bd08(1)));
                }
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = c0Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((te2.e4) ((zy2.g8) zVar.a(activity).c(zy2.g8.class))).f499507d.M0(str2);
            db5.t7.m(c0Var.m80379x76847179(), c0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.gyq));
        }
        return jz5.f0.f384359a;
    }
}
