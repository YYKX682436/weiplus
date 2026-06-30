package mm2;

/* loaded from: classes3.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.c1 f410273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f410274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f410275f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(mm2.c1 c1Var, java.util.LinkedList linkedList, boolean z17) {
        super(0);
        this.f410273d = c1Var;
        this.f410274e = linkedList;
        this.f410275f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mm2.c1 c1Var = this.f410273d;
        c1Var.f410348h4.clear();
        java.util.LinkedList linkedList = this.f410274e;
        java.util.List list = c1Var.f410348h4;
        list.addAll(linkedList);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("printRedPacketInfoList(reset,fromJoinLive:" + this.f410275f + ")：");
        if (list != null) {
            int i17 = 0;
            for (java.lang.Object obj : list) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                sb6.append("index:" + i17 + ',' + ((r45.v62) obj) + "};");
                i17 = i18;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c1Var.f410333f, sb6.toString());
        return jz5.f0.f384359a;
    }
}
