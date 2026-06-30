package f12;

/* loaded from: classes4.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 f340202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340203e;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 activityC13254xf536ee79, java.lang.String str) {
        this.f340202d = activityC13254xf536ee79;
        this.f340203e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f12.c0 c0Var = this.f340202d.f178973f;
        if (c0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        c0Var.f340121q.m64938x75cc54fa(this.f340203e);
    }
}
