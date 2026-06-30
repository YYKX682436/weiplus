package tj5;

/* loaded from: classes8.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22484x63a3bec1 f501372d;

    public d0(com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22484x63a3bec1 c22484x63a3bec1) {
        this.f501372d = c22484x63a3bec1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/search/WebSearchView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tj5.y yVar = this.f501372d.f291389h;
        if (yVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            yVar.mo74458x91b34899(view);
        }
        yj0.a.h(this, "com/tencent/mm/ui/search/WebSearchView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
