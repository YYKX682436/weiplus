package p61;

/* loaded from: classes5.dex */
public class m1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11361xb56cc096 f433846d;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11361xb56cc096 activityC11361xb56cc096) {
        this.f433846d = activityC11361xb56cc096;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindMContactStatusUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11364xda6e5bc5.g7();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11361xb56cc096 activityC11361xb56cc096 = this.f433846d;
        android.content.Intent intent = activityC11361xb56cc096.getIntent();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11361xb56cc096.f154512i;
        if (!intent.getBooleanExtra("intent_back_launcherui", false)) {
            activityC11361xb56cc096.W6(1);
            yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMContactStatusUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.addFlags(67108864);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.u(intent2, activityC11361xb56cc096);
            yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMContactStatusUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
