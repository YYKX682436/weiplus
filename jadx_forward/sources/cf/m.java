package cf;

/* loaded from: classes7.dex */
public final class m implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f122360d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.ArrayMap f122361e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f122362f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f122363g;

    public m(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f122360d = appId;
        this.f122361e = new android.util.ArrayMap(((kz5.b) cf.j.f122357a).d());
        this.f122362f = jz5.h.b(new cf.l(this));
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        yz5.a aVar;
        if ((str == null || str.length() == 0) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f122360d) || bVar == null || (aVar = (yz5.a) this.f122361e.get(bVar)) == null) {
            return;
        }
        aVar.mo152xb9724478();
    }

    public final void a(yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f122361e.put(u81.b.BACKGROUND, callback);
    }

    public final void b(yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f122361e.put(u81.b.DESTROYED, callback);
    }
}
