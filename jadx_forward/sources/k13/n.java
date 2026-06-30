package k13;

/* loaded from: classes5.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f384784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15561x6c397057 f384785e;

    public n(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15561x6c397057 activityC15561x6c397057) {
        this.f384784d = str;
        this.f384785e = activityC15561x6c397057;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new i13.e(this.f384784d).l().h(new k13.m(this.f384785e));
    }
}
