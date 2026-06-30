package p61;

/* loaded from: classes5.dex */
public class v2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11367x42f5894c f433927d;

    public v2(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11367x42f5894c activityC11367x42f5894c) {
        this.f433927d = activityC11367x42f5894c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindMobileVerifyUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11367x42f5894c activityC11367x42f5894c = this.f433927d;
        activityC11367x42f5894c.mo48674x36654fab();
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("bindmcontact_mobile", activityC11367x42f5894c.f154584f);
        bundle.putInt("voice_verify_type", 4);
        intent.putExtras(bundle);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.x(activityC11367x42f5894c, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMobileVerifyUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
