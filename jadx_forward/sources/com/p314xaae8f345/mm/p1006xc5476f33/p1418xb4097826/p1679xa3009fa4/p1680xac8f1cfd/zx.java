package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes8.dex */
public final class zx extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tx f218255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f218256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f218257f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tx txVar, android.content.Context context, int i17) {
        super(0);
        this.f218255d = txVar;
        this.f218256e = context;
        this.f218257f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[goVerify] ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tx txVar = this.f218255d;
        sb6.append(txVar);
        sb6.append(" 视频号=");
        g92.b bVar = g92.b.f351302e;
        sb6.append(bVar.T0());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PublishSecurityCheck", sb6.toString());
        p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.dy.f215706b).remove(txVar.f217596a);
        boolean S3 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(txVar.f217596a);
        android.content.Context context = this.f218256e;
        int i17 = this.f218257f;
        if (S3) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
            android.content.res.Resources resources = context.getResources();
            java.lang.String string = i17 == 1 ? resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.le8) : resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.le9);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            u1Var.g(string);
            u1Var.a(true);
            u1Var.n(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.le_));
            u1Var.j(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg));
            u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.yx(txVar, context));
            u1Var.q(false);
        } else {
            if (bVar.T0().length() > 0) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
                android.content.res.Resources resources2 = context.getResources();
                java.lang.String string2 = i17 == 1 ? resources2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.le8) : resources2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.le9);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
                u1Var2.g(string2);
                u1Var2.a(true);
                u1Var2.n(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.le_));
                u1Var2.j(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg));
                u1Var2.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.vx(txVar, context));
                u1Var2.q(false);
            } else {
                java.lang.String string3 = context.getString(i17 == 1 ? com.p314xaae8f345.mm.R.C30867xcad56011.f572868le3 : com.p314xaae8f345.mm.R.C30867xcad56011.f572869le4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string3);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p1.f183981a.a(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.crv), string3, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.crr), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.crl), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.wx(context), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xx.f218035d, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
