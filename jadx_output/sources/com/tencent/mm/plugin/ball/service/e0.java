package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class e0 implements fs.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f93149a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f93150b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f93151c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f93152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f93153e;

    public e0(com.tencent.mm.plugin.ball.service.s sVar, com.tencent.mm.plugin.ball.model.BallInfo ballInfo, int i17, int i18, int i19, int i27) {
        this.f93149a = ballInfo;
        this.f93150b = i17;
        this.f93151c = i18;
        this.f93152d = i19;
        this.f93153e = i27;
    }

    @Override // fs.o
    public boolean a(fs.n nVar) {
        ((gp1.x) nVar).S(this.f93149a, this.f93150b, this.f93151c, this.f93152d, this.f93153e);
        return false;
    }
}
