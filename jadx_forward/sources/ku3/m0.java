package ku3;

/* loaded from: classes3.dex */
public final class m0 implements yt3.r2, p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final zt3.a f393844d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f393845e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f393846f;

    public m0(zt3.a kitContext, android.view.ViewGroup parent, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kitContext, "kitContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f393844d = kitContext;
        this.f393845e = jz5.h.b(new ku3.l0(parent));
    }

    public final android.view.View a() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393845e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        zt3.c cVar = (zt3.c) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitNineGridPlugin", "onChanged >> " + cVar);
        if (cVar == null) {
            return;
        }
        android.view.View a17 = a();
        int i17 = cVar.f557121b ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitNineGridPlugin", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/MenuInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(a17, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitNineGridPlugin", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/MenuInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // yt3.r2
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        this.f393844d.R6(new ku3.k0(this));
    }
}
