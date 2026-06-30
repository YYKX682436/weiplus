package xw2;

/* loaded from: classes2.dex */
public final class m implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f539240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f539241e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xw2.s f539242f;

    public m(android.widget.LinearLayout linearLayout, android.view.ViewGroup viewGroup, xw2.s sVar) {
        this.f539240d = linearLayout;
        this.f539241e = viewGroup;
        this.f539242f = sVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.widget.LinearLayout linearLayout = this.f539240d;
        int childCount = linearLayout.getChildCount();
        if (childCount < intValue) {
            int i17 = intValue - childCount;
            for (int i18 = 0; i18 < i17; i18++) {
                linearLayout.addView(android.view.LayoutInflater.from(this.f539241e.getContext()).inflate(this.f539242f.mo63149x721372b7(), (android.view.ViewGroup) linearLayout, false));
            }
        } else if (childCount > intValue) {
            int i19 = childCount - intValue;
            for (int i27 = 0; i27 < i19; i27++) {
                linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
            }
        }
        return jz5.f0.f384359a;
    }
}
