package j35;

/* loaded from: classes14.dex */
public class d0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994 f379036d;

    public d0(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994 activityC19629x1cf9c994) {
        this.f379036d = activityC19629x1cf9c994;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994 activityC19629x1cf9c994 = this.f379036d;
        if (activityC19629x1cf9c994.f271062f) {
            return;
        }
        j35.f0 f0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994.f271058g;
        if (f0Var != null) {
            f0Var.b(activityC19629x1cf9c994);
            com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994.f271058g.d();
        }
        activityC19629x1cf9c994.finish();
    }
}
