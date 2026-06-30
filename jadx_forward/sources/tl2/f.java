package tl2;

/* loaded from: classes8.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f501776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo0.a f501777e;

    public f(boolean z17, qo0.a aVar) {
        this.f501776d = z17;
        this.f501777e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f501776d;
        qo0.a aVar = this.f501777e;
        if (z17) {
            aVar.f446856d.setTranslationX(Float.MAX_VALUE);
        } else {
            aVar.f446856d.setTranslationX(0.0f);
        }
    }
}
