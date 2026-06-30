package g63;

/* loaded from: classes8.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g63.j f350633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z53.i f350634e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g63.j jVar, z53.i iVar) {
        super(0);
        this.f350633d = jVar;
        this.f350634e = iVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        g63.j jVar = this.f350633d;
        int indexOf = jVar.f350663g.indexOf(this.f350634e);
        if (indexOf >= 0) {
            jVar.f350663g.remove(indexOf);
            jVar.m8155x27702c4(indexOf);
        }
        return jz5.f0.f384359a;
    }
}
