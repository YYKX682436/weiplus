package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class xc implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.yc f83917a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f83918b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f83919c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f83920d;

    public xc(com.tencent.mm.plugin.appbrand.jsapi.yc ycVar, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17, kotlin.jvm.internal.h0 h0Var) {
        this.f83917a = ycVar;
        this.f83918b = d0Var;
        this.f83919c = i17;
        this.f83920d = h0Var;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.yc ycVar = this.f83917a;
        if (i17 != ycVar.f83945h) {
            return false;
        }
        int i19 = this.f83919c;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f83918b;
        if (i18 != -1) {
            d0Var.a(i19, ycVar.o("fail:cancel"));
            return true;
        }
        if (intent == null) {
            return true;
        }
        r45.oz5 oz5Var = new r45.oz5();
        kotlin.jvm.internal.h0 h0Var = this.f83920d;
        oz5Var.f382630d = (java.lang.String) h0Var.f310123d;
        oz5Var.f382631e = intent.getStringExtra("Select_Conv_User");
        com.tencent.mars.xlog.Log.i(ycVar.f83944g, "do send redcover appmsg: " + ((java.lang.String) h0Var.f310123d) + ", " + oz5Var.f382631e);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6446;
        lVar.f70666c = "/cgi-bin/micromsg-bin/sendsharecovermsg";
        lVar.f70664a = oz5Var;
        lVar.f70665b = new r45.pz5();
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new com.tencent.mm.plugin.appbrand.jsapi.wc(ycVar, d0Var, i19));
        return true;
    }
}
