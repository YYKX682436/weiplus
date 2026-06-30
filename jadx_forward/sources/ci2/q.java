package ci2;

/* loaded from: classes10.dex */
public final class q implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 f123229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f123230e;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950, yz5.a aVar) {
        this.f123229d = c14245x86828950;
        this.f123230e = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.ViewTreeObserver viewTreeObserver = this.f123229d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        this.f123230e.mo152xb9724478();
        return true;
    }
}
