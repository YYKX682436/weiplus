package if0;

/* loaded from: classes16.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if0.k f372551d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(if0.k kVar) {
        super(0);
        this.f372551d = kVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if0.k kVar = this.f372551d;
        if0.l lVar = kVar.f372565e;
        if (lVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.d(), "delayTask:" + kVar.f372565e + ", cancel");
            lVar.f372566a.cancel(false);
            kVar.f372565e = null;
        }
        return jz5.f0.f384359a;
    }
}
