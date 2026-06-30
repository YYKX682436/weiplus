package pr;

/* loaded from: classes15.dex */
public final class y0 implements dr.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pr.a1 f439333a;

    public y0(pr.a1 a1Var) {
        this.f439333a = a1Var;
    }

    @Override // dr.r
    public void a(int i17, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        boolean z17 = true;
        if (i17 != -1 && i17 != 1) {
            z17 = false;
        }
        if (z17) {
            pm0.v.X(new pr.x0(this.f439333a, emojiInfo, i17));
        }
    }
}
