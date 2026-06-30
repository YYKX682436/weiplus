package sv2;

/* loaded from: classes8.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sv2.v f494885d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(sv2.v vVar) {
        super(0);
        this.f494885d = vVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        sv2.v vVar = this.f494885d;
        linkedList.addAll(vVar.f494889m.m59264x7efe73ec());
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(((r45.mb4) it.next()).m75945x2fec8307(0));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMD5String(...)");
            java.lang.String concat = "uploaddraft_".concat(a17);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(concat)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f494888i, "feedDeleteListener cancelSendTask " + concat);
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(concat);
            }
        }
        return jz5.f0.f384359a;
    }
}
