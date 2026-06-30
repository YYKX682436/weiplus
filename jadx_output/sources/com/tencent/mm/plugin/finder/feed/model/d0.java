package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.l0 f107779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f107780e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f107781f;

    public d0(com.tencent.mm.plugin.finder.feed.model.l0 l0Var, long j17, java.util.LinkedList linkedList) {
        this.f107779d = l0Var;
        this.f107780e = j17;
        this.f107781f = linkedList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.appcompat.app.AppCompatActivity activity = this.f107779d.f108125g;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.xc xcVar = (com.tencent.mm.plugin.finder.viewmodel.component.xc) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.xc.class);
        if (xcVar != null) {
            xcVar.f7(this.f107780e).postValue(new jz5.l(this.f107781f, 0L));
        }
    }
}
