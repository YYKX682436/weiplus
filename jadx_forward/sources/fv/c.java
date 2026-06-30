package fv;

/* loaded from: classes16.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fv.k f348451d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(fv.k kVar) {
        super(0);
        this.f348451d = kVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fv.k kVar = this.f348451d;
        fv.l lVar = kVar.f348465e;
        if (lVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.d(), "delayTask:" + kVar.f348465e + ", cancel");
            lVar.f348466a.cancel(false);
            kVar.f348465e = null;
        }
        return jz5.f0.f384359a;
    }
}
