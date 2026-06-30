package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd;

/* loaded from: classes2.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.j0 f189522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f189523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f189524f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.j0 j0Var, int i17, int i18) {
        super(0);
        this.f189522d = j0Var;
        this.f189523e = i17;
        this.f189524f = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList linkedList = this.f189522d.f189541a;
        int i17 = this.f189523e;
        int i18 = this.f189524f;
        synchronized (linkedList) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((ym5.q1) it.next()).mo56051xb0566d03(i17, i18);
            }
        }
        return jz5.f0.f384359a;
    }
}
