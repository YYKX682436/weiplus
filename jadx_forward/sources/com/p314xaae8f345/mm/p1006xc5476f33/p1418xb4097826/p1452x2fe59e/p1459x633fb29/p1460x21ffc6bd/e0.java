package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd;

/* loaded from: classes2.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.j0 f189512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f189513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f189514f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f189515g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.j0 j0Var, int i17, int i18, java.lang.Object obj) {
        super(0);
        this.f189512d = j0Var;
        this.f189513e = i17;
        this.f189514f = i18;
        this.f189515g = obj;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList linkedList = this.f189512d.f189541a;
        int i17 = this.f189513e;
        int i18 = this.f189514f;
        java.lang.Object obj = this.f189515g;
        synchronized (linkedList) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((ym5.q1) it.next()).mo56050xa44dd169(i17, i18, obj);
            }
        }
        return jz5.f0.f384359a;
    }
}
