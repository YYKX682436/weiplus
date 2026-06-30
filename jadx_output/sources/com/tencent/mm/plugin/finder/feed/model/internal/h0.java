package com.tencent.mm.plugin.finder.feed.model.internal;

/* loaded from: classes2.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.j0 f108001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f108002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f108003f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.finder.feed.model.internal.j0 j0Var, boolean z17, ym5.s3 s3Var) {
        super(0);
        this.f108001d = j0Var;
        this.f108002e = z17;
        this.f108003f = s3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList<ym5.q1> linkedList = this.f108001d.f108008a;
        boolean z17 = this.f108002e;
        ym5.s3 s3Var = this.f108003f;
        synchronized (linkedList) {
            for (ym5.q1 q1Var : linkedList) {
                if (z17) {
                    q1Var.onPreFinishLoadMoreSmooth(s3Var);
                } else {
                    q1Var.onPreFinishLoadMore(s3Var);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
