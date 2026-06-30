package df2;

/* loaded from: classes3.dex */
public final class uw extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f313093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.xw f313094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313095f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(dk2.zf zfVar, df2.xw xwVar, java.lang.String str) {
        super(0);
        this.f313093d = zfVar;
        this.f313094e = xwVar;
        this.f313095f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vk0 vk0Var;
        dk2.zf zfVar = this.f313093d;
        dk2.dg dgVar = zfVar instanceof dk2.dg ? (dk2.dg) zfVar : null;
        r45.d54 d54Var = r45.d54.LOADING;
        if (dgVar != null) {
            dgVar.t(d54Var);
        }
        if (zfVar != null && (vk0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vk0) this.f313094e.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vk0.class)) != null) {
            java.lang.String str = this.f313095f;
            if (str == null) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(zfVar);
                vk0Var.v1(linkedList);
            } else {
                vk0Var.w1(d54Var, str);
            }
        }
        return jz5.f0.f384359a;
    }
}
