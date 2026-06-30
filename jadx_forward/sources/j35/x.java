package j35;

/* loaded from: classes5.dex */
public class x implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19627x87d09a1e f379058d;

    public x(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19627x87d09a1e activityC19627x87d09a1e) {
        this.f379058d = activityC19627x87d09a1e;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19627x87d09a1e activityC19627x87d09a1e = this.f379058d;
        activityC19627x87d09a1e.finish();
        j35.g0 g0Var = (j35.g0) j35.u.f379055b.remove(activityC19627x87d09a1e.f271048f);
        if (g0Var != null) {
            g0Var.a(activityC19627x87d09a1e.f271049g, 0, null);
        }
    }
}
