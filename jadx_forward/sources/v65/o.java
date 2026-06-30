package v65;

/* loaded from: classes4.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.y f515116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b f515117e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p012xc85e97e9.p093xedfae76a.y yVar, com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b c20977x242e434b) {
        super(0);
        this.f515116d = yVar;
        this.f515117e = c20977x242e434b;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p093xedfae76a.y yVar = this.f515116d;
        p012xc85e97e9.p093xedfae76a.n b17 = yVar.mo273xed6858b4().b();
        p012xc85e97e9.p093xedfae76a.n nVar = p012xc85e97e9.p093xedfae76a.n.DESTROYED;
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b c20977x242e434b = this.f515117e;
        if (b17 != nVar) {
            yVar.mo273xed6858b4().a(c20977x242e434b);
        } else {
            c20977x242e434b.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.SequenceLifecycleScope", c20977x242e434b.hashCode() + " run empty block and trigger destroy");
        }
        return jz5.f0.f384359a;
    }
}
