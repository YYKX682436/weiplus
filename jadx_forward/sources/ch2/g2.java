package ch2;

/* loaded from: classes10.dex */
public final class g2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f122890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f122891e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f122892f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f122893g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f122894h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f122895i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, boolean z17, ch2.o2 o2Var, r45.yx1 yx1Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f122891e = h0Var;
        this.f122892f = z17;
        this.f122893g = o2Var;
        this.f122894h = yx1Var;
        this.f122895i = h0Var2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ch2.g2(this.f122891e, this.f122892f, this.f122893g, this.f122894h, this.f122895i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ch2.g2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f122890d;
        r45.yx1 yx1Var = this.f122894h;
        ch2.o2 o2Var = this.f122893g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f122890d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(60000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                ch2.o2 o2Var2 = this.f122893g;
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f122895i;
                ch2.o2.Z6(o2Var2, false, (org.json.JSONObject) h0Var.f391656d, 60000L, this.f122894h);
                gh2.f l76 = o2Var.l7();
                java.lang.String unique_id = yx1Var.f472992e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(unique_id, "unique_id");
                l76.O6(unique_id, gh2.b.f353396p, new ch2.f2(h0Var));
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) this.f122891e.f391656d;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("timeout, mainSinger: ");
        boolean z17 = this.f122892f;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVSingController", sb6.toString());
        if (!z17) {
            java.util.List list = (java.util.List) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) o2Var.q7().A).mo144003x754a37bb();
            if (list != null) {
                o2Var.v7(list, false);
            }
            return jz5.f0.f384359a;
        }
        java.lang.String string = o2Var.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573113mj3);
        this.f122890d = 2;
        if (o2Var.s7(yx1Var, string, this) == aVar) {
            return aVar;
        }
        ch2.o2 o2Var22 = this.f122893g;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = this.f122895i;
        ch2.o2.Z6(o2Var22, false, (org.json.JSONObject) h0Var2.f391656d, 60000L, this.f122894h);
        gh2.f l762 = o2Var.l7();
        java.lang.String unique_id2 = yx1Var.f472992e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(unique_id2, "unique_id");
        l762.O6(unique_id2, gh2.b.f353396p, new ch2.f2(h0Var2));
        return jz5.f0.f384359a;
    }
}
