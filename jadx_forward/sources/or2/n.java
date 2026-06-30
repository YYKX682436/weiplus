package or2;

/* loaded from: classes10.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f429195d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429196e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i17, java.lang.String str) {
        super(0);
        this.f429195d = i17;
        this.f429196e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6487xe42ecfcc c6487xe42ecfcc = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6487xe42ecfcc();
        c6487xe42ecfcc.f138286d = this.f429195d;
        java.lang.String str = this.f429196e;
        c6487xe42ecfcc.f138287e = java.lang.Long.parseLong(str);
        c6487xe42ecfcc.f138288f = c6487xe42ecfcc.b("commentSceneString", str, true);
        c6487xe42ecfcc.l();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFpsReporter", "[fpsReporter] " + c6487xe42ecfcc.n());
        return jz5.f0.f384359a;
    }
}
