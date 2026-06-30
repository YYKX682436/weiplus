package iu0;

/* loaded from: classes5.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iu0.d f376332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f376333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ iu0.a f376334f;

    public c(iu0.d dVar, java.lang.String str, iu0.a aVar) {
        this.f376332d = dVar;
        this.f376333e = str;
        this.f376334f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f376332d.f376337c) {
            return;
        }
        this.f376332d.c(this.f376333e, this.f376334f);
    }
}
