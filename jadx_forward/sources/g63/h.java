package g63;

/* loaded from: classes8.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g63.j f350652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z53.i f350653e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g63.j jVar, z53.i iVar) {
        super(0);
        this.f350652d = jVar;
        this.f350653e = iVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        g63.j jVar = this.f350652d;
        java.util.LinkedList linkedList = jVar.f350663g;
        z53.i iVar = this.f350653e;
        int indexOf = linkedList.indexOf(iVar);
        if (indexOf >= 0) {
            jVar.f350663g.set(indexOf, iVar);
            jVar.m8147xed6e4d18(indexOf);
        }
        return jz5.f0.f384359a;
    }
}
