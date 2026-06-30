package nf;

/* loaded from: classes7.dex */
public abstract class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f418147d = {false};

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q qVar;
        boolean[] zArr = this.f418147d;
        try {
            if (!zArr[0]) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.a3 a3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.a3) this;
                android.view.View view = a3Var.f156421e;
                view.sendAccessibilityEvent(32768);
                int i17 = 0;
                while (true) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = a3Var.f156423g;
                    int childCount = c11510xdd90c2f2.f156343s.getChildCount();
                    qVar = c11510xdd90c2f2.f156343s;
                    if (i17 >= childCount) {
                        break;
                    }
                    android.view.View childAt = qVar.getChildAt(i17);
                    if (a3Var.f156422f.mo52965xfb86a31b() != childAt) {
                        childAt.setImportantForAccessibility(4);
                    }
                    i17++;
                }
                qVar.f173385g = true;
                qVar.f173386h = view;
            }
        } finally {
            zArr[0] = true;
        }
    }
}
