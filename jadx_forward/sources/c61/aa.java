package c61;

/* loaded from: classes.dex */
public final class aa extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f120415d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(1);
        this.f120415d = c0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        this.f120415d.f391645d = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterAccountPlugin", "Canceled because of " + ((java.lang.Throwable) obj));
        return jz5.f0.f384359a;
    }
}
