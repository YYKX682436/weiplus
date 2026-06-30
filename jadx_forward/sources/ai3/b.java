package ai3;

/* loaded from: classes5.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f86638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86639e;

    public b(int i17, java.lang.String str) {
        this.f86638d = i17;
        this.f86639e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = ai3.d.f86642c;
        while (true) {
            int i18 = this.f86638d;
            if (i17 >= i18) {
                ai3.d.f86642c = java.lang.Math.max(i18, 0);
                return;
            }
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(java.lang.String.format("%s/tempvideo%s.mp4", this.f86639e, java.lang.Integer.valueOf(i17)));
            if (r6Var.m()) {
                r6Var.l();
            }
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var.o() + ".remux");
            if (r6Var2.m()) {
                r6Var2.l();
            }
            com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(r6Var.n() + ".thumb");
            if (r6Var3.m()) {
                r6Var3.l();
            }
            i17++;
        }
    }
}
