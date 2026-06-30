package p61;

/* loaded from: classes5.dex */
public class q2 implements s61.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f433889a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11366xcba74a33 f433890b;

    public q2(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11366xcba74a33 activityC11366xcba74a33, java.lang.String str) {
        this.f433890b = activityC11366xcba74a33;
        this.f433889a = str;
    }

    @Override // s61.k1
    public void a(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11366xcba74a33 activityC11366xcba74a33 = this.f433890b;
        if (i17 == 2) {
            if (activityC11366xcba74a33.A) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11365x86ed685.Z6(activityC11366xcba74a33, !activityC11366xcba74a33.f154577u.isChecked(), !activityC11366xcba74a33.f154578v.isChecked());
                activityC11366xcba74a33.U6(-1);
                return;
            }
            android.content.Intent intent = new android.content.Intent(activityC11366xcba74a33, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11365x86ed685.class);
            intent.putExtra("kstyle_bind_wording", activityC11366xcba74a33.f154581y);
            intent.putExtra("kstyle_bind_recommend_show", activityC11366xcba74a33.f154582z);
            intent.putExtra("Kfind_friend_by_mobile_flag", activityC11366xcba74a33.f154577u.isChecked());
            intent.putExtra("Krecom_friends_by_mobile_flag", activityC11366xcba74a33.f154578v.isChecked());
            com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(activityC11366xcba74a33, intent);
            return;
        }
        if (i17 == 1) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11366xcba74a33.B;
            activityC11366xcba74a33.getClass();
            android.content.Intent intent2 = new android.content.Intent(activityC11366xcba74a33, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11367x42f5894c.class);
            intent2.putExtra("bindmcontact_mobile", this.f433889a);
            intent2.putExtra("kstyle_bind_wording", activityC11366xcba74a33.f154581y);
            intent2.putExtra("kstyle_bind_recommend_show", activityC11366xcba74a33.f154582z);
            intent2.putExtra("Kfind_friend_by_mobile_flag", activityC11366xcba74a33.f154577u.isChecked());
            intent2.putExtra("Krecom_friends_by_mobile_flag", activityC11366xcba74a33.f154578v.isChecked());
            if (activityC11366xcba74a33.A) {
                intent2.putExtra("bind_scene", 6);
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(activityC11366xcba74a33, intent2);
        }
    }
}
