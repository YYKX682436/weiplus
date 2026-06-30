package cj4;

/* loaded from: classes11.dex */
public final class a0 extends cj4.i1 implements cj4.k1 {
    public final java.lang.String D1;
    public android.view.View E1;
    public android.widget.FrameLayout F1;
    public com.tencent.mm.ui.widget.listview.PullDownListView G1;
    public android.widget.TextView H1;
    public android.view.View I1;
    public android.view.View J1;
    public android.widget.TextView K1;
    public android.view.View L1;
    public int M1;
    public final jz5.g N1;
    public boolean O1;
    public bk4.c2 P1;
    public boolean Q1;
    public float R1;
    public boolean S1;
    public boolean T1;
    public long U1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(bi4.k1 showParam) {
        super(showParam);
        kotlin.jvm.internal.o.g(showParam, "showParam");
        this.D1 = "MicroMsg.TextStatus.BaseProfileLoadLogic@" + hashCode();
        this.M1 = 1;
        this.N1 = jz5.h.b(new cj4.o(this));
        jz5.h.b(new cj4.n(this));
        jz5.h.b(new cj4.l(this));
        jz5.h.b(new cj4.y(this));
        jz5.h.b(new cj4.x(this));
        jz5.h.b(new cj4.m(this));
    }

    @Override // cj4.i1
    public void D() {
        bi4.h0 d17 = d();
        android.widget.TextView textView = this.f41953p0;
        if (textView != null) {
            textView.setText(d17 != null ? d17.i() : null);
        }
        android.widget.TextView textView2 = this.f41953p0;
        if (textView2 == null) {
            return;
        }
        java.lang.CharSequence text = textView2 != null ? textView2.getText() : null;
        textView2.setVisibility(((text == null || r26.n0.N(text)) || !this.Y) ? 8 : 0);
    }

