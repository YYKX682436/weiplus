package e75;

/* loaded from: classes12.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2602x14c752d6.C20988xba34acb1 f331503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e75.g f331504e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.sdk.p2602x14c752d6.C20988xba34acb1 c20988xba34acb1, e75.g gVar) {
        super(0);
        this.f331503d = c20988xba34acb1;
        this.f331504e = gVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.sdk.p2602x14c752d6.C20988xba34acb1 c20988xba34acb1 = this.f331503d;
        boolean b17 = c20988xba34acb1.b();
        p012xc85e97e9.p093xedfae76a.y yVar = c20988xba34acb1.f273938d;
        if (b17) {
            yVar.mo273xed6858b4().a(c20988xba34acb1);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f331504e.mo42857x23aed0ac(), "attachObserver fail, lifecycle is destroyed owner:" + yVar.hashCode() + " observer:" + c20988xba34acb1.f273939e.hashCode());
        }
        return jz5.f0.f384359a;
    }
}
