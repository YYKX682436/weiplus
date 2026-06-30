package es2;

/* loaded from: classes2.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ es2.h0 f337878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(es2.h0 h0Var) {
        super(0);
        this.f337878d = h0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        es2.h0 h0Var = this.f337878d;
        java.lang.String str = h0Var.f337908h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resetRunningTask loading:");
        java.util.HashMap hashMap = h0Var.f337904d;
        sb6.append(hashMap.size());
        sb6.append(" waiting:");
        java.util.LinkedList linkedList = h0Var.f337905e;
        sb6.append(linkedList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.addAll(hashMap.values());
        java.util.Iterator it = linkedList2.iterator();
        while (it.hasNext()) {
            h0Var.a(((cs2.p) it.next()).f303625i2, true, "resetRunningTask");
        }
        return java.lang.Boolean.valueOf(linkedList.addAll(linkedList2));
    }
}
