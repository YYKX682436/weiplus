package com.tencent.matrix.lifecycle;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/matrix/lifecycle/IStatefulOwner;", "Lcom/tencent/matrix/lifecycle/l;", "", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public interface IStatefulOwner extends com.tencent.matrix.lifecycle.l {
    @Override // com.tencent.matrix.lifecycle.l
    /* synthetic */ boolean active();

    /* synthetic */ void observeForever(com.tencent.matrix.lifecycle.k kVar);

    /* synthetic */ void observeWithLifecycle(androidx.lifecycle.y yVar, com.tencent.matrix.lifecycle.k kVar);

    /* synthetic */ void removeObserver(com.tencent.matrix.lifecycle.k kVar);
}
