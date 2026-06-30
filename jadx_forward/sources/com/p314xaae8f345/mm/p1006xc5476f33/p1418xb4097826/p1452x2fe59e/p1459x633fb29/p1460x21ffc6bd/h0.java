package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd;

/* loaded from: classes2.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.j0 f189534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f189535e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f189536f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.j0 j0Var, boolean z17, ym5.s3 s3Var) {
        super(0);
        this.f189534d = j0Var;
        this.f189535e = z17;
        this.f189536f = s3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList<ym5.q1> linkedList = this.f189534d.f189541a;
        boolean z17 = this.f189535e;
        ym5.s3 s3Var = this.f189536f;
        synchronized (linkedList) {
            for (ym5.q1 q1Var : linkedList) {
                if (z17) {
                    q1Var.mo56054xc12c74c0(s3Var);
                } else {
                    q1Var.mo15403x2053b072(s3Var);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
