package o45;

/* loaded from: classes12.dex */
public class nh extends com.p314xaae8f345.mm.p944x882e457a.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f424516a;

    /* renamed from: b, reason: collision with root package name */
    public final o45.oh f424517b;

    /* renamed from: c, reason: collision with root package name */
    public final o45.ph f424518c = new o45.ph();

    public nh(boolean z17) {
        this.f424516a = true;
        this.f424516a = z17;
        this.f424517b = new o45.oh(z17);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.k1, com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getOptions */
    public int mo14486xf353c268() {
        return this.f424516a ? 1 : 0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.k1
    /* renamed from: getReqObjImp */
    public o45.zg mo13820xe7c2e2dd() {
        return this.f424517b;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getRespObj */
    public o45.ah mo13821x7f35c2d1() {
        return this.f424518c;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getType */
    public int mo13822xfb85f7b0() {
        return this.f424516a ? 3944 : 836;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getUri */
    public java.lang.String mo13823xb5887636() {
        return this.f424516a ? "/cgi-bin/micromsg-bin/fpfreshnl" : "/cgi-bin/micromsg-bin/fpfresh";
    }
}
