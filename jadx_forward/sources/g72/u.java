package g72;

/* loaded from: classes14.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13521xbef6f614 f350779d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13521xbef6f614 activityC13521xbef6f614) {
        this.f350779d = activityC13521xbef6f614;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "dismiss cover and start capture");
        g72.a0 a0Var = this.f350779d.f181607h;
        synchronized (a0Var) {
            a0Var.f350757a = true;
        }
        g72.a0 a0Var2 = this.f350779d.f181607h;
        synchronized (a0Var2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "toString: %s", a0Var2.m131027x9616526c());
            if (a0Var2.f350757a) {
                a0Var2.f350758b.f181612p.setVisibility(0);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13521xbef6f614 activityC13521xbef6f614 = this.f350779d;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.b0.f181526c == null) {
            activityC13521xbef6f614.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.b0.f181526c = new com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.b0();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.b0 b0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.b0.f181526c;
        activityC13521xbef6f614.f181606g = b0Var;
        b0Var.f181527a = 0;
        b0Var.f181528b = -1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y.INSTANCE.f181576d.f181577i.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectNativeManager", "hy: get all motion not init");
        b0Var.f181528b = 0;
        activityC13521xbef6f614.f181609m = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45 c13528xdd12ba45 = activityC13521xbef6f614.f181613q;
        android.graphics.RectF rectF = new android.graphics.RectF(activityC13521xbef6f614.f181614r.getLeft(), activityC13521xbef6f614.f181614r.getTop(), activityC13521xbef6f614.f181614r.getRight(), activityC13521xbef6f614.f181614r.getBottom());
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13527xdbf7520a c13527xdbf7520a = c13528xdd12ba45.f181653e;
        c13527xdbf7520a.getClass();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = rectF.toString();
        android.graphics.RectF rectF2 = c13527xdbf7520a.f181649g;
        objArr[1] = rectF2 == null ? "null" : rectF2.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectDecorView", "hy: trigger showCover cover: %s, old: %s", objArr);
        c13527xdbf7520a.f181647e = true;
        android.graphics.RectF rectF3 = c13527xdbf7520a.f181649g;
        if (rectF3 == null || !rectF3.equals(rectF)) {
            c13527xdbf7520a.f181649g = rectF;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectDecorView", "invalidate %s", rectF.toString());
            c13527xdbf7520a.invalidate();
        }
        activityC13521xbef6f614.W6();
    }
}
