package bg2;

/* loaded from: classes12.dex */
public final class i7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.j7 f20176e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f20177f;

    public i7(int i17, bg2.j7 j7Var, int i18) {
        this.f20175d = i17;
        this.f20176e = j7Var;
        this.f20177f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update Req Interval for ");
        int i17 = this.f20175d;
        sb6.append(i17);
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("Finder.LivePollingService", sb6.toString());
        bg2.j7 j7Var = this.f20176e;
        java.util.Iterator it = j7Var.f20211a.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (((bg2.r6) obj2).f20469d == i17) {
                    break;
                }
            }
        }
        bg2.r6 r6Var = (bg2.r6) obj2;
        int i18 = this.f20177f;
        if (r6Var != null) {
            r6Var.f20472g = i18;
        }
        java.util.Iterator it6 = j7Var.f20211a.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            if (((bg2.r6) next).f20469d == i17) {
                obj = next;
                break;
            }
        }
        bg2.r6 r6Var2 = (bg2.r6) obj;
        if (r6Var2 != null) {
            r6Var2.f20473h = android.os.SystemClock.uptimeMillis() + (i18 * 1000);
        }
        bg2.r6 r6Var3 = (bg2.r6) j7Var.f20212b.get(java.lang.Integer.valueOf(i17));
        if (r6Var3 != null) {
            r6Var3.f20472g = i18;
        }
        bg2.r6 r6Var4 = (bg2.r6) j7Var.f20212b.get(java.lang.Integer.valueOf(i17));
        if (r6Var4 != null) {
            r6Var4.f20473h = android.os.SystemClock.uptimeMillis() + (i18 * 1000);
        }
        bg2.j7.b(j7Var);
    }
}
