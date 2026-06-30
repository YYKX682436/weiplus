package gu0;

/* loaded from: classes5.dex */
public final class z0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f357397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f357398e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(gu0.k2 k2Var, yz5.a aVar) {
        super(0);
        this.f357397d = k2Var;
        this.f357398e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f357397d.f357265h = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.Session", "openEditPage: LiteApp open failed");
        yz5.a aVar = this.f357398e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
