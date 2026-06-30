package gf;

/* loaded from: classes7.dex */
public final class u1 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df f352710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f352711b;

    public u1(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df c28641x1f60b8df, java.lang.Runnable runnable) {
        this.f352710a = c28641x1f60b8df;
        this.f352711b = runnable;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6
    /* renamed from: onFlutterUiDisplayed */
    public void mo2121x6c956b30() {
        this.f352710a.m138037x4c436f6(this);
        this.f352711b.run();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6
    /* renamed from: onFlutterUiNoLongerDisplayed */
    public void mo2122xb9179606() {
    }
}
