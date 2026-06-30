package yt2;

/* loaded from: classes3.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt2.v f546859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f546860e;

    public u(yt2.v vVar, yz5.a aVar) {
        this.f546859d = vVar;
        this.f546860e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f546859d.b();
        yz5.a aVar = this.f546860e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
