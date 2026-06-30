package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class d0 implements fs.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f93139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f93140b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f93141c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f93142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f93143e;

    public d0(com.tencent.mm.plugin.ball.service.s sVar, com.tencent.mm.plugin.ball.model.BallInfo ballInfo, int i17, int i18, int i19, int i27) {
        this.f93139a = ballInfo;
        this.f93140b = i17;
        this.f93141c = i18;
        this.f93142d = i19;
        this.f93143e = i27;
    }

    @Override // fs.o
    public boolean a(fs.n nVar) {
        ((gp1.x) nVar).S(this.f93139a, this.f93140b, this.f93141c, this.f93142d, this.f93143e);
        return false;
    }
}
