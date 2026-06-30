package wv2;

/* loaded from: classes10.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wv2.m f531548d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(wv2.m mVar) {
        super(0);
        this.f531548d = mVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        wv2.m mVar = this.f531548d;
        linkedList.addAll(mVar.f531551h.m59264x7efe73ec());
        java.util.Iterator<T> it = mVar.f531551h.m59214x2de915fd().iterator();
        while (it.hasNext()) {
            linkedList.addAll(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it.next()).m59264x7efe73ec());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(((r45.mb4) it6.next()).m75945x2fec8307(0));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMD5String(...)");
            java.lang.String q17 = mVar.q(a17);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvUploadStage", "feedDeleteListener cancelSendTask " + q17);
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(q17);
            }
        }
        return jz5.f0.f384359a;
    }
}
