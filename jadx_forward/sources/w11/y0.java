package w11;

/* loaded from: classes12.dex */
public class y0 extends com.p314xaae8f345.mm.p944x882e457a.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final o45.xh f523706a;

    /* renamed from: b, reason: collision with root package name */
    public final o45.yh f523707b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f523708c;

    public y0(boolean z17) {
        this.f523706a = new o45.xh();
        this.f523707b = new o45.yh();
        this.f523708c = z17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.k1
    /* renamed from: getPush */
    public boolean mo47977xfb841790() {
        return this.f523708c;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.k1
    /* renamed from: getReqObjImp */
    public o45.zg mo13820xe7c2e2dd() {
        return this.f523706a;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getRespObj */
    public o45.ah mo13821x7f35c2d1() {
        return this.f523707b;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getType */
    public int mo13822xfb85f7b0() {
        return 138;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getUri */
    public java.lang.String mo13823xb5887636() {
        return "/cgi-bin/micromsg-bin/newsync";
    }

    public y0(o45.yh yhVar) {
        this.f523706a = new o45.xh();
        this.f523707b = yhVar;
        this.f523708c = true;
    }
}
