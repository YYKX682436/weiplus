package xh5;

/* loaded from: classes3.dex */
public final class b extends lf3.n implements cg3.a {

    /* renamed from: d, reason: collision with root package name */
    public cg3.c f536178d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // cg3.a
    public void H1(mf3.k info, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, db5.g4 g4Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
    }

    @Override // cg3.a
    public cg3.c U3() {
        return this.f536178d;
    }

    @Override // cg3.a
    /* renamed from: cancel */
    public void mo14793xae7a2e7a() {
    }

    @Override // cg3.a
    public void n5(cg3.d scanResult, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 selectInfo, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scanResult, "scanResult");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectInfo, "selectInfo");
    }

    @Override // cg3.a
    public void o4(java.lang.String imgPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgPath, "imgPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "preScanOCR imgPath: ".concat(imgPath));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b) m158354x19263085 : null;
        if (viewOnClickListenerC21748xb3d38e6b != null) {
            viewOnClickListenerC21748xb3d38e6b.x9(imgPath, true, true);
        }
    }

    @Override // cg3.a
    public void u0(mf3.k mediaInfo, android.graphics.Bitmap bitmap, cg3.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
    }

    @Override // cg3.a
    public void u3(cg3.c cVar) {
        this.f536178d = cVar;
    }
}
