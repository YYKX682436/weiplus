package hd3;

/* loaded from: classes.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f362084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362085e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362086f;

    public f(int i17, java.lang.String str, java.lang.String str2) {
        this.f362084d = i17;
        this.f362085e = str;
        this.f362086f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        db5.t7.m123883x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "Cpu profile successful! Path is already copied to clipboard, size is " + this.f362084d + ". Use \"adb pull\" to get profile file", 1).show();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cpu profile path: ");
        sb6.append(this.f362085e);
        sb6.append(' ');
        java.lang.String str2 = this.f362086f;
        if (str2 == null || (str = "\n gpu profile path: ".concat(str2)) == null) {
            str = "";
        }
        sb6.append(str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(sb6.toString());
    }
}
