package wh5;

/* loaded from: classes12.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wh5.s f527604d;

    public j(wh5.s sVar) {
        this.f527604d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/media/chat/live/ChatLiveBottomBarLayer$attach$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wh5.s.g0(this.f527604d, dg3.q.f313881o);
        yj0.a.h(this, "com/tencent/mm/ui/media/chat/live/ChatLiveBottomBarLayer$attach$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
