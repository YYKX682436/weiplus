package m50;

/* loaded from: classes.dex */
public final class u implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f405036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m50.x f405037b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f405038c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f405039d;

    public u(boolean z17, m50.x xVar, int i17, yz5.a aVar) {
        this.f405036a = z17;
        this.f405037b = xVar;
        this.f405038c = i17;
        this.f405039d = aVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        boolean z18 = this.f405036a;
        int i17 = this.f405038c;
        m50.x xVar = this.f405037b;
        if (z18) {
            com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.n(xVar.c7(), xVar.g7(), 1, i17);
        } else {
            com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.m(xVar.c7(), xVar.g7(), 1, i17);
        }
        this.f405039d.mo152xb9724478();
    }
}
