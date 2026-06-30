package xx0;

/* loaded from: classes5.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f539386d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f539387e;

    /* renamed from: f, reason: collision with root package name */
    public int f539388f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f539389g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xx0.c f539390h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ xx0.j f539391i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, xx0.c cVar, xx0.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f539389g = context;
        this.f539390h = cVar;
        this.f539391i = jVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xx0.b(this.f539389g, this.f539390h, this.f539391i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xx0.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.widget.ProgressBar progressBar;
        xx0.c cVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f539388f;
        android.content.Context context = this.f539389g;
        boolean z17 = true;
        xx0.c cVar2 = this.f539390h;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            progressBar = new android.widget.ProgressBar(context);
            progressBar.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
            progressBar.setBackgroundColor(0);
            progressBar.setIndeterminateDrawable(progressBar.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.avg));
            cVar2.addView(progressBar);
            xx0.i iVar = cVar2.f539395e;
            this.f539386d = progressBar;
            this.f539387e = cVar2;
            this.f539388f = 1;
            obj = iVar.b(true, this);
            if (obj == aVar) {
                return aVar;
            }
            cVar = cVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (xx0.c) this.f539387e;
            progressBar = (android.widget.ProgressBar) this.f539386d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        cVar.f539399i = kz5.n0.V0((java.util.Collection) obj);
        java.util.List list = cVar2.f539399i;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((vt3.r) it.next()).f521575d) {
                    break;
                }
            }
        }
        z17 = false;
        cVar2.f539400m = z17;
        cVar2.removeView(progressBar);
        cVar2.getClass();
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff(context, null);
        c2718xca2902ff.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, c2718xca2902ff.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db)));
        c2718xca2902ff.setBackground(null);
        c2718xca2902ff.m20371x33be8efb(0);
        c2718xca2902ff.m20368xc75d81ec(c2718xca2902ff.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30));
        c2718xca2902ff.m20374x5ef8445b(false);
        c2718xca2902ff.m20370x2c4c8fbe(c2718xca2902ff.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561175bh));
        c2718xca2902ff.m20375x54a12416(0);
        c2718xca2902ff.m20376x95e7e540(null);
        cVar2.f539396f = c2718xca2902ff;
        cVar2.addView(c2718xca2902ff);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10999x6193c3b0 c10999x6193c3b0 = new com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10999x6193c3b0(context, null, 2, null);
        cVar2.getClass();
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        c10999x6193c3b0.setLayoutParams(layoutParams);
        cVar2.addView(c10999x6193c3b0);
        c2718xca2902ff.a(new xx0.a(cVar2, c10999x6193c3b0));
        cVar2.f539397g = new xx0.f0(cVar2.f539394d, cVar2.f539399i, cVar2.f539395e, this.f539391i);
        c10999x6193c3b0.m8315x6cab2c8d(cVar2.f539397g);
        c10999x6193c3b0.m8321x40341e13(3);
        for (vt3.r rVar : cVar2.f539399i) {
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570957dk2, (android.view.ViewGroup) null);
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.qoy)).setText(rVar.f521573b);
            inflate.setTag(new java.lang.Long(rVar.f521572a));
            oa.i l17 = c2718xca2902ff.l();
            l17.f425316f = inflate;
            l17.f();
            c2718xca2902ff.b(l17);
        }
        return jz5.f0.f384359a;
    }
}
