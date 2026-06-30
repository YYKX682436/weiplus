package tj5;

/* loaded from: classes8.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22483x6b4c354e f501366d;

    public a0(com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22483x6b4c354e c22483x6b4c354e) {
        this.f501366d = c22483x6b4c354e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/search/WeAppWebSearchView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tj5.y yVar = this.f501366d.f291384m;
        if (yVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            yVar.mo74458x91b34899(view);
        }
        yj0.a.h(this, "com/tencent/mm/ui/search/WeAppWebSearchView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
