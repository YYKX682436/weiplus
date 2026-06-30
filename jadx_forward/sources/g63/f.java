package g63;

/* loaded from: classes8.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g63.j f350637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z53.i f350638e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g63.j jVar, z53.i iVar) {
        super(0);
        this.f350637d = jVar;
        this.f350638e = iVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        g63.j jVar = this.f350637d;
        java.util.LinkedList linkedList = jVar.f350663g;
        z53.i iVar = this.f350638e;
        int indexOf = linkedList.indexOf(iVar);
        java.util.LinkedList linkedList2 = jVar.f350663g;
        if (indexOf >= 0) {
            linkedList2.remove(indexOf);
            jVar.m8155x27702c4(indexOf);
        }
        linkedList2.add(0, iVar);
        jVar.m8149x8b456734(0);
        return jz5.f0.f384359a;
    }
}
