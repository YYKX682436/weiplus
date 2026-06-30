package zx2;

/* loaded from: classes15.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zx2.t f558596d;

    public q(zx2.t tVar) {
        this.f558596d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        zx2.t tVar = this.f558596d;
        int childCount = tVar.getChildCount();
        if (childCount % 2 == 0) {
            return;
        }
        int i17 = childCount / 2;
        int paddingStart = tVar.getPaddingStart();
        int paddingEnd = tVar.getPaddingEnd();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CustomTabLayout", " startPadding:" + paddingStart + " endPadding:" + paddingEnd);
        int i18 = 0;
        int i19 = 0;
        for (int i27 = 0; i27 < i17; i27++) {
            i19 += tVar.getChildAt(i27).getWidth() + paddingStart;
        }
        while (true) {
            i17++;
            if (i17 >= childCount) {
                break;
            } else {
                i18 += tVar.getChildAt(i17).getWidth() + paddingEnd;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79 = tVar.f558613p;
        if (i19 > i18) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" add right padding:");
            int i28 = (paddingEnd + i19) - i18;
            sb6.append(i28);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CustomTabLayout", sb6.toString());
            int i29 = c15436x4c00d79.f214637h;
            int i37 = c15436x4c00d79.f214638i;
            int i38 = c15436x4c00d79.f214640n;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.v0.k(tVar, i29, i37, i28, i38);
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(" add left padding:");
        int i39 = (paddingStart + i18) - i19;
        sb7.append(i39);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CustomTabLayout", sb7.toString());
        int i47 = c15436x4c00d79.f214638i;
        int i48 = c15436x4c00d79.f214639m;
        int i49 = c15436x4c00d79.f214640n;
        java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
        n3.v0.k(tVar, i39, i47, i48, i49);
    }
}
