package cj4;

/* loaded from: classes11.dex */
public class k implements cj4.l1, com.tencent.mm.modelbase.u0 {
    public android.widget.TextView A;
    public android.widget.ImageView B;
    public android.widget.TextView C;
    public android.widget.TextView D;
    public android.view.View E;
    public android.view.View F;
    public android.view.View G;
    public mj4.h H;
    public com.tencent.mm.emoji.view.EmojiStatusView I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f41974J;
    public com.tencent.mm.ui.base.FlowLayout K;
    public android.view.View L;
    public android.widget.TextView M;
    public android.view.View N;
    public android.widget.FrameLayout P;
    public android.view.View Q;
    public android.view.View R;
    public android.view.View S;
    public bi4.h0 T;
    public pj4.o0 U;
    public bi4.m0 V;

    /* renamed from: d, reason: collision with root package name */
    public final bi4.k1 f41975d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f41976e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.Context f41977f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f41978g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f41979h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f41980i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f41981m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f41982n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f41983o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f41984p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f41985q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f41986r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f41987s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f41988t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f41989u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f41990v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f41991w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f41992x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f41993y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f41994z;

    public k(bi4.k1 showParam) {
        kotlin.jvm.internal.o.g(showParam, "showParam");
        this.f41975d = showParam;
        this.f41978g = "";
    }

