package tv2;

/* loaded from: classes10.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tv2.v f503861d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(tv2.v vVar) {
        super(0);
        this.f503861d = vVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.addAll(this.f503861d.f503864h.m59264x7efe73ec());
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(((r45.mb4) it.next()).m75945x2fec8307(0));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMD5String(...)");
            uv2.i iVar = uv2.i.f512922a;
            java.lang.String concat = "upload_".concat(a17);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(concat)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderUploadStage", "feedDeleteListener cancelSendTask " + concat);
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(concat);
            }
        }
        return jz5.f0.f384359a;
    }
}
