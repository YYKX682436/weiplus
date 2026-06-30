package c55;

/* loaded from: classes12.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a f120269d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a activityC19821xb90ad83a) {
        super(0);
        this.f120269d = activityC19821xb90ad83a;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.io.File cacheDir = this.f120269d.getCacheDir();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cacheDir, "getCacheDir(...)");
        return vz5.q.f(vz5.q.f(cacheDir, "recovery"), "packed_logs");
    }
}
