package o45;

/* loaded from: classes12.dex */
public class qh extends com.p314xaae8f345.mm.p944x882e457a.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f424534a;

    /* renamed from: b, reason: collision with root package name */
    public final o45.rh f424535b;

    /* renamed from: c, reason: collision with root package name */
    public final o45.sh f424536c = new o45.sh();

    public qh(boolean z17) {
        this.f424534a = true;
        this.f424534a = z17;
        this.f424535b = new o45.rh(z17);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.k1, com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getOptions */
    public int mo14486xf353c268() {
        return this.f424534a ? 1 : 0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.k1
    /* renamed from: getReqObjImp */
    public o45.zg mo13820xe7c2e2dd() {
        return this.f424535b;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getRespObj */
    public o45.ah mo13821x7f35c2d1() {
        return this.f424536c;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getType */
    public int mo13822xfb85f7b0() {
        return this.f424534a ? 3789 : 3644;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getUri */
    public java.lang.String mo13823xb5887636() {
        return this.f424534a ? "/cgi-bin/micromsg-bin/fpinitnl" : "/cgi-bin/micromsg-bin/fpinit";
    }
}
