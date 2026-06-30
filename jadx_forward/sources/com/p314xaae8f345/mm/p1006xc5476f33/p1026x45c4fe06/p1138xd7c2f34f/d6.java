package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class d6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l6 f166100d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l6 l6Var) {
        super(1);
        this.f166100d = l6Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 it = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancelPreDownloadTasks for args(scene:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l6 l6Var = this.f166100d;
        sb6.append(l6Var.f166286a);
        sb6.append(", username:");
        java.lang.String str = l6Var.f166287b;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(", appId:");
        java.lang.String str2 = l6Var.f166288c;
        sb6.append(str2 != null ? str2 : "");
        sb6.append("), request:");
        sb6.append(it.f166592b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ICommonPkgFetcher", sb6.toString());
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = it.f166605o;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = it.f166604n;
        try {
            java.util.Iterator it6 = concurrentLinkedQueue.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua.Ai((m81.b) it6.next());
            }
            concurrentLinkedQueue.clear();
            atomicBoolean.set(true);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j4) it.f166598h).mo149xb9724478(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a6.f166021f, null);
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            concurrentLinkedQueue.clear();
            atomicBoolean.set(true);
            throw th6;
        }
    }
}
