package d04;

/* loaded from: classes13.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb f306934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f306935e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f306936f;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb c17326x8613bffb, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f306934d = c17326x8613bffb;
        this.f306935e = i17;
        this.f306936f = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView$showSuccessView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb c17326x8613bffb = this.f306934d;
        int i17 = this.f306935e;
        c17326x8613bffb.f241224x0 = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.i2 i2Var = c17326x8613bffb.f241221p0;
        if (i2Var != null) {
            i2Var.a(i17, (android.view.View) this.f306936f.f391656d);
        }
        java.util.Iterator<T> it = c17326x8613bffb.m68766xd611573d().iterator();
        while (it.hasNext()) {
            ((android.view.View) it.next()).setOnClickListener(null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView$showSuccessView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
