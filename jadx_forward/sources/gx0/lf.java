package gx0;

/* loaded from: classes5.dex */
public final class lf implements vu0.y {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f358219a;

    public lf(yz5.l resultBlock) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultBlock, "resultBlock");
        this.f358219a = resultBlock;
    }

    @Override // vu0.y
    public void a() {
        this.f358219a.mo146xb9724478(null);
    }

    @Override // vu0.y
    public void b() {
    }

    @Override // vu0.y
    public void c(java.util.List list) {
        java.util.ArrayList arrayList;
        if (list != null) {
            arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.util.LinkedList<r45.me4> sentenceGroup = ((r45.ne4) it.next()).f462844e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sentenceGroup, "sentenceGroup");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(sentenceGroup, 10));
                for (r45.me4 me4Var : sentenceGroup) {
                    arrayList2.add(new com.p314xaae8f345.p457x3304c6.p479x4179489f.C4131x387bddf0(new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33967x6fa736dc(me4Var.f461949m), com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33967x6fa736dc(me4Var.f461944e))));
                }
                kz5.h0.u(arrayList, arrayList2);
            }
        } else {
            arrayList = null;
        }
        this.f358219a.mo146xb9724478(arrayList);
    }

    @Override // vu0.y
    /* renamed from: onCancel */
    public void mo132434x3d6f0539() {
        this.f358219a.mo146xb9724478(null);
    }

    @Override // vu0.y
    /* renamed from: onProgress */
    public void mo132435x696ee52c(float f17) {
    }
}
