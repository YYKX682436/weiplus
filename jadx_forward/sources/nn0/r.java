package nn0;

/* loaded from: classes10.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final nn0.d0 f420136d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 f420137e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf f420138f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nn0.s f420139g;

    public r(nn0.s sVar, nn0.d0 d0Var, com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 interfaceC25479x1853e9c1, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        this.f420139g = sVar;
        this.f420136d = d0Var;
        this.f420137e = interfaceC25479x1853e9c1;
        this.f420138f = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf;
        if (sVar.f420159y != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("fromCustomRender", true);
            sVar.f420159y.mo15376x8cd414a7(999999, bundle);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf;
        nn0.c0 c0Var;
        java.lang.String str = this.f420139g.f420141d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mIsSetPlayerViewFirstRenderView callback ");
        nn0.d0 d0Var = this.f420136d;
        sb6.append(d0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 interfaceC25479x1853e9c1 = this.f420137e;
        if (interfaceC25479x1853e9c1 != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("fromCustomRender", true);
            interfaceC25479x1853e9c1.mo15376x8cd414a7(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46363x8f250ae2, bundle);
        }
        if (d0Var == null || (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = this.f420138f) == null) {
            return;
        }
        int hashCode = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.hashCode();
        int i17 = d0Var.f420092b;
        if (hashCode == i17 && (c0Var = d0Var.f420091a) != null) {
            ((mn0.p) c0Var).f411324a.mo152xb9724478();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewChangeFunction", "newViewCode: " + hashCode + " bindViewCode = " + i17);
    }
}
