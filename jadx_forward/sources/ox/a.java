package ox;

/* loaded from: classes7.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tk.p f430972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ox.g f430973e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(tk.p pVar, ox.g gVar, android.content.Context context) {
        super(2);
        this.f430972d = pVar;
        this.f430973e = gVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b) obj;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar2 = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b) obj2;
        tk.p pVar = this.f430972d;
        if (bVar == null || bVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizPublishApiFeatureService", "checkRemoteBizAndPhotoBizAcct failed, bizAcct=" + bVar + ", photoAcct=" + bVar2);
            pVar.a(false, "cgi error", null);
        } else {
            this.f430973e.getClass();
            pVar.a(true, "", null);
        }
        return jz5.f0.f384359a;
    }
}
