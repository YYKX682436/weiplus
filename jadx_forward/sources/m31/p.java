package m31;

/* loaded from: classes9.dex */
public class p implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11167x3e42f9bc f404707d;

    public p(com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11167x3e42f9bc activityC11167x3e42f9bc) {
        this.f404707d = activityC11167x3e42f9bc;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11167x3e42f9bc activityC11167x3e42f9bc = this.f404707d;
        java.util.concurrent.atomic.AtomicLong atomicLong = activityC11167x3e42f9bc.f153406v;
        java.lang.String url = activityC11167x3e42f9bc.f153392e.f153349v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        long nanoTime = java.lang.System.nanoTime();
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p965xc41bc71e.p969x6b2e132.C11171xe3ef7b08(nanoTime, url, 0), p31.e.class, p31.a.f432981d);
        atomicLong.set(nanoTime);
    }
}
