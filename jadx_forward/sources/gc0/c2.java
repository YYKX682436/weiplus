package gc0;

/* loaded from: classes5.dex */
public final class c2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f351646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f351647e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gc0.b0 f351648f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f351649g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 f351650h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f351651i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f351652m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(gc0.p2 p2Var, gc0.b0 b0Var, yz5.a aVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18, yz5.a aVar2, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f351647e = p2Var;
        this.f351648f = b0Var;
        this.f351649g = aVar;
        this.f351650h = c21475x81dbaa18;
        this.f351651i = aVar2;
        this.f351652m = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gc0.c2(this.f351647e, this.f351648f, this.f351649g, this.f351650h, this.f351651i, this.f351652m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gc0.c2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String obj2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f351646d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gc0.p2 p2Var = this.f351647e;
            gc0.e1 e1Var = p2Var.f351781m;
            gc0.b0 b0Var = this.f351648f;
            java.lang.String str = b0Var.f351633b;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            e1Var.getClass();
            e1Var.f351685k = str;
            android.text.Editable text = ((android.widget.EditText) this.f351649g.mo152xb9724478()).getText();
            if (text != null && (obj2 = text.toString()) != null) {
                str2 = obj2;
            }
            this.f351646d = 1;
            obj = p2Var.R6(b0Var, str2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        jz5.l lVar = (jz5.l) obj;
        boolean booleanValue = ((java.lang.Boolean) lVar.f384366d).booleanValue();
        java.util.List list = (java.util.List) lVar.f384367e;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        gc0.b2 b2Var = new gc0.b2(this.f351650h, list, this.f351647e, booleanValue, this.f351651i, this.f351648f, this.f351652m, this.f351649g, null);
        this.f351646d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, b2Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
