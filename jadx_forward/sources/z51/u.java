package z51;

/* loaded from: classes10.dex */
public final class u implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z51.w f551759d;

    public u(z51.w wVar) {
        this.f551759d = wVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/player/component/LivePhotoThumbViewPc$buildView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        z51.w wVar = this.f551759d;
        if (!((z51.p) wVar.a(z51.p.class)).k()) {
            ((z51.p) wVar.a(z51.p.class)).i();
            wVar.f551766k = true;
        }
        yj0.a.i(true, this, "com/tencent/mm/player/component/LivePhotoThumbViewPc$buildView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
