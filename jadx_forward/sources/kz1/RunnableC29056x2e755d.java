package kz1;

/* renamed from: kz1.e$$b */
/* loaded from: classes13.dex */
public final /* synthetic */ class RunnableC29056x2e755d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kz1.e f395384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f395385e;

    public /* synthetic */ RunnableC29056x2e755d(kz1.e eVar, android.view.View view) {
        this.f395384d = eVar;
        this.f395385e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uz1.a aVar = this.f395384d.f395374d;
        android.view.View view = this.f395385e;
        if (aVar.m170825xde2d761f(view)) {
            return;
        }
        aVar.add(view);
    }
}
