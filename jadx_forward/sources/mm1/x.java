package mm1;

/* loaded from: classes11.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f410247d;

    /* renamed from: e, reason: collision with root package name */
    public int f410248e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm1.b0 f410249f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f410250g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ il4.e f410251h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f410252i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f410253m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ qk.a f410254n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f410255o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f410256p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f410257q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.util.List f410258r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ bw5.o50 f410259s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ yz5.a f410260t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(mm1.b0 b0Var, bw5.lp0 lp0Var, il4.e eVar, android.content.Context context, java.lang.Boolean bool, qk.a aVar, boolean z17, android.os.Bundle bundle, boolean z18, java.util.List list, bw5.o50 o50Var, yz5.a aVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f410249f = b0Var;
        this.f410250g = lp0Var;
        this.f410251h = eVar;
        this.f410252i = context;
        this.f410253m = bool;
        this.f410254n = aVar;
        this.f410255o = z17;
        this.f410256p = bundle;
        this.f410257q = z18;
        this.f410258r = list;
        this.f410259s = o50Var;
        this.f410260t = aVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mm1.x(this.f410249f, this.f410250g, this.f410251h, this.f410252i, this.f410253m, this.f410254n, this.f410255o, this.f410256p, this.f410257q, this.f410258r, this.f410259s, this.f410260t, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm1.x) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0144, code lost:
    
        if (r3.intValue() != r5) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0262, code lost:
    
        if (((mm1.f0) r1).Vi(r5) == false) goto L121;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x01eb A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mm1.x.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
