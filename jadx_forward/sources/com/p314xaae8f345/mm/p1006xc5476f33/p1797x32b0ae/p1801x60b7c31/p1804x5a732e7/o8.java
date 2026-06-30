package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public final class o8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.p8 f225238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f225239e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225240f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225241g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.o f225242h;

    public o8(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.p8 p8Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.o oVar) {
        this.f225238d = p8Var;
        this.f225239e = h0Var;
        this.f225240f = str;
        this.f225241g = str2;
        this.f225242h = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f225239e;
        this.f225238d.a((java.lang.String) h0Var.f391656d, this.f225240f);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, h0Var.f391656d);
        hashMap.put(dm.i4.f66867x2a5c95c7, this.f225241g);
        hashMap.put("err_msg", "sendFileMessage:ok");
        this.f225242h.b(hashMap);
    }
}
