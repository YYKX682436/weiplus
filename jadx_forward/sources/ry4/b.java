package ry4;

/* loaded from: classes.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.a f483112d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry4.g f483113e;

    public b(ry4.a aVar, ry4.g gVar) {
        this.f483112d = aVar;
        this.f483113e = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandAdapter$bindInteractions$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int m8183xf806b362 = this.f483112d.m8183xf806b362();
        if (m8183xf806b362 == -1) {
            yj0.a.h(this, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandAdapter$bindInteractions$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ry4.g gVar = this.f483113e;
        if (gVar.f483163n.contains(java.lang.Integer.valueOf(m8183xf806b362))) {
            gVar.f483163n.remove(java.lang.Integer.valueOf(m8183xf806b362));
        } else {
            gVar.f483163n.add(java.lang.Integer.valueOf(m8183xf806b362));
        }
        gVar.m8148xed6e4d18(m8183xf806b362, "PAYLOAD_SELECTION");
        gVar.f483159g.mo146xb9724478(java.lang.Integer.valueOf(gVar.f483163n.size()));
        yj0.a.h(this, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandAdapter$bindInteractions$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
