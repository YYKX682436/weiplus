package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class b8 implements db2.v3 {

    /* renamed from: a, reason: collision with root package name */
    public final fp0.b f107738a;

    /* renamed from: b, reason: collision with root package name */
    public final fp0.r f107739b;

    public b8(fp0.b bVar, fp0.r task) {
        kotlin.jvm.internal.o.g(task, "task");
        this.f107738a = bVar;
        this.f107739b = task;
    }

    @Override // db2.v3
    public boolean a(int i17, int i18, java.lang.String str, r45.ny3 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        fp0.b bVar = this.f107738a;
        if (bVar == null) {
            return false;
        }
        int a17 = bVar.a();
        fp0.r rVar = this.f107739b;
        if (a17 == rVar.f265279h) {
            return false;
        }
        rVar.b(fp0.u.f265290f);
        com.tencent.mars.xlog.Log.w("CgiConsumeCallback", "[isFetchConsume] executorToken=" + bVar.a() + " taskToken=" + rVar.f265279h);
        return true;
    }
}
