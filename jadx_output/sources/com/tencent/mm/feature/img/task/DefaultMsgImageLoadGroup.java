package com.tencent.mm.feature.img.task;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/feature/img/task/DefaultMsgImageLoadGroup;", "Lcom/tencent/mm/sdk/coroutines/task/group/WorkerPoolWeTaskGroup;", "Landroidx/lifecycle/y;", "lifecycleOwner", "<init>", "(Landroidx/lifecycle/y;)V", "feature-img_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class DefaultMsgImageLoadGroup extends com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup {

    /* renamed from: n, reason: collision with root package name */
    public final int f67112n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f67113o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultMsgImageLoadGroup(androidx.lifecycle.y lifecycleOwner) {
        super(lifecycleOwner);
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        this.f67112n = 8;
        this.f67113o = jz5.h.b(new f80.c(lifecycleOwner));
    }

    @Override // com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup
    public java.lang.String f() {
        return "MicroMsg.DefaultMsgImageLoadGroup";
    }

    @Override // com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup
    public com.tencent.mm.sdk.coroutines.LifecycleScope g() {
        return (com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) this.f67113o).getValue();
    }

    @Override // com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup
    /* renamed from: h, reason: from getter */
    public int getF67112n() {
        return this.f67112n;
    }

    @Override // x65.a
    public java.lang.String name() {
        return "DefaultMsgImageLoadGroup";
    }
}
