package com.tencent.matrix.lifecycle;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0002\u0003\u0004\b\n\u0018\u00002\u00020\u0001:\u0001\u0003J\u0017\u0010\u0005\u001a\u00060\u0003R\u00020\u0004*\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u0010"}, d2 = {"com/tencent/matrix/lifecycle/StatefulOwnerKt$reverse$1", "Lcom/tencent/matrix/lifecycle/IStatefulOwner;", "Lcom/tencent/matrix/lifecycle/k;", "com/tencent/matrix/lifecycle/a1", "com/tencent/matrix/lifecycle/StatefulOwnerKt$reverse$1", "wrap", "(Lcom/tencent/matrix/lifecycle/k;)Lcom/tencent/matrix/lifecycle/a1;", "", "active", "observer", "Ljz5/f0;", "observeForever", "Landroidx/lifecycle/y;", "lifecycleOwner", "observeWithLifecycle", "removeObserver", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class StatefulOwnerKt$reverse$1 implements com.tencent.matrix.lifecycle.IStatefulOwner {
    final /* synthetic */ com.tencent.matrix.lifecycle.IStatefulOwner $this_reverse;

    public StatefulOwnerKt$reverse$1(com.tencent.matrix.lifecycle.IStatefulOwner iStatefulOwner) {
        this.$this_reverse = iStatefulOwner;
    }

    private final com.tencent.matrix.lifecycle.a1 wrap(com.tencent.matrix.lifecycle.k kVar) {
        return new com.tencent.matrix.lifecycle.a1(this, kVar);
    }

    @Override // com.tencent.matrix.lifecycle.IStatefulOwner, com.tencent.matrix.lifecycle.l
    public boolean active() {
        return !this.$this_reverse.active();
    }

    @Override // com.tencent.matrix.lifecycle.IStatefulOwner
    public void observeForever(com.tencent.matrix.lifecycle.k observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        this.$this_reverse.observeForever(wrap(observer));
    }

    @Override // com.tencent.matrix.lifecycle.IStatefulOwner
    public void observeWithLifecycle(androidx.lifecycle.y lifecycleOwner, com.tencent.matrix.lifecycle.k observer) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(observer, "observer");
        this.$this_reverse.observeWithLifecycle(lifecycleOwner, wrap(observer));
    }

    @Override // com.tencent.matrix.lifecycle.IStatefulOwner
    public void removeObserver(com.tencent.matrix.lifecycle.k observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        this.$this_reverse.removeObserver(wrap(observer));
    }
}
