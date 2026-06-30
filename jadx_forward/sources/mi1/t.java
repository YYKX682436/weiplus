package mi1;

/* loaded from: classes7.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi1.v f408222d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(mi1.v vVar) {
        super(0);
        this.f408222d = vVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mi1.u0 u0Var = this.f408222d.f408243i;
        if (u0Var != null) {
            u0Var.q();
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blinkWrapper");
        throw null;
    }
}
