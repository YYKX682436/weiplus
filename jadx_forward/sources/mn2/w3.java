package mn2;

/* loaded from: classes4.dex */
public final class w3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn2.x3 f411682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f411683e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f411684f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f411685g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(mn2.x3 x3Var, java.lang.String str, long j17, long j18) {
        super(0);
        this.f411682d = x3Var;
        this.f411683e = str;
        this.f411684f = j17;
        this.f411685g = j18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mn2.x3 x3Var = this.f411682d;
        t21.h0 h0Var = x3Var.f411693e;
        if (h0Var != null) {
            h0Var.f(this.f411683e, this.f411684f, this.f411685g);
        }
        cw2.eb ebVar = x3Var.f411692d;
        if (ebVar != null) {
            ebVar.c((int) this.f411684f, (int) this.f411685g, x3Var.f411694f);
        }
        return jz5.f0.f384359a;
    }
}
