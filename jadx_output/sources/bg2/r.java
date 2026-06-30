package bg2;

/* loaded from: classes3.dex */
public final class r extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public boolean f20432e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f20433f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f20434g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f20435h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f20436i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView f20437m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f20438n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f20438n = "";
    }

    @Override // tc2.c
    public void P6() {
        in5.s0 s0Var = this.f417141d.f417149i;
        android.view.ViewGroup viewGroup = s0Var != null ? (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.djy) : null;
        this.f20433f = viewGroup;
        this.f20434g = viewGroup != null ? (android.view.ViewGroup) viewGroup.findViewById(com.tencent.mm.R.id.f484259dk2) : null;
        android.view.ViewGroup viewGroup2 = this.f20433f;
        this.f20437m = viewGroup2 != null ? (com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView) viewGroup2.findViewById(com.tencent.mm.R.id.djz) : null;
        android.view.ViewGroup viewGroup3 = this.f20434g;
        this.f20435h = viewGroup3 != null ? (android.widget.TextView) viewGroup3.findViewById(com.tencent.mm.R.id.f484257dk0) : null;
        android.view.ViewGroup viewGroup4 = this.f20434g;
        this.f20436i = viewGroup4 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup4.findViewById(com.tencent.mm.R.id.f484258dk1) : null;
    }

    @Override // tc2.c
    public void Q6() {
        bg2.d2 d2Var = (bg2.d2) N6(bg2.d2.class);
        boolean z17 = d2Var != null ? d2Var.f20013i : false;
        this.f20432e = z17;
        if (!z17) {
            com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView finderLiveConfettiView = this.f20437m;
            if (finderLiveConfettiView != null) {
                finderLiveConfettiView.setVisibility(8);
            }
            android.view.ViewGroup viewGroup = this.f20434g;
            if (viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(8);
            return;
        }
        com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView finderLiveConfettiView2 = this.f20437m;
        if (finderLiveConfettiView2 != null) {
            finderLiveConfettiView2.setVisibility(0);
        }
        android.view.ViewGroup viewGroup2 = this.f20434g;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        kotlinx.coroutines.y0 y0Var = this.f417141d.f417147g;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new bg2.n(this, null), 3, null);
        }
    }

    @Override // tc2.c
    public void U6() {
        this.f20438n = "";
        android.view.ViewGroup viewGroup = this.f20434g;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView finderLiveConfettiView = this.f20437m;
        if (finderLiveConfettiView != null) {
            finderLiveConfettiView.setVisibility(8);
        }
        com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView finderLiveConfettiView2 = this.f20437m;
        if (finderLiveConfettiView2 != null) {
            finderLiveConfettiView2.e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.f329468a == true) goto L15;
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
            mm2.v0 r0 = r0.f20257g
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 == 0) goto L14
            java.util.List r2 = r0.f329469b
            goto L15
        L14:
            r2 = r1
        L15:
            r3 = 0
            if (r0 == 0) goto L1e
            boolean r0 = r0.f329468a
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
            tc2.g r0 = r9.f417141d
            kotlinx.coroutines.y0 r3 = r0.f417147g
            if (r3 == 0) goto L3d
            kotlinx.coroutines.p0 r4 = kotlinx.coroutines.q1.f310570c
            r5 = 0
            bg2.o r6 = new bg2.o
            r6.<init>(r2, r9, r1)
            r7 = 2
            r8 = 0
            kotlinx.coroutines.l.d(r3, r4, r5, r6, r7, r8)
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.r.Y6():void");
    }

    public final void Z6(boolean z17) {
        java.lang.Float f17;
        kotlinx.coroutines.y0 y0Var;
        android.view.ViewGroup viewGroup;
        mm2.v0 v0Var;
        android.widget.TextView textView;
        android.content.Context context;
        if (this.f20432e) {
            bg2.l lVar = (bg2.l) N6(bg2.l.class);
            java.lang.Long valueOf = lVar != null ? java.lang.Long.valueOf(lVar.f20259i) : null;
            android.view.ViewGroup viewGroup2 = this.f20433f;
            if (viewGroup2 == null || (context = viewGroup2.getContext()) == null) {
                f17 = null;
            } else {
                java.lang.Object systemService = context.getSystemService("window");
                kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
                if (defaultDisplay != null) {
                    defaultDisplay.getMetrics(displayMetrics);
                }
                f17 = java.lang.Float.valueOf((12.0f * displayMetrics.density) / context.getResources().getDisplayMetrics().density);
            }
            if (f17 != null && (textView = this.f20435h) != null) {
                textView.setTextSize(1, f17.floatValue());
            }
            android.widget.TextView textView2 = this.f20435h;
            if (textView2 != null) {
                textView2.setText(valueOf != null ? zl2.r4.S(zl2.r4.f473950a, valueOf.longValue(), 0, 2, null) : null);
            }
            java.lang.String str = (lVar == null || (v0Var = lVar.f20257g) == null) ? null : v0Var.f329470c;
            com.tencent.mars.xlog.Log.i("LiveConvertCheerUIController", "updateCheerIcon:  " + z17 + ", " + str + ", " + this.f20438n);
            if (!kotlin.jvm.internal.o.b(str, this.f20438n) || z17) {
                android.view.ViewGroup viewGroup3 = this.f20433f;
                android.content.Context context2 = viewGroup3 != null ? viewGroup3.getContext() : null;
                if (context2 != null && (y0Var = this.f417141d.f417147g) != null) {
                    kotlinx.coroutines.l.d(y0Var, null, null, new bg2.q(context2, str, this, null), 3, null);
                }
            }
            long j17 = lVar != null ? lVar.f20260m : 0L;
            com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView finderLiveConfettiView = this.f20437m;
            if (finderLiveConfettiView != null) {
                finderLiveConfettiView.f117594n += j17;
            }
            android.view.ViewGroup viewGroup4 = this.f20434g;
            if ((viewGroup4 != null && viewGroup4.getVisibility() == 0) || (viewGroup = this.f20434g) == null) {
                return;
            }
            viewGroup.setVisibility(0);
        }
    }

    @Override // tc2.h
    public void onLiveMsg(r45.r71 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        Y6();
        Z6(false);
    }

    @Override // tc2.h
    public void onLiveStart(r45.hc1 hc1Var) {
        Y6();
        Z6(true);
    }
}
