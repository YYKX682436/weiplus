package yw;

/* loaded from: classes9.dex */
public final class j2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f547897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.biz.C23232x91bb1d7a f547898e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f547899f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(yz5.l lVar, com.p314xaae8f345.p2845xc516c4b6.biz.C23232x91bb1d7a c23232x91bb1d7a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        super(1);
        this.f547897d = lVar;
        this.f547898e = c23232x91bb1d7a;
        this.f547899f = abstractActivityC21394xb3d2c0cf;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        android.content.res.Resources resources;
        java.lang.String string;
        java.lang.String username = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        yz5.l lVar = this.f547897d;
        if (lVar != null) {
            lVar.mo146xb9724478(new com.p314xaae8f345.p2845xc516c4b6.biz.C23227xa6365ebf(1L, java.lang.Boolean.TRUE));
        }
        com.p314xaae8f345.p2845xc516c4b6.biz.C23232x91bb1d7a c23232x91bb1d7a = this.f547898e;
        java.lang.Long m85533xa121bd03 = c23232x91bb1d7a.m85533xa121bd03();
        if (m85533xa121bd03 != null && ((int) m85533xa121bd03.longValue()) == com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23233xdbc3d3d4.f40855x1294c7f6.ordinal()) {
            yw.q2 q2Var = yw.q2.f547967a;
            if (c23232x91bb1d7a.m85529x1e741da2() != null) {
                q2Var.c(c23232x91bb1d7a.m85529x1e741da2(), new yw.a2(new java.lang.ref.WeakReference(this.f547899f), username, c23232x91bb1d7a));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterShareMsgHelper", "doDownloadAndSendImageRecentForward img url is null");
            }
        } else {
            yw.q2 q2Var2 = yw.q2.f547967a;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f547899f;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.f9.a(c23232x91bb1d7a.m85529x1e741da2());
            if (abstractActivityC21394xb3d2c0cf == null || (resources = abstractActivityC21394xb3d2c0cf.getResources()) == null || (string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572122za)) == null) {
                str = null;
            } else {
                str = string + c23232x91bb1d7a.m85535x7531c8a2();
            }
            ((r35.k1) ((o25.q1) i95.n0.c(o25.q1.class))).Ri(abstractActivityC21394xb3d2c0cf, username, str, new yw.f2(c23232x91bb1d7a, username, abstractActivityC21394xb3d2c0cf), new yw.g2(abstractActivityC21394xb3d2c0cf, c23232x91bb1d7a), null);
        }
        return jz5.f0.f384359a;
    }
}
