package mi5;

/* loaded from: classes9.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x05.k f408415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f408416e;

    public n(x05.k kVar, java.lang.String str) {
        this.f408415d = kVar;
        this.f408416e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ChattingFinderLiveView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        te5.t tVar = te5.t.f500282a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        tVar.h(view, this.f408415d, this.f408416e);
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ChattingFinderLiveView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
