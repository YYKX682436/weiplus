package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public final class j1 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f63404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f63405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.cx4 f63406f;

    public j1(int i17, int i18, r45.cx4 cx4Var) {
        this.f63404d = i17;
        this.f63405e = i18;
        this.f63406f = cx4Var;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        return java.lang.Integer.valueOf(((com.tencent.mm.plugin.zero.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai().c(this.f63404d, this.f63405e, "", this.f63406f));
    }
}
