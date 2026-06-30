package ke5;

/* loaded from: classes9.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ke5.i f388620d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ke5.i iVar) {
        super(1);
        this.f388620d = iVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String talker = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        ke5.i iVar = this.f388620d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(talker, iVar.f388622j) && c01.s0.c()) {
            iVar.b(hd5.n.ACTION_UPDATE, false);
        }
        return jz5.f0.f384359a;
    }
}
