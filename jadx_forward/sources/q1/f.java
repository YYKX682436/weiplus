package q1;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final q1.b[] f441026a;

    /* renamed from: b, reason: collision with root package name */
    public int f441027b;

    public f() {
        q1.b[] bVarArr = new q1.b[20];
        for (int i17 = 0; i17 < 20; i17++) {
            bVarArr[i17] = null;
        }
        this.f441026a = bVarArr;
    }

    public final long a() {
        q1.b bVar;
        long j17;
        q1.e eVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int i17 = this.f441027b;
        q1.b[] bVarArr = this.f441026a;
        q1.b bVar2 = bVarArr[i17];
        if (bVar2 == null) {
            eVar = q1.e.f441021e;
        } else {
            int i18 = 0;
            q1.b bVar3 = bVar2;
            while (true) {
                q1.b bVar4 = bVarArr[i17];
                long j18 = bVar2.f441016b;
                if (bVar4 != null) {
                    long j19 = bVar4.f441016b;
                    q1.b[] bVarArr2 = bVarArr;
                    bVar = bVar2;
                    float f17 = (float) (j18 - j19);
                    j17 = j18;
                    float abs = (float) java.lang.Math.abs(j19 - bVar3.f441016b);
                    if (f17 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    long j27 = bVar4.f441015a;
                    arrayList.add(java.lang.Float.valueOf(d1.e.c(j27)));
                    arrayList2.add(java.lang.Float.valueOf(d1.e.d(j27)));
                    arrayList3.add(java.lang.Float.valueOf(-f17));
                    if (i17 == 0) {
                        i17 = 20;
                    }
                    i17--;
                    i18++;
                    bVar3 = bVar4;
                    if (i18 >= 20) {
                        break;
                    }
                    bVarArr = bVarArr2;
                    bVar2 = bVar;
                } else {
                    bVar = bVar2;
                    j17 = j18;
                    break;
                }
            }
            long j28 = bVar.f441015a;
            long j29 = bVar3.f441016b;
            long j37 = bVar3.f441015a;
            if (i18 >= 3) {
                try {
                    q1.c b17 = q1.g.b(arrayList3, arrayList, 2);
                    q1.c b18 = q1.g.b(arrayList3, arrayList2, 2);
                    float f18 = 1000;
                    eVar = new q1.e(d1.f.a(((java.lang.Number) b17.f441017a.get(1)).floatValue() * f18, ((java.lang.Number) b18.f441017a.get(1)).floatValue() * f18), b17.f441018b * b18.f441018b, j17 - j29, d1.e.e(j28, j37), null);
                } catch (java.lang.IllegalArgumentException unused) {
                    eVar = q1.e.f441021e;
                }
            } else {
                eVar = new q1.e(d1.e.f307156b, 1.0f, j17 - j29, d1.e.e(j28, j37), null);
            }
        }
        long j38 = eVar.f441022a;
        return p2.x.a(d1.e.c(j38), d1.e.d(j38));
    }
}
