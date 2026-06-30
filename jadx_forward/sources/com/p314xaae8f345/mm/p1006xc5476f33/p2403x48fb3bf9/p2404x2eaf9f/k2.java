package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes8.dex */
public final class k2 implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.l2 f263393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263394e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f263395f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f263396g;

    public k2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.l2 l2Var, java.lang.String str, long j17, int i17) {
        this.f263393d = l2Var;
        this.f263394e = str;
        this.f263395f = j17;
        this.f263396g = i17;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        long j17 = this.f263395f;
        int i17 = this.f263396g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.l2 l2Var = this.f263393d;
        l2Var.a(this.f263394e, j17, i17);
        l2Var.f263408h = null;
        return false;
    }
}
