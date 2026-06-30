package hn0;

/* loaded from: classes14.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hn0.p f363922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f363923e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(hn0.p pVar, double d17) {
        super(0);
        this.f363922d = pVar;
        this.f363923e = d17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p05.h1 h1Var = (p05.h1) this.f363922d.f363934c;
        double d17 = this.f363923e;
        h1Var.f432067i = d17;
        if (!h1Var.f432057a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MakeUpSuitEffect", "This effect is not attached!");
        }
        if (h1Var.f432057a) {
            long j17 = h1Var.f432062f;
            if (j17 > 0) {
                com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83753xb899ce6f(h1Var.f432059c, j17, (float) d17);
            }
        }
        return jz5.f0.f384359a;
    }
}