    @Override // cj4.i1
    public void E(java.lang.String str) {
        java.lang.CharSequence charSequence;
        super.E(str);
        J();
        if (str == null || str.length() == 0) {
            S(0);
        }
        bk4.c2 c2Var = this.P1;
        if (r26.i0.q((c2Var == null || (charSequence = c2Var.f21415f) == null) ? null : charSequence.toString(), str, false, 2, null)) {
            bk4.c2 c2Var2 = this.P1;
            if (((c2Var2 == null || !c2Var2.f21414e) ? 0 : 1) != 0) {
                S(c2Var2 != null ? c2Var2.f21413d : 0);
            }
            com.tencent.mars.xlog.Log.i(this.D1, "handleDesc: is same textStatusDesc, return ");
            return;
        }
        android.widget.TextView textView = this.K1;
        if (textView != null) {
            bk4.c2 c2Var3 = new bk4.c2(textView);
            c2Var3.g(str != null ? str : "");
            c2Var3.f21430u = new bk4.a1(this.f41969z1);
            java.lang.String string = w().getResources().getString(com.tencent.mm.R.string.jvn);
            c2Var3.f21421l = null;
            c2Var3.f21416g = string;
            if (string != null) {
                c2Var3.i(w().getResources().getString(com.tencent.mm.R.string.jvh).length(), string.length(), com.tencent.mm.R.color.BW_100_Alpha_0_6, new cj4.q(this));
            }
            ym5.a1.h(textView, new cj4.s(this, str));
            java.lang.String string2 = w().getResources().getString(com.tencent.mm.R.string.jvp);
            c2Var3.f21422m = null;
            c2Var3.f21417h = string2;
            c2Var3.f21418i = java.lang.Integer.valueOf(com.tencent.mm.R.color.BW_100_Alpha_0_6);
            c2Var3.f21425p = J() ? 1 : 3;
            c2Var3.f21421l = null;
            c2Var3.f21422m = null;
            androidx.transition.Transition transition = c2Var3.f21426q;
            if (transition != null) {
                com.tencent.mm.plugin.textstatus.ui.LongTextView longTextView = this.f41945g;
                ((androidx.transition.TransitionSet) transition).Z(longTextView != null ? longTextView.getAnimationDuration() : 0L);
            }
            android.view.ViewParent parent = c2Var3.f21410a.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            c2Var3.f21428s = (android.view.ViewGroup) parent;
            c2Var3.c(false);
            textView.setOnClickListener(new cj4.t(this));
            this.P1 = c2Var3;
        }
        android.view.View view = this.Z;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic", "handleDesc", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic", "handleDesc", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // cj4.i1
    public void F() {
        super.F();
        int i17 = J() ? 1 : 3;
        bk4.c2 c2Var = this.P1;
        if (c2Var == null || c2Var.f21425p == i17) {
            return;
        }
        c2Var.f21425p = i17;
        c2Var.f21421l = null;
        c2Var.f21422m = null;
        c2Var.c(false);
    }

    @Override // cj4.i1
    public void G() {
        si4.a G = ai4.m0.f5173a.G();
        mj4.h hVar = this.R;
        if (G.w(hVar != null ? mj4.d.b(xe0.j0.a(hVar, false, 1, null)) : null, kz5.c0.d(this.f41946h)).size() <= 0) {
            N();
            return;
        }
        pj4.p0 p0Var = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(w(), 9, pj4.p0.class);
        int i17 = p0Var != null && p0Var.f355242m == 5 ? 6 : 4;
        e0(w());
        qj4.s.m(qj4.s.f363958a, w(), 28L, qj4.b.f363906a.a(y(i17), bi4.v1.d().f21091a, this.S1), this.R, 0L, 0L, 0L, y(i17), null, null, 0L, 1904, null);
    }

    @Override // cj4.i1
    public void L() {
        M(4);
    }

    @Override // cj4.i1
    public boolean N() {
        java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f21093a;
        int i17 = kotlin.jvm.internal.o.b(en1.a.a(), this.f41946h) ? 6 : 4;
        qj4.s.m(qj4.s.f363958a, w(), 28L, qj4.b.f363906a.a(y(i17), bi4.v1.d().f21091a, this.S1), this.R, 0L, 0L, 0L, y(i17), null, null, 0L, 1904, null);
        e0(w());
        return true;
    }

    @Override // cj4.i1
    public void T() {
        B(false);
        super.T();
    }

    @Override // cj4.i1
    public boolean X() {
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("suffixOnClick: isPostOpen:");
        sb6.append(this.Y);
        sb6.append(' ');
        android.widget.TextView textView = this.K1;
        sb6.append(textView != null ? java.lang.Integer.valueOf(textView.getVisibility()) : null);
        sb6.append(", ");
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView2 = this.G1;
        sb6.append(pullDownListView2 != null ? java.lang.Float.valueOf(pullDownListView2.getTranslationY()) : null);
        com.tencent.mars.xlog.Log.i(this.D1, sb6.toString());
        if (this.Y && (pullDownListView = this.G1) != null && pullDownListView.getTranslationY() <= 0.0d) {
            return false;
        }
        boolean z17 = this.Y;
        qj4.s sVar = qj4.s.f363958a;
        if (z17) {
            android.widget.TextView textView2 = this.K1;
            if (textView2 != null) {
                textView2.setVisibility(4);
            }
            qj4.s.m(sVar, w(), 82L, null, null, 0L, 0L, 0L, 0L, null, null, 0L, 2044, null);
            return true;
        }
        android.widget.TextView textView3 = this.K1;
        if (textView3 != null) {
            textView3.setVisibility(4);
        }
        android.content.Context w17 = w();
        pf5.z zVar = pf5.z.f353948a;
        if (!(w17 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        uj4.e eVar = (uj4.e) zVar.a((androidx.appcompat.app.AppCompatActivity) w17).e(uj4.e.class);
        if (eVar != null) {
            eVar.f428426p = true;
        }
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView3 = this.G1;
        if (pullDownListView3 != null) {
            pullDownListView3.o();
        }
        this.O1 = true;
        qj4.s.m(sVar, w(), 81L, null, null, 0L, 0L, 0L, 0L, null, null, 0L, 2044, null);
        return true;
    }

    @Override // cj4.i1
    public void a0() {
        if (!this.Y) {
            java.lang.String str = this.f41946h;
            if ((str == null ? false : kotlin.jvm.internal.o.b(str, en1.a.a())) && this.f41942d.f21067g == 5) {
                java.lang.String str2 = this.D1;
                com.tencent.mars.xlog.Log.i(str2, "updateCommentBtn: !isPostOpen");
                com.tencent.mars.xlog.Log.i(str2, "hideCommentLayout: ");
                android.view.View view = this.A;
                if (view == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic", "hideCommentLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic", "hideCommentLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
        }
        super.a0();
    }

    @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
    public void b(int i17) {
    }

    @Override // cj4.i1
    public void c0() {
        if (!this.Y) {
            java.lang.String str = this.f41946h;
            if ((str == null ? false : kotlin.jvm.internal.o.b(str, en1.a.a())) && this.f41942d.f21067g == 5) {
                java.lang.String str2 = this.D1;
                com.tencent.mars.xlog.Log.i(str2, "updateLikeNum: !isPostOpen");
                com.tencent.mars.xlog.Log.i(str2, "hideLikeLayout: ");
                android.view.View view = this.f41968z;
                if (view == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic", "hideLikeLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic", "hideLikeLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
        }
        super.c0();
    }

    @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
    public void e() {
    }

    public void e0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (this.f41942d.f21067g == 5) {
            bi4.u1 d17 = bi4.v1.d();
            int i17 = d17.f21091a;
            if (i17 != 0) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TEXT_STATUS_FRIENDS_BUTTON_STYLE_CLICK_TAG_STRING, bi4.v1.c(java.lang.String.valueOf(i17), d17.f21092b));
            }
            bk4.s sVar = this.B1;
            if (sVar != null && sVar.f21554a) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TEXT_STATUS_SQUARE_RED_DOT_TAG_STRING, bi4.v1.c("squrered", sVar.f21555b));
            }
        }
        long y17 = y(6);
        if (1 == ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.textstatus.flutter.RepairerConfigTextStatusFlutterSquarePage())) {
            we0.u0 u0Var = (we0.u0) ((xe0.c0) i95.n0.c(xe0.c0.class));
            com.tencent.mars.xlog.Log.i(u0Var.f445169d, "openStatusSquarePage: ");
            xe0.c0.d9(u0Var, context, "StatusSquarePage", new java.util.LinkedHashMap(), "com.tencent.mm.plugin.textstatus.ui.FlutterTextStatusTransparentActivity", null, 16, null);
        } else {
            com.tencent.mm.plugin.textstatus.ui.ce.a(com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity.f173656z, context, null, 6, y17, bi4.v1.d().f21091a, false, 34, null);
        }
        qj4.s.l(qj4.s.f363958a, 52L, qj4.b.f363906a.a(y(kotlin.jvm.internal.o.b(en1.a.a(), this.f41946h) ? 6 : 4), bi4.v1.d().f21091a, this.S1), com.tencent.mm.plugin.finder.gallery.b0.f111351b, 0L, null, 0L, 56, null);
    }

    public void f0() {
        java.lang.String c17;
        mj4.h hVar = this.R;
        if (hVar != null) {
            ai4.m0 m0Var = ai4.m0.f5173a;
            int size = m0Var.G().w(mj4.d.b(xe0.j0.a(hVar, false, 1, null)), kz5.c0.d(this.f41946h)).size();
            int o17 = bk4.i.a().K() ? m0Var.G().o(en1.a.a()) : 0;
            if (!this.f41942d.l(4) || ((size <= 0 || bk4.i.a().K()) && (o17 <= 0 || !bk4.i.a().K()))) {
                android.widget.TextView textView = this.f41949m;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                this.T1 = false;
                return;
            }
            com.tencent.mars.xlog.Log.i(this.D1, "sameTopicSize " + size + " allFriendsTopicSize:" + o17);
            android.widget.TextView textView2 = this.f41949m;
            if (textView2 != null) {
                if (bk4.i.a().K()) {
                    java.lang.String string = w().getString(com.tencent.mm.R.string.jvq, java.lang.Integer.valueOf(o17));
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    c17 = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[0], 0));
                    kotlin.jvm.internal.o.f(c17, "format(...)");
                } else if (bk4.i.a().G()) {
                    java.lang.String string2 = w().getString(com.tencent.mm.R.string.jvq, java.lang.Integer.valueOf(size));
                    kotlin.jvm.internal.o.f(string2, "getString(...)");
                    c17 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[0], 0));
                    kotlin.jvm.internal.o.f(c17, "format(...)");
                } else {
                    c17 = bk4.i.a().c(xe0.j0.a(hVar, false, 1, null), size, bk4.i.a().m(xe0.j0.a(hVar, false, 1, null)), 1);
                }
                textView2.setText(c17);
            }
            this.T1 = true;
            android.widget.TextView textView3 = this.f41949m;
            if (textView3 != null) {
                textView3.setAlpha(1.0f);
            }
            android.widget.TextView textView4 = this.f41949m;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            pj4.p0 p0Var = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(w(), 9, pj4.p0.class);
            if (p0Var != null) {
                p0Var.f355240h = size;
            }
        }
    }

    public final void g0() {
        android.widget.TextView textView = this.K1;
        if (textView != null) {
            textView.setVisibility(com.tencent.mm.sdk.platformtools.t8.J0(textView.getText()) ? 8 : 0);
        }
    }

    @Override // cj4.i1, cj4.l1
    public void i(android.view.View contentView) {
        android.view.ViewGroup viewGroup;
        java.lang.ref.WeakReference weakReference;
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.i(contentView);
        contentView.toString();
        android.content.Context w17 = w();
        pf5.z zVar = pf5.z.f353948a;
        if (!(w17 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        uj4.e eVar = (uj4.e) zVar.a((androidx.appcompat.app.AppCompatActivity) w17).e(uj4.e.class);
        this.G1 = (eVar == null || (weakReference = eVar.f428419f) == null) ? null : (com.tencent.mm.ui.widget.listview.PullDownListView) weakReference.get();
        android.content.Context w18 = w();
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(w18 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        this.Z = null;
        this.E1 = contentView.findViewById(com.tencent.mm.R.id.owg);
        this.F1 = (android.widget.FrameLayout) contentView.findViewById(com.tencent.mm.R.id.hvk);
        this.H1 = (android.widget.TextView) contentView.findViewById(com.tencent.mm.R.id.f487415ol2);
        this.B = contentView.findViewById(com.tencent.mm.R.id.hy7);
        this.I1 = contentView.findViewById(com.tencent.mm.R.id.hxj);
        this.L1 = contentView.findViewById(com.tencent.mm.R.id.hym);
        this.K1 = (android.widget.TextView) contentView.findViewById(com.tencent.mm.R.id.ops);
        this.f41963x0 = contentView.findViewById(com.tencent.mm.R.id.owc);
        this.J1 = contentView.findViewById(com.tencent.mm.R.id.f487531ow2);
        android.view.ViewGroup viewGroup2 = this.U;
        if ((viewGroup2 != null && viewGroup2.getVisibility() == 0) && (viewGroup = this.U) != null) {
            viewGroup.setOnClickListener(new cj4.u(this));
        }
        android.view.View view = this.B;
        if (view != null) {
            view.setOnClickListener(new cj4.v(this));
        }
        android.widget.FrameLayout frameLayout = this.F1;
        float a17 = i65.a.a(w(), 10.0f);
        boolean z17 = (12 & 4) != 0;
        boolean z18 = (12 & 8) != 0;
        if (frameLayout != null) {
            frameLayout.setOutlineProvider(new bk4.e2(z17, z18, a17));
        }
        if (frameLayout != null) {
            frameLayout.setClipToOutline(true);
        }
        int b17 = i65.a.b(w(), 20);
        android.view.View view2 = this.L1;
        if (view2 != null) {
            view2.setOnTouchListener(new cj4.w(this, b17));
        }
        if ((z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192975c) && bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.textstatus.RepairerConfigTextStatusProfileShowDebugInfo()) == 1) {
            java.lang.String concat = "Debug: Status DB On ".concat(ai4.b0.f5126d ? "Aff" : "Native");
            android.widget.TextView textView = new android.widget.TextView(contentView.getContext());
            textView.setTextColor(i65.a.d(contentView.getContext(), com.tencent.mm.R.color.f478718f9));
            textView.setTextSize(12.0f);
            textView.setText(concat);
            textView.setVisibility(0);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(12, -1);
            layoutParams.setMargins(ym5.x.a(contentView.getContext(), 18.0f), 0, 0, 0);
            android.widget.RelativeLayout relativeLayout = contentView instanceof android.widget.RelativeLayout ? (android.widget.RelativeLayout) contentView : null;
            if (relativeLayout != null) {
                relativeLayout.addView(textView, layoutParams);
            }
        }
    }

    @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
    public void j(int i17) {
    }

    @Override // cj4.i1, cj4.l1
    public boolean m(java.lang.String username, mj4.h hVar, pj4.u0 u0Var) {
        kotlin.jvm.internal.o.g(username, "username");
        boolean m17 = super.m(username, hVar, u0Var);
        android.widget.TextView textView = this.f41953p0;
        if (textView != null) {
            textView.setVisibility(8);
        }
        mj4.h hVar2 = this.R;
        if (hVar2 != null) {
            f0();
            if (this.T1) {
                android.widget.ImageView imageView = this.C;
                if (imageView != null) {
                    imageView.setAlpha(1.0f);
                }
            } else {
                android.widget.ImageView imageView2 = this.C;
                if (imageView2 != null) {
                    ((mj4.k) hVar2).h();
                    imageView2.setAlpha(1.0f);
                }
            }
            if (m17) {
                pj4.p0 p0Var = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(w(), 9, pj4.p0.class);
                if (p0Var != null) {
                    p0Var.f355245p = this.M1;
                }
            }
            android.view.View view = this.J1;
            if (view != null) {
                int i17 = (!m17 || com.tencent.mm.plugin.textstatus.ui.c.d(hVar2, d())) ? 8 : 0;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic", "update", "(Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;Lcom/tencent/mm/plugin/textstatus/proto/TextStatusCardShowExtraParam;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic", "update", "(Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;Lcom/tencent/mm/plugin/textstatus/proto/TextStatusCardShowExtraParam;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (m17) {
            android.view.View view2 = this.Q;
            if (view2 != null) {
                view2.addOnLayoutChangeListener(new cj4.z(this));
            }
            boolean z17 = true;
            java.lang.String d17 = hVar2 != null ? wi4.a.d(xe0.j0.a(hVar2, false, 1, null)) : null;
            if (!(d17 == null || r26.n0.N(d17))) {
                bi4.h0 d18 = d();
                android.widget.FrameLayout frameLayout = this.F1;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                android.widget.FrameLayout frameLayout2 = this.F1;
                java.lang.Boolean valueOf = frameLayout2 == null ? java.lang.Boolean.FALSE : d18 != null ? java.lang.Boolean.valueOf(d18.o(frameLayout2)) : null;
                java.lang.CharSequence f17 = d18 != null ? d18.f() : null;
                if (kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.TRUE)) {
                    if (f17 != null && !r26.n0.N(f17)) {
                        z17 = false;
                    }
                    if (!z17) {
                        android.widget.TextView textView2 = this.H1;
                        if (textView2 != null) {
                            textView2.setText(f17);
                        }
                        android.widget.LinearLayout linearLayout = this.f41958t;
                        if (linearLayout != null) {
                            linearLayout.setOnClickListener(new cj4.p(d18, this, hVar2));
                        }
                    }
                }
            }
        }
        if (bk4.i.a().J()) {
            android.widget.ImageView imageView3 = this.C;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
            android.widget.TextView textView3 = this.D;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        }
        return m17;
    }

    @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
    public void onPostClose() {
        android.widget.LinearLayout linearLayout;
        android.widget.TextView textView;
        long c17 = c01.id.c() - this.U1;
        this.Y = false;
        c0();
        a0();
        this.M1 = 1;
        pj4.p0 p0Var = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(w(), 9, pj4.p0.class);
        if (p0Var != null) {
            p0Var.f355245p = this.M1;
        }
        android.widget.TextView textView2 = this.f41953p0;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        mj4.h hVar = this.R;
        boolean a17 = hVar != null ? bk4.i.a().a(xe0.j0.a(hVar, false, 1, null).f355214e) : false;
        if (!this.T1 && !a17 && (textView = this.f41949m) != null) {
            textView.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout2 = this.f41958t;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        mj4.h hVar2 = this.R;
        pj4.o0 a18 = hVar2 != null ? xe0.j0.a(hVar2, false, 1, null) : null;
        if ((a18 != null && O(a18)) && (linearLayout = this.f41957s) != null) {
            linearLayout.setVisibility(0);
        }
        java.lang.String d17 = a18 != null ? wi4.a.d(a18) : null;
        if (!(d17 == null || r26.n0.N(d17))) {
            bi4.h0 d18 = d();
            if (d18 != null && d18.j()) {
                com.tencent.mm.plugin.textstatus.ui.LongTextView longTextView = this.f41945g;
                if (longTextView != null) {
                    cj4.j1.b(longTextView);
                }
                android.view.View view = this.B;
                if (view != null) {
                    cj4.j1.b(view);
                }
                android.view.View view2 = this.I1;
                if (view2 != null) {
                    cj4.j1.b(view2);
                }
                android.widget.TextView textView3 = this.f41956r;
                if (textView3 != null) {
                    cj4.j1.b(textView3);
                }
            }
        }
        qj4.s sVar = qj4.s.f363958a;
        qj4.s.m(sVar, w(), 65L, null, this.R, 0L, 0L, 0L, 0L, null, null, 0L, com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_VIDEO_TIMESTAMP_ROLLBACK, null);
        mj4.h hVar3 = this.R;
        if (kotlin.jvm.internal.o.b(hVar3 != null ? wi4.a.d(xe0.j0.a(hVar3, false, 1, null)) : null, "music_player@inner") && c17 > 5000) {
            qj4.s.m(sVar, w(), 64L, null, this.R, 0L, 0L, 0L, 0L, null, null, 0L, com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_VIDEO_TIMESTAMP_ROLLBACK, null);
        }
        Z();
        g0();
    }

    @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
    public void onPostOpen(boolean z17) {
        android.widget.TextView textView;
        android.widget.LinearLayout linearLayout;
        android.widget.TextView textView2;
        com.tencent.mm.emoji.view.EmojiStatusView emojiStatusView;
        android.widget.TextView textView3;
        this.U1 = c01.id.c();
        this.Y = true;
        c0();
        a0();
        this.M1 = 2;
        pj4.p0 p0Var = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(w(), 9, pj4.p0.class);
        if (p0Var != null) {
            p0Var.f355245p = this.M1;
        }
        android.widget.TextView textView4 = this.f41949m;
        if (textView4 != null) {
            textView4.setVisibility(0);
        }
        mj4.h hVar = this.R;
        java.lang.String d17 = hVar != null ? wi4.a.d(xe0.j0.a(hVar, false, 1, null)) : null;
        if (!(d17 == null || r26.n0.N(d17))) {
            bi4.h0 d18 = d();
            if (d18 != null && d18.j()) {
                bi4.h0 d19 = d();
                if ((d19 != null ? d19.l() : true) && (textView3 = this.f41953p0) != null) {
                    java.lang.CharSequence text = textView3.getText();
                    textView3.setVisibility(text == null || r26.n0.N(text) ? 8 : 0);
                }
                com.tencent.mm.plugin.textstatus.ui.LongTextView longTextView = this.f41945g;
                if (longTextView != null) {
                    cj4.j1.a(longTextView);
                }
                android.view.View view = this.I1;
                if (view != null) {
                    cj4.j1.a(view);
                }
                android.widget.TextView textView5 = this.f41956r;
                if (textView5 != null) {
                    cj4.j1.a(textView5);
                }
            }
        }
        Z();
        qj4.s.m(qj4.s.f363958a, w(), 42L, null, this.R, 0L, 0L, 0L, 0L, null, null, 0L, com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_VIDEO_TIMESTAMP_ROLLBACK, null);
        if (this.O1) {
            M(4);
            android.widget.TextView textView6 = this.K1;
            if (textView6 != null) {
                textView6.setVisibility(4);
            }
            android.content.Context w17 = w();
            pf5.z zVar = pf5.z.f353948a;
            if (!(w17 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((uj4.m) zVar.a((androidx.appcompat.app.AppCompatActivity) w17).a(uj4.m.class)).O6();
        } else {
            android.content.Context w18 = w();
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(w18 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            uj4.m mVar = (uj4.m) zVar2.a((androidx.appcompat.app.AppCompatActivity) w18).a(uj4.m.class);
            mj4.h hVar2 = this.R;
            mVar.P6(null, hVar2 != null ? ((mj4.k) hVar2).o() : null);
            if (J()) {
                com.tencent.mm.emoji.view.EmojiStatusView emojiStatusView2 = this.T;
                if (!(emojiStatusView2 != null && emojiStatusView2.getVisibility() == 0) && (emojiStatusView = this.T) != null) {
                    emojiStatusView.setVisibility(0);
                }
            }
            mj4.h hVar3 = this.R;
            java.lang.String k17 = hVar3 != null ? ((mj4.k) hVar3).k() : null;
            if ((!(k17 == null || r26.n0.N(k17))) && (textView2 = this.f41956r) != null) {
                textView2.setVisibility(0);
            }
            mj4.h hVar4 = this.R;
            pj4.o0 a17 = hVar4 != null ? xe0.j0.a(hVar4, false, 1, null) : null;
            if ((a17 != null && O(a17)) && (linearLayout = this.f41957s) != null) {
                linearLayout.setVisibility(0);
            }
            if (I() && (textView = this.f41953p0) != null) {
                textView.setVisibility(0);
            }
            Z();
            g0();
        }
        this.O1 = false;
    }

    @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
    public void onPreClose() {
        android.view.ViewPropertyAnimator animate;
        android.view.View view = this.E1;
        android.view.ViewPropertyAnimator alpha = (view == null || (animate = view.animate()) == null) ? null : animate.alpha(0.15f);
        if (alpha == null) {
            return;
        }
        alpha.setDuration(200L);
    }

    @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
    public void onPreOpen() {
        android.view.ViewPropertyAnimator animate;
        android.view.View view = this.E1;
        android.view.ViewPropertyAnimator alpha = (view == null || (animate = view.animate()) == null) ? null : animate.alpha(0.0f);
        if (alpha != null) {
            alpha.setDuration(200L);
        }
        D();
    }

    @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
    public void p() {
    }

    @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
    public void q(int i17) {
    }

    @Override // bi4.b1
    public void r(float f17, float f18, float f19) {
        com.tencent.mm.emoji.view.EmojiStatusView emojiStatusView;
        float f27 = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1)) == 0 ? 0.0f : f18 - this.R1;
        this.R1 = f18;
        android.widget.TextView textView = this.K1;
        if (textView != null) {
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams ? (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.A = (f17 * 0.5f) + 0.5f;
                textView.setLayoutParams(layoutParams2);
            }
        }
        if (f18 >= f19 || f27 >= 0.0f) {
            return;
        }
        android.view.View view = this.Z;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic", "onPullDownProgress", "(FFF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic", "onPullDownProgress", "(FFF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        g0();
        if (!J() || (emojiStatusView = this.T) == null) {
            return;
        }
        emojiStatusView.setVisibility(0);
    }

    @Override // cj4.i1
    public void u() {
        super.u();
        if (this.M1 == 2) {
            mj4.h hVar = this.R;
            if (kotlin.jvm.internal.o.b(hVar != null ? wi4.a.d(xe0.j0.a(hVar, false, 1, null)) : null, "music_player@inner")) {
                qj4.s.m(qj4.s.f363958a, w(), 63L, null, this.R, 0L, 0L, 0L, 0L, null, null, 0L, com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_VIDEO_TIMESTAMP_ROLLBACK, null);
            }
        }
    }
}
