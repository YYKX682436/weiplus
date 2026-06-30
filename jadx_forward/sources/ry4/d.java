package ry4;

/* loaded from: classes.dex */
public final class d implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.g f483138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry4.a f483139e;

    public d(ry4.g gVar, ry4.a aVar) {
        this.f483138d = gVar;
        this.f483139e = aVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandAdapter$bindInteractions$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.g1 g1Var = this.f483138d.f483161i;
        if (g1Var != null) {
            g1Var.o(this.f483139e);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandAdapter$bindInteractions$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
