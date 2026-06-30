package rf2;

/* loaded from: classes10.dex */
public final class a2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f476184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.c2 f476185e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476186f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rf2.d2 f476187g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476188h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f476189i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f476190m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, rf2.c2 c2Var, java.lang.String str, rf2.d2 d2Var, java.lang.String str2, android.widget.TextView textView, android.view.View view) {
        super(2, interfaceC29045xdcb5ca57);
        this.f476184d = hVar;
        this.f476185e = c2Var;
        this.f476186f = str;
        this.f476187g = d2Var;
        this.f476188h = str2;
        this.f476189i = textView;
        this.f476190m = view;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rf2.a2(this.f476184d, interfaceC29045xdcb5ca57, this.f476185e, this.f476186f, this.f476187g, this.f476188h, this.f476189i, this.f476190m);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        rf2.a2 a2Var = (rf2.a2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        a2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        rf2.c2 c2Var = this.f476185e;
        mm2.v4 v4Var = (mm2.v4) c2Var.f476213b.m56788xbba4bfc0(mm2.v4.class);
        rf2.d2 d2Var = this.f476187g;
        r45.l30 S6 = v4Var.S6(this.f476186f, new java.lang.Integer(d2Var.f476228d.m75939xb282bd08(0)));
        d2Var.f476228d.set(2, 1);
        if (S6 != null) {
            d2Var.f476228d.set(3, java.lang.Integer.valueOf(S6.m75939xb282bd08(3)));
        } else {
            r45.l30 l30Var = d2Var.f476228d;
            l30Var.set(3, java.lang.Integer.valueOf(l30Var.m75939xb282bd08(3) + 1));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c2Var.f476214c, "vote " + d2Var.f476232h + ", " + d2Var.f476228d.m75939xb282bd08(0) + ", voteId:" + this.f476188h + ", succ");
        this.f476185e.d(this.f476186f, this.f476189i, this.f476190m, this.f476188h, true);
        return jz5.f0.f384359a;
    }
}
