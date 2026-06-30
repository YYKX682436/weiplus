package df2;

/* loaded from: classes3.dex */
public final class fm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f311683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.hm f311684e;

    public fm(android.view.ViewGroup viewGroup, df2.hm hmVar) {
        this.f311683d = viewGroup;
        this.f311684e = hmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f311683d.setVisibility(0);
        df2.hm.Z6(this.f311684e);
    }
}
