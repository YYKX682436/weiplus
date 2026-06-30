package qs1;

/* loaded from: classes8.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qs1.m f447754d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(qs1.m mVar) {
        super(0);
        this.f447754d = mVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qs1.m mVar = this.f447754d;
        java.lang.Object systemService = mVar.f447761a.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((android.view.WindowManager) systemService).getDefaultDisplay().getRealMetrics(new android.util.DisplayMetrics());
        int i17 = (int) (r2.heightPixels * 0.75d);
        ss1.d dVar = new ss1.d(mVar.f447761a, 0, 2, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizCustomBottomSheetHelper", "peekHeight:" + i17);
        if (i17 <= 0) {
            i17 = -2;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(mVar.a(), -1);
        android.view.ViewGroup viewGroup = dVar.f493430s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
        android.view.View view = mVar.f447770j;
        viewGroup.addView(view, 0, layoutParams);
        if (i17 > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1304xd1075a44.C13024x615b62e1 c13024x615b62e1 = view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1304xd1075a44.C13024x615b62e1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1304xd1075a44.C13024x615b62e1) view : null;
            if (c13024x615b62e1 != null) {
                c13024x615b62e1.m54421x25bfb969(i17);
            }
        }
        dVar.f493425n = true;
        android.view.ViewGroup viewGroup2 = dVar.f493431t;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        dVar.f493429r = true;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = dVar.f493426o;
        if (c2690x46972046 != null) {
            c2690x46972046.f125986z = new ss1.a(dVar);
        }
        return dVar;
    }
}
