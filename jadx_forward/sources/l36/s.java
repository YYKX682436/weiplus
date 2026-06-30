package l36;

/* loaded from: classes16.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l36.t f397169d;

    public s(l36.t tVar) {
        this.f397169d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        while (true) {
            l36.t tVar = this.f397169d;
            long nanoTime = java.lang.System.nanoTime();
            synchronized (tVar) {
                java.util.Iterator it = ((java.util.ArrayDeque) tVar.f397175d).iterator();
                o36.d dVar = null;
                long j18 = Long.MIN_VALUE;
                int i17 = 0;
                int i18 = 0;
                while (it.hasNext()) {
                    o36.d dVar2 = (o36.d) it.next();
                    if (tVar.a(dVar2, nanoTime) > 0) {
                        i18++;
                    } else {
                        i17++;
                        long j19 = nanoTime - dVar2.f424305o;
                        if (j19 > j18) {
                            dVar = dVar2;
                            j18 = j19;
                        }
                    }
                }
                j17 = tVar.f397173b;
                if (j18 < j17 && i17 <= tVar.f397172a) {
                    if (i17 > 0) {
                        j17 -= j18;
                    } else if (i18 <= 0) {
                        tVar.f397177f = false;
                        j17 = -1;
                    }
                }
                ((java.util.ArrayDeque) tVar.f397175d).remove(dVar);
                m36.e.d(dVar.f424295e);
                j17 = 0;
            }
            if (j17 == -1) {
                return;
            }
            if (j17 > 0) {
                long j27 = j17 / 1000000;
                long j28 = j17 - (1000000 * j27);
                synchronized (this.f397169d) {
                    try {
                        this.f397169d.wait(j27, (int) j28);
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
            }
        }
    }
}
