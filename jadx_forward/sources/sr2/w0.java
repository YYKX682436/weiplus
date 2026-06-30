package sr2;

/* loaded from: classes10.dex */
public final class w0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tg, ya2.r1, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.pp {
    public final jz5.g A;
    public final int B;
    public boolean C;
    public int D;
    public int E;
    public java.lang.String F;
    public int G;
    public int H;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15336x844a2f32 I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f493285J;
    public int K;
    public wl5.x L;
    public wl5.x M;
    public sr2.r N;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f493286d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15332x74d0ee7d f493287e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f493288f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15333xd9276341 f493289g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f493290h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f493291i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.RelativeLayout f493292m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15332x74d0ee7d f493293n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f493294o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f493295p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f493296q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f493297r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f493298s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f493299t;

    /* renamed from: u, reason: collision with root package name */
    public int f493300u;

    /* renamed from: v, reason: collision with root package name */
    public rx2.u f493301v;

    /* renamed from: w, reason: collision with root package name */
    public int f493302w;

    /* renamed from: x, reason: collision with root package name */
    public db5.d5 f493303x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f493304y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f493305z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f493298s = true;
        this.f493299t = true;
        this.f493302w = -1;
        jz5.i iVar = jz5.i.f384364f;
        this.f493304y = jz5.h.a(iVar, new sr2.q0(activity));
        this.f493305z = jz5.h.a(iVar, new sr2.r0(activity));
        this.A = jz5.h.a(iVar, new sr2.t0(activity));
        this.B = (int) activity.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
        this.F = "";
        so2.p6 p6Var = so2.p6.f492074d;
    }

    public final void O6(java.lang.String str, java.lang.String str2) {
        java.lang.String sb6;
        int selectionStart = V6().getSelectionStart();
        java.lang.String obj = V6().getText().toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostEditUIC", "addTopicStr before start:" + selectionStart + " content:" + obj);
        int length = str2.length() > 0 ? selectionStart - str2.length() : 0;
        if (selectionStart == 0) {
            sb6 = str + obj;
        } else if (selectionStart == obj.length()) {
            if (length > 0) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                java.lang.String substring = obj.substring(0, length);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                sb7.append(substring);
                sb7.append(str);
                java.lang.String substring2 = obj.substring(length + 1, obj.length());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
                sb7.append(substring2);
                sb6 = sb7.toString();
            } else {
                sb6 = obj + str;
            }
        } else if (length > 0) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            java.lang.String substring3 = obj.substring(0, length);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring3, "substring(...)");
            sb8.append(substring3);
            sb8.append(str);
            java.lang.String substring4 = obj.substring(length + 1, obj.length());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring4, "substring(...)");
            sb8.append(substring4);
            sb6 = sb8.toString();
        } else {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            java.lang.String substring5 = obj.substring(0, selectionStart);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring5, "substring(...)");
            sb9.append(substring5);
            sb9.append(str);
            java.lang.String substring6 = obj.substring(selectionStart, obj.length());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring6, "substring(...)");
            sb9.append(substring6);
            sb6 = sb9.toString();
        }
        this.f493302w = length > 0 ? length + str.length() : selectionStart + str.length();
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.app.Activity m80379x76847179 = m80379x76847179();
        ((ke0.e) xVar).getClass();
        android.text.SpannableString i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(m80379x76847179, sb6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostEditUIC", "addTopicStr after content:" + sb6 + " text:" + ((java.lang.Object) i17));
        V6().setText(i17);
        V6().requestFocus();
        V6().mo81549xf579a34a(this.f493302w);
    }

    public final void P6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6.class)).Z6();
    }

    public final void Q6(int i17) {
        if (!h7() || g7()) {
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207937c).mo141623x754a37bb()).r()).intValue();
            boolean i76 = i7();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostEditUIC", "[checkShowShortTitle] textLimit=" + intValue + " textCount=" + i17 + " enableShortTitle=" + i76);
            jz5.g gVar = this.A;
            if (!i76) {
                if (l7()) {
                    ((ur2.v) gVar.mo141623x754a37bb()).O6(false);
                    return;
                }
                android.widget.RelativeLayout relativeLayout = this.f493292m;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(8);
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shortTitleLayout");
                    throw null;
                }
            }
            if (l7()) {
                ((ur2.v) gVar.mo141623x754a37bb()).O6(i17 > intValue);
                return;
            }
            if (i17 > intValue) {
                android.widget.RelativeLayout relativeLayout2 = this.f493292m;
                if (relativeLayout2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shortTitleLayout");
                    throw null;
                }
                if (relativeLayout2.getVisibility() == 8) {
                    android.widget.RelativeLayout relativeLayout3 = this.f493292m;
                    if (relativeLayout3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shortTitleLayout");
                        throw null;
                    }
                    relativeLayout3.setVisibility(0);
                    android.widget.RelativeLayout relativeLayout4 = this.f493292m;
                    if (relativeLayout4 != null) {
                        relativeLayout4.post(new sr2.x(this));
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shortTitleLayout");
                        throw null;
                    }
                }
            }
        }
    }

    public final void R6(wl5.x xVar) {
        if (xVar != null) {
            xVar.k();
        }
        if (xVar != null) {
            xVar.M = true;
        }
        if (xVar != null) {
            xVar.N = true;
        }
        if (xVar != null) {
            xVar.i();
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m0 S6(int i17, int i18) {
        java.lang.Object obj;
        java.util.Iterator it = d7().b().f482500c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m0 m0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m0) obj;
            if (i17 >= m0Var.f183908a && i18 <= m0Var.f183909b) {
                break;
            }
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m0) obj;
    }

    public final java.lang.String T6() {
        java.util.List<so2.n6> m62352x576a94df;
        if (!h7() || g7()) {
            return r26.n0.w0(V6().getText().toString()).toString();
        }
        java.lang.String obj = r26.n0.w0(U6().getText().toString()).toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15336x844a2f32 c15336x844a2f32 = this.I;
        if (c15336x844a2f32 == null || (m62352x576a94df = c15336x844a2f32.m62352x576a94df()) == null) {
            return obj;
        }
        for (so2.n6 n6Var : kz5.n0.F0(m62352x576a94df, new sr2.y())) {
            obj = r26.n0.X(obj, n6Var.f492036c, n6Var.f492037d).toString();
        }
        return obj;
    }

    public final android.widget.TextView U6() {
        android.widget.TextView textView = this.f493291i;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descModTv");
        throw null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15332x74d0ee7d V6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15332x74d0ee7d c15332x74d0ee7d = this.f493287e;
        if (c15332x74d0ee7d != null) {
            return c15332x74d0ee7d;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descTv");
        throw null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15333xd9276341 W6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15333xd9276341 c15333xd9276341 = this.f493289g;
        if (c15333xd9276341 != null) {
            return c15333xd9276341;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("footer");
        throw null;
    }

    public final android.view.View X6() {
        android.view.View view = this.f493290h;
        if (view != null) {
            return view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("footerContainer");
        throw null;
    }

    public final int Y6(int i17) {
        return (m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.jlt).getHeight() - i17) - W6().findViewById(com.p314xaae8f345.mm.R.id.tca).getLayoutParams().height;
    }

    public final android.widget.ScrollView Z6() {
        return (android.widget.ScrollView) this.f493305z.mo141623x754a37bb();
    }

    public final java.lang.String a7() {
        java.lang.String obj;
        java.lang.String obj2;
        if (h7() && !g7()) {
            java.lang.CharSequence text = b7().getText();
            if (text != null && (obj2 = text.toString()) != null) {
                return obj2;
            }
        } else if (i7() && l7()) {
            ur2.v vVar = (ur2.v) this.A.mo141623x754a37bb();
            if (vVar.f511957d) {
                android.widget.TextView textView = vVar.f511960g;
                if (textView != null) {
                    return textView.getText().toString();
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tvTitle");
                throw null;
            }
        } else {
            android.text.Editable text2 = c7().getText();
            if (text2 != null && (obj = text2.toString()) != null) {
                return obj;
            }
        }
        return "";
    }

    public final android.widget.TextView b7() {
        android.widget.TextView textView = this.f493297r;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shortTitleModTv");
        throw null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15332x74d0ee7d c7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15332x74d0ee7d c15332x74d0ee7d = this.f493293n;
        if (c15332x74d0ee7d != null) {
            return c15332x74d0ee7d;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shortTitleTv");
        throw null;
    }

    public final rx2.u d7() {
        rx2.u uVar = this.f493301v;
        if (uVar != null) {
            return uVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("styleManager");
        throw null;
    }

    public final wl5.x e7(android.widget.TextView textView, so2.p6 p6Var) {
        int dimensionPixelSize = (m80379x76847179().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.u_) - ((int) ((textView.getPaint().getFontMetrics().bottom - textView.getPaint().getFontMetrics().top) / 4))) + m80379x76847179().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        rl5.r rVar = new rl5.r(m80379x76847179(), textView);
        rVar.C = true;
        rVar.Q = false;
        rVar.f478888y = new sr2.z(this);
        rVar.f478887x = new sr2.a0(this, p6Var);
        rVar.L = sr2.b0.f493049d;
        wl5.o oVar = new wl5.o(textView, rVar, null, null, null);
        oVar.f528656g = com.p314xaae8f345.mm.R.C30859x5a72f63.a3y;
        oVar.f528655f = com.p314xaae8f345.mm.R.C30859x5a72f63.f560393j6;
        int i17 = -dimensionPixelSize;
        com.p314xaae8f345.mm.ui.yk.a("SelectableTextHelper", "setMenuAdjustY:%s", java.lang.Integer.valueOf(i17));
        oVar.f528659j = i17;
        oVar.f528660k = false;
        wl5.x xVar = new wl5.x(oVar);
        xVar.C = textView.length();
        xVar.f528692d = new sr2.j0(this, xVar, textView, m158361x893a2f6f().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), p6Var);
        return xVar;
    }

    public final void f7(android.view.View view, java.lang.String str, int i17) {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view, str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view, i17, 25496);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(view, new sr2.m0(this));
    }

    public final boolean g7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0 ad0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a;
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.W).mo141623x754a37bb()).r()).booleanValue();
    }

    public final boolean h7() {
        return 1 == this.E;
    }

    public final boolean i7() {
        return ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a.a().r()).booleanValue() ? ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.V).mo141623x754a37bb()).r()).booleanValue() && k7() : k7();
    }

    public final boolean k7() {
        ya2.b2 b17 = ya2.h.f542017a.b(xy2.c.e(m158354x19263085()));
        long j17 = b17 != null ? b17.f69298x75e87a18 : 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostEditUIC", "[isShortTitleEnable] additionalFlag=" + j17);
        return (j17 & 8) == 8;
    }

    public final boolean l7() {
        return ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a.a().r()).booleanValue() && ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.V).mo141623x754a37bb()).r()).booleanValue();
    }

    public final void m7(boolean z17) {
        android.view.View contentView;
        int[] iArr = new int[2];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15336x844a2f32 c15336x844a2f32 = this.I;
        if (c15336x844a2f32 != null && (contentView = c15336x844a2f32.getContentView()) != null) {
            contentView.getLocationInWindow(iArr);
        }
        int i17 = iArr[1];
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6.class);
        int i18 = this.K;
        c14609xb4d6eef6.getClass();
        android.graphics.Point point = new android.graphics.Point();
        c14609xb4d6eef6.m158354x19263085().getWindowManager().getDefaultDisplay().getSize(point);
        int dimensionPixelSize = c14609xb4d6eef6.m158361x893a2f6f().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        c14609xb4d6eef6.P7((point.y - i17) + dimensionPixelSize);
        int i19 = (i18 - i17) + (dimensionPixelSize * 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostUI", "[checkBottomAndScroll] selectY:" + i18 + " bottomY:" + i17 + " offset:" + i19);
        if (z17) {
            android.view.View view = c14609xb4d6eef6.f204049h;
            if (view != null) {
                view.post(new sr2.h3(c14609xb4d6eef6, i19));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomSpace");
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void n7(java.lang.String oldStr, java.lang.String newStr, int i17, int i18, so2.p6 textType, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldStr, "oldStr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newStr, "newStr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textType, "textType");
        so2.p6 p6Var = so2.p6.f492075e;
        R6(textType == p6Var ? this.L : this.M);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            abstractActivityC21394xb3d2c0cf.mo48674x36654fab();
        }
        android.widget.TextView U6 = textType == p6Var ? U6() : b7();
        float dimension = textType == p6Var ? m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r) : m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561383gz);
        java.lang.CharSequence text = U6.getText();
        if (z17) {
            android.text.SpannableString spannableString = text instanceof android.text.SpannableString ? (android.text.SpannableString) text : null;
            if (spannableString != null) {
                for (java.lang.Object obj : spannableString.getSpans(0, spannableString.length(), db5.g.class)) {
                    spannableString.removeSpan((db5.g) obj);
                }
            }
        }
        int length = i18 > text.length() ? text.length() : i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostEditUIC", "[onModify] text.length:" + text.length() + " oldStr:" + oldStr + " newStr:" + newStr + " start:" + i17 + " end:" + i18 + " realEnd:" + length + " isRevert:" + z17 + " isDelete:" + z18);
        java.lang.String obj2 = text.subSequence(0, i17).toString();
        java.lang.String obj3 = text.subSequence(length, text.length()).toString();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onModify] preStr:");
        sb6.append(obj2);
        sb6.append(" newStr:");
        sb6.append(newStr);
        sb6.append(" after:");
        sb6.append(obj3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostEditUIC", sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(obj2);
        sb7.append(newStr);
        sb7.append(obj3);
        java.lang.String element = sb7.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostEditUIC", "[onModify] text:" + ((java.lang.Object) element));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15336x844a2f32 c15336x844a2f32 = this.I;
        if (c15336x844a2f32 != null) {
            java.util.Iterator it = ((java.util.ArrayList) c15336x844a2f32.c(textType)).iterator();
            while (it.hasNext()) {
                so2.n6 n6Var = (so2.n6) it.next();
                int color = n6Var.f492039f == so2.a.f491775f ? m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77896x93b90315) : m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a3y);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(element, "element");
                int i19 = n6Var.f492036c;
                int i27 = n6Var.f492037d;
                android.text.SpannableString spannableString2 = new android.text.SpannableString(element);
                spannableString2.setSpan(new db5.g(U6, color, i19, i27), i19, i27, 33);
                element = spannableString2;
            }
        }
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        U6.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.n(m80379x76847179(), element, dimension));
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15336x844a2f32 c15336x844a2f322 = this.I;
            if (c15336x844a2f322 != null) {
                c15336x844a2f322.post(new sr2.o0(this));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostEditUIC", "[onModify] textAfterDelete:" + T6());
        }
    }

    public final void o7(int i17, android.content.Intent intent, boolean z17) {
        java.lang.String str;
        int length;
        int selectionEnd;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15336x844a2f32 c15336x844a2f32;
        if (intent != null) {
            boolean z18 = true;
            int intExtra = intent.getIntExtra("key_scene", 1);
            if (i17 != -1) {
                d7().b().d(0, "");
                if (intExtra == 2) {
                    java.lang.String obj = V6().getText().toString();
                    int selectionEnd2 = V6().getSelectionEnd();
                    if (selectionEnd2 > 0) {
                        int i18 = selectionEnd2 - 1;
                        boolean z19 = true;
                        while (i18 >= 0 && z19) {
                            if (V6().getText().toString().charAt(i18) == '@') {
                                i18--;
                            } else {
                                z19 = false;
                            }
                        }
                        int i19 = i18 + 1;
                        if (i19 > obj.length()) {
                            i19 = obj.length();
                        }
                        java.lang.String substring = obj.substring(0, i19);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                        java.lang.String substring2 = obj.substring(selectionEnd2, obj.length());
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
                        V6().setText(substring.concat(substring2));
                        V6().mo81549xf579a34a(i19);
                        return;
                    }
                    return;
                }
                return;
            }
            int intExtra2 = intent.getIntExtra("key_source", 2);
            byte[] byteArrayExtra = intent.getByteArrayExtra("key_select_contact");
            r45.gb4 gb4Var = null;
            if (byteArrayExtra != null) {
                try {
                    r45.gb4 gb4Var2 = new r45.gb4();
                    gb4Var2.mo11468x92b714fd(byteArrayExtra);
                    gb4Var = gb4Var2;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.PostEditUIC", "onActivityResult LocalFinderAtContact parseFrom:%s", e17.getMessage());
                }
            }
            rx2.d b17 = d7().b();
            if (gb4Var == null || (str = gb4Var.m75945x2fec8307(2)) == null) {
                str = "";
            }
            b17.d(intExtra2, str);
            d7().b().a(gb4Var);
            if (gb4Var != null) {
                if (h7() && !g7()) {
                    java.lang.String m75945x2fec8307 = gb4Var.m75945x2fec8307(2);
                    if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
                        z18 = false;
                    }
                    if (z18) {
                        return;
                    }
                    java.lang.String m75945x2fec83072 = gb4Var.m75945x2fec8307(2);
                    java.lang.String concat = "@".concat(m75945x2fec83072 != null ? m75945x2fec83072 : "");
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(concat, this.F) || (c15336x844a2f32 = this.I) == null) {
                        return;
                    }
                    c15336x844a2f32.h(concat, this.F, this.G, this.H, so2.p6.f492075e, gb4Var);
                    return;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gb4Var.m75945x2fec8307(2))) {
                    return;
                }
                int selectionEnd3 = V6().getSelectionEnd();
                java.lang.String obj2 = V6().getText().toString();
                if (intExtra == 2 && (selectionEnd = V6().getSelectionEnd()) > 0) {
                    int i27 = selectionEnd - 1;
                    boolean z27 = true;
                    while (i27 >= 0 && z27) {
                        if (V6().getText().toString().charAt(i27) == '@') {
                            i27--;
                        } else {
                            z27 = false;
                        }
                    }
                    selectionEnd3 = i27 + 1;
                    if (selectionEnd3 > obj2.length()) {
                        selectionEnd3 = obj2.length();
                    }
                    java.lang.String substring3 = obj2.substring(0, selectionEnd3);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring3, "substring(...)");
                    java.lang.String substring4 = obj2.substring(selectionEnd, obj2.length());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring4, "substring(...)");
                    obj2 = substring3.concat(substring4);
                }
                if (selectionEnd3 > obj2.length()) {
                    selectionEnd3 = obj2.length();
                }
                java.lang.String substring5 = obj2.substring(0, selectionEnd3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring5, "substring(...)");
                if (z17) {
                    substring5 = substring5.concat("@");
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(substring5);
                sb6.append(gb4Var.m75945x2fec8307(2));
                sb6.append(' ');
                java.lang.String substring6 = obj2.substring(selectionEnd3, obj2.length());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring6, "substring(...)");
                sb6.append(substring6);
                java.lang.String sb7 = sb6.toString();
                if (z17) {
                    java.lang.String m75945x2fec83073 = gb4Var.m75945x2fec8307(2);
                    length = selectionEnd3 + (m75945x2fec83073 != null ? m75945x2fec83073.length() : 0) + 2;
                } else {
                    java.lang.String m75945x2fec83074 = gb4Var.m75945x2fec8307(2);
                    length = selectionEnd3 + (m75945x2fec83074 != null ? m75945x2fec83074.length() : 0) + 1;
                }
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity m80379x76847179 = m80379x76847179();
                ((ke0.e) xVar).getClass();
                android.text.SpannableString i28 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(m80379x76847179, sb7);
                i28.toString();
                V6().setText(i28);
                V6().mo81549xf579a34a(length);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        d7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        this.f493285J = true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (!this.C) {
            java.lang.String stringExtra = m158354x19263085().getIntent().getStringExtra("KEY_FINDER_POST_TOPIC_WORD");
            if (stringExtra == null) {
                stringExtra = "";
            }
            boolean booleanExtra = m158354x19263085().getIntent().getBooleanExtra("KEY_FINDER_POST_IS_HIGHLIGHT_TOPIC", false);
            if ((stringExtra.length() > 0) && !booleanExtra) {
                O6("#".concat(stringExtra), "");
            }
        }
        this.C = true;
        this.f493285J = false;
    }

    public final sr2.v5 p7() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(sr2.v5.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (sr2.v5) a17;
    }

    public final void q7(int i17) {
        if (i17 == 0) {
            int dimension = (int) m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.by);
            if (V6().getMaxHeight() < dimension || !((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a.a().r()).booleanValue()) {
                V6().setMaxHeight(dimension);
                return;
            }
            return;
        }
        int i18 = com.p314xaae8f345.mm.ui.bl.b(m80379x76847179()).y;
        int i19 = com.p314xaae8f345.mm.ui.bl.i(m80379x76847179(), -1);
        android.view.View view = this.f493296q;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("header");
            throw null;
        }
        int height = view.getHeight();
        android.view.View view2 = this.f493296q;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("header");
            throw null;
        }
        int b17 = height + com.p314xaae8f345.mm.ui.kk.b(view2);
        android.view.View view3 = this.f493296q;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("header");
            throw null;
        }
        int a17 = b17 + com.p314xaae8f345.mm.ui.kk.a(view3);
        int dimension2 = (int) m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561195c0);
        if (!((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a.a().r()).booleanValue()) {
            V6().setMaxHeight(((i18 - i19) - a17) - dimension2);
            return;
        }
        float Y6 = ((Y6(i17) - Z6().getY()) - ((r0 * 2) + r0)) - ((int) m158354x19263085().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        android.view.View findViewById = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.ur9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
        if (findViewById.getVisibility() == 0) {
            Y6 -= this.B;
        }
        V6().setMaxHeight((int) Y6);
    }

    public final void r7(java.lang.String str) {
        android.view.View contentView;
        db5.d5 d5Var = this.f493303x;
        if (d5Var == null) {
            if (this.C) {
                this.f493303x = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y3.b(m158354x19263085(), com.p314xaae8f345.mm.R.C30864xbddafb2a.d1a, com.p314xaae8f345.mm.R.raw.f80141xebd5ba06, m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c), str, 0L);
                return;
            } else {
                c7().post(new sr2.v0(this, str));
                return;
            }
        }
        android.widget.TextView textView = (d5Var == null || (contentView = d5Var.getContentView()) == null) ? null : (android.widget.TextView) contentView.findViewById(com.p314xaae8f345.mm.R.id.obb);
        if (textView == null) {
            return;
        }
        textView.setText(str);
    }

    @Override // ya2.r1
    public void w4(m92.b account) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(account, "account");
        Q6(this.D);
    }
}
