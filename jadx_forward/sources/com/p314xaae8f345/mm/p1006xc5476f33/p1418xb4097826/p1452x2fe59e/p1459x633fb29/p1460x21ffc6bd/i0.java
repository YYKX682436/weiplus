package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd;

/* loaded from: classes2.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.j0 f189538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f189539e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.j0 j0Var, ym5.s3 s3Var) {
        super(0);
        this.f189538d = j0Var;
        this.f189539e = s3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList linkedList = this.f189538d.f189541a;
        ym5.s3 s3Var = this.f189539e;
        synchronized (linkedList) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((ym5.q1) it.next()).mo15404x8041b4e4(s3Var);
            }
        }
        return jz5.f0.f384359a;
    }
}
