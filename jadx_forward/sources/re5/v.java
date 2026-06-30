package re5;

/* loaded from: classes8.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.o2 f476134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f476135e;

    public v(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.o2 o2Var, android.widget.TextView textView) {
        this.f476134d = o2Var;
        this.f476135e = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/uic/video/LocalVideoPlayerErrorPanelUIC$setErrorPanelVisibility$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f476135e.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.u0) this.f476134d).n(context);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/uic/video/LocalVideoPlayerErrorPanelUIC$setErrorPanelVisibility$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
