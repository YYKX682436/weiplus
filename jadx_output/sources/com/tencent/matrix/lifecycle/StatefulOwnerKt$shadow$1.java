package com.tencent.matrix.lifecycle;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/matrix/lifecycle/StatefulOwnerKt$shadow$1", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class StatefulOwnerKt$shadow$1 extends com.tencent.matrix.lifecycle.StatefulOwner {
    final /* synthetic */ boolean $serial;
    final /* synthetic */ com.tencent.matrix.lifecycle.IStatefulOwner $this_shadow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatefulOwnerKt$shadow$1(com.tencent.matrix.lifecycle.IStatefulOwner iStatefulOwner, boolean z17, boolean z18) {
        super(z18);
        this.$this_shadow = iStatefulOwner;
        this.$serial = z17;
        iStatefulOwner.observeForever(new com.tencent.matrix.lifecycle.b1(this));
    }
}
