package yf5;

/* loaded from: classes11.dex */
public final class u0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f543487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf5.w0 f543488e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f543489f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l75.a1 f543490g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(java.lang.Object obj, yf5.w0 w0Var, int i17, l75.a1 a1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f543487d = obj;
        this.f543488e = w0Var;
        this.f543489f = i17;
        this.f543490g = a1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yf5.u0(this.f543487d, this.f543488e, this.f543489f, this.f543490g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yf5.u0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        yf5.a aVar;
        java.util.HashMap hashMap;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var;
        yf5.m mVar;
        yf5.x xVar;
        pz5.a aVar2 = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        jz5.f0 f0Var = jz5.f0.f384359a;
        java.lang.Object obj2 = this.f543487d;
        int i17 = this.f543489f;
        yf5.w0 w0Var = this.f543488e;
        if (obj2 == null || !(obj2 instanceof java.lang.String)) {
            java.lang.String str = w0Var.f543511g;
            new java.lang.Integer(i17);
            return f0Var;
        }
        l75.a1 a1Var = this.f543490g;
        if (a1Var instanceof com.p314xaae8f345.mm.p2621x8fb0427b.l8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w0Var.f543511g, "unreadcheck onConversationStorageNotifyChange event type %d, username %s", new java.lang.Integer(i17), obj2);
            w0Var.d().k(i17, (java.lang.String) obj2);
        } else if (a1Var instanceof com.p314xaae8f345.mm.p2621x8fb0427b.e8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w0Var.f543511g, "unreadcheck onContactStorageNotifyChange event type %d, username %s, isIniting %b", new java.lang.Integer(i17), obj2, java.lang.Boolean.valueOf(w0Var.f543527z));
            if (w0Var.f543527z) {
                return f0Var;
            }
            yf5.w d17 = w0Var.d();
            java.lang.String str2 = (java.lang.String) obj2;
            d17.getClass();
            if ((i17 == 3 || i17 == 4) && (aVar = d17.f543497h) != null && (hashMap = aVar.f543379c) != null && (l4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) hashMap.get(str2)) != null) {
                yf5.x xVar2 = (yf5.x) d17.f543505s.get(str2);
                if (xVar2 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = d17.f543495f;
                    if (c16718x7059cefe != null) {
                        java.util.Iterator it = new java.util.ArrayList(c16718x7059cefe.f233598o).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                xVar = 0;
                                break;
                            }
                            xVar = it.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((yf5.x) xVar).f543528d.h1(), str2)) {
                                break;
                            }
                        }
                        xVar2 = xVar;
                    } else {
                        xVar2 = null;
                    }
                }
                if (xVar2 == null) {
                    xVar2 = d17.d(l4Var, null);
                } else {
                    d17.e(l4Var, xVar2, null);
                }
                yf5.x xVar3 = xVar2;
                if (xVar3 != null && (mVar = d17.f543496g) != null) {
                    v65.i.b(mVar.f543443d, null, new yf5.l(mVar, xVar3, false, mVar.f543445f.f543397b, null), 1, null);
                }
            }
        }
        return f0Var;
    }
}
