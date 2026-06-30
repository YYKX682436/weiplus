package cw1;

/* renamed from: cw1.w2$$u */
/* loaded from: classes12.dex */
public final /* synthetic */ class C28166x6a4337a implements cw1.r5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194 f304979a;

    public final void a(int[] iArr, long[] jArr) {
        long[] jArr2 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.H;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194 abstractActivityC13112xefd3d194 = this.f304979a;
        abstractActivityC13112xefd3d194.getClass();
        java.util.HashSet hashSet = new java.util.HashSet();
        int[] iArr2 = abstractActivityC13112xefd3d194.G;
        int i17 = iArr2[0];
        int i18 = iArr[0];
        if (i17 != i18) {
            abstractActivityC13112xefd3d194.f177250y = i18;
            abstractActivityC13112xefd3d194.E = true;
            hashSet.add(0);
        }
        int i19 = iArr[1];
        long j17 = (i19 < 0 || i19 >= 4) ? -2L : com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.H[i19];
        if (j17 != abstractActivityC13112xefd3d194.f177248w) {
            abstractActivityC13112xefd3d194.f177248w = j17;
            abstractActivityC13112xefd3d194.D = true;
            hashSet.add(1);
        }
        if (j17 == -1 && !java.util.Arrays.equals(jArr, abstractActivityC13112xefd3d194.f177249x)) {
            abstractActivityC13112xefd3d194.f177249x = jArr;
            abstractActivityC13112xefd3d194.D = true;
            hashSet.add(1);
        }
        int i27 = iArr2[2];
        int i28 = iArr[2];
        if (i27 != i28) {
            abstractActivityC13112xefd3d194.f177247v = i28;
            if (abstractActivityC13112xefd3d194.d7()) {
                abstractActivityC13112xefd3d194.B = abstractActivityC13112xefd3d194.f177247v > 2;
            } else {
                abstractActivityC13112xefd3d194.B = abstractActivityC13112xefd3d194.f177247v > 3;
            }
            abstractActivityC13112xefd3d194.C = true;
            hashSet.add(2);
        }
        int i29 = iArr2[3];
        int i37 = iArr[3];
        if (i29 != i37) {
            if (i37 == 1) {
                abstractActivityC13112xefd3d194.f177251z = java.lang.Boolean.TRUE;
            } else if (i37 == 2) {
                abstractActivityC13112xefd3d194.f177251z = java.lang.Boolean.FALSE;
            } else {
                abstractActivityC13112xefd3d194.f177251z = null;
            }
            hashSet.add(3);
        }
        int i38 = iArr2[4];
        int i39 = iArr[4];
        if (i38 != i39) {
            abstractActivityC13112xefd3d194.A = i39;
            hashSet.add(4);
        }
        if (hashSet.isEmpty()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanChattingBaseUI", "NewFilter changed: " + hashSet);
        int[] iArr3 = new int[hashSet.size()];
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            iArr3[0] = ((java.lang.Integer) it.next()).intValue();
        }
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        abstractActivityC13112xefd3d194.e7(iArr3);
    }
}
