package lf4;

/* loaded from: classes4.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if4.f f399908d;

    public c0(if4.f fVar) {
        this.f399908d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LogStory: deleteItem fake ");
        if4.f fVar = this.f399908d;
        sb6.append(fVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfGalleryPresenter", sb6.toString());
        ef4.e0.f333974a.a(fVar.f372780e.f372786a);
        jf4.a aVar = jf4.a.f380965a;
        aVar.a(fVar.f372780e.f372792g);
        aVar.b(fVar.f372780e.f372792g);
    }
}