    @Override // cj4.l1
    public void a(android.content.Context context, mj4.h hVar) {
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final android.widget.ImageView b(android.view.ViewGroup viewGroup) {
        android.widget.ImageView b17;
        kotlin.jvm.internal.o.g(viewGroup, "viewGroup");
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt instanceof android.widget.ImageView) {
                return (android.widget.ImageView) childAt;
            }
            if ((childAt instanceof android.view.ViewGroup) && (b17 = b((android.view.ViewGroup) childAt)) != null) {
                return b17;
            }
        }
        return null;
    }

    public final com.tencent.mm.ui.widget.imageview.WeImageView e() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f41990v;
        if (weImageView != null) {
            return weImageView;
        }
        kotlin.jvm.internal.o.o("btnLike");
        throw null;
    }

    @Override // cj4.l1
    public void f(yz5.a aVar) {
    }

    @Override // cj4.l1
    public cj4.q1 g() {
        return cj4.q1.f42020d;
    }

    @Override // cj4.l1
    public void h(android.content.Context context, mj4.h hVar) {
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // cj4.l1
    public void i(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        android.content.Context context = contentView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f41977f = context;
        this.f41976e = (android.widget.TextView) contentView.findViewById(com.tencent.mm.R.id.oq8);
        this.f41979h = (android.widget.TextView) contentView.findViewById(com.tencent.mm.R.id.opk);
        this.f41985q = (android.widget.TextView) contentView.findViewById(com.tencent.mm.R.id.ooq);
        android.view.View findViewById = contentView.findViewById(com.tencent.mm.R.id.b0s);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f41990v = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById;
        android.view.View findViewById2 = contentView.findViewById(com.tencent.mm.R.id.onw);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f41991w = (android.widget.TextView) findViewById2;
        this.f41992x = contentView.findViewById(com.tencent.mm.R.id.hx6);
        this.f41993y = contentView.findViewById(com.tencent.mm.R.id.f485500hw3);
        this.f41994z = (android.widget.ImageView) contentView.findViewById(com.tencent.mm.R.id.h7m);
        this.A = (android.widget.TextView) contentView.findViewById(com.tencent.mm.R.id.opx);
        this.f41980i = (android.widget.ImageView) contentView.findViewById(com.tencent.mm.R.id.ovl);
        this.f41981m = (android.widget.LinearLayout) contentView.findViewById(com.tencent.mm.R.id.hvn);
        this.f41982n = (android.widget.ImageView) contentView.findViewById(com.tencent.mm.R.id.hkk);
        this.f41983o = (android.widget.ImageView) contentView.findViewById(com.tencent.mm.R.id.hnr);
        this.M = (android.widget.TextView) contentView.findViewById(com.tencent.mm.R.id.ol_);
        this.f41984p = contentView.findViewById(com.tencent.mm.R.id.hvz);
        this.f41986r = (android.widget.LinearLayout) contentView.findViewById(com.tencent.mm.R.id.hvr);
        this.f41987s = (android.widget.LinearLayout) contentView.findViewById(com.tencent.mm.R.id.hvj);
        this.f41988t = (com.tencent.mm.ui.widget.imageview.WeImageView) contentView.findViewById(com.tencent.mm.R.id.r7e);
        this.B = (android.widget.ImageView) contentView.findViewById(com.tencent.mm.R.id.hmy);
        this.C = (android.widget.TextView) contentView.findViewById(com.tencent.mm.R.id.ood);
        this.D = (android.widget.TextView) contentView.findViewById(com.tencent.mm.R.id.olw);
        this.E = contentView.findViewById(com.tencent.mm.R.id.hxg);
        this.F = contentView.findViewById(com.tencent.mm.R.id.rjs);
        this.N = contentView.findViewById(com.tencent.mm.R.id.owc);
        this.G = contentView.findViewById(com.tencent.mm.R.id.hwc);
        this.I = (com.tencent.mm.emoji.view.EmojiStatusView) contentView.findViewById(com.tencent.mm.R.id.det);
        this.f41974J = (android.widget.TextView) contentView.findViewById(com.tencent.mm.R.id.om7);
        this.f41989u = contentView.findViewById(com.tencent.mm.R.id.owe);
        this.K = (com.tencent.mm.ui.base.FlowLayout) contentView.findViewById(com.tencent.mm.R.id.g9e);
        this.L = contentView.findViewById(com.tencent.mm.R.id.ow_);
        this.P = (android.widget.FrameLayout) contentView.findViewById(com.tencent.mm.R.id.hyd);
        this.Q = contentView.findViewById(com.tencent.mm.R.id.o4w);
        this.R = contentView.findViewById(com.tencent.mm.R.id.r9h);
        this.S = contentView.findViewById(com.tencent.mm.R.id.r9i);
        android.widget.LinearLayout linearLayout = this.f41986r;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new cj4.g(this));
        }
        android.view.View view = this.E;
        if (view != null) {
            view.setOnClickListener(new cj4.h(this));
        }
    }

    public final android.content.Context j() {
        android.content.Context context = this.f41977f;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.o.o("context");
        throw null;
    }

    @Override // cj4.l1
    public boolean k(boolean z17, boolean z18) {
        boolean z19;
        mj4.h hVar = this.H;
        if (hVar == null || kotlin.jvm.internal.o.b(en1.a.a(), this.f41978g)) {
            return false;
        }
        java.lang.Object tag = e().getTag();
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        if ((bool != null ? bool.booleanValue() : false) == z17) {
            return false;
        }
        qj4.s sVar = qj4.s.f363958a;
        if (z17) {
            w(true);
            mj4.k kVar = (mj4.k) hVar;
            gm0.j1.d().g(new ej4.j(kVar.m(), kVar.l(), this.f41978g, 0, 1));
            if (z18) {
                qj4.s.m(sVar, j(), 15L, null, this.H, 0L, 0L, 0L, 0L, null, null, 12L, 1012, null);
                z19 = true;
            } else {
                z19 = true;
                qj4.s.m(sVar, j(), 13L, "1", hVar, 0L, 0L, 0L, 0L, null, null, 12L, 1008, null);
            }
        } else {
            mj4.k kVar2 = (mj4.k) hVar;
            gm0.j1.d().g(new ej4.j(kVar2.m(), kVar2.l(), this.f41978g, 1, 1));
            w(false);
            qj4.s.m(sVar, j(), 12L, null, hVar, 0L, 0L, 0L, 0L, null, null, 12L, 1012, null);
            z19 = true;
        }
        if (z17) {
            e().performHapticFeedback(0, 3);
        }
        return z19;
    }

    @Override // cj4.l1
    public void l() {
        e().setTag(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0589  */
    /* JADX WARN: Type inference failed for: r9v5, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // cj4.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m(java.lang.String r37, mj4.h r38, pj4.u0 r39) {
        /*
            Method dump skipped, instructions count: 1597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj4.k.m(java.lang.String, mj4.h, pj4.u0):boolean");
    }

    @Override // cj4.l1
    public void n() {
    }

    @Override // cj4.l1
    public void o() {
        bi4.h0 h0Var = this.T;
        if (h0Var != null) {
            h0Var.n();
        }
        this.T = null;
        this.U = null;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17 = m1Var instanceof ej4.j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0020, code lost:
    
        if ((r4 != null && com.tencent.mm.plugin.textstatus.ui.c.b(r4, r0)) == false) goto L8;
     */
    @Override // cj4.l1
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bi4.h0 d() {
        /*
            r6 = this;
            mj4.h r0 = r6.H
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto Lc
            pj4.o0 r0 = xe0.j0.a(r0, r2, r1, r3)
            goto Ld
        Lc:
            r0 = r3
        Ld:
            bi4.h0 r4 = r6.T
            if (r4 != 0) goto L13
        L11:
            r1 = r2
            goto L23
        L13:
            pj4.o0 r4 = r6.U
            if (r4 == 0) goto L1f
            boolean r4 = com.tencent.mm.plugin.textstatus.ui.c.b(r4, r0)
            if (r4 != r1) goto L1f
            r4 = r1
            goto L20
        L1f:
            r4 = r2
        L20:
            if (r4 != 0) goto L23
            goto L11
        L23:
            if (r1 != 0) goto L82
            r6.o()
            sj4.z0 r1 = sj4.z0.f408908a     // Catch: java.lang.Throwable -> L30
            sj4.v0 r1 = new sj4.v0     // Catch: java.lang.Throwable -> L30
            r1.<init>()     // Catch: java.lang.Throwable -> L30
            goto L3b
        L30:
            r1 = move-exception
            java.lang.String r4 = "customps err"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = "MicroMsg.TextStatus.BaseMiniStatusLoadLogic"
            com.tencent.mars.xlog.Log.printErrStackTrace(r5, r1, r4, r2)
            r1 = r3
        L3b:
            r6.T = r1
            if (r1 == 0) goto L5c
            mj4.h r2 = r6.H
            if (r2 == 0) goto L4a
            mj4.k r2 = (mj4.k) r2
            java.lang.String r2 = r2.l()
            goto L4b
        L4a:
            r2 = r3
        L4b:
            if (r0 == 0) goto L52
            java.util.LinkedList r4 = wi4.a.b(r0)
            goto L53
        L52:
            r4 = r3
        L53:
            if (r0 == 0) goto L58
            java.util.LinkedList r5 = r0.f355216g
            goto L59
        L58:
            r5 = r3
        L59:
            r1.r(r2, r4, r5)
        L5c:
            r6.U = r0
            java.lang.Class<nd0.e> r0 = nd0.e.class
            i95.m r0 = i95.n0.c(r0)
            nd0.e r0 = (nd0.e) r0
            android.content.Context r1 = r6.j()
            java.lang.Class<pj4.p0> r2 = pj4.p0.class
            md0.e r0 = (md0.e) r0
            r4 = 9
            com.tencent.mm.protobuf.f r0 = r0.Ui(r1, r4, r2)
            pj4.p0 r0 = (pj4.p0) r0
            if (r0 == 0) goto L82
            bi4.h0 r1 = r6.T
            if (r1 == 0) goto L80
            java.lang.String r3 = r1.h()
        L80:
            r0.f355246q = r3
        L82:
            bi4.h0 r0 = r6.T
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cj4.k.d():bi4.h0");
    }

    public void q(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            android.widget.TextView textView = this.D;
            if (textView == null) {
                return;
            }
            textView.setVisibility(4);
            return;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context j17 = j();
        ((ke0.e) xVar).getClass();
        android.text.SpannableString i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(j17, str);
        android.widget.TextView textView2 = this.D;
        if (textView2 != null) {
            textView2.setText(i17);
        }
        android.widget.TextView textView3 = this.D;
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
        android.widget.TextView textView4 = this.f41974J;
        android.view.ViewTreeObserver viewTreeObserver = textView4 != null ? textView4.getViewTreeObserver() : null;
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new cj4.b(this));
        }
    }

    public final void r() {
        if (kotlin.jvm.internal.o.b(en1.a.a(), this.f41978g)) {
            e().setContentDescription(j().getString(com.tencent.mm.R.string.jv6));
        } else {
            e().setContentDescription(kotlin.jvm.internal.o.b(e().getTag(), java.lang.Boolean.TRUE) ? j().getString(com.tencent.mm.R.string.jv8) : j().getString(com.tencent.mm.R.string.jv7));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r0.q(r3.P) == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            r3 = this;
            bi4.h0 r0 = r3.d()
            android.widget.FrameLayout r1 = r3.P
            r2 = 0
            if (r1 == 0) goto L18
            r1.removeAllViews()
            if (r0 == 0) goto L18
            android.widget.FrameLayout r1 = r3.P
            boolean r0 = r0.q(r1)
            r1 = 1
            if (r0 != r1) goto L18
            goto L19
        L18:
            r1 = r2
        L19:
            if (r1 == 0) goto L3a
            android.widget.FrameLayout r0 = r3.P
            if (r0 != 0) goto L20
            goto L23
        L20:
            r0.setVisibility(r2)
        L23:
            android.widget.FrameLayout r0 = r3.P
            if (r0 == 0) goto L44
            android.widget.ImageView r0 = r3.b(r0)
            if (r0 == 0) goto L44
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            cj4.f r2 = new cj4.f
            r2.<init>(r0, r3)
            r1.addOnDrawListener(r2)
            goto L44
        L3a:
            android.widget.FrameLayout r0 = r3.P
            if (r0 != 0) goto L3f
            goto L44
        L3f:
            r1 = 8
            r0.setVisibility(r1)
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cj4.k.s():void");
    }

    public final void t(android.widget.ImageView iv6, mj4.h info) {
        kotlin.jvm.internal.o.g(iv6, "iv");
        kotlin.jvm.internal.o.g(info, "info");
        if (!com.tencent.mm.plugin.textstatus.ui.c.d(info, d())) {
            iv6.setVisibility(8);
        } else {
            iv6.setVisibility(0);
            bk4.f.R(bk4.i.a(), iv6, ((mj4.k) info).h(), null, null, null, 28, null);
        }
    }

    public final void u(mj4.h hVar, boolean z17) {
        if (hVar == null) {
            return;
        }
        android.content.Context j17 = j();
        pf5.z zVar = pf5.z.f353948a;
        if (!(j17 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC textStatusCardFeedUIC = (com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) j17).a(com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC.class);
        textStatusCardFeedUIC.f173782p.put(((mj4.k) hVar).l(), java.lang.Boolean.valueOf(z17));
    }

    public void v() {
        mj4.h hVar = this.H;
        if (hVar == null) {
            return;
        }
        if (kotlin.jvm.internal.o.b(this.f41978g, en1.a.a())) {
            android.view.View view = this.f41992x;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/logic/BaseMiniStatusLoadLogic", "updateLikeNum", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/textstatus/logic/BaseMiniStatusLoadLogic", "updateLikeNum", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = this.f41992x;
            if (view2 != null) {
                view2.setBackground(null);
            }
            android.widget.TextView textView = this.f41991w;
            if (textView == null) {
                kotlin.jvm.internal.o.o("tvLikeNum");
                throw null;
            }
            textView.setVisibility(0);
            mj4.a aVar = ((mj4.k) hVar).f327067b;
            int i17 = aVar.field_LikeCount + aVar.field_referenceCount;
            android.widget.TextView textView2 = this.f41991w;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("tvLikeNum");
                throw null;
            }
            textView2.setText(java.lang.String.valueOf(i17));
            android.widget.TextView textView3 = this.f41991w;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("tvLikeNum");
                throw null;
            }
            textView3.setVisibility(0);
            e().setVisibility(0);
            android.view.View view3 = this.f41992x;
            if (view3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/logic/BaseMiniStatusLoadLogic", "updateLikeNum", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/textstatus/logic/BaseMiniStatusLoadLogic", "updateLikeNum", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view4 = this.f41992x;
            if (view4 != null) {
                view4.setBackground(null);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView e17 = e();
            android.view.ViewGroup.LayoutParams layoutParams = e17.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = i65.a.f(e17.getContext(), com.tencent.mm.R.dimen.f479704cz);
            }
            if (layoutParams != null) {
                layoutParams.width = i65.a.f(e17.getContext(), com.tencent.mm.R.dimen.f479704cz);
            }
            e17.setLayoutParams(layoutParams);
            e().setImageResource(com.tencent.mm.R.raw.finder_outlined_like_private_status);
            e().setIconColor(i65.a.d(j(), com.tencent.mm.R.color.BW_100_Alpha_0_5));
        } else {
            android.view.View view5 = this.f41992x;
            if (view5 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/textstatus/logic/BaseMiniStatusLoadLogic", "updateLikeNum", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/textstatus/logic/BaseMiniStatusLoadLogic", "updateLikeNum", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view6 = this.f41992x;
            if (view6 != null) {
                view6.setBackground(j().getResources().getDrawable(com.tencent.mm.R.drawable.b6p));
            }
            android.widget.TextView textView4 = this.f41991w;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("tvLikeNum");
                throw null;
            }
            textView4.setVisibility(8);
            mj4.k kVar = (mj4.k) hVar;
            boolean o17 = ai4.m0.f5173a.o(kVar.l());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update like num : tag=");
            sb6.append(e().getTag());
            sb6.append(" isLike=");
            sb6.append(o17);
            sb6.append(" tvnick=");
            android.widget.TextView textView5 = this.C;
            java.lang.CharSequence text = textView5 != null ? textView5.getText() : null;
            if (text == null) {
                text = "";
            }
            sb6.append((java.lang.Object) text);
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.BaseMiniStatusLoadLogic", sb6.toString());
            e().setTag(java.lang.Boolean.valueOf(o17));
            com.tencent.mm.ui.widget.imageview.WeImageView e18 = e();
            android.view.ViewGroup.LayoutParams layoutParams2 = e18.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = i65.a.f(e18.getContext(), com.tencent.mm.R.dimen.f479688cn);
            }
            if (layoutParams2 != null) {
                layoutParams2.width = i65.a.f(e18.getContext(), com.tencent.mm.R.dimen.f479688cn);
            }
            e18.setLayoutParams(layoutParams2);
            u(hVar, o17);
            if (o17) {
                e().setImageResource(com.tencent.mm.R.raw.icon_filled_awesome_status);
                e().setIconColor(i65.a.d(j(), com.tencent.mm.R.color.Red_100));
                android.content.Context j17 = j();
                pf5.z zVar = pf5.z.f353948a;
                if (!(j17 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.tencent.mm.plugin.textstatus.ui.kd) zVar.a((androidx.appcompat.app.AppCompatActivity) j17).a(com.tencent.mm.plugin.textstatus.ui.kd.class)).O6(kVar.l());
            } else {
                e().setImageResource(com.tencent.mm.R.raw.icon_filled_awesome_status);
                e().setIconColor(i65.a.d(j(), com.tencent.mm.R.color.f478553an));
                android.content.Context j18 = j();
                pf5.z zVar2 = pf5.z.f353948a;
                if (!(j18 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.tencent.mm.plugin.textstatus.ui.kd) zVar2.a((androidx.appcompat.app.AppCompatActivity) j18).a(com.tencent.mm.plugin.textstatus.ui.kd.class)).P6(kVar.l());
            }
        }
        r();
        pj4.p0 p0Var = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(j(), 9, pj4.p0.class);
        if (p0Var != null) {
            p0Var.f355239g = e().getVisibility() == 0 ? "1" : "0";
        }
    }

    public final void w(boolean z17) {
        e().setTag(java.lang.Boolean.valueOf(z17));
        u(this.H, z17);
        android.view.View view = this.f41992x;
        if (view != null) {
            view.setBackground(j().getResources().getDrawable(com.tencent.mm.R.drawable.b6p));
        }
        if (!z17) {
            com.tencent.mm.ui.widget.imageview.WeImageView e17 = e();
            android.graphics.drawable.Drawable drawable = j().getResources().getDrawable(com.tencent.mm.R.raw.icon_filled_awesome_status);
            com.tencent.mm.ui.uk.f(drawable, j().getResources().getColor(com.tencent.mm.R.color.f478553an));
            e17.setImageDrawable(drawable);
            return;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView e18 = e();
        android.graphics.drawable.Drawable drawable2 = j().getResources().getDrawable(com.tencent.mm.R.raw.icon_filled_awesome_status);
        com.tencent.mm.ui.uk.f(drawable2, j().getResources().getColor(com.tencent.mm.R.color.Red_100));
        e18.setImageDrawable(drawable2);
        pa5.j.c(e(), pa5.o.f353108a, 2.0f, 1.0f, 0.5f, 200.0f, null, 32, null);
    }
}
