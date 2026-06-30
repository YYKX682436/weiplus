package com.tencent.matrix.lifecycle;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B5\u0012\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0012"}, d2 = {"Lcom/tencent/matrix/lifecycle/ImmutableMultiSourceStatefulOwner;", "Lcom/tencent/matrix/lifecycle/MultiSourceStatefulOwner;", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "owner", "Ljz5/f0;", "addSourceOwner", "Landroidx/lifecycle/y;", "removeSourceOwner", "Lkotlin/Function1;", "", "Lcom/tencent/matrix/lifecycle/l;", "", "reduceOperator", "", "Lcom/tencent/matrix/lifecycle/IStatefulOwner;", "args", "<init>", "(Lyz5/l;[Lcom/tencent/matrix/lifecycle/IStatefulOwner;)V", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public class ImmutableMultiSourceStatefulOwner extends com.tencent.matrix.lifecycle.MultiSourceStatefulOwner {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImmutableMultiSourceStatefulOwner(yz5.l reduceOperator, com.tencent.matrix.lifecycle.IStatefulOwner... args) {
        super(reduceOperator, (com.tencent.matrix.lifecycle.IStatefulOwner[]) java.util.Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.o.g(reduceOperator, "reduceOperator");
        kotlin.jvm.internal.o.g(args, "args");
    }

    @Override // com.tencent.matrix.lifecycle.MultiSourceStatefulOwner
    public final void addSourceOwner(com.tencent.matrix.lifecycle.StatefulOwner owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.tencent.matrix.lifecycle.MultiSourceStatefulOwner
    public final void removeSourceOwner(com.tencent.matrix.lifecycle.StatefulOwner owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.tencent.matrix.lifecycle.MultiSourceStatefulOwner
    public final com.tencent.matrix.lifecycle.StatefulOwner addSourceOwner(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        throw new java.lang.UnsupportedOperationException();
    }
}
