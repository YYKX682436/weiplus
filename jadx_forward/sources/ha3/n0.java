package ha3;

/* loaded from: classes15.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.o0 f361439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361440e;

    public n0(ha3.o0 o0Var, java.lang.String str) {
        this.f361439d = o0Var;
        this.f361440e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ha3.o0 o0Var = this.f361439d;
        if (com.p314xaae8f345.mm.vfs.w6.j(o0Var.f361444e)) {
            com.p314xaae8f345.mm.vfs.w6.x(o0Var.f361444e, o0Var.f361445f, true);
            java.lang.String str = o0Var.f361446g;
            try {
                o0Var.f361443d.mo37932xc5dd699b(this.f361440e, com.p314xaae8f345.mm.vfs.w6.M(o0Var.f361445f));
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(o0Var.f361446g, "unable to parse m3u8 content");
            }
        }
    }
}
