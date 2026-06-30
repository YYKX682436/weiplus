package ry4;

/* loaded from: classes.dex */
public final class f implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.a f483153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry4.g f483154e;

    public f(ry4.a aVar, ry4.g gVar) {
        this.f483153d = aVar;
        this.f483154e = gVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandAdapter$bindInteractions$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        ry4.a aVar = this.f483153d;
        int m8183xf806b362 = aVar.m8183xf806b362();
        if (m8183xf806b362 == -1) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandAdapter$bindInteractions$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        ry4.g gVar = this.f483154e;
        yz5.q qVar = gVar.f483160h;
        java.lang.Object obj = gVar.f483156d.get(m8183xf806b362);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(m8183xf806b362);
        android.view.View itemView = aVar.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        qVar.mo147xb9724478(obj, valueOf, itemView);
        yj0.a.i(true, this, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandAdapter$bindInteractions$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
