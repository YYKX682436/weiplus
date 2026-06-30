package az0;

/* loaded from: classes5.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.a0 f97385d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(az0.a0 a0Var) {
        super(1);
        this.f97385d = a0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete onComplete = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onComplete, "onComplete");
        az0.a0 a0Var = this.f97385d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a0Var.f96844c, "shutdownPlayback: ready");
        return a0Var.f96842a.m33248x6b5b8a91(onComplete);
    }
}
