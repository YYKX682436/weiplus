package xv2;

/* loaded from: classes10.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xv2.j f538944d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(xv2.j jVar) {
        super(0);
        this.f538944d = jVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        xv2.j jVar = this.f538944d;
        linkedList.addAll(jVar.f538946h.m59264x7efe73ec());
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(((r45.mb4) it.next()).m75945x2fec8307(0));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMD5String(...)");
            java.lang.String n17 = jVar.n(a17);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f538947i, "feedDeleteListener cancelSendTask " + n17);
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(n17);
            }
        }
        return jz5.f0.f384359a;
    }
}
