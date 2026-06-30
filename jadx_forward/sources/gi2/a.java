package gi2;

/* loaded from: classes10.dex */
public final class a implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1507xaf968b71.C14233xcca2a527 f353795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f353796e;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1507xaf968b71.C14233xcca2a527 c14233xcca2a527, yz5.a aVar) {
        this.f353795d = c14233xcca2a527;
        this.f353796e = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f353795d.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f353796e.mo152xb9724478();
        return true;
    }
}
