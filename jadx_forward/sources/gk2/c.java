package gk2;

/* loaded from: classes3.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f354002d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(gk2.e eVar) {
        super(0);
        this.f354002d = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gk2.e eVar = this.f354002d;
        if (eVar.f354007h.f93138c == p012xc85e97e9.p093xedfae76a.n.DESTROYED) {
            eVar.f354007h = new p012xc85e97e9.p093xedfae76a.b0(eVar, true);
            eVar.f354008i = new yg2.b(eVar, "liveScope");
        }
        eVar.f354007h.i(p012xc85e97e9.p093xedfae76a.n.RESUMED);
        return jz5.f0.f384359a;
    }
}
