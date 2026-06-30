package or1;

/* loaded from: classes12.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12985xde48fa36 f429032e;

    public g2(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12985xde48fa36 activityC12985xde48fa36, java.lang.String str) {
        this.f429032e = activityC12985xde48fa36;
        this.f429031d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12985xde48fa36 activityC12985xde48fa36 = this.f429032e;
        activityC12985xde48fa36.f175578f.mo81060xd7655c6f(this.f429031d);
        activityC12985xde48fa36.f175578f.f291679g.performClick();
    }
}
