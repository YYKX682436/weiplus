package gh4;

/* loaded from: classes8.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f353472a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f353473b;

    static {
        gh4.m0 m0Var = new gh4.m0();
        java.lang.String str = m0Var.a() + "coverimg/";
        f353472a = str;
        java.lang.String str2 = com.p314xaae8f345.mm.vfs.q7.c("taskbar") + "/coverimg/";
        f353473b = str2;
        if (!com.p314xaae8f345.mm.vfs.w6.j(m0Var.a())) {
            com.p314xaae8f345.mm.vfs.w6.u(m0Var.a());
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.mm.vfs.w6.u(str);
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            return;
        }
        com.p314xaae8f345.mm.vfs.w6.u(str2);
    }

    public final java.lang.String a() {
        return gm0.j1.u().d() + "taskbar/";
    }
}
