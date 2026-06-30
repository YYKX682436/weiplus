package os3;

/* loaded from: classes8.dex */
public class b3 extends com.p314xaae8f345.p3210x3857dc.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16939x74e056 f429575a;

    public b3(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16939x74e056 activityC16939x74e056) {
        this.f429575a = activityC16939x74e056;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public boolean B(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        if (str.startsWith("weixin://private/getcontentwidth/")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16939x74e056.T6(this.f429575a, str);
            return true;
        }
        c27816xac2547f9.mo32265x141096a9(str);
        return true;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void n(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        ((yg0.s4) ((zg0.q3) i95.n0.c(zg0.q3.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.i(c27816xac2547f9, "weixin://private/getcontentwidth/", "document.getElementsByTagName('html')[0].scrollWidth;", true);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void v(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, float f17, float f18) {
        this.f429575a.f236442d.mo120153xd15cf999().F(android.webkit.WebSettings.LayoutAlgorithm.NORMAL);
    }
}
