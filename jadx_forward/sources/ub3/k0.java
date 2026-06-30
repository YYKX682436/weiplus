package ub3;

/* loaded from: classes15.dex */
public class k0 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e f507649d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e) {
        this.f507649d = c16332x7cb9791e;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        android.util.DisplayMetrics displayMetrics = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e.E;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e = this.f507649d;
        c16332x7cb9791e.l();
        for (int i39 = 0; i39 < c16332x7cb9791e.f226660v; i39++) {
            c16332x7cb9791e.k((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i39), i39);
        }
        c16332x7cb9791e.removeOnLayoutChangeListener(this);
    }
}
