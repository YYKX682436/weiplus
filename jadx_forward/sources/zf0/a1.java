package zf0;

/* loaded from: classes10.dex */
public final class a1 extends qz5.l implements yz5.p {
    public final /* synthetic */ com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d A;
    public final /* synthetic */ java.lang.String B;
    public final /* synthetic */ java.lang.String C;
    public final /* synthetic */ zf0.a D;
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 E;
    public final /* synthetic */ yz5.l F;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f553892d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f553893e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f553894f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f553895g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f553896h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f553897i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f553898m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f553899n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Object f553900o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f553901p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f553902q;

    /* renamed from: r, reason: collision with root package name */
    public int f553903r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f553904s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f553905t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f553906u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f553907v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f553908w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3332x361a9b.d f553909x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f553910y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f553911z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar, boolean z17, boolean z18, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, java.lang.String str4, java.lang.String str5, zf0.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 c17683x770f5025, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f553905t = str;
        this.f553906u = str2;
        this.f553907v = str3;
        this.f553908w = map;
        this.f553909x = dVar;
        this.f553910y = z17;
        this.f553911z = z18;
        this.A = c11120x15dce88d;
        this.B = str4;
        this.C = str5;
        this.D = aVar;
        this.E = c17683x770f5025;
        this.F = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        zf0.a1 a1Var = new zf0.a1(this.f553905t, this.f553906u, this.f553907v, this.f553908w, this.f553909x, this.f553910y, this.f553911z, this.A, this.B, this.C, this.D, this.E, this.F, interfaceC29045xdcb5ca57);
        a1Var.f553904s = obj;
        return a1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zf0.a1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(11:(1:(1:(1:(3:6|7|8)(2:10|11))(11:12|13|14|15|16|17|(1:22)|19|(1:21)|7|8))(1:31))(7:52|(1:84)(1:56)|(1:83)|60|(4:64|(1:66)(1:75)|67|(3:(1:70)|71|72)(1:(1:74)))|76|(2:78|(1:80)(1:81))(5:82|19|(0)|7|8))|41|42|(1:44)|16|17|(0)|19|(0)|7|8)|32|33|(1:35)(1:49)|36|37|38|39|40|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01d1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d2, code lost:
    
        r17 = r15;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01d6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01d7, code lost:
    
        r17 = r15;
        r15 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0208 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zf0.a1.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
