package bk2;

/* loaded from: classes10.dex */
public final class b implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk2.c f21367d;

    public b(bk2.c cVar) {
        this.f21367d = cVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        bk2.c cVar = this.f21367d;
        cVar.getClass();
        pm0.v.X(new bk2.a(cVar));
        return true;
    }
}
