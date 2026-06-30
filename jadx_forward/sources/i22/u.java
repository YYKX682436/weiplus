package i22;

/* loaded from: classes15.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i22.v f369566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i22.n0 f369567e;

    public u(i22.v vVar, i22.n0 n0Var) {
        this.f369566d = vVar;
        this.f369567e = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder$onBind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i22.v vVar = this.f369566d;
        i22.p0 p0Var = vVar.f369577n;
        if (p0Var != null) {
            p0Var.b(vVar, vVar.m8183xf806b362(), this.f369567e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder$onBind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
