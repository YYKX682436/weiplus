package vc2;

/* loaded from: classes15.dex */
public class b implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f516768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1456x30012e.C13830x9baef275 f516769e;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1456x30012e.C13830x9baef275 c13830x9baef275, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f516769e = c13830x9baef275;
        this.f516768d = c1163xf1deaba4;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f516768d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1456x30012e.C13830x9baef275 c13830x9baef275 = this.f516769e;
        c13830x9baef275.f188297q = null;
        wc2.a aVar = c13830x9baef275.f188293m;
        aVar.f526031b = c13830x9baef275.f188292i.c();
        aVar.f526033d.clear();
        aVar.e();
    }
}
