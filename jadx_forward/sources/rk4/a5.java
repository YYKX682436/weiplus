package rk4;

/* loaded from: classes10.dex */
public final class a5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d f478077d;

    public a5(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d activityC18699x6096e65d) {
        this.f478077d = activityC18699x6096e65d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d activityC18699x6096e65d = this.f478077d;
        activityC18699x6096e65d.Y6();
        if (activityC18699x6096e65d.isFinishing()) {
            return;
        }
        db5.f.b(activityC18699x6096e65d);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95 = activityC18699x6096e65d.m78735x28280f95();
        if (m78735x28280f95 != null) {
            m78735x28280f95.m81454x4335bff3(true);
            m78735x28280f95.d(false);
        }
    }
}
