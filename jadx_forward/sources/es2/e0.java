package es2;

/* loaded from: classes2.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ es2.h0 f337876d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(es2.h0 h0Var) {
        super(0);
        this.f337876d = h0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        es2.h0 h0Var = this.f337876d;
        if (!h0Var.f337905e.isEmpty()) {
            int size = h0Var.f337901a.f546222f - h0Var.f337904d.size();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[pollWaiting] continue to preload next video. count=");
            sb6.append(size);
            sb6.append(" size=");
            java.util.LinkedList linkedList = h0Var.f337905e;
            sb6.append(linkedList.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h0Var.f337908h, sb6.toString());
            kz5.g0.s(linkedList);
            for (int i17 = 0; i17 < size; i17++) {
                cs2.p pVar = (cs2.p) linkedList.pollFirst();
                if (pVar != null) {
                    h0Var.b(pVar);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
