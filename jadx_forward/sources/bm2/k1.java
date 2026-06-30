package bm2;

/* loaded from: classes.dex */
public final class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f103560d;

    public k1(yz5.l lVar) {
        this.f103560d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        this.f103560d.mo146xb9724478(view);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
