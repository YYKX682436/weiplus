package tj5;

/* loaded from: classes2.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 f501389d;

    public u(com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92) {
        this.f501389d = c22482x50bddb92;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/search/FTSSearchView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tj5.w wVar = this.f501389d.f291377p;
        if (wVar != null) {
            wVar.mo56568x81ab18cc(view);
        }
        yj0.a.h(this, "com/tencent/mm/ui/search/FTSSearchView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
