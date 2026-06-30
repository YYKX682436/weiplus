package gg1;

/* loaded from: classes7.dex */
public final class w0 extends gg1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353186a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(gg1.c1 c1Var, java.lang.String str) {
        super(c1Var);
        this.f353186a = str;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCast.VideoCastController", "seek fail");
    }

    @Override // z91.a
    public void b(aa1.e response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCast.VideoCastController", "seek to " + this.f353186a + " success");
    }
}
