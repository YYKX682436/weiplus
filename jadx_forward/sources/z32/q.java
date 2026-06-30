package z32;

/* loaded from: classes.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z32.s f551462d;

    public q(z32.s sVar) {
        this.f551462d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        z32.s sVar = this.f551462d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sVar.f551468d) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("#", sVar.f551468d)) {
            android.content.Intent intent = new android.content.Intent(sVar.m158354x19263085(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13469x6a5106b4.class);
            java.lang.String str = sVar.f551469e;
            if (str == null) {
                str = "";
            }
            intent.putExtra("app_username", str);
            java.lang.String str2 = sVar.f551468d;
            intent.putExtra("rank_id", str2 != null ? str2 : "");
            intent.putExtra("key_is_like_read_only", true);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = sVar.m158354x19263085();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m158354x19263085, arrayList2.toArray(), "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            m158354x19263085.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(m158354x19263085, "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
