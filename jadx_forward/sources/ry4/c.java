package ry4;

/* loaded from: classes.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.a f483120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry4.g f483121e;

    public c(ry4.a aVar, ry4.g gVar) {
        this.f483120d = aVar;
        this.f483121e = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandAdapter$bindInteractions$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int m8183xf806b362 = this.f483120d.m8183xf806b362();
        if (m8183xf806b362 == -1) {
            yj0.a.h(this, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandAdapter$bindInteractions$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ry4.g gVar = this.f483121e;
        gVar.f483158f.mo149xb9724478(gVar.f483156d.get(m8183xf806b362), java.lang.Integer.valueOf(m8183xf806b362));
        yj0.a.h(this, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandAdapter$bindInteractions$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
