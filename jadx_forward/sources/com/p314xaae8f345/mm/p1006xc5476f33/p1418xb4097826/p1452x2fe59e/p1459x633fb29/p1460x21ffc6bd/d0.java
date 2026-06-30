package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd;

/* loaded from: classes2.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.j0 f189502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f189503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f189504f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.j0 j0Var, int i17, int i18) {
        super(0);
        this.f189502d = j0Var;
        this.f189503e = i17;
        this.f189504f = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList linkedList = this.f189502d.f189541a;
        int i17 = this.f189503e;
        int i18 = this.f189504f;
        synchronized (linkedList) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((ym5.q1) it.next()).mo56049xa44dd169(i17, i18);
            }
        }
        return jz5.f0.f384359a;
    }
}
