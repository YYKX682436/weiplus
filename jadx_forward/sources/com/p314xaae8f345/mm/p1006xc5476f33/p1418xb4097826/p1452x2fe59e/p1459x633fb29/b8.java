package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class b8 implements db2.v3 {

    /* renamed from: a, reason: collision with root package name */
    public final fp0.b f189271a;

    /* renamed from: b, reason: collision with root package name */
    public final fp0.r f189272b;

    public b8(fp0.b bVar, fp0.r task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        this.f189271a = bVar;
        this.f189272b = task;
    }

    @Override // db2.v3
    public boolean a(int i17, int i18, java.lang.String str, r45.ny3 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        fp0.b bVar = this.f189271a;
        if (bVar == null) {
            return false;
        }
        int a17 = bVar.a();
        fp0.r rVar = this.f189272b;
        if (a17 == rVar.f346812h) {
            return false;
        }
        rVar.b(fp0.u.f346823f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("CgiConsumeCallback", "[isFetchConsume] executorToken=" + bVar.a() + " taskToken=" + rVar.f346812h);
        return true;
    }
}
