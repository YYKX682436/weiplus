package bu2;

/* loaded from: classes2.dex */
public final class o0 extends bu2.l0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r45.p21 source) {
        super(source);
        kotlin.jvm.internal.o.g(source, "source");
    }

    @Override // bu2.l0
    public so2.j5 a() {
        r45.jt4 jt4Var;
        r45.p21 data = this.f24548a;
        kotlin.jvm.internal.o.g(data, "data");
        if (!(data.getInteger(5) == 7) || (jt4Var = (r45.jt4) data.getCustom(11)) == null) {
            return null;
        }
        return new com.tencent.mm.plugin.finder.feed.model.d5(jt4Var);
    }

    public o0(int i17, r45.jt4 dramaInfo) {
        kotlin.jvm.internal.o.g(dramaInfo, "dramaInfo");
        r45.p21 p21Var = this.f24548a;
        p21Var.set(0, java.lang.Integer.valueOf(i17));
        p21Var.set(5, 7);
        p21Var.set(11, dramaInfo);
    }
}
