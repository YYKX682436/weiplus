package st2;

/* loaded from: classes3.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f493805d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(st2.h1 h1Var) {
        super(0);
        this.f493805d = h1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = ((mm2.c1) this.f493805d.f493868f.a(mm2.c1.class)).T;
        zl2.r4 r4Var = zl2.r4.f555483a;
        boolean z18 = r4Var.w1() || z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "isAnchorOrAssistant result: " + z18 + ", isAnchorLive: " + r4Var.w1() + ", isAssistant: " + z17);
        return java.lang.Boolean.valueOf(z18);
    }
}
