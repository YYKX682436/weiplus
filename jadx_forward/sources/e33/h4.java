package e33;

/* loaded from: classes5.dex */
public class h4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f328786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f328787e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 f328788f;

    public h4(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561, java.util.List list, java.util.List list2) {
        this.f328788f = activityC15656x6f26b561;
        this.f328786d = list;
        this.f328787e = list2;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561.f220105k2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561 = this.f328788f;
        activityC15656x6f26b561.runOnUiThread(new e33.g4(this, (java.lang.String) activityC15656x6f26b561.b7(this.f328786d, this.f328787e).f384366d));
    }
}
