package jz3;

/* loaded from: classes13.dex */
public class c implements kd0.a3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[][] f384318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f384319b;

    public c(jz3.d dVar, java.lang.String[][] strArr, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f384318a = strArr;
        this.f384319b = countDownLatch;
    }

    @Override // kd0.a3
    public void a(long j17, kd0.c3 c3Var) {
        java.util.List list = c3Var.f388154a;
        if (list != null) {
            java.lang.String[] strArr = new java.lang.String[list.size()];
            java.util.Iterator it = c3Var.f388154a.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                strArr[i17] = ((com.p314xaae8f345.p2891x34da02.C25311x69ff7e80) it.next()).f556865f;
                i17++;
            }
            synchronized (this.f384318a) {
                this.f384318a[0] = strArr;
            }
        }
        this.f384319b.countDown();
    }
}
