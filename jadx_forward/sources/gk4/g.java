package gk4;

/* loaded from: classes10.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.r f354085d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(gk4.r rVar) {
        super(0);
        this.f354085d = rVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f354085d.f354135g, "invoke first frame callback, pts:" + this.f354085d.f354145q);
        yz5.a aVar = this.f354085d.f354132d;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        this.f354085d.f354132d = null;
        return jz5.f0.f384359a;
    }
}
