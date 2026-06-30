package y;

/* loaded from: classes16.dex */
public final class m2 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14327xf6cdefc6 f539932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f539933e;

    public m2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14327xf6cdefc6 c14327xf6cdefc6, yz5.a aVar) {
        this.f539932d = c14327xf6cdefc6;
        this.f539933e = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.ViewTreeObserver viewTreeObserver = this.f539932d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        this.f539933e.mo152xb9724478();
    }
}
