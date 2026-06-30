package lr;

/* loaded from: classes12.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f402131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lr.y0 f402132e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(int i17, lr.y0 y0Var) {
        super(0);
        this.f402131d = i17;
        this.f402132e = y0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f402131d;
        lr.y0 y0Var = this.f402132e;
        if (i17 == 0) {
            y0Var.f402148h.setVisibility(0);
        } else {
            y0Var.f402148h.setVisibility(8);
        }
        return jz5.f0.f384359a;
    }
}
