package z32;

/* loaded from: classes.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z32.s f551460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f551461e;

    public p(z32.s sVar, java.lang.String str) {
        this.f551460d = sVar;
        this.f551461e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        z32.s sVar = this.f551460d;
        sVar.getClass();
        android.content.Intent intent = new android.content.Intent(sVar.m158354x19263085(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13481xc7ac0134.class);
        intent.putExtra(dm.i4.f66875xa013b0d5, this.f551461e);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = sVar.m158354x19263085();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(m158354x19263085, arrayList2.toArray(), "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC", "startSportHistoryActivity", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        m158354x19263085.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(m158354x19263085, "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC", "startSportHistoryActivity", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
