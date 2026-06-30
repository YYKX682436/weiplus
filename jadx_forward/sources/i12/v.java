package i12;

/* loaded from: classes15.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i12.x f368780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i22.n0 f368781e;

    public v(i12.x xVar, i22.n0 n0Var) {
        this.f368780d = xVar;
        this.f368781e = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder$onBind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i12.x xVar = this.f368780d;
        i22.p0 p0Var = xVar.f368786h;
        if (p0Var != null) {
            p0Var.b(xVar, xVar.m8183xf806b362(), this.f368781e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder$onBind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
