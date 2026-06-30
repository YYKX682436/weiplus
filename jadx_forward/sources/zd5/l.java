package zd5;

/* loaded from: classes9.dex */
public final class l implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zd5.n f553230d;

    public l(zd5.n nVar) {
        this.f553230d = nVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/search/multi/adapter/FTSMultiNormalResultAdapter$onCreateViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.Object tag = view.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) tag).intValue();
        zd5.n nVar = this.f553230d;
        nVar.f553234f.a6(view, intValue, nVar.f553233e.mo127525xfb80e389(intValue));
        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/search/multi/adapter/FTSMultiNormalResultAdapter$onCreateViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
