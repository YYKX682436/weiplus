package ds2;

/* loaded from: classes2.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ds2.b0 f324385d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ds2.b0 b0Var) {
        super(0);
        this.f324385d = b0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ds2.b0 b0Var = this.f324385d;
        if (!b0Var.f324389d.isEmpty()) {
            int size = b0Var.f324386a.f546222f - b0Var.f324388c.size();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[pollWaiting] continue to preload next video. count=");
            sb6.append(size);
            sb6.append(" size=");
            java.util.LinkedList linkedList = b0Var.f324389d;
            sb6.append(linkedList.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f324392g, sb6.toString());
            kz5.g0.s(linkedList);
            for (int i17 = 0; i17 < size; i17++) {
                cs2.p pVar = (cs2.p) linkedList.pollFirst();
                if (pVar != null) {
                    b0Var.b(pVar);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
