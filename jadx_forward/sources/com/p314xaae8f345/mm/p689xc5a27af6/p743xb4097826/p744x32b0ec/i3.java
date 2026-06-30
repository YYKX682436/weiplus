package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes.dex */
public final class i3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f148292d;

    /* renamed from: e, reason: collision with root package name */
    public int f148293e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f148294f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 f148295g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f148296h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f148297i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f148298m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148299n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f148300o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var, int i17, android.content.Context context, long j17, java.lang.String str, android.widget.ImageView imageView, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f148295g = v4Var;
        this.f148296h = i17;
        this.f148297i = context;
        this.f148298m = j17;
        this.f148299n = str;
        this.f148300o = imageView;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.i3 i3Var = new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.i3(this.f148295g, this.f148296h, this.f148297i, this.f148298m, this.f148299n, this.f148300o, interfaceC29045xdcb5ca57);
        i3Var.f148294f = obj;
        return i3Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.i3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        java.util.Set set;
        p3325xe03a0797.p3326xc267989b.y0 y0Var2;
        java.util.Set set2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f148293e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        int i18 = this.f148296h;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var3 = (p3325xe03a0797.p3326xc267989b.y0) this.f148294f;
            com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var = this.f148295g;
            java.util.Set set3 = (java.util.Set) ((java.util.LinkedHashMap) v4Var.H).get(new java.lang.Integer(i18));
            if (set3 == null) {
                set3 = new java.util.LinkedHashSet();
                v4Var.H.put(new java.lang.Integer(i18), set3);
            }
            java.util.Set set4 = set3;
            set4.add(y0Var3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "#executeCirculationFillingActivityIcon source=" + i18 + " add done. setCount=" + set4.size());
            try {
                android.content.Context context = this.f148297i;
                long j17 = this.f148298m;
                java.lang.String str = this.f148299n;
                android.widget.ImageView imageView = this.f148300o;
                this.f148294f = y0Var3;
                this.f148292d = set4;
                this.f148293e = 1;
                try {
                    v4Var.getClass();
                    p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                    y0Var = y0Var3;
                    try {
                        set = set4;
                        try {
                            java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.l2(j17, v4Var, context, str, imageView, null), this);
                            if (g17 != aVar) {
                                g17 = f0Var;
                            }
                            if (g17 == aVar) {
                                return aVar;
                            }
                            y0Var2 = y0Var;
                            set2 = set;
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            y0Var2 = y0Var;
                            set2 = set;
                            set2.remove(y0Var2);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "#executeCirculationFillingActivityIcon source=" + i18 + " remove done. setCount=" + set2.size());
                            throw th;
                        }
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        set = set4;
                        y0Var2 = y0Var;
                        set2 = set;
                        set2.remove(y0Var2);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "#executeCirculationFillingActivityIcon source=" + i18 + " remove done. setCount=" + set2.size());
                        throw th;
                    }
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    y0Var = y0Var3;
                }
            } catch (java.lang.Throwable th9) {
                th = th9;
                y0Var = y0Var3;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set2 = (java.util.Set) this.f148292d;
            y0Var2 = (p3325xe03a0797.p3326xc267989b.y0) this.f148294f;
            try {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            } catch (java.lang.Throwable th10) {
                th = th10;
                set2.remove(y0Var2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "#executeCirculationFillingActivityIcon source=" + i18 + " remove done. setCount=" + set2.size());
                throw th;
            }
        }
        set2.remove(y0Var2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "#executeCirculationFillingActivityIcon source=" + i18 + " remove done. setCount=" + set2.size());
        return f0Var;
    }
}
