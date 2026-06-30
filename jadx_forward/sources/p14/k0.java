package p14;

/* loaded from: classes.dex */
public class k0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17368x689ea64e f432764d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17368x689ea64e activityC17368x689ea64e) {
        this.f432764d = activityC17368x689ea64e;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17368x689ea64e activityC17368x689ea64e = this.f432764d;
        android.content.Intent intent = new android.content.Intent(activityC17368x689ea64e.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11448x932bffb8.class);
        intent.putExtra("is_force_unbind", true);
        activityC17368x689ea64e.mo55332x76847179().startActivityForResult(intent, 8);
    }
}
