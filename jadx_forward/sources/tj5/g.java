package tj5;

/* loaded from: classes8.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 f501375d;

    public g(com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381) {
        this.f501375d = c22479x68a26381;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/search/FTSEditTextView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381 = this.f501375d;
        tj5.l lVar = c22479x68a26381.B;
        if (lVar != null) {
            lVar.Y3(c22479x68a26381.f291364y);
        }
        yj0.a.h(this, "com/tencent/mm/ui/search/FTSEditTextView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
