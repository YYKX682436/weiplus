package yt2;

/* loaded from: classes3.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt2.v f546857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f546858e;

    public t(yt2.v vVar, yz5.a aVar) {
        this.f546857d = vVar;
        this.f546858e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f546857d.c();
        yz5.a aVar = this.f546858e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
