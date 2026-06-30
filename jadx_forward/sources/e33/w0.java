package e33;

/* loaded from: classes10.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f329054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd f329055e;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd, java.util.List list) {
        this.f329055e = activityC15653x403456cd;
        this.f329054d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd.f220042t2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd = this.f329055e;
        activityC15653x403456cd.runOnUiThread(new e33.v0(this, (java.lang.String) activityC15653x403456cd.w7(this.f329054d).f384366d));
    }
}
