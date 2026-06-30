package p012xc85e97e9.p100xa8fcbcdb;

/* loaded from: classes13.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p100xa8fcbcdb.x f93337a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f93338b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f93339c = false;

    public d(p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244 abstractC1150xa1fed244, p012xc85e97e9.p100xa8fcbcdb.x xVar) {
        this.f93337a = xVar;
        this.f93338b = abstractC1150xa1fed244.f93280d;
    }

    public final java.util.List a(p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244 abstractC1150xa1fed244) {
        this.f93339c = false;
        boolean z17 = abstractC1150xa1fed244.V != Integer.MAX_VALUE;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int O = abstractC1150xa1fed244.O();
        int i17 = 0;
        for (int i18 = 0; i18 < O; i18++) {
            p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb N = abstractC1150xa1fed244.N(i18);
            if (N.C) {
                if (!z17 || i17 < abstractC1150xa1fed244.V) {
                    arrayList.add(N);
                } else {
                    arrayList2.add(N);
                }
                if (N instanceof p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244) {
                    p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244 abstractC1150xa1fed2442 = (p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244) N;
                    if (!(abstractC1150xa1fed2442 instanceof p012xc85e97e9.p100xa8fcbcdb.C1151xb1835d47)) {
                        java.util.List<p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb> a17 = a(abstractC1150xa1fed2442);
                        if (z17 && this.f93339c) {
                            throw new java.lang.IllegalArgumentException("Nested expand buttons are not supported!");
                        }
                        for (p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb c1146x1fce98fb : a17) {
                            if (!z17 || i17 < abstractC1150xa1fed244.V) {
                                arrayList.add(c1146x1fce98fb);
                            } else {
                                arrayList2.add(c1146x1fce98fb);
                            }
                            i17++;
                        }
                    } else {
                        continue;
                    }
                } else {
                    i17++;
                }
            }
        }
        if (z17 && i17 > abstractC1150xa1fed244.V) {
            p012xc85e97e9.p100xa8fcbcdb.c cVar = new p012xc85e97e9.p100xa8fcbcdb.c(this.f93338b, arrayList2, abstractC1150xa1fed244.f93282f);
            cVar.f93285i = new p012xc85e97e9.p100xa8fcbcdb.b(this, abstractC1150xa1fed244);
            arrayList.add(cVar);
        }
        this.f93339c |= z17;
        return arrayList;
    }
}
