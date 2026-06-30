package kz0;

/* loaded from: classes5.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c1 f395228d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c1 c1Var) {
        super(1);
        this.f395228d = c1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c1 c1Var = this.f395228d;
        c1Var.f151426x = false;
        if (!booleanValue) {
            if (!c1Var.f151427y && c1Var.f151424v) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "onInitSelectTemplateSelected: " + c1Var.f151413k);
                c1Var.f151424v = false;
                com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.a5 a5Var = new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.a5(c1Var.f151413k);
                if (c1Var.f151405c) {
                    c1Var.a(a5Var, null);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "onTemplateSelected: " + a5Var.f151610a);
                    p3325xe03a0797.p3326xc267989b.l.d(c1Var.f151403a, null, null, new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.b1(c1Var, a5Var, null), 3, null);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
