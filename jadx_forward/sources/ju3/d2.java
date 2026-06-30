package ju3;

/* loaded from: classes10.dex */
public final class d2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17025x1dde6f4e f383463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mu3.b f383464e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f383465f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17025x1dde6f4e c17025x1dde6f4e, mu3.b bVar, boolean z17) {
        super(0);
        this.f383463d = c17025x1dde6f4e;
        this.f383464e = bVar;
        this.f383465f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p05.l4 l4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19568xd45988ab c19568xd45988ab;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider = this.f383463d.getConfigProvider();
        mu3.b bVar = this.f383464e;
        if (configProvider != null && (c19568xd45988ab = configProvider.Q) != null && bVar != null) {
            bVar.f412933x = c19568xd45988ab;
            p05.l4 l4Var2 = bVar.f412931v;
            if (l4Var2 != null) {
                l4Var2.F(c19568xd45988ab);
            }
        }
        if (bVar != null && (l4Var = bVar.f412931v) != null) {
            l4Var.C(this.f383465f);
        }
        return jz5.f0.f384359a;
    }
}
