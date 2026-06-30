package cw1;

/* loaded from: classes11.dex */
public final class g5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194 f304483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13119xe838701 f304484e;

    public g5(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194 abstractActivityC13112xefd3d194, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13119xe838701 activityC13119xe838701) {
        this.f304483d = abstractActivityC13112xefd3d194;
        this.f304484e = activityC13119xe838701;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Intent m81196xcc238d5d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194 abstractActivityC13112xefd3d194 = this.f304483d;
        if (abstractActivityC13112xefd3d194.m81195xcc234ba0() == -1 && (m81196xcc238d5d = abstractActivityC13112xefd3d194.m81196xcc238d5d()) != null) {
            long longExtra = m81196xcc238d5d.getLongExtra("tds", 0L);
            com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13119xe838701 activityC13119xe838701 = this.f304484e;
            activityC13119xe838701.f177292d += longExtra;
            activityC13119xe838701.setResult(-1, new android.content.Intent().putExtra("tds", activityC13119xe838701.f177292d));
        }
    }
}
