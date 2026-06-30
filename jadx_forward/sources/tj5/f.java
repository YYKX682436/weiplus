package tj5;

/* loaded from: classes8.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 f501374d;

    public f(com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381) {
        this.f501374d = c22479x68a26381;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/search/FTSEditTextView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381 = this.f501374d;
        c22479x68a26381.e();
        c22479x68a26381.f291349g.setEllipsize(null);
        c22479x68a26381.f291349g.setKeyListener(new android.text.method.TextKeyListener(android.text.method.TextKeyListener.Capitalize.NONE, false));
        tj5.n nVar = c22479x68a26381.E;
        if (nVar != null) {
            nVar.mo56570x81f2906b(view);
        }
        yj0.a.h(this, "com/tencent/mm/ui/search/FTSEditTextView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
