package z32;

/* loaded from: classes.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f551436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z32.s f551437e;

    public e(java.lang.String str, z32.s sVar) {
        this.f551436d = str;
        this.f551437e = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", this.f551436d);
        j45.l.j(this.f551437e.m158354x19263085(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
