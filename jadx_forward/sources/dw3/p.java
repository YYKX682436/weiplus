package dw3;

/* loaded from: classes4.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325784d;

    public p(java.lang.String str) {
        this.f325784d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("exec delete filePath:");
        java.lang.String str = this.f325784d;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", sb6.toString());
        com.p314xaae8f345.mm.vfs.w6.h(str);
    }
}
