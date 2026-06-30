package zu2;

/* loaded from: classes2.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zu2.b f557224d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(zu2.b bVar) {
        super(0);
        this.f557224d = bVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zu2.b bVar = this.f557224d;
        java.lang.String str = bVar.f557239d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invoke ecSourceReqStruct ");
        r45.vg0 vg0Var = bVar.f557240e;
        sb6.append(vg0Var != null ? vg0Var.hashCode() : 0);
        sb6.append(' ');
        r45.vg0 vg0Var2 = bVar.f557240e;
        sb6.append(pm0.v.u(vg0Var2 != null ? vg0Var2.m75942xfb822ef2(0) : 0L));
        sb6.append(", ");
        r45.vg0 vg0Var3 = bVar.f557240e;
        sb6.append(vg0Var3 != null ? vg0Var3.m75945x2fec8307(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        return bVar.f557240e;
    }
}
