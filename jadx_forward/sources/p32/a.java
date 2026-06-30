package p32;

/* loaded from: classes8.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f432989d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.r6 f432990e;

    public a(java.lang.String str, com.p314xaae8f345.mm.vfs.r6 r6Var) {
        this.f432989d = str;
        this.f432990e = r6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] u07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u0(this.f432989d);
        if (u07 != null) {
            com.p314xaae8f345.mm.vfs.w6.S(this.f432990e.u(), u07, 0, u07.length);
        }
    }

    /* renamed from: toString */
    public java.lang.String m157794x9616526c() {
        return super.toString() + "|DownloadRunnable";
    }
}
