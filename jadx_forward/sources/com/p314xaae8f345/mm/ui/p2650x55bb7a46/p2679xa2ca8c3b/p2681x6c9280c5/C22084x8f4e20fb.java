package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingNewFileMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/m;", "Lem/l;", "f", "Lem/l;", "getHolder", "()Lem/l;", "setHolder", "(Lem/l;)V", "holder", "Lem/p;", "g", "Lem/p;", "getSourceHolder", "()Lem/p;", "setSourceHolder", "(Lem/p;)V", "sourceHolder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingNewFileMvvmView */
/* loaded from: classes9.dex */
public final class C22084x8f4e20fb extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<z01.m> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public em.l holder;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public em.p sourceHolder;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22084x8f4e20fb(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public android.view.View c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e0v, (android.view.ViewGroup) this, false);
        em.l lVar = new em.l(inflate);
        m80101x101324ae(lVar);
        m80102xd351ef29(new em.p(lVar.e()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public void e(q31.p pVar, q31.p pVar2) {
        boolean z17;
        java.lang.Object m143895xf1229813;
        java.lang.String str;
        jz5.f0 f0Var;
        jz5.f0 f0Var2;
        java.lang.String A;
        java.lang.String o17;
        z01.m mVar = (z01.m) pVar2;
        if (mVar == null) {
            return;
        }
        em.l m80099x1cddf0a2 = m80099x1cddf0a2();
        if (m80099x1cddf0a2.f336047b == null) {
            m80099x1cddf0a2.f336047b = (com.p314xaae8f345.mm.p2776x373aa5.C22811x324162d2) m80099x1cddf0a2.f336046a.findViewById(com.p314xaae8f345.mm.R.id.bkg);
        }
        m80099x1cddf0a2.f336047b.m82764xec18708e(new ym5.a6(5.0d, 0.0d, 3.5d, 0.0d, 0, 26, null));
        java.lang.String str2 = "";
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2529x2ff57c.C20154xb459d094()) == 1) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 i17 = m80099x1cddf0a2().i();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i17, "getChattingAppmsgTitleTv(...)");
            java.lang.String str3 = mVar.f550631i;
            java.lang.String str4 = str3 == null ? "" : str3;
            i17.m84175x8dd5167d(2);
            float width = (i17.getWidth() - i17.getPaddingLeft()) - i17.getPaddingRight();
            if (width > 0.0f) {
                android.text.TextPaint m84162x74f59ea8 = i17.m84162x74f59ea8();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m84162x74f59ea8, "getPaint(...)");
                i17.b(al5.p3.a(str4, width, 2, m84162x74f59ea8, 3, true, true));
            } else {
                i17.b(str4);
                i17.post(new al5.o3(i17, str4, 2, 3, true, true));
            }
        } else {
            m80099x1cddf0a2().i().m84166xb86dec4b(android.text.TextUtils.TruncateAt.END);
            m80099x1cddf0a2().i().b(mVar.f550631i);
        }
        m80099x1cddf0a2().b().setText(mVar.f550632m);
        m80099x1cddf0a2().i().m84183x1c5c5ff4(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        m80099x1cddf0a2().b().setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adg));
        int i18 = mVar.f550633n;
        if (i18 != 0) {
            setBackgroundResource(i18);
        }
        em.l m80099x1cddf0a22 = m80099x1cddf0a2();
        if (m80099x1cddf0a22.f336059n == null) {
            m80099x1cddf0a22.f336059n = (android.widget.LinearLayout) m80099x1cddf0a22.f336046a.findViewById(com.p314xaae8f345.mm.R.id.biy);
        }
        m80099x1cddf0a22.f336059n.setPadding(0, getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx), 0, 0);
        m80099x1cddf0a2().g().setVisibility(0);
        m80099x1cddf0a2().c().setVisibility(8);
        m80099x1cddf0a2().h().setVisibility(8);
        ut.g gVar = ut.g.f512159a;
        boolean b17 = gVar.b(mVar.f550628f);
        boolean c17 = gVar.c(mVar.f550628f);
        jz5.f0 f0Var3 = jz5.f0.f384359a;
        if (c17) {
            gk0.k kVar = new gk0.k(i65.a.b(getContext(), 40), i65.a.b(getContext(), 30));
            java.lang.String str5 = mVar.f550635p;
            if (str5 != null) {
                if (com.p314xaae8f345.mm.vfs.w6.j(str5)) {
                    m80099x1cddf0a2().c().setVisibility(0);
                    gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c18 = m80099x1cddf0a2().c();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getChattingAppmsgFileThumbIv(...)");
                    ((h83.g) n0Var).Ai(c18, str5, kVar);
                } else {
                    v05.a aVar = mVar.A;
                    if (!((aVar == null || (o17 = aVar.o()) == null || !(r26.n0.N(o17) ^ true)) ? false : true)) {
                        v05.a aVar2 = mVar.A;
                        if (!((aVar2 == null || (A = aVar2.A()) == null || !(r26.n0.N(A) ^ true)) ? false : true)) {
                            m80099x1cddf0a2().c().setVisibility(8);
                        }
                    }
                    v05.a aVar3 = mVar.A;
                    if (aVar3 != null) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fileThumb_");
                        java.lang.String o18 = aVar3.o();
                        if (!java.lang.Boolean.valueOf(o18.length() > 0).booleanValue()) {
                            o18 = null;
                        }
                        if (o18 == null) {
                            o18 = aVar3.A();
                        }
                        sb6.append(o18);
                        sb6.append('_');
                        z17 = b17;
                        sb6.append(c01.id.a());
                        y01.a aVar4 = new y01.a(sb6.toString());
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar3.A())) {
                            aVar4.a(aVar3.j());
                            aVar4.d(aVar3.o());
                            aVar4.b(aVar3.n());
                            aVar4.f540108d = 3;
                        } else {
                            aVar4.a(aVar3.w());
                            aVar4.d(aVar3.A());
                            aVar4.b(aVar3.z());
                            aVar4.c(aVar3.u());
                            aVar4.f540108d = 19;
                        }
                        aVar4.f540109e = str5;
                        m80099x1cddf0a2().c().setVisibility(0);
                        int Ai = ((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).Ai(aVar3.m75942xfb822ef2(aVar3.f449897d + 0));
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c19 = m80099x1cddf0a2().c();
                        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(mVar.G);
                        jz5.g gVar2 = ho.b.f364148a;
                        if (c19 != null) {
                            g75.z Ui = ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Ui(((rx.h) ((gk0.k0) i95.n0.c(gk0.k0.class))).wi(kVar, aVar4), kVar, c19, aVar4.f540109e);
                            Ui.l("KeyCdnParams", aVar4);
                            Ui.l("KeyAppMsgSubType", java.lang.Integer.valueOf(Ai));
                            Ui.l("KeyFileMd5", aVar4.f540110f);
                            jz5.g gVar3 = ho.b.f364148a;
                            ((gk0.j) ((jz5.n) ho.b.f364148a).mo141623x754a37bb()).a(Ui, weakReference);
                        }
                        f0Var2 = f0Var3;
                    } else {
                        z17 = b17;
                        f0Var2 = null;
                    }
                    if (f0Var2 == null) {
                        m80099x1cddf0a2().c().setVisibility(8);
                    }
                    f0Var = f0Var3;
                }
                z17 = b17;
                f0Var = f0Var3;
            } else {
                z17 = b17;
                f0Var = null;
            }
            if (f0Var == null) {
                m80099x1cddf0a2().c().setVisibility(8);
            }
        } else {
            z17 = b17;
        }
        if (mVar.f550634o != null) {
            m80099x1cddf0a2().g().setImageBitmap(mVar.f550634o);
        } else {
            m80099x1cddf0a2().g().setImageResource(mVar.f550636q);
        }
        m80099x1cddf0a2().f().setVisibility(0);
        m80099x1cddf0a2().b().setVisibility(0);
        em.p m80100x9d08f41d = m80100x9d08f41d();
        if (m80100x9d08f41d.f336228c == null) {
            m80100x9d08f41d.f336228c = (android.widget.ImageView) m80100x9d08f41d.f336226a.findViewById(com.p314xaae8f345.mm.R.id.bjn);
        }
        m80100x9d08f41d.f336228c.setVisibility(8);
        em.p m80100x9d08f41d2 = m80100x9d08f41d();
        if (m80100x9d08f41d2.f336227b == null) {
            m80100x9d08f41d2.f336227b = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) m80100x9d08f41d2.f336226a.findViewById(com.p314xaae8f345.mm.R.id.bjo);
        }
        m80100x9d08f41d2.f336227b.setVisibility(8);
        if (mVar.f550637r) {
            android.view.View e17 = m80099x1cddf0a2().e();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(e17, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingNewFileMvvmView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/FileViewModel;Lcom/tencent/mm/modelchatting/FileViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            e17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(e17, "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingNewFileMvvmView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/FileViewModel;Lcom/tencent/mm/modelchatting/FileViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View e18 = m80099x1cddf0a2().e();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(e18, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingNewFileMvvmView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/FileViewModel;Lcom/tencent/mm/modelchatting/FileViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            e18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(e18, "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingNewFileMvvmView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/FileViewModel;Lcom/tencent/mm/modelchatting/FileViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        m80099x1cddf0a2().a().setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adg));
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            te5.j jVar = te5.j.f500219a;
            z01.m m48328xa0ab20ce = m48328xa0ab20ce();
            if (m48328xa0ab20ce != null && (str = m48328xa0ab20ce.f550628f) != null) {
                str2 = str;
            }
            int color = getContext().getResources().getColor(jVar.b(str2), null);
            m80099x1cddf0a2().d().m82040x7541828(color);
            m80099x1cddf0a2().j().m82114x7d38f3f4(color);
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var3);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingNewFileMvvmView", "getFileProgressIconColorResIdByExt failed");
        }
        m80099x1cddf0a2().j().setVisibility(8);
        m80099x1cddf0a2().d().setVisibility(8);
        m80099x1cddf0a2().a().setVisibility(8);
        m80099x1cddf0a2().k().setVisibility(8);
        switch (mVar.f550626d) {
            case 1:
                m80099x1cddf0a2().a().setVisibility(0);
                m80099x1cddf0a2().a().setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.na9));
                g();
                break;
            case 2:
                m80099x1cddf0a2().d().setImageResource(com.p314xaae8f345.mm.R.raw.f78418xba0710d8);
                h();
                break;
            case 3:
                m80099x1cddf0a2().a().setVisibility(0);
                m80099x1cddf0a2().a().setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n_m));
                g();
                break;
            case 4:
                m80099x1cddf0a2().d().setImageResource(com.p314xaae8f345.mm.R.raw.f78417x547e8b9f);
                h();
                break;
            case 5:
                m80099x1cddf0a2().j().m82112x7e1bd1fe(false);
                m80099x1cddf0a2().j().setVisibility(0);
                m80099x1cddf0a2().d().setVisibility(0);
                m80099x1cddf0a2().d().setImageResource(com.p314xaae8f345.mm.R.raw.f78417x547e8b9f);
                m80099x1cddf0a2().a().setVisibility(0);
                m80099x1cddf0a2().a().setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572016wc));
                break;
            case 6:
                m80099x1cddf0a2().a().setVisibility(0);
                m80099x1cddf0a2().a().setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n_x));
                break;
            case 7:
                m80099x1cddf0a2().a().setVisibility(0);
                m80099x1cddf0a2().a().setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n_y));
                break;
            case 8:
                m80099x1cddf0a2().j().setVisibility(8);
                m80099x1cddf0a2().d().setVisibility(8);
                break;
            case 9:
                m80099x1cddf0a2().d().setImageResource(com.p314xaae8f345.mm.R.raw.f78418xba0710d8);
                h();
                m80099x1cddf0a2().a().setVisibility(0);
                m80099x1cddf0a2().a().setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572018we));
                m80099x1cddf0a2().a().setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
                break;
            default:
                z01.m m48328xa0ab20ce2 = m48328xa0ab20ce();
                if (m48328xa0ab20ce2 != null && m48328xa0ab20ce2.f550641v) {
                    m80099x1cddf0a2().a().setVisibility(0);
                    m80099x1cddf0a2().a().setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nad));
                } else {
                    z01.m m48328xa0ab20ce3 = m48328xa0ab20ce();
                    if (m48328xa0ab20ce3 != null && (m48328xa0ab20ce3.f550627e ^ true)) {
                        z01.m m48328xa0ab20ce4 = m48328xa0ab20ce();
                        if (m48328xa0ab20ce4 != null && m48328xa0ab20ce4.f550629g) {
                            m80099x1cddf0a2().a().setVisibility(0);
                            m80099x1cddf0a2().a().setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.na_));
                        }
                    }
                }
                m80099x1cddf0a2().j().setVisibility(8);
                m80099x1cddf0a2().d().setVisibility(8);
                break;
        }
        if (mVar.f550626d == 0) {
            if (z17 && m80099x1cddf0a2().c().getVisibility() == 0 && m80099x1cddf0a2().c().getDrawable() != null) {
                m80099x1cddf0a2().h().setVisibility(0);
            } else {
                m80099x1cddf0a2().h().setVisibility(8);
            }
        }
        em.l m80099x1cddf0a23 = m80099x1cddf0a2();
        if (m80099x1cddf0a23.f336053h == null) {
            m80099x1cddf0a23.f336053h = (android.widget.ImageView) m80099x1cddf0a23.f336046a.findViewById(com.p314xaae8f345.mm.R.id.f565189bl5);
        }
        m80099x1cddf0a23.f336053h.setVisibility(8);
        em.l m80099x1cddf0a24 = m80099x1cddf0a2();
        if (m80099x1cddf0a24.f336057l == null) {
            m80099x1cddf0a24.f336057l = (android.widget.ProgressBar) m80099x1cddf0a24.f336046a.findViewById(com.p314xaae8f345.mm.R.id.v3b);
        }
        m80099x1cddf0a24.f336057l.setVisibility(8);
        if (m80099x1cddf0a2().j().getVisibility() == 0) {
            m80099x1cddf0a2().j().m82113x3ae760af(mVar.f550640u);
        }
        if (mVar.f550639t) {
            m80099x1cddf0a2().f().setOnClickListener(mVar.B);
        } else {
            m80099x1cddf0a2().f().setOnClickListener(null);
            m80099x1cddf0a2().f().setClickable(false);
            if (mVar.f550630h == 1) {
                m80099x1cddf0a2().a().setVisibility(0);
                m80099x1cddf0a2().a().setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.na9));
            }
        }
        setTag(mVar.C);
        setOnClickListener(mVar.D);
        setOnLongClickListener(mVar.E);
        setOnTouchListener(mVar.F);
    }

    public final void g() {
        m80099x1cddf0a2().d().setVisibility(8);
        m80099x1cddf0a2().j().m82112x7e1bd1fe(true);
        m80099x1cddf0a2().j().setVisibility(0);
    }

    /* renamed from: getHolder */
    public final em.l m80099x1cddf0a2() {
        em.l lVar = this.holder;
        if (lVar != null) {
            return lVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
        throw null;
    }

    /* renamed from: getSourceHolder */
    public final em.p m80100x9d08f41d() {
        em.p pVar = this.sourceHolder;
        if (pVar != null) {
            return pVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceHolder");
        throw null;
    }

    public final void h() {
        m80099x1cddf0a2().j().m82112x7e1bd1fe(false);
        m80099x1cddf0a2().j().setVisibility(0);
        m80099x1cddf0a2().d().setVisibility(0);
    }

    /* renamed from: setHolder */
    public final void m80101x101324ae(em.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lVar, "<set-?>");
        this.holder = lVar;
    }

    /* renamed from: setSourceHolder */
    public final void m80102xd351ef29(em.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pVar, "<set-?>");
        this.sourceHolder = pVar;
    }

    public /* synthetic */ C22084x8f4e20fb(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22084x8f4e20fb(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
