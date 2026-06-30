package df2;

/* loaded from: classes3.dex */
public final class zl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f313509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.hm f313510e;

    public zl(android.view.ViewGroup viewGroup, df2.hm hmVar) {
        this.f313509d = viewGroup;
        this.f313510e = hmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f313509d.setVisibility(0);
        df2.hm.Z6(this.f313510e);
    }
}
