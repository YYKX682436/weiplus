package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class l4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 f166284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f166285e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 q4Var, yz5.l lVar) {
        super(1);
        this.f166284d = q4Var;
        this.f166285e = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p6 it = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p6) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 q4Var = this.f166284d;
        if (!q4Var.f166605o.get()) {
            this.f166285e.mo146xb9724478(it);
            boolean z17 = it.f166426b instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q6;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k6 k6Var = q4Var.f166595e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 request = q4Var.f166592b;
            if (z17) {
                if (k6Var != null) {
                    k6Var.d(request, it);
                }
            } else if (k6Var != null) {
                k6Var.e(request, it);
            }
            int i17 = q4Var.f166603m;
            if (i17 > 0) {
                r81.f.INSTANCE.b(i17, 190);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CommonPkgFetcher", "onSuccess, request:" + request + ", response:" + it);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j6 j6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x6.f166945a;
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = q4Var.f166602l;
            java.util.LinkedList linkedList = concurrentLinkedQueue != null ? new java.util.LinkedList(concurrentLinkedQueue) : null;
            j6Var.getClass();
            java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j6.f166226b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.wi().getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.mj();
            try {
                java.util.Set g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j6.f166227c.g(request);
                if (g17 != null) {
                    java.util.Iterator it6 = g17.iterator();
                    while (it6.hasNext()) {
                        ((yz5.l) it6.next()).mo146xb9724478(it);
                    }
                }
                ((java.util.concurrent.ConcurrentHashMap) map).remove(request);
                java.util.Iterator it7 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j6.f166230f.iterator();
                while (it7.hasNext()) {
                    ((yz5.r) it7.next()).C(request, it, q4Var.f166594d, linkedList);
                }
            } catch (java.lang.Throwable th6) {
                ((java.util.concurrent.ConcurrentHashMap) map).remove(request);
                throw th6;
            }
        }
        return jz5.f0.f384359a;
    }
}
