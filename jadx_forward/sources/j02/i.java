package j02;

/* loaded from: classes8.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b02.a f378529d;

    public i(b02.a aVar) {
        this.f378529d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b02.a aVar = this.f378529d;
        int max = java.lang.Math.max(aVar.f98337c.getWidth(), aVar.f98336b.getWidth());
        aVar.f98337c.setWidth(max);
        aVar.f98336b.setWidth(max);
    }
}
