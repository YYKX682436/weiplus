package hy;

/* loaded from: classes14.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy.a0 f367267d;

    public f(hy.a0 a0Var, java.lang.String str, byte[] bArr, java.lang.String str2, java.lang.String str3, int i17) {
        this.f367267d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = ((java.util.ArrayList) hy.a0.a(this.f367267d)).iterator();
        while (it.hasNext()) {
            ((wx.g1) it.next()).getClass();
        }
    }
}
