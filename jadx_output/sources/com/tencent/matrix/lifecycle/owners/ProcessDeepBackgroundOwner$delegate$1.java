package com.tencent.matrix.lifecycle.owners;

@kotlin.Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"com/tencent/matrix/lifecycle/owners/ProcessDeepBackgroundOwner$delegate$1", "Lcom/tencent/matrix/lifecycle/ImmutableMultiSourceStatefulOwner;", "Lcom/tencent/matrix/lifecycle/j;", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class ProcessDeepBackgroundOwner$delegate$1 extends com.tencent.matrix.lifecycle.ImmutableMultiSourceStatefulOwner implements com.tencent.matrix.lifecycle.j {
    public ProcessDeepBackgroundOwner$delegate$1(yz5.l lVar, com.tencent.matrix.lifecycle.IStatefulOwner[] iStatefulOwnerArr) {
        super(lVar, iStatefulOwnerArr);
    }

    @Override // com.tencent.matrix.lifecycle.j
    public boolean serial() {
        return true;
    }
}
