package w11;

/* loaded from: classes12.dex */
public class y extends com.p314xaae8f345.mm.p944x882e457a.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final w11.w f523702a;

    /* renamed from: b, reason: collision with root package name */
    public final w11.x f523703b;

    /* renamed from: c, reason: collision with root package name */
    public final int f523704c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f523705d;

    public y(int i17, java.lang.String str, int i18, r45.cu5 cu5Var, byte[] bArr) {
        w11.w wVar = new w11.w();
        this.f523702a = wVar;
        this.f523703b = new w11.x();
        this.f523704c = i17;
        this.f523705d = str;
        wVar.f523690b = i17;
        wVar.f523691c = bArr;
        r45.tc tcVar = wVar.f523689a;
        tcVar.f467816d = i18;
        tcVar.f467817e = cu5Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.k1, com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getIsUserCmd */
    public boolean mo47974xd4193e2f() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.k1, com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getOptions */
    public int mo14486xf353c268() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.k1
    /* renamed from: getReqObjImp */
    public o45.zg mo13820xe7c2e2dd() {
        return this.f523702a;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getRespObj */
    public o45.ah mo13821x7f35c2d1() {
        return this.f523703b;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getType */
    public int mo13822xfb85f7b0() {
        return this.f523704c;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v0
    /* renamed from: getUri */
    public java.lang.String mo13823xb5887636() {
        return this.f523705d;
    }
}
