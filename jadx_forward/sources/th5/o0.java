package th5;

/* loaded from: classes12.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f500960d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f500961e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f500962f;

    /* renamed from: g, reason: collision with root package name */
    public int f500963g;

    /* renamed from: h, reason: collision with root package name */
    public float f500964h;

    /* renamed from: i, reason: collision with root package name */
    public float f500965i;

    /* renamed from: m, reason: collision with root package name */
    public int f500966m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ th5.q f500967n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f500968o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f500969p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f500970q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f500971r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f500972s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ th5.p0 f500973t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f500974u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(th5.q qVar, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, boolean z18, th5.p0 p0Var, java.lang.String str4, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f500967n = qVar;
        this.f500968o = str;
        this.f500969p = str2;
        this.f500970q = str3;
        this.f500971r = z17;
        this.f500972s = z18;
        this.f500973t = p0Var;
        this.f500974u = str4;
    }

    public static final void a(p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, th5.p0 p0Var, th5.q qVar, float f17) {
        float e17 = e06.p.e(f17, 0.0f, 0.999f);
        if (java.lang.Math.abs(e17 - e0Var.f391648d) >= 0.007f || e17 >= 0.99f) {
            e0Var.f391648d = e17;
            vf3.e eVar = vf3.e.f517913g;
            vf3.i.Z6(p0Var, qVar, eVar, new vf3.f(eVar, null, 0, e17, 6, null), null, null, 12, null);
        }
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new th5.o0(this.f500967n, this.f500968o, this.f500969p, this.f500970q, this.f500971r, this.f500972s, this.f500973t, this.f500974u, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((th5.o0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0290 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0551 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018d  */
    /* JADX WARN: Type inference failed for: r13v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v36, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r42) {
        /*
            Method dump skipped, instructions count: 1378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: th5.o0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
