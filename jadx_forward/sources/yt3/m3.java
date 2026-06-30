package yt3;

/* loaded from: classes10.dex */
public final class m3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.r3 f547072a;

    public m3(yt3.r3 r3Var) {
        this.f547072a = r3Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.h0
    public void a() {
        yt3.r3 r3Var = this.f547072a;
        r3Var.f547172t = true;
        r3Var.getClass();
        r3Var.w();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.h0
    public void b() {
        yt3.r3 r3Var = this.f547072a;
        java.util.concurrent.Future future = r3Var.f547176x;
        if (future != null) {
            future.cancel(false);
        }
        android.view.View view = r3Var.f547163h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/RecordButtonPlugin$setEnableType$2", "onPressDown", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/RecordButtonPlugin$setEnableType$2", "onPressDown", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int[] iArr = new int[2];
        r3Var.f547161f.getLocationOnScreen(iArr);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("PARAM_PREPARE_CAMERA_ZOOM_LOCATION_INT", iArr[1]);
        r3Var.f547160e.w(ju3.c0.f383404d, bundle);
        r3Var.f547162g.animate().alpha(0.0f).withEndAction(new yt3.l3(r3Var)).start();
        nu3.i iVar = nu3.i.f421751a;
        iVar.d(2);
        iVar.b(2);
        nu3.i.f421757g.f142482i = 1L;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.h0
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordButtonPlugin", "onLongPressFinish");
        yt3.r3 r3Var = this.f547072a;
        if (r3Var.f547172t) {
            r3Var.f547172t = false;
            ju3.d0.k(r3Var.f547160e, ju3.c0.f383452z, null, 2, null);
        } else {
            r3Var.n(false);
        }
        dx1.g.f326022a.j("SnsPublishProcess", "endSessionShot", 1, bx1.u.f117843e);
    }
}
