package vw;

/* loaded from: classes11.dex */
public final class c2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f522136d;

    /* renamed from: e, reason: collision with root package name */
    public int f522137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dw5.o f522138f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f522139g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rv.h3 f522140h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(dw5.o oVar, android.content.Context context, rv.h3 h3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f522138f = oVar;
        this.f522139g = context;
        this.f522140h = h3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vw.c2(this.f522138f, this.f522139g, this.f522140h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vw.c2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pi0.l1 l1Var;
        java.lang.Object s17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f522137e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            pi0.q Ui = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            byte[] mo14344x5f01b1f6 = this.f522138f.mo14344x5f01b1f6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
            linkedHashMap.put("previewInfo", mo14344x5f01b1f6);
            pi0.l1 l1Var2 = new pi0.l1(Ui, "biz", null, false, null, 28, null);
            this.f522136d = l1Var2;
            this.f522137e = 1;
            if (l1Var2.o("image_previewer", linkedHashMap, this) == aVar) {
                return aVar;
            }
            l1Var = l1Var2;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            l1Var = (pi0.l1) this.f522136d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        lx.x5 x5Var = new lx.x5();
        x5Var.f403542d = new vw.b2(this.f522140h);
        l1Var.a(kz5.c0.i(x5Var, new lx.p5(), new lx.v5(), new lx.i2()));
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6 = new com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6(1, -1, null, false, false, false, null, 0, false, false, false, null, 4076, null);
        android.content.Context context = this.f522139g;
        this.f522136d = null;
        this.f522137e = 2;
        s17 = l1Var.s(context, c10716x931597c6, (r13 & 4) != 0 ? null : com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1294xd2ae381c.ActivityC12991xa70eba82.class, (r13 & 8) != 0 ? null : null, this);
        if (s17 == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
