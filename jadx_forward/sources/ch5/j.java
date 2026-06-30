package ch5;

/* loaded from: classes3.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f123120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f123121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f123122f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22418xd23ce184 f123123g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f123124h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f123125i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i17, int i18, long j17, com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22418xd23ce184 c22418xd23ce184, yz5.l lVar, yz5.a aVar) {
        super(0);
        this.f123120d = i17;
        this.f123121e = i18;
        this.f123122f = j17;
        this.f123123g = c22418xd23ce184;
        this.f123124h = lVar;
        this.f123125i = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(this.f123120d, this.f123121e);
        ofInt.setDuration(this.f123122f);
        ch5.i iVar = new ch5.i(this.f123123g, this.f123124h);
        ch5.h hVar = new ch5.h(this.f123125i, ofInt, iVar);
        ofInt.addUpdateListener(iVar);
        ofInt.addListener(hVar);
        ofInt.start();
        return jz5.f0.f384359a;
    }
}
