package m43;

/* loaded from: classes8.dex */
public class e extends java.util.concurrent.CopyOnWriteArrayList {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f404990d = new java.lang.Object();

    public int d(java.lang.Object obj) {
        int i17 = 0;
        for (int i18 = 0; i18 < size(); i18++) {
            if (java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0) ((m43.d) get(i18))).f178847c).equals(obj)) {
                i17++;
            }
        }
        return i17;
    }

    public int e(m43.d dVar) {
        int i17;
        synchronized (this.f404990d) {
            boolean z17 = false;
            i17 = 0;
            while (true) {
                if (i17 >= size()) {
                    i17 = 0;
                    break;
                }
                if (java.lang.Integer.compare(((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0) dVar).f178847c, java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0) ((m43.d) get(i17))).f178847c).intValue()) < 0) {
                    z17 = true;
                    break;
                }
                i17++;
            }
            if (!z17) {
                i17 = size();
            }
            add(i17, dVar);
        }
        return i17;
    }
}
