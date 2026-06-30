package id2;

/* loaded from: classes3.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f372091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f372092e;

    public f(android.content.DialogInterface.OnClickListener onClickListener, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var) {
        this.f372091d = onClickListener;
        this.f372092e = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/uic/ChatRoomCustomUIC$initOnCreate$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.DialogInterface.OnClickListener onClickListener = this.f372091d;
        if (onClickListener != null) {
            onClickListener.onClick(null, -2);
        }
        this.f372092e.B();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/uic/ChatRoomCustomUIC$initOnCreate$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
