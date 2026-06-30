package ni2;

/* loaded from: classes3.dex */
public final class u2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f419011h;

    /* renamed from: i, reason: collision with root package name */
    public fg2.g1 f419012i;

    /* renamed from: m, reason: collision with root package name */
    public int f419013m;

    /* renamed from: n, reason: collision with root package name */
    public int f419014n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f419015o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        super(context, false, null, false, 14, null);
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f419011h = basePlugin;
        this.f419015o = jz5.h.b(new ni2.t2(context, this));
        this.f199917g.c(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.aja));
        java.util.LinkedList linkedList = ((mm2.e1) basePlugin.P0(mm2.e1.class)).G;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((r45.p12) obj).m75939xb282bd08(0) == 2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            r45.p12 p12Var = (r45.p12) obj;
            if (p12Var != null) {
                android.widget.RelativeLayout[] relativeLayoutArr = new android.widget.RelativeLayout[3];
                fg2.g1 g1Var = this.f419012i;
                if (g1Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                    throw null;
                }
                relativeLayoutArr[0] = g1Var.f343590g;
                if (g1Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                    throw null;
                }
                relativeLayoutArr[1] = g1Var.f343588e;
                if (g1Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                    throw null;
                }
                relativeLayoutArr[2] = g1Var.f343586c;
                for (android.widget.RelativeLayout relativeLayout : kz5.c0.i(relativeLayoutArr)) {
                    int A = A(relativeLayout);
                    relativeLayout.setVisibility(pm0.v.z(p12Var.m75939xb282bd08(3), A) ? 0 : 8);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVoiceRoomModePanel", "liveSubMode: " + A + ",visibility: " + relativeLayout.getVisibility());
                }
            }
        }
    }

    public final int A(android.view.View view) {
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.g1 g1Var = this.f419012i;
        if (g1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        int id6 = g1Var.f343590g.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            return 2;
        }
        fg2.g1 g1Var2 = this.f419012i;
        if (g1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        int id7 = g1Var2.f343588e.getId();
        if (valueOf != null && valueOf.intValue() == id7) {
            return 8;
        }
        fg2.g1 g1Var3 = this.f419012i;
        if (g1Var3 != null) {
            return (valueOf != null && valueOf.intValue() == g1Var3.f343586c.getId()) ? 16 : 2;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
        throw null;
    }

    public final void B(int i17) {
        if (i17 == 8) {
            fg2.g1 g1Var = this.f419012i;
            if (g1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
            g1Var.f343587d.setVisibility(0);
            fg2.g1 g1Var2 = this.f419012i;
            if (g1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
            g1Var2.f343589f.setVisibility(8);
            fg2.g1 g1Var3 = this.f419012i;
            if (g1Var3 != null) {
                g1Var3.f343585b.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
        }
        if (i17 != 16) {
            fg2.g1 g1Var4 = this.f419012i;
            if (g1Var4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
            g1Var4.f343587d.setVisibility(8);
            fg2.g1 g1Var5 = this.f419012i;
            if (g1Var5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
            g1Var5.f343589f.setVisibility(0);
            fg2.g1 g1Var6 = this.f419012i;
            if (g1Var6 != null) {
                g1Var6.f343585b.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
        }
        fg2.g1 g1Var7 = this.f419012i;
        if (g1Var7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        g1Var7.f343587d.setVisibility(8);
        fg2.g1 g1Var8 = this.f419012i;
        if (g1Var8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        g1Var8.f343589f.setVisibility(8);
        fg2.g1 g1Var9 = this.f419012i;
        if (g1Var9 != null) {
            g1Var9.f343585b.setVisibility(0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.view.View c() {
        return f();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570470dl1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public java.lang.String o() {
        java.lang.String string = this.f199914d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m0x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveVoiceRoomModePanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int A = A(view);
        this.f419014n = A;
        B(A);
        z(this.f419014n != this.f419013m);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveVoiceRoomModePanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        int i17 = com.p314xaae8f345.mm.R.id.sp_;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.sp_);
        if (c22699x3dcdb352 != null) {
            i17 = com.p314xaae8f345.mm.R.id.spa;
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.spa);
            if (relativeLayout != null) {
                i17 = com.p314xaae8f345.mm.R.id.spb;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.spb);
                if (textView != null) {
                    i17 = com.p314xaae8f345.mm.R.id.spc;
                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.spc);
                    if (textView2 != null) {
                        i17 = com.p314xaae8f345.mm.R.id.r7p;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.r7p);
                        if (c22699x3dcdb3522 != null) {
                            i17 = com.p314xaae8f345.mm.R.id.r7q;
                            android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.r7q);
                            if (relativeLayout2 != null) {
                                i17 = com.p314xaae8f345.mm.R.id.r7r;
                                android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.r7r);
                                if (textView3 != null) {
                                    i17 = com.p314xaae8f345.mm.R.id.r8t;
                                    android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.r8t);
                                    if (textView4 != null) {
                                        i17 = com.p314xaae8f345.mm.R.id.jux;
                                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.jux);
                                        if (c22699x3dcdb3523 != null) {
                                            i17 = com.p314xaae8f345.mm.R.id.f567541qv0;
                                            android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f567541qv0);
                                            if (relativeLayout3 != null) {
                                                i17 = com.p314xaae8f345.mm.R.id.f567542qv1;
                                                android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f567542qv1);
                                                if (textView5 != null) {
                                                    i17 = com.p314xaae8f345.mm.R.id.f567543qv2;
                                                    android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f567543qv2);
                                                    if (textView6 != null) {
                                                        this.f419012i = new fg2.g1((android.widget.LinearLayout) rootView, c22699x3dcdb352, relativeLayout, textView, textView2, c22699x3dcdb3522, relativeLayout2, textView3, textView4, c22699x3dcdb3523, relativeLayout3, textView5, textView6);
                                                        relativeLayout3.setOnClickListener(this);
                                                        fg2.g1 g1Var = this.f419012i;
                                                        if (g1Var == null) {
                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                                                            throw null;
                                                        }
                                                        g1Var.f343588e.setOnClickListener(this);
                                                        fg2.g1 g1Var2 = this.f419012i;
                                                        if (g1Var2 != null) {
                                                            g1Var2.f343586c.setOnClickListener(this);
                                                            return;
                                                        } else {
                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                                                            throw null;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void v() {
        a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f419011h;
        dk2.u4 u4Var = ((mm2.o4) lVar.P0(mm2.o4.class)).Z;
        android.content.Context context = this.f199914d;
        if (u4Var != null && ((mm2.e1) lVar.P0(mm2.e1.class)).c7()) {
            db5.t7.m123883x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m3y), 0).show();
            return;
        }
        int i17 = this.f419014n;
        java.lang.String str = "";
        if (((mm2.e1) lVar.P0(mm2.e1.class)).b7()) {
            if (!((om2.g) lVar.P0(om2.g.class)).f427844r.isEmpty()) {
                str = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0d);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
            }
        } else if (((mm2.o4) lVar.P0(mm2.o4.class)).f410860v.size() > 0) {
            if (i17 == 2) {
                str = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m0w, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m0f));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
            } else if (i17 == 8) {
                str = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m0w, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.epw));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
            } else if (i17 != 16) {
                str = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m0w, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m0n));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
            } else {
                str = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m0w, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.olu));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
            }
        }
        if (!(str.length() > 0)) {
            y();
            return;
        }
        ni2.q2 q2Var = (ni2.q2) ((jz5.n) this.f419015o).mo141623x754a37bb();
        int i18 = this.f419014n;
        q2Var.getClass();
        q2Var.w();
        android.widget.TextView textView = q2Var.f418975m;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerTextView");
            throw null;
        }
        textView.setText(str);
        android.widget.TextView textView2 = q2Var.f418978p;
        if (textView2 != null) {
            textView2.setVisibility(i18 != 8 ? 8 : 0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("secondText");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void w() {
        super.w();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f419011h;
        this.f419013m = ((mm2.e1) lVar.P0(mm2.e1.class)).U6();
        B(((mm2.e1) lVar.P0(mm2.e1.class)).U6());
        z(false);
    }

    public final void y() {
        km2.m V0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e;
        ch2.o2 o2Var;
        te2.j0 j0Var;
        java.lang.Object obj;
        boolean z17;
        zi2.w wVar = (zi2.w) this.f419011h.X0(zi2.w.class);
        if (wVar != null) {
            if (this.f419014n == 2) {
                wVar.t1();
            }
            int i17 = this.f419014n;
            if (i17 == 1 || i17 == 8 || i17 == 16) {
                zn0.y yVar = zn0.x.f555947a;
                java.util.ArrayList arrayList = yVar.f555948a;
                if (arrayList == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCoverPlugin", "micFocusGrabModeFillConfig remoteUserConfigList = null");
                } else {
                    if (arrayList.size() > 1) {
                        kz5.g0.t(arrayList, new zi2.q());
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCoverPlugin", "resetToNormalPosition before audienceList: " + ((mm2.o4) wVar.P0(mm2.o4.class)).f410860v);
                    java.util.ArrayList arrayList2 = yVar.f555948a;
                    int size = arrayList2 != null ? arrayList2.size() : 0;
                    yVar.f555949b = 1;
                    yVar.f555950c = size;
                    ((mm2.o4) wVar.P0(mm2.o4.class)).a7().f390725w = 1;
                    synchronized (arrayList) {
                        java.util.Iterator it = arrayList.iterator();
                        int i18 = 0;
                        while (it.hasNext()) {
                            java.lang.Object next = it.next();
                            int i19 = i18 + 1;
                            if (i18 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            zn0.v vVar = (zn0.v) next;
                            int i27 = i18 + 2;
                            vVar.f555946n = i27;
                            java.util.List list = ((mm2.o4) wVar.P0(mm2.o4.class)).f410860v;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
                            synchronized (list) {
                                java.util.Iterator it6 = list.iterator();
                                while (true) {
                                    if (!it6.hasNext()) {
                                        obj = null;
                                        break;
                                    } else {
                                        obj = it6.next();
                                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj).f390703a, vVar.f555939d)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            km2.q qVar = (km2.q) obj;
                            if (qVar != null) {
                                qVar.f390725w = i27;
                            }
                            i18 = i19;
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCoverPlugin", "resetToNormalPosition after audienceList: " + ((mm2.o4) wVar.P0(mm2.o4.class)).f410860v);
                }
            }
            wVar.E1("opChangeLiveMode");
            if (((mm2.e1) wVar.P0(mm2.e1.class)).b7()) {
                if (!(i17 == 8)) {
                    z17 = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCoverPlugin", "opChangeLiveMode mainMode: 2 subMode: " + i17 + " isNeedClearSong: " + z17);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.e(wVar, null, null, new zi2.m(wVar, 2, i17, null, null), 3, null);
                }
            }
            z17 = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCoverPlugin", "opChangeLiveMode mainMode: 2 subMode: " + i17 + " isNeedClearSong: " + z17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.e(wVar, null, null, new zi2.m(wVar, 2, i17, null, null), 3, null);
        }
        df2.y1 y1Var = (df2.y1) this.f419011h.U0(df2.y1.class);
        if (y1Var != null) {
            int i28 = this.f419014n;
            r45.q12 q12Var = ((mm2.e1) y1Var.m56788xbba4bfc0(mm2.e1.class)).f410522s;
            if (q12Var != null) {
                q12Var.set(1, java.lang.Integer.valueOf(i28));
            }
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = ((mm2.g1) y1Var.m56788xbba4bfc0(mm2.g1.class)).f410601f;
            r45.q12 q12Var2 = j2Var != null ? (r45.q12) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb() : null;
            if (q12Var2 != null) {
                q12Var2.set(1, java.lang.Integer.valueOf(i28));
            }
            ((ml2.j0) i95.n0.c(ml2.j0.class)).ek(y1Var.a7());
        }
        qo0.c.a(this.f419011h.f194858g, qo0.b.R4, null, 2, null);
        qo0.c cVar = this.f419011h.f194858g;
        qo0.b bVar = qo0.b.T2;
        android.os.Bundle bundle = new android.os.Bundle();
        r45.q12 q12Var3 = ((mm2.e1) this.f419011h.P0(mm2.e1.class)).f410522s;
        bundle.putInt("PARAM_FINDER_LIVE_MAIN_MODE", q12Var3 != null ? q12Var3.m75939xb282bd08(0) : 0);
        bundle.putInt("PARAM_FINDER_LIVE_SUB_MODE", this.f419014n);
        cVar.mo46557x60d69242(bVar, bundle);
        ch2.q qVar2 = (ch2.q) this.f419011h.U0(ch2.q.class);
        if (qVar2 != null) {
            int i29 = this.f419014n;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVController", "onVoiceModeChange curSelectLiveSubMode: " + i29);
            if (i29 == 8) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h8 h8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h8) qVar2.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h8.class);
                if (h8Var != null && (j0Var = h8Var.f194318q) != null) {
                    ((te2.p1) j0Var).y();
                }
                qVar2.c7();
            } else {
                qVar2.f7("onVoiceModeChange");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f419011h;
        r45.yx1 Q6 = ((om2.g) lVar.P0(om2.g.class)).Q6();
        if (Q6 == null || (V0 = lVar.V0()) == null || (c14197x319b1b9e = V0.f390664f) == null || (o2Var = (ch2.o2) c14197x319b1b9e.m56798x25fe639c(ch2.o2.class)) == null) {
            return;
        }
        zh2.a.b3(o2Var, Q6, null, 2, null);
    }

    public final void z(boolean z17) {
        android.widget.TextView textView;
        android.view.View view = this.f199916f;
        if (z17) {
            textView = view instanceof android.widget.TextView ? (android.widget.TextView) view : null;
            if (textView != null) {
                textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaz));
                textView.setEnabled(true);
                return;
            }
            return;
        }
        textView = view instanceof android.widget.TextView ? (android.widget.TextView) view : null;
        if (textView != null) {
            textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29));
            textView.setEnabled(false);
        }
    }
}
