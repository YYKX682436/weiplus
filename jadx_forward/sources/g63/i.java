package g63;

/* loaded from: classes8.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g63.j f350656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f350657e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g63.j jVar, java.util.List list) {
        super(0);
        this.f350656d = jVar;
        this.f350657e = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        g63.j jVar = this.f350656d;
        int mo1894x7e414b06 = jVar.mo1894x7e414b06();
        java.util.LinkedList linkedList = jVar.f350663g;
        java.util.List list = this.f350657e;
        linkedList.addAll(list);
        jVar.m8153xd399a4d9(mo1894x7e414b06, list.size());
        return jz5.f0.f384359a;
    }
}
