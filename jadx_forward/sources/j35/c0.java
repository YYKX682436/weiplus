package j35;

/* loaded from: classes14.dex */
public class c0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994 f379035d;

    public c0(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994 activityC19629x1cf9c994) {
        this.f379035d = activityC19629x1cf9c994;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994 activityC19629x1cf9c994 = this.f379035d;
        activityC19629x1cf9c994.f271062f = true;
        qp1.l0 l0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994.f271059h;
        if (l0Var != null) {
            l0Var.c();
            com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994.f271059h = null;
        }
        j35.f0 f0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994.f271058g;
        if (f0Var != null) {
            f0Var.b(activityC19629x1cf9c994);
            com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994.f271058g.d();
        }
        activityC19629x1cf9c994.finish();
    }
}
