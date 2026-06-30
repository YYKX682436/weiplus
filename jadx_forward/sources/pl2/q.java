package pl2;

/* loaded from: classes3.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pl2.s f438177d;

    public q(pl2.s sVar) {
        this.f438177d = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pl2.s sVar = this.f438177d;
        android.content.Context context = sVar.c().getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        gc2.a aVar = new gc2.a(context);
        aVar.f93582a = sVar.f438190l;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = sVar.c().getLayoutManager();
        if (layoutManager != null) {
            layoutManager.m8099x6305639d(aVar);
        }
    }
}
