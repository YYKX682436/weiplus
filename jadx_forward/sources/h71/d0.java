package h71;

/* loaded from: classes14.dex */
public class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11394xd9667693 f360917d;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11394xd9667693 activityC11394xd9667693) {
        this.f360917d = activityC11394xd9667693;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/security/ui/SecurityAccountIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11394xd9667693 activityC11394xd9667693 = this.f360917d;
        com.p314xaae8f345.mm.p944x882e457a.m1 eVar = !activityC11394xd9667693.f154762i ? new h11.e(activityC11394xd9667693.f154759f, 10, "", 0, "", activityC11394xd9667693.f154758e) : new r61.e1(activityC11394xd9667693.f154759f, 10, "", 0, "", "");
        gm0.j1.d().g(eVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11394xd9667693 activityC11394xd96676932 = this.f360917d;
        activityC11394xd96676932.f154763m = db5.e1.Q(activityC11394xd96676932, activityC11394xd96676932.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC11394xd9667693.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574448i83), true, true, new h71.c0(this, eVar));
        yj0.a.h(this, "com/tencent/mm/plugin/account/security/ui/SecurityAccountIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
