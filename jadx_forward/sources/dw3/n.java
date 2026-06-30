package dw3;

/* loaded from: classes4.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325770d;

    public n(java.lang.String str) {
        this.f325770d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("exec delete filePath:");
        java.lang.String str = this.f325770d;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", sb6.toString());
        com.p314xaae8f345.mm.vfs.w6.f(str);
    }
}
