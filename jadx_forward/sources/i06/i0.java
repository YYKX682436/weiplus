package i06;

/* loaded from: classes15.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.k0 f368192d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(i06.k0 k0Var) {
        super(0);
        this.f368192d = k0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        i06.k0 k0Var = this.f368192d;
        java.util.List<o06.e2> mo132803xb121b9ba = k0Var.l().mo132803xb121b9ba();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132803xb121b9ba, "getTypeParameters(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(mo132803xb121b9ba, 10));
        for (o06.e2 e2Var : mo132803xb121b9ba) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e2Var);
            arrayList.add(new i06.y3(k0Var, e2Var));
        }
        return arrayList;
    }
}
