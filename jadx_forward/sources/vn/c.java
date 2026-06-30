package vn;

/* loaded from: classes11.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f519701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f519702e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f519703f;

    public c(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, android.content.Context context, java.lang.String str) {
        this.f519701d = k0Var;
        this.f519702e = context;
        this.f519703f = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/util/ConvBoxTip$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f519701d.u();
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(this.f519702e, "com.tencent.mm.ui.LauncherUI");
        android.content.SharedPreferences d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d();
        if (d17 != null) {
            d17.edit().putBoolean("conversation_box_tip", true).apply();
        }
        intent.setFlags(67108864);
        android.content.Context context = this.f519702e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/chatroom/util/ConvBoxTip$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/chatroom/util/ConvBoxTip$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6363x8f18fad7 c6363x8f18fad7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6363x8f18fad7();
        c6363x8f18fad7.f137131d = c6363x8f18fad7.b("roomUsername", this.f519703f, true);
        c6363x8f18fad7.f137132e = 3L;
        c6363x8f18fad7.k();
        yj0.a.h(this, "com/tencent/mm/chatroom/util/ConvBoxTip$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
