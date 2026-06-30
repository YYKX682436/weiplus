package s61;

/* loaded from: classes15.dex */
public class m implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11375x7be2c669 f484901d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11375x7be2c669 activityC11375x7be2c669) {
        this.f484901d = activityC11375x7be2c669;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11375x7be2c669 activityC11375x7be2c669 = this.f484901d;
        java.lang.String str = activityC11375x7be2c669.f154660s;
        if (str == null || !str.contains("2")) {
            activityC11375x7be2c669.a7();
            return;
        }
        android.content.Intent intent = new android.content.Intent(activityC11375x7be2c669, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11376x2afd0f69.class);
        intent.putExtra("regsetinfo_ticket", activityC11375x7be2c669.f154658q);
        intent.putExtra("login_type", activityC11375x7be2c669.f154662u);
        intent.putExtra("regsetinfo_NextStyle", activityC11375x7be2c669.f154661t);
        com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(activityC11375x7be2c669, intent);
    }
}
