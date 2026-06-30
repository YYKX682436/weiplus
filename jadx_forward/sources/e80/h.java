package e80;

/* loaded from: classes12.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r70.c f331553d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r70.c cVar) {
        super(0);
        this.f331553d = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r70.c cVar = this.f331553d;
        cVar.f474607a.getClass();
        java.util.Iterator it = ((java.util.HashSet) ((jz5.n) ((v70.w) i95.n0.c(v70.w.class)).f515158m).mo141623x754a37bb()).iterator();
        while (it.hasNext()) {
            ((r70.b) it.next()).K3(cVar);
        }
        return jz5.f0.f384359a;
    }
}
