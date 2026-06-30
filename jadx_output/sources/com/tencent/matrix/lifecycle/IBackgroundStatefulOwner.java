package com.tencent.matrix.lifecycle;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000bH\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000bH\u0017J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000bH\u0017¨\u0006\f"}, d2 = {"Lcom/tencent/matrix/lifecycle/IBackgroundStatefulOwner;", "Lcom/tencent/matrix/lifecycle/IStatefulOwner;", "", "isBackground", "Lcom/tencent/matrix/lifecycle/g;", "callback", "Ljz5/f0;", "addLifecycleCallback", "Landroidx/lifecycle/y;", "lifecycleOwner", "removeLifecycleCallback", "Lcom/tencent/matrix/lifecycle/i;", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public interface IBackgroundStatefulOwner extends com.tencent.matrix.lifecycle.IStatefulOwner {
    @Override // com.tencent.matrix.lifecycle.IStatefulOwner, com.tencent.matrix.lifecycle.l
    /* synthetic */ boolean active();

    void addLifecycleCallback(androidx.lifecycle.y yVar, com.tencent.matrix.lifecycle.g gVar);

    void addLifecycleCallback(androidx.lifecycle.y yVar, com.tencent.matrix.lifecycle.i iVar);

    void addLifecycleCallback(com.tencent.matrix.lifecycle.g gVar);

    void addLifecycleCallback(com.tencent.matrix.lifecycle.i iVar);

    boolean isBackground();

    @Override // com.tencent.matrix.lifecycle.IStatefulOwner
    /* synthetic */ void observeForever(com.tencent.matrix.lifecycle.k kVar);

    @Override // com.tencent.matrix.lifecycle.IStatefulOwner
    /* synthetic */ void observeWithLifecycle(androidx.lifecycle.y yVar, com.tencent.matrix.lifecycle.k kVar);

    void removeLifecycleCallback(com.tencent.matrix.lifecycle.g gVar);

    void removeLifecycleCallback(com.tencent.matrix.lifecycle.i iVar);

    @Override // com.tencent.matrix.lifecycle.IStatefulOwner
    /* synthetic */ void removeObserver(com.tencent.matrix.lifecycle.k kVar);
}
