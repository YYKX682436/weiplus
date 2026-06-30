package ai0;

/* loaded from: classes3.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ai0.i f5072d;

    public j(ai0.i iVar) {
        this.f5072d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/yuanbao/widget/YuanBaoHalfScreenDialog$buildClickableSpan$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f5072d.f5069b.onClick(view);
        yj0.a.h(this, "com/tencent/mm/feature/yuanbao/widget/YuanBaoHalfScreenDialog$buildClickableSpan$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
