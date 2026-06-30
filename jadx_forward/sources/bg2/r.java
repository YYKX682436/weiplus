package bg2;

/* loaded from: classes3.dex */
public final class r extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public boolean f101965e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f101966f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f101967g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f101968h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f101969i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14394xb058b2bf f101970m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f101971n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f101971n = "";
    }

    @Override // tc2.c
    public void P6() {
        in5.s0 s0Var = this.f498674d.f498682i;
        android.view.ViewGroup viewGroup = s0Var != null ? (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.djy) : null;
        this.f101966f = viewGroup;
        this.f101967g = viewGroup != null ? (android.view.ViewGroup) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f565792dk2) : null;
        android.view.ViewGroup viewGroup2 = this.f101966f;
        this.f101970m = viewGroup2 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14394xb058b2bf) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.djz) : null;
        android.view.ViewGroup viewGroup3 = this.f101967g;
        this.f101968h = viewGroup3 != null ? (android.widget.TextView) viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.f565790dk0) : null;
        android.view.ViewGroup viewGroup4 = this.f101967g;
        this.f101969i = viewGroup4 != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) viewGroup4.findViewById(com.p314xaae8f345.mm.R.id.f565791dk1) : null;
    }

    @Override // tc2.c
    public void Q6() {
        bg2.d2 d2Var = (bg2.d2) N6(bg2.d2.class);
        boolean z17 = d2Var != null ? d2Var.f101546i : false;
        this.f101965e = z17;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14394xb058b2bf c14394xb058b2bf = this.f101970m;
            if (c14394xb058b2bf != null) {
                c14394xb058b2bf.setVisibility(8);
            }
            android.view.ViewGroup viewGroup = this.f101967g;
            if (viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(8);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14394xb058b2bf c14394xb058b2bf2 = this.f101970m;
        if (c14394xb058b2bf2 != null) {
            c14394xb058b2bf2.setVisibility(0);
        }
        android.view.ViewGroup viewGroup2 = this.f101967g;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f498674d.f498680g;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new bg2.n(this, null), 3, null);
        }
    }

    @Override // tc2.c
    public void U6() {
        this.f101971n = "";
        android.view.ViewGroup viewGroup = this.f101967g;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14394xb058b2bf c14394xb058b2bf = this.f101970m;
        if (c14394xb058b2bf != null) {
            c14394xb058b2bf.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14394xb058b2bf c14394xb058b2bf2 = this.f101970m;
        if (c14394xb058b2bf2 != null) {
            c14394xb058b2bf2.e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.f411001a == true) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y6() {
        /*
            r9 = this;
            java.lang.Class<bg2.l> r0 = bg2.l.class
            tc2.c r0 = r9.N6(r0)
            bg2.l r0 = (bg2.l) r0
            r1 = 0
            if (r0 == 0) goto Le
            mm2.v0 r0 = r0.f101790g
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 == 0) goto L14
            java.util.List r2 = r0.f411002b
            goto L15
        L14:
            r2 = r1
        L15:
            r3 = 0
            if (r0 == 0) goto L1e
            boolean r0 = r0.f411001a
            r4 = 1
            if (r0 != r4) goto L1e
            goto L1f
        L1e:
            r4 = r3
        L1f:
            if (r2 == 0) goto L25
            int r3 = r2.size()
        L25:
            if (r3 <= 0) goto L3d
            if (r4 != 0) goto L2a
            goto L3d
        L2a:
            tc2.g r0 = r9.f498674d
            kotlinx.coroutines.y0 r3 = r0.f498680g
            if (r3 == 0) goto L3d
            kotlinx.coroutines.p0 r4 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            r5 = 0
            bg2.o r6 = new bg2.o
            r6.<init>(r2, r9, r1)
            r7 = 2
            r8 = 0
            p3325xe03a0797.p3326xc267989b.l.d(r3, r4, r5, r6, r7, r8)
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.r.Y6():void");
    }

    public final void Z6(boolean z17) {
        java.lang.Float f17;
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        android.view.ViewGroup viewGroup;
        mm2.v0 v0Var;
        android.widget.TextView textView;
        android.content.Context context;
        if (this.f101965e) {
            bg2.l lVar = (bg2.l) N6(bg2.l.class);
            java.lang.Long valueOf = lVar != null ? java.lang.Long.valueOf(lVar.f101792i) : null;
            android.view.ViewGroup viewGroup2 = this.f101966f;
            if (viewGroup2 == null || (context = viewGroup2.getContext()) == null) {
                f17 = null;
            } else {
                java.lang.Object systemService = context.getSystemService("window");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
                if (defaultDisplay != null) {
                    defaultDisplay.getMetrics(displayMetrics);
                }
                f17 = java.lang.Float.valueOf((12.0f * displayMetrics.density) / context.getResources().getDisplayMetrics().density);
            }
            if (f17 != null && (textView = this.f101968h) != null) {
                textView.setTextSize(1, f17.floatValue());
            }
            android.widget.TextView textView2 = this.f101968h;
            if (textView2 != null) {
                textView2.setText(valueOf != null ? zl2.r4.S(zl2.r4.f555483a, valueOf.longValue(), 0, 2, null) : null);
            }
            java.lang.String str = (lVar == null || (v0Var = lVar.f101790g) == null) ? null : v0Var.f411003c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveConvertCheerUIController", "updateCheerIcon:  " + z17 + ", " + str + ", " + this.f101971n);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f101971n) || z17) {
                android.view.ViewGroup viewGroup3 = this.f101966f;
                android.content.Context context2 = viewGroup3 != null ? viewGroup3.getContext() : null;
                if (context2 != null && (y0Var = this.f498674d.f498680g) != null) {
                    p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new bg2.q(context2, str, this, null), 3, null);
                }
            }
            long j17 = lVar != null ? lVar.f101793m : 0L;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14394xb058b2bf c14394xb058b2bf = this.f101970m;
            if (c14394xb058b2bf != null) {
                c14394xb058b2bf.f199127n += j17;
            }
            android.view.ViewGroup viewGroup4 = this.f101967g;
            if ((viewGroup4 != null && viewGroup4.getVisibility() == 0) || (viewGroup = this.f101967g) == null) {
                return;
            }
            viewGroup.setVisibility(0);
        }
    }

    @Override // tc2.h
    /* renamed from: onLiveMsg */
    public void mo10406x5aa1c816(r45.r71 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        Y6();
        Z6(false);
    }

    @Override // tc2.h
    /* renamed from: onLiveStart */
    public void mo10403x39a513b7(r45.hc1 hc1Var) {
        Y6();
        Z6(true);
    }
}
