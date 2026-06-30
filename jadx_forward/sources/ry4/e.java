package ry4;

/* loaded from: classes.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.g f483149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8 f483150e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f483151f;

    public e(ry4.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8 c19510x90fb7cb8, int i17) {
        this.f483149d = gVar;
        this.f483150e = c19510x90fb7cb8;
        this.f483151f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandAdapter$bindInteractions$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f483149d.f483158f.mo149xb9724478(this.f483150e, java.lang.Integer.valueOf(this.f483151f));
        yj0.a.h(this, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandAdapter$bindInteractions$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
