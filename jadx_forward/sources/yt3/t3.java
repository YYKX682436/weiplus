package yt3;

/* loaded from: classes5.dex */
public final class t3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.u3 f547217d;

    public t3(yt3.u3 u3Var) {
        this.f547217d = u3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/RecordFilterPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yt3.u3 u3Var = this.f547217d;
        boolean z17 = !u3Var.f547226g;
        u3Var.f547226g = z17;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_BEAUTIFY_ENABLE", z17);
        u3Var.f547224e.w(ju3.c0.f383438u, bundle);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/RecordFilterPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
