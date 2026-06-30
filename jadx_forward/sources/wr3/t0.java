package wr3;

/* loaded from: classes11.dex */
public final class t0 extends wr3.i {
    public int A;
    public final jz5.g B;
    public final java.lang.ref.WeakReference C;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d D;

    /* renamed from: m, reason: collision with root package name */
    public final android.content.Context f530412m;

    /* renamed from: n, reason: collision with root package name */
    public final int f530413n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.z3 f530414o;

    /* renamed from: p, reason: collision with root package name */
    public final long f530415p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f530416q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f530417r;

    /* renamed from: s, reason: collision with root package name */
    public final sr3.g f530418s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f530419t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f530420u;

    /* renamed from: v, reason: collision with root package name */
    public r45.gl f530421v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.Integer f530422w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.LinkedList f530423x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.LinkedList f530424y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f530425z;

    public t0(android.content.Context context, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact, long j17, boolean z17, boolean z18, sr3.g config, java.lang.String bizUsername, final p012xc85e97e9.p093xedfae76a.y lifecycleOwner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        this.f530412m = context;
        this.f530413n = i17;
        this.f530414o = contact;
        this.f530415p = j17;
        this.f530416q = z17;
        this.f530417r = z18;
        this.f530418s = config;
        this.f530419t = "BizProfileTabFeaturedMsgAdapter";
        this.f530420u = new java.util.ArrayList();
        this.f530422w = 0;
        this.B = jz5.h.b(wr3.r0.f530405d);
        this.C = new java.lang.ref.WeakReference(this);
        this.D = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4>(lifecycleOwner) { // from class: com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabFeaturedMsgAdapter$tingPlayerListener$1
            {
                this.f39173x3fe91575 = -1155728636;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 event = c5722xb16ab0f4;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                wr3.t0 t0Var = this;
                wr3.t0 t0Var2 = (wr3.t0) t0Var.C.get();
                if (t0Var2 == null) {
                    return false;
                }
                int i18 = event.f136045g.f88569b;
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) t0Var.B).mo141623x754a37bb()).mo50293x3498a0(new wr3.s0(t0Var2));
                return false;
            }
        };
    }

    @Override // wr3.i
    public android.content.Context B() {
        return this.f530412m;
    }

    @Override // wr3.i
    public long E() {
        return this.f530415p;
    }

    @Override // wr3.i
    public boolean J() {
        return this.f530417r;
    }

    @Override // wr3.i
    public boolean K() {
        return this.f530416q;
    }

    public final void L(r45.s5 s5Var, wr3.n0 n0Var) {
        java.util.LinkedList linkedList;
        r45.p5 p5Var = s5Var.f467047i;
        if ((p5Var != null ? p5Var.f464287e : null) == null || p5Var.f464287e.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f530419t, "DetailInfo is null or empty, skip adding message");
            return;
        }
        int size = s5Var.f467047i.f464287e.size();
        r45.o5 o5Var = (r45.o5) s5Var.f467047i.f464287e.get(0);
        int i17 = o5Var.f463456p;
        java.util.ArrayList arrayList = this.f530420u;
        if (i17 == 8) {
            r45.y5 y5Var = s5Var.f467042d;
            if (y5Var != null && y5Var.f472329m == 1) {
                arrayList.add(new jz5.o(wr3.o0.f530393p, n0Var, s5Var));
                return;
            }
        }
        if (size == 1) {
            if (i17 == 5) {
                arrayList.add(new jz5.o(wr3.o0.f530387g, n0Var, s5Var));
                return;
            }
            if (i17 == 8) {
                r45.l5 l5Var = s5Var.f467047i.f464286d;
                if ((l5Var != null ? l5Var.f460675h : 0) == 1) {
                    r45.g6 g6Var = o5Var.K;
                    if (((g6Var == null || (linkedList = g6Var.f456442d) == null) ? 0 : linkedList.size()) >= 3 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.t5) o5Var.K.f456442d.get(0)).f467681g)) {
                        arrayList.add(new jz5.o(wr3.o0.f530392o, n0Var, s5Var));
                        return;
                    }
                }
            }
            int i18 = o5Var.f463456p;
            if (i18 == 8) {
                arrayList.add(new jz5.o(wr3.o0.f530388h, n0Var, s5Var));
                return;
            }
            if (i18 == 10) {
                arrayList.add(new jz5.o(wr3.o0.f530386f, n0Var, s5Var));
                return;
            } else if (i18 == 19) {
                arrayList.add(new jz5.o(wr3.o0.f530390m, n0Var, s5Var));
                return;
            } else if (i18 == 0 && s5Var.f467047i.f464286d.f460675h == 1) {
                arrayList.add(new jz5.o(wr3.o0.f530391n, n0Var, s5Var));
                return;
            }
        }
        arrayList.add(new jz5.o(wr3.o0.f530389i, n0Var, s5Var));
    }

    public final void M(r45.s5 s5Var, wr3.n0 n0Var) {
        java.lang.String str = this.f530419t;
        if (s5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "addMessageWithStatus msg null");
            return;
        }
        r45.p5 p5Var = s5Var.f467047i;
        boolean z17 = false;
        boolean z18 = p5Var == null || p5Var.f464287e.size() == 0;
        int i17 = s5Var.f467042d.f472324e;
        if (i17 == 1 && s5Var.f467043e == null) {
            z17 = true;
        }
        if (z18 && z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "updateData fail, appMsgTypeLegal = " + z18 + ", oldTextLegal = " + z17);
            return;
        }
        wr3.n0 n0Var2 = wr3.n0.f530375f;
        if (n0Var != n0Var2) {
            L(s5Var, n0Var);
        } else if (i17 == 1) {
            this.f530420u.add(new jz5.o(wr3.o0.f530386f, n0Var2, s5Var));
        } else {
            if (i17 != 49) {
                return;
            }
            L(s5Var, n0Var);
        }
    }

    public final void N(r45.gl v2RespMsgList, java.lang.Integer num, java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        int i17;
        java.util.LinkedList<r45.o5> linkedList3;
        java.util.LinkedList linkedList4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v2RespMsgList, "v2RespMsgList");
        r45.gl glVar = new r45.gl();
        glVar.f456856d = new java.util.LinkedList(v2RespMsgList.f456856d);
        glVar.f456859g = v2RespMsgList.f456859g;
        this.f530421v = glVar;
        this.f530422w = num;
        this.f530423x = linkedList;
        this.f530424y = linkedList2;
        java.util.ArrayList arrayList = this.f530420u;
        arrayList.clear();
        java.util.LinkedList linkedList5 = this.f530424y;
        java.lang.String str = this.f530419t;
        if (linkedList5 == null || linkedList5.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "no draftMessage");
        } else {
            java.util.LinkedList linkedList6 = this.f530424y;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList6);
            java.util.Iterator it = linkedList6.iterator();
            while (it.hasNext()) {
                vr3.h hVar = (vr3.h) it.next();
                r45.s5 s5Var = hVar.f521164a;
                wr3.n0 n0Var = hVar.f521165b;
                if (n0Var == null) {
                    n0Var = wr3.n0.f530375f;
                }
                M(s5Var, n0Var);
            }
        }
        r45.gl glVar2 = this.f530421v;
        if (glVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("v2RespMsgList");
            throw null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(glVar2.f456856d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "no v2resp msg");
        } else {
            java.lang.Integer num2 = this.f530422w;
            if ((num2 == null || num2.intValue() < 0 || (linkedList4 = this.f530423x) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList4)) ? false : true) {
                java.util.LinkedList linkedList7 = this.f530423x;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList7);
                r45.p5 p5Var = ((r45.s5) linkedList7.get(0)).f467047i;
                if (p5Var == null || (linkedList3 = p5Var.f464287e) == null || linkedList3.isEmpty()) {
                    i17 = 0;
                } else {
                    i17 = 0;
                    for (r45.o5 o5Var : linkedList3) {
                        if ((!(o5Var != null && o5Var.f463456p == 8)) && (i17 = i17 + 1) < 0) {
                            kz5.c0.o();
                            throw null;
                        }
                    }
                }
                this.f530350g = i17;
                zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
                java.lang.String d17 = this.f530414o.d1();
                yq1.z zVar = (yq1.z) a0Var;
                zVar.getClass();
                long q17 = zVar.k().q(("Biz_" + gm0.j1.b().j() + "_EnterProfileTime") + '_' + d17, 0L);
                java.lang.Integer num3 = this.f530422w;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num3);
                boolean z17 = (((((long) num3.intValue()) * ((long) 1000)) > q17 ? 1 : ((((long) num3.intValue()) * ((long) 1000)) == q17 ? 0 : -1)) > 0) || this.f530349f;
                r45.gl glVar3 = this.f530421v;
                if (glVar3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("v2RespMsgList");
                    throw null;
                }
                int i18 = ((r45.s5) glVar3.f456856d.get(0)).f467049n;
                yr3.o0[] o0VarArr = yr3.o0.f546498d;
                if (i18 != 0) {
                    r45.gl glVar4 = this.f530421v;
                    if (glVar4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("v2RespMsgList");
                        throw null;
                    }
                    glVar4.f456856d.remove(0);
                }
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "add featured expand msg");
                    java.util.LinkedList linkedList8 = this.f530423x;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList8);
                    ((r45.s5) linkedList8.get(0)).f467049n = 2;
                    r45.gl glVar5 = this.f530421v;
                    if (glVar5 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("v2RespMsgList");
                        throw null;
                    }
                    java.util.LinkedList linkedList9 = glVar5.f456856d;
                    java.util.LinkedList linkedList10 = this.f530423x;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList10);
                    linkedList9.add(0, linkedList10.get(0));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "add featured collapse msg");
                    java.util.LinkedList linkedList11 = this.f530423x;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList11);
                    ((r45.s5) linkedList11.get(0)).f467049n = 1;
                    r45.gl glVar6 = this.f530421v;
                    if (glVar6 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("v2RespMsgList");
                        throw null;
                    }
                    java.util.LinkedList linkedList12 = glVar6.f456856d;
                    java.util.LinkedList linkedList13 = this.f530423x;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList13);
                    linkedList12.add(0, linkedList13.get(0));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "no featured list");
                this.f530350g = 0;
            }
        }
        r45.gl glVar7 = this.f530421v;
        if (glVar7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("v2RespMsgList");
            throw null;
        }
        java.util.Iterator it6 = glVar7.f456856d.iterator();
        while (it6.hasNext()) {
            M((r45.s5) it6.next(), wr3.n0.f530375f);
        }
        r45.gl glVar8 = this.f530421v;
        if (glVar8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("v2RespMsgList");
            throw null;
        }
        java.util.LinkedList Msg = glVar8.f456856d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Msg, "Msg");
        if (!Msg.isEmpty()) {
            r45.gl glVar9 = this.f530421v;
            if (glVar9 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("v2RespMsgList");
                throw null;
            }
            r45.ul ulVar = glVar9.f456859g;
            if (ulVar != null && ulVar.f468986e == 0) {
                arrayList.add(new jz5.o(wr3.o0.f530394q, wr3.n0.f530375f, new r45.s5()));
            }
        }
        m8146xced61ae5();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f530420u.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((wr3.o0) ((jz5.o) this.f530420u.get(i17)).f384374d).f530396d;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        yz5.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.ArrayList arrayList = this.f530420u;
        if (i17 == arrayList.size() - 1 && (aVar = this.f530348e) != null) {
            aVar.mo152xb9724478();
        }
        java.lang.String d17 = this.f530414o.d1();
        if (d17 == null) {
            d17 = "";
        }
        java.lang.String str = d17;
        boolean z17 = holder instanceof wr3.f2;
        yr3.w wVar = yr3.w.f546592a;
        if (z17) {
            wr3.f2 f2Var = (wr3.f2) holder;
            r45.s5 bizMessage = (r45.s5) ((jz5.o) arrayList.get(i17)).f384376f;
            wr3.n0 itemStatus = (wr3.n0) ((jz5.o) arrayList.get(i17)).f384375e;
            boolean z18 = this.f530417r;
            int i18 = this.f530413n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizMessage, "bizMessage");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemStatus, "itemStatus");
            if (itemStatus == wr3.n0.f530375f || itemStatus == wr3.n0.f530379m) {
                wVar.l(bizMessage, str);
            }
            fq1.e.h(fq1.e.f347040a, f2Var.f530333q, i65.a.b(f2Var.f530325f, 8), false, false, 12, null);
            android.content.Context context = f2Var.f530325f;
            wr3.t0 t0Var = f2Var.f530323d;
            android.view.View view = f2Var.f530328i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            android.view.View view2 = f2Var.f530329m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
            android.view.View view3 = f2Var.f530333q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view3);
            android.widget.TextView textView = f2Var.f530330n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
            android.view.View view4 = f2Var.f530331o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view4);
            wVar.h(context, t0Var, bizMessage, view, view2, view3, textView, view4, new wr3.e2(f2Var, bizMessage, itemStatus, z18, i18));
            return;
        }
        if (holder instanceof yr3.i0) {
            yr3.i0 i0Var = (yr3.i0) holder;
            r45.s5 bizMessage2 = (r45.s5) ((jz5.o) arrayList.get(i17)).f384376f;
            wr3.n0 itemStatus2 = (wr3.n0) ((jz5.o) arrayList.get(i17)).f384375e;
            boolean z19 = this.f530417r;
            int i19 = this.f530413n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizMessage2, "bizMessage");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemStatus2, "itemStatus");
            if (itemStatus2 == wr3.n0.f530375f || itemStatus2 == wr3.n0.f530379m) {
                wVar.l(bizMessage2, str);
            }
            fq1.e.h(fq1.e.f347040a, i0Var.f546395o, i65.a.b(i0Var.f546389f, 8), false, false, 12, null);
            android.content.Context context2 = i0Var.f546389f;
            wr3.t0 t0Var2 = i0Var.f546387d;
            android.view.View view5 = i0Var.f546390g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view5);
            android.view.View view6 = i0Var.f546391h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view6);
            android.view.View view7 = i0Var.f546395o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view7);
            android.widget.TextView textView2 = i0Var.f546392i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
            android.view.View view8 = i0Var.f546393m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view8);
            wVar.h(context2, t0Var2, bizMessage2, view5, view6, view7, textView2, view8, new yr3.h0(i0Var, bizMessage2, itemStatus2, z19, i19));
            return;
        }
        if (holder instanceof yr3.k0) {
            yr3.k0 k0Var = (yr3.k0) holder;
            r45.s5 bizMessage3 = (r45.s5) ((jz5.o) arrayList.get(i17)).f384376f;
            wr3.n0 itemStatus3 = (wr3.n0) ((jz5.o) arrayList.get(i17)).f384375e;
            boolean z27 = this.f530417r;
            int i27 = this.f530413n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizMessage3, "bizMessage");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemStatus3, "itemStatus");
            if (itemStatus3 == wr3.n0.f530375f || itemStatus3 == wr3.n0.f530379m) {
                wVar.l(bizMessage3, str);
            }
            fq1.e.h(fq1.e.f347040a, k0Var.f546438r, i65.a.b(k0Var.f546429f, 8), false, false, 12, null);
            android.content.Context context3 = k0Var.f546429f;
            wr3.t0 t0Var3 = k0Var.f546427d;
            android.view.View view9 = k0Var.f546433m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view9);
            android.view.View view10 = k0Var.f546434n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view10);
            android.view.View view11 = k0Var.f546438r;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view11);
            android.widget.TextView textView3 = k0Var.f546435o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView3);
            android.view.View view12 = k0Var.f546436p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view12);
            wVar.h(context3, t0Var3, bizMessage3, view9, view10, view11, textView3, view12, new yr3.j0(k0Var, bizMessage3, itemStatus3, z27, i27));
            return;
        }
        if (holder instanceof yr3.y) {
            ((yr3.y) holder).i((r45.s5) ((jz5.o) arrayList.get(i17)).f384376f, (wr3.n0) ((jz5.o) arrayList.get(i17)).f384375e, i17, this.f530417r, str, this.f530413n);
            return;
        }
        if (holder instanceof yr3.e0) {
            yr3.e0 e0Var = (yr3.e0) holder;
            r45.s5 bizMessage4 = (r45.s5) ((jz5.o) arrayList.get(i17)).f384376f;
            wr3.n0 itemStatus4 = (wr3.n0) ((jz5.o) arrayList.get(i17)).f384375e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizMessage4, "bizMessage");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemStatus4, "itemStatus");
            fq1.e.h(fq1.e.f347040a, e0Var.f546324n, i65.a.b(e0Var.f546319f, 8), false, false, 12, null);
            android.content.Context context4 = e0Var.f546319f;
            wr3.t0 t0Var4 = e0Var.f546317d;
            android.view.View view13 = e0Var.f546320g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view13);
            android.view.View view14 = e0Var.f546321h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view14);
            android.view.View view15 = e0Var.f546324n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view15);
            android.widget.TextView textView4 = e0Var.f546322i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView4);
            android.view.View view16 = e0Var.f546323m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view16);
            wVar.h(context4, t0Var4, bizMessage4, view13, view14, view15, textView4, view16, new yr3.b0(e0Var, bizMessage4, itemStatus4, this.f530417r));
            return;
        }
        if (holder instanceof yr3.g0) {
            ((yr3.g0) holder).i((r45.s5) ((jz5.o) arrayList.get(i17)).f384376f, (wr3.n0) ((jz5.o) arrayList.get(i17)).f384375e, i17, this.f530417r, str, this.f530413n);
            return;
        }
        if (holder instanceof yr3.m0) {
            yr3.m0 m0Var = (yr3.m0) holder;
            r45.s5 bizMessage5 = (r45.s5) ((jz5.o) arrayList.get(i17)).f384376f;
            wr3.n0 itemStatus5 = (wr3.n0) ((jz5.o) arrayList.get(i17)).f384375e;
            boolean z28 = this.f530417r;
            int i28 = this.f530413n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizMessage5, "bizMessage");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemStatus5, "itemStatus");
            if (itemStatus5 == wr3.n0.f530375f || itemStatus5 == wr3.n0.f530379m) {
                wVar.l(bizMessage5, str);
            }
            fq1.e.h(fq1.e.f347040a, m0Var.f546473o, i65.a.b(m0Var.f546467f, 8), false, false, 12, null);
            android.content.Context context5 = m0Var.f546467f;
            wr3.t0 t0Var5 = m0Var.f546465d;
            android.view.View view17 = m0Var.f546468g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view17);
            android.view.View view18 = m0Var.f546469h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view18);
            android.view.View view19 = m0Var.f546473o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view19);
            android.widget.TextView textView5 = m0Var.f546470i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView5);
            android.view.View view20 = m0Var.f546471m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view20);
            wVar.h(context5, t0Var5, bizMessage5, view17, view18, view19, textView5, view20, new yr3.l0(m0Var, bizMessage5, itemStatus5, z28, i28));
            return;
        }
        if (holder instanceof yr3.h1) {
            yr3.h1 h1Var = (yr3.h1) holder;
            r45.s5 bizMessage6 = (r45.s5) ((jz5.o) arrayList.get(i17)).f384376f;
            wr3.n0 itemStatus6 = (wr3.n0) ((jz5.o) arrayList.get(i17)).f384375e;
            boolean z29 = this.f530417r;
            int i29 = this.f530413n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizMessage6, "bizMessage");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemStatus6, "itemStatus");
            wVar.l(bizMessage6, str);
            android.widget.TextView textView6 = h1Var.f546376i;
            android.text.TextPaint paint = textView6 != null ? textView6.getPaint() : null;
            if (paint != null) {
                paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            }
            android.text.TextPaint paint2 = textView6 != null ? textView6.getPaint() : null;
            if (paint2 != null) {
                paint2.setStrokeWidth(0.8f);
            }
            r45.p5 p5Var = bizMessage6.f467047i;
            r45.o5 o5Var = (p5Var == null || (linkedList2 = p5Var.f464287e) == null) ? null : (r45.o5) kz5.n0.a0(linkedList2, 0);
            r45.p5 p5Var2 = bizMessage6.f467047i;
            r45.o5 o5Var2 = (p5Var2 == null || (linkedList = p5Var2.f464287e) == null) ? null : (r45.o5) kz5.n0.a0(linkedList, 1);
            r45.p5 p5Var3 = bizMessage6.f467047i;
            java.util.LinkedList linkedList3 = p5Var3 != null ? p5Var3.f464287e : null;
            android.widget.TextView textView7 = h1Var.f546377m;
            if (linkedList3 == null || p5Var3.f464287e.size() < 2) {
                textView7.setVisibility(8);
            } else {
                textView7.setVisibility(0);
                textView7.setOnClickListener(new yr3.f1(h1Var));
            }
            yr3.e1 e1Var = h1Var.f546380p;
            boolean z37 = e1Var.f546329a.getVisibility() == 0;
            yr3.e1 e1Var2 = h1Var.f546381q;
            boolean z38 = e1Var2.f546329a.getVisibility() == 0;
            if (z37 && z38) {
                e1Var.f546334f.getViewTreeObserver().addOnGlobalLayoutListener(new yr3.g1(h1Var));
            }
            h1Var.i(bizMessage6, o5Var, z29, i29, i17, h1Var.f546380p);
            h1Var.i(bizMessage6, o5Var2, z29, i29, i17, h1Var.f546381q);
            android.view.View view21 = e1Var.f546329a;
            android.view.ViewGroup.LayoutParams layoutParams = view21.getLayoutParams();
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = layoutParams instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams ? (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams : null;
            boolean z39 = e1Var2.f546329a.getVisibility() == 0;
            if (layoutParams2 != null) {
                if (z39) {
                    layoutParams2.f92440r = com.p314xaae8f345.mm.R.id.syj;
                } else {
                    layoutParams2.f92441s = -1;
                    layoutParams2.f92440r = -1;
                }
                view21.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        wr3.o0 o0Var = wr3.o0.f530385e;
        if (i17 == 90) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a19, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new yr3.z(inflate);
        }
        wr3.o0 o0Var2 = wr3.o0.f530385e;
        if (i17 == 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a0x, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
            return new wr3.f2(this, inflate2);
        }
        wr3.o0 o0Var3 = wr3.o0.f530385e;
        if (i17 == 3) {
            android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a0w, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate3);
            return new yr3.i0(this, inflate3);
        }
        wr3.o0 o0Var4 = wr3.o0.f530385e;
        if (i17 == 1) {
            android.view.View inflate4 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a0y, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate4);
            return new yr3.k0(this, inflate4);
        }
        wr3.o0 o0Var5 = wr3.o0.f530385e;
        int i18 = this.f530413n;
        if (i17 == 4) {
            android.view.View inflate5 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a0g, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate5);
            return new yr3.y(this, inflate5, i18);
        }
        wr3.o0 o0Var6 = wr3.o0.f530385e;
        if (i17 == 5) {
            android.view.View inflate6 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a0t, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate6);
            return new yr3.e0(this, inflate6);
        }
        wr3.o0 o0Var7 = wr3.o0.f530385e;
        if (i17 == 6) {
            android.view.View inflate7 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dno, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate7);
            return new yr3.g0(this, inflate7);
        }
        wr3.o0 o0Var8 = wr3.o0.f530385e;
        if (i17 == 7) {
            android.view.View inflate8 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dpu, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate8);
            return new yr3.m0(this, inflate8);
        }
        wr3.o0 o0Var9 = wr3.o0.f530385e;
        if (i17 == 8) {
            android.view.View inflate9 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e3e, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate9);
            return new yr3.h1(this, inflate9, this.A, this.f530418s.g());
        }
        android.view.View inflate10 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a0g, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate10);
        return new yr3.y(this, inflate10, i18);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewAttachedToWindow */
    public void mo8160xd8bfd53(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder) {
        wr3.j jVar;
        java.util.LinkedList linkedList;
        r45.o5 o5Var;
        java.util.LinkedList linkedList2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8160xd8bfd53(holder);
        int m8183xf806b362 = holder.m8183xf806b362();
        sr3.a g17 = this.f530418s.g();
        sr3.a aVar = sr3.a.f493362e;
        android.content.Context context = this.f530412m;
        if (g17 == aVar && context != null && (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2) && !this.f530425z) {
            gr3.c.d((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2) context);
            this.f530425z = true;
        }
        if (m8183xf806b362 >= 0) {
            java.util.ArrayList arrayList = this.f530420u;
            if (m8183xf806b362 >= arrayList.size() || ((jz5.o) arrayList.get(m8183xf806b362)).f384374d == wr3.o0.f530385e || ((jz5.o) arrayList.get(m8183xf806b362)).f384374d == wr3.o0.f530389i) {
                return;
            }
            r45.p5 p5Var = ((r45.s5) ((jz5.o) arrayList.get(m8183xf806b362)).f384376f).f467047i;
            if (((p5Var == null || (linkedList2 = p5Var.f464287e) == null) ? 0 : linkedList2.size()) > 0) {
                int i17 = ((r45.s5) ((jz5.o) arrayList.get(m8183xf806b362)).f384376f).f467047i.f464286d.f460671d;
                r45.p5 p5Var2 = ((r45.s5) ((jz5.o) arrayList.get(m8183xf806b362)).f384376f).f467047i;
                java.lang.String str = (p5Var2 == null || (linkedList = p5Var2.f464287e) == null || (o5Var = (r45.o5) linkedList.get(0)) == null) ? null : o5Var.f463450h;
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f530414o;
                int i18 = !z3Var.n2() ? 1 : 0;
                wr3.j jVar2 = this.f530347d;
                if (((java.util.HashSet) jVar2.f530355a).contains(jVar2.a(i17, 0))) {
                    return;
                }
                if (this.f530417r) {
                    jVar = jVar2;
                    gr3.b bVar = gr3.b.f356380a;
                    bVar.b(java.lang.Long.valueOf(((r45.s5) ((jz5.o) arrayList.get(m8183xf806b362)).f384376f).f467042d.f472323d), 0L, 101L, bVar.a((wr3.n0) ((jz5.o) arrayList.get(m8183xf806b362)).f384375e), (r29 & 16) != 0 ? 0L : 0L, (r29 & 32) != 0 ? "" : str, this.f530413n, (r29 & 128) != 0 ? 0 : i18, (r29 & 256) != 0 ? 0 : 0);
                } else {
                    java.lang.String d17 = z3Var.d1();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                    jVar = jVar2;
                    gr3.e.d(d17, 107, this.f530415p, context instanceof android.app.Activity ? ((android.app.Activity) context).getIntent() : null, i18, 0, 0, str, null, null, 0, 0, 3936, null);
                }
                ((java.util.HashSet) jVar.f530355a).add(jVar.a(i17, 0));
            }
        }
    }

    @Override // wr3.i
    public int x() {
        return this.f530413n;
    }

    @Override // wr3.i
    public sr3.g y() {
        return this.f530418s;
    }

    @Override // wr3.i
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 z() {
        return this.f530414o;
    }
}
