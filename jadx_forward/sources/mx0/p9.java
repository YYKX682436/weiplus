package mx0;

/* loaded from: classes5.dex */
public final class p9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f413754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413755e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(boolean z17, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced) {
        super(0);
        this.f413754d = z17;
        this.f413755e = c10977x8e40eced;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        wx0.s0 m47303x63dc8ed6;
        wx0.s0 m47303x63dc8ed62;
        wx0.s0 m47303x63dc8ed63;
        boolean z17 = this.f413754d;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413755e;
        if (!z17) {
            m47303x63dc8ed6 = c10977x8e40eced.m47303x63dc8ed6();
            m47303x63dc8ed6.b(false);
            c10977x8e40eced.k1(false);
            bs0.j jVar = c10977x8e40eced.f151085q;
            if (jVar != null) {
                jVar.mo9386xf597288(false);
            }
        } else if (c10977x8e40eced.mo47327x5e317b7()) {
            m47303x63dc8ed63 = c10977x8e40eced.m47303x63dc8ed6();
            m47303x63dc8ed63.b(true);
            c10977x8e40eced.k1(true);
            bs0.j jVar2 = c10977x8e40eced.f151085q;
            if (jVar2 != null) {
                jVar2.mo9386xf597288(false);
            }
        } else {
            m47303x63dc8ed62 = c10977x8e40eced.m47303x63dc8ed6();
            m47303x63dc8ed62.b(false);
            c10977x8e40eced.k1(false);
            bs0.j jVar3 = c10977x8e40eced.f151085q;
            if (jVar3 != null) {
                jVar3.mo9386xf597288(true);
            }
        }
        return jz5.f0.f384359a;
    }
}
