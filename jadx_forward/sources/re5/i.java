package re5;

/* loaded from: classes12.dex */
public final class i implements vj5.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re5.s f476110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout f476111e;

    public i(re5.s sVar, android.widget.RelativeLayout relativeLayout) {
        this.f476110d = sVar;
        this.f476111e = relativeLayout;
    }

    @Override // vj5.k
    public final void n6(int i17) {
        if (this.f476110d.f476127g) {
            return;
        }
        this.f476111e.setPadding(0, i17, 0, 0);
    }
}
