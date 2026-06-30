package k22;

/* loaded from: classes12.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k22.g f385014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.zj0 f385015e;

    public f(k22.g gVar, r45.zj0 zj0Var) {
        this.f385014d = gVar;
        this.f385015e = zj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog$updateEmotionRelativeInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        k22.g gVar = this.f385014d;
        j22.a.d(gVar.f385017e, 4, gVar.f385035z, gVar.A, gVar.f385020h);
        y12.m.e(gVar.f385016d, this.f385015e, false, 0, -1, -1, "", 0, false);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog$updateEmotionRelativeInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
