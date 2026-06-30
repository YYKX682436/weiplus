package on2;

/* loaded from: classes3.dex */
public final class t2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f428550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ on2.z2 f428551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f428552f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(boolean z17, on2.z2 z2Var, java.lang.String str) {
        super(0);
        this.f428550d = z17;
        this.f428551e = z2Var;
        this.f428552f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f428552f;
        on2.z2 z2Var = this.f428551e;
        boolean z17 = this.f428550d;
        if (z17) {
            z2Var.c7(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLotterySlice", "removeLotteryInfoFromList localLotteryInfo:" + z2Var.f428625m + " remove:" + pm0.v.d0(z2Var.f428624i, new on2.s2(str)) + ",saveId:" + z17 + '!');
        z2Var.Z6("remove", false);
        return jz5.f0.f384359a;
    }
}
