package com.tencent.mm.plugin.finder.feed.model.internal;

/* loaded from: classes2.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.j0 f108005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f108006e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.finder.feed.model.internal.j0 j0Var, ym5.s3 s3Var) {
        super(0);
        this.f108005d = j0Var;
        this.f108006e = s3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList = this.f108005d.f108008a;
        ym5.s3 s3Var = this.f108006e;
        synchronized (linkedList) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((ym5.q1) it.next()).onPreFinishRefresh(s3Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
