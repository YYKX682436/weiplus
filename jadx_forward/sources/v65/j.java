package v65;

/* loaded from: classes8.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f515110d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a) {
        super(0);
        this.f515110d = c20976x6ba6452a;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = this.f515110d;
        if (c20976x6ba6452a.f273884e.mo273xed6858b4().b() != p012xc85e97e9.p093xedfae76a.n.DESTROYED) {
            c20976x6ba6452a.f273884e.mo273xed6858b4().a(c20976x6ba6452a);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.LifecycleScope", "leak this scope, because lifecycle is already destroy");
        }
        return jz5.f0.f384359a;
    }
}
