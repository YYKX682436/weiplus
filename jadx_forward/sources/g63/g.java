package g63;

/* loaded from: classes8.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g63.j f350648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f350649e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(g63.j jVar, java.util.List list) {
        super(0);
        this.f350648d = jVar;
        this.f350649e = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        g63.j jVar = this.f350648d;
        int size = jVar.f350663g.size();
        jVar.f350663g.clear();
        jVar.m8154xdb81fc7f(0, size);
        java.util.List data = this.f350649e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        pm0.v.X(new g63.i(jVar, data));
        return jz5.f0.f384359a;
    }
}
