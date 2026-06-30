package ft0;

/* loaded from: classes14.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ft0.d f347988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f347989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f347990f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ft0.d dVar, boolean z17, boolean z18) {
        super(0);
        this.f347988d = dVar;
        this.f347989e = z17;
        this.f347990f = z18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(this.f347988d.f347994b, "release", new java.lang.Object[0]);
        ms0.c cVar = this.f347988d.f347995c;
        if (cVar != null) {
            ms0.c.o(cVar, false, 1, null);
        }
        ft0.d dVar = this.f347988d;
        dVar.f347996d = null;
        if (this.f347989e && this.f347990f) {
            synchronized (dVar.f347999g) {
                try {
                    dVar.f347999g.notifyAll();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(dVar.f347994b, e17, "notify release error", new java.lang.Object[0]);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
