package kx5;

/* loaded from: classes15.dex */
public class e implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 f394823a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kx5.n f394824b;

    public e(kx5.n nVar, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1) {
        this.f394824b = nVar;
        this.f394823a = c28553x45ef20c1;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6
    /* renamed from: onFlutterUiDisplayed */
    public void mo2121x6c956b30() {
        final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df m137264x385aa5fd = this.f394823a.m137264x385aa5fd();
        if (m137264x385aa5fd != null) {
            m137264x385aa5fd.m138037x4c436f6(this);
            m137264x385aa5fd.m138030x29812006(new java.lang.Runnable() { // from class: kx5.e$$a
                @Override // java.lang.Runnable
                public final void run() {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this.m138039x4fb41144();
                }
            });
            this.f394824b.f394852i.postDelayed(new java.lang.Runnable() { // from class: kx5.e$$b
                @Override // java.lang.Runnable
                public final void run() {
                    final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df c28641x1f60b8df = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this;
                    c28641x1f60b8df.m138030x29812006(new java.lang.Runnable() { // from class: kx5.e$$c
                        @Override // java.lang.Runnable
                        public final void run() {
                            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this.m138039x4fb41144();
                        }
                    });
                    c28641x1f60b8df.m138039x4fb41144();
                }
            }, 100L);
            m137264x385aa5fd.m138039x4fb41144();
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6
    /* renamed from: onFlutterUiNoLongerDisplayed */
    public void mo2122xb9179606() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df m137264x385aa5fd = this.f394823a.m137264x385aa5fd();
        if (m137264x385aa5fd != null) {
            m137264x385aa5fd.m138037x4c436f6(this);
        }
    }
}
