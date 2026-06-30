package sp2;

/* loaded from: classes2.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f492636d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(sp2.o2 o2Var) {
        super(0);
        this.f492636d = o2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sp2.o2 o2Var = this.f492636d;
        int i17 = 0;
        if (r26.n0.D(o2Var.V, "messageNotify", false, 2, null)) {
            i17 = 1;
        } else {
            java.lang.String str = o2Var.V;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "closeGuidePreload")) {
                i17 = 3;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "liveEndPage")) {
                i17 = 2;
            }
        }
        return java.lang.Integer.valueOf(i17);
    }
}
