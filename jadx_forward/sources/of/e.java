package of;

/* loaded from: classes3.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of.h f426359d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(of.h hVar) {
        super(0);
        this.f426359d = hVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List list = (java.util.List) this.f426359d.f426362b.get("[stack]");
        if (list == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Luggage.ProcMapsInfo", "guessVirtualMemoryLimit, stackVmaInfoList is null");
            return -1L;
        }
        if (1 != list.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Luggage.ProcMapsInfo", "guessVirtualMemoryLimit, invalid stackVmaInfoList size: " + list.size());
            return -1L;
        }
        long j17 = 1;
        while (j17 < ((of.t) list.get(0)).f426393c) {
            j17 <<= 1;
        }
        return java.lang.Long.valueOf(j17);
    }
}
