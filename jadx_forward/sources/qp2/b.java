package qp2;

/* loaded from: classes2.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f447296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qp2.g f447297e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f447298f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z17, qp2.g gVar, r45.qt2 qt2Var) {
        super(0);
        this.f447296d = z17;
        this.f447297e = gVar;
        this.f447298f = qt2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyLiveSquareTabLayoutUIC", "fetchLiveSquareTabs success:" + this.f447296d);
        this.f447297e.c(this.f447298f);
        return jz5.f0.f384359a;
    }
}
