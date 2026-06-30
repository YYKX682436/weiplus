package com.tencent.mm.feature.chatrecordstts;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/feature/chatrecordstts/SupervisedLifecycleScope;", "Lkotlinx/coroutines/y0;", "Landroidx/lifecycle/v;", "Lv65/i;", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "Landroidx/lifecycle/y;", "owner", "", "threadCount", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/y;I)V", "feature-chatrecordstts_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class SupervisedLifecycleScope implements kotlinx.coroutines.y0, androidx.lifecycle.v, v65.i {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f65329d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.y f65330e;

    /* renamed from: f, reason: collision with root package name */
    public final int f65331f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.c0 f65332g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f65333h;

    public SupervisedLifecycleScope(java.lang.String name, androidx.lifecycle.y yVar, int i17) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f65329d = name;
        this.f65330e = yVar;
        this.f65331f = i17;
        if (yVar != null) {
            d75.b.g(new com.tencent.mm.feature.chatrecordstts.l2(this));
        }
        this.f65332g = kotlinx.coroutines.t3.a(null, 1, null);
        this.f65333h = jz5.h.b(new com.tencent.mm.feature.chatrecordstts.m2(this));
    }

    @Override // v65.i
    public kotlinx.coroutines.r2 a(kotlinx.coroutines.a1 start, yz5.p block) {
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(block, "block");
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        return kotlinx.coroutines.l.c(this, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, start, block);
    }

    @Override // v65.i
    public kotlinx.coroutines.r2 d(kotlinx.coroutines.a1 start, yz5.p block) {
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(block, "block");
        return kotlinx.coroutines.l.c(this, (kotlinx.coroutines.f2) ((jz5.n) this.f65333h).getValue(), start, block);
    }

    @Override // kotlinx.coroutines.y0
    /* renamed from: getCoroutineContext */
    public oz5.l getF11582e() {
        return ((kotlinx.coroutines.f2) ((jz5.n) this.f65333h).getValue()).plus(this.f65332g);
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(event, "event");
        if (event == androidx.lifecycle.m.ON_DESTROY) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTts.LifecycleScope", "onDestroy");
            kotlinx.coroutines.p2.a(this.f65332g, null, 1, null);
            jz5.g gVar = this.f65333h;
            kotlinx.coroutines.v2.c((kotlinx.coroutines.f2) ((jz5.n) gVar).getValue(), null, 1, null);
            ((kotlinx.coroutines.f2) ((jz5.n) gVar).getValue()).close();
        }
    }

    public /* synthetic */ SupervisedLifecycleScope(java.lang.String str, androidx.lifecycle.y yVar, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(str, (i18 & 2) != 0 ? null : yVar, (i18 & 4) != 0 ? 1 : i17);
    }
}
