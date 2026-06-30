package pf4;

/* loaded from: classes4.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pf4.e f435389e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pf4.c f435390f;

    public d(java.lang.String str, pf4.e eVar, pf4.c cVar) {
        this.f435388d = str;
        this.f435389e = eVar;
        this.f435390f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/adapter/GalleryAvatarAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.isSelected()) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", this.f435388d);
            intent.putExtra("Contact_ChatRoomId", this.f435389e.f435393e);
            intent.putExtra("CONTACT_INFO_UI_SOURCE", 15);
            j45.l.j(this.f435390f.f3639x46306858.getContext(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/adapter/GalleryAvatarAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
