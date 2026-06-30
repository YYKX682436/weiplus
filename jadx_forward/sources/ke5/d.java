package ke5;

/* loaded from: classes9.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f388600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f388601e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f388602f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f388603g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ke5.a f388604h;

    public d(ke5.a aVar, int i17, int i18, boolean z17, boolean z18) {
        this.f388604h = aVar;
        this.f388600d = i17;
        this.f388601e = i18;
        this.f388602f = z17;
        this.f388603g = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        ke5.a aVar = this.f388604h;
        int j17 = aVar.f388574b.j();
        int i17 = this.f388600d;
        if (j17 <= i17 && i17 <= aVar.f388574b.o()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.AbstractDataPresenter", "[protectSetSelection] successfully! pos:" + i17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.AbstractDataPresenter", "[protectSetSelection] pos:" + i17 + " reTryCount:" + aVar.f388578f);
        yb5.d dVar = aVar.f388574b;
        boolean z17 = dVar.f542254p;
        boolean z18 = this.f388603g;
        boolean z19 = this.f388602f;
        if (z17) {
            dVar.U(i17, i65.a.b(dVar.g(), 120), z19, z18);
        } else {
            dVar.U(i17, this.f388601e, z19, z18);
        }
        int i18 = aVar.f388578f - 1;
        aVar.f388578f = i18;
        if (i18 >= 0) {
            aVar.f388574b.p().m75894x7c4d7ca2(this, 20L);
        }
    }
}
