package p61;

/* loaded from: classes5.dex */
public class o2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11366xcba74a33 f433866d;

    public o2(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11366xcba74a33 activityC11366xcba74a33) {
        this.f433866d = activityC11366xcba74a33;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindMobileUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11366xcba74a33 activityC11366xcba74a33 = this.f433866d;
        intent.putExtra("country_name", activityC11366xcba74a33.f154570n);
        intent.putExtra("couttry_code", activityC11366xcba74a33.f154571o);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.o(intent, activityC11366xcba74a33, 100);
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMobileUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
