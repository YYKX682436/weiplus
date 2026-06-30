package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class da extends com.tencent.mm.ui.component.UIComponent implements s82.h {
    public java.util.ArrayList A;
    public java.util.ArrayList B;
    public java.util.ArrayList C;
    public boolean D;
    public android.view.View E;
    public java.lang.String F;
    public final android.widget.AdapterView.OnItemLongClickListener G;
    public java.lang.String H;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f100576d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f100577e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f100578f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f100579g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f100580h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f100581i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.gallery.h0 f100582m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.adapter.c f100583n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.c3 f100584o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.fav.ui.ra f100585p;

    /* renamed from: q, reason: collision with root package name */
    public final int[] f100586q;

    /* renamed from: r, reason: collision with root package name */
    public o72.r2 f100587r;

    /* renamed from: s, reason: collision with root package name */
    public w82.k f100588s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f100589t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f100590u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f100591v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f100592w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f100593x;

    /* renamed from: y, reason: collision with root package name */
    public final o72.i4 f100594y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashSet f100595z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(androidx.appcompat.app.AppCompatActivity context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f100576d = "";
        this.f100577e = jz5.h.b(new com.tencent.mm.plugin.fav.ui.n9(context));
        this.f100578f = jz5.h.b(new com.tencent.mm.plugin.fav.ui.o9(context));
        this.f100579g = jz5.h.b(new com.tencent.mm.plugin.fav.ui.p9(context));
        this.f100580h = jz5.h.b(new com.tencent.mm.plugin.fav.ui.m9(context));
        this.f100581i = jz5.h.b(new com.tencent.mm.plugin.fav.ui.l9(context));
        this.f100585p = new com.tencent.mm.plugin.fav.ui.ra(context, 16);
        this.f100586q = new int[2];
        this.f100589t = new java.util.ArrayList();
        this.f100594y = new o72.b3();
        this.f100595z = new java.util.HashSet();
        this.A = new java.util.ArrayList();
        this.B = new java.util.ArrayList();
        this.C = new java.util.ArrayList();
        this.F = "";
        this.G = new com.tencent.mm.plugin.fav.ui.u9(this);
        this.H = "";
    }

    public static final void O6(com.tencent.mm.plugin.fav.ui.da daVar, android.view.View view, int i17, o72.r2 r2Var) {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(daVar.getContext());
        u1Var.g(daVar.getContext().getString(com.tencent.mm.R.string.c_j));
        u1Var.j(daVar.getContext().getString(com.tencent.mm.R.string.c_c));
        u1Var.n(daVar.getContext().getString(com.tencent.mm.R.string.caz));
        u1Var.c(com.tencent.mm.plugin.fav.ui.w9.f101517a, new com.tencent.mm.plugin.fav.ui.x9(daVar, view, i17, r2Var));
        u1Var.q(false);
    }

    @Override // s82.h
    public void F4(long j17, boolean z17) {
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = this.f100583n;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
        if (cVar.f100484q) {
            w82.k kVar = this.f100588s;
            kotlin.jvm.internal.o.d(kVar);
            com.tencent.mm.plugin.fav.ui.adapter.c cVar2 = this.f100583n;
            if (cVar2 == null) {
                kotlin.jvm.internal.o.o("mResultAdapter");
                throw null;
            }
            kVar.b(cVar2.l() > 0);
            if (getActivity() instanceof com.tencent.mm.plugin.fav.ui.FavBaseUI) {
                androidx.appcompat.app.AppCompatActivity activity = getActivity();
                kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.ui.FavBaseUI");
                com.tencent.mm.plugin.fav.ui.FavBaseUI favBaseUI = (com.tencent.mm.plugin.fav.ui.FavBaseUI) activity;
                com.tencent.mm.plugin.fav.ui.adapter.c cVar3 = this.f100583n;
                if (cVar3 != null) {
                    favBaseUI.Z6(cVar3.l());
                } else {
                    kotlin.jvm.internal.o.o("mResultAdapter");
                    throw null;
                }
            }
        }
    }

    public final boolean P6() {
        com.tencent.mm.plugin.fav.ui.c3 c3Var = this.f100584o;
        if (c3Var == null) {
            kotlin.jvm.internal.o.o("mFavFinderManager");
            throw null;
        }
        if (c3Var.b().f416403d) {
            com.tencent.mm.plugin.fav.ui.c3 c3Var2 = this.f100584o;
            if (c3Var2 != null) {
                c3Var2.b().P6();
                return true;
            }
            kotlin.jvm.internal.o.o("mFavFinderManager");
            throw null;
        }
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = this.f100583n;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
        if (cVar.f100484q) {
            cVar.g(false, null);
            R6().setOnItemLongClickListener(this.G);
            w82.k kVar = this.f100588s;
            kotlin.jvm.internal.o.d(kVar);
            kVar.c();
            if (getActivity() instanceof com.tencent.mm.plugin.fav.ui.FavBaseUI) {
                androidx.appcompat.app.AppCompatActivity activity = getActivity();
                kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.ui.FavBaseUI");
                ((com.tencent.mm.plugin.fav.ui.FavBaseUI) activity).b7();
            }
            return true;
        }
        com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var = this.f100582m;
        if (h0Var == null) {
            kotlin.jvm.internal.o.o("mFavGallery");
            throw null;
        }
        if (h0Var.f100953m.getVisibility() != 8) {
            com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var2 = this.f100582m;
            if (h0Var2 == null) {
                kotlin.jvm.internal.o.o("mFavGallery");
                throw null;
            }
            if (h0Var2.a()) {
                com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var3 = this.f100582m;
                if (h0Var3 != null) {
                    h0Var3.i();
                    return true;
                }
                kotlin.jvm.internal.o.o("mFavGallery");
                throw null;
            }
        }
        return false;
    }

    public final android.widget.ListView Q6() {
        java.lang.Object value = ((jz5.n) this.f100577e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.ListView) value;
    }

    public final android.widget.ListView R6() {
        java.lang.Object value = ((jz5.n) this.f100578f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.ListView) value;
    }

    public final android.view.View S6() {
        java.lang.Object value = ((jz5.n) this.f100579g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final int T6() {
        boolean z17 = !this.B.isEmpty();
        boolean z18 = !this.A.isEmpty();
        boolean z19 = !this.C.isEmpty();
        if (z17 && z18 && z19) {
            return 7;
        }
        if (z19 && z18) {
            return 6;
        }
        if (z17 && z18) {
            return 5;
        }
        if (z17 && z19) {
            return 4;
        }
        if (z18) {
            return 3;
        }
        return z19 ? 2 : 1;
    }

    public final void U6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", "[refreshNormalResult]");
        Q6().setVisibility(8);
        com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var = this.f100582m;
        if (h0Var == null) {
            kotlin.jvm.internal.o.o("mFavGallery");
            throw null;
        }
        h0Var.g(8);
        com.tencent.mm.plugin.fav.ui.c3 c3Var = this.f100584o;
        if (c3Var == null) {
            kotlin.jvm.internal.o.o("mFavFinderManager");
            throw null;
        }
        c3Var.f100537d.setVisibility(8);
        c3Var.f100543m = false;
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = this.f100583n;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
        if (cVar.isEmpty()) {
            android.view.View S6 = S6();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(S6, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopSearchUIC", "refreshNormalResult", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            S6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(S6, "com/tencent/mm/plugin/fav/ui/FavTopSearchUIC", "refreshNormalResult", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            R6().setVisibility(8);
            return;
        }
        android.view.View S62 = S6();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(S62, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopSearchUIC", "refreshNormalResult", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        S62.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(S62, "com/tencent/mm/plugin/fav/ui/FavTopSearchUIC", "refreshNormalResult", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        R6().setVisibility(0);
    }

    public final void V6(o72.r2 info) {
        kotlin.jvm.internal.o.g(info, "info");
        java.util.List u17 = o72.x1.u();
        java.util.List I7 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj().I7(this.B, this.C, this.A);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("fav_card_origin_index", java.lang.Integer.valueOf(u17.indexOf(java.lang.Long.valueOf(info.field_localId))));
        hashMap.put("fav_card_filted_index", java.lang.Integer.valueOf(I7.indexOf(java.lang.Long.valueOf(info.field_localId))));
        hashMap.put("fav_ts", java.lang.Long.valueOf(info.field_updateTime));
        hashMap.put("card_fav_type", java.lang.Integer.valueOf(info.field_type));
        hashMap.put("fav_homepage_sessionid", this.H);
        java.lang.String join = android.text.TextUtils.join(",", this.B);
        kotlin.jvm.internal.o.f(join, "join(...)");
        hashMap.put("query_word", join);
        hashMap.put("fav_res_method", java.lang.Integer.valueOf(T6()));
        hashMap.put("search_result_cnt", java.lang.Integer.valueOf(I7.size()));
        hashMap.put("queryid", this.F);
        java.lang.Integer d17 = com.tencent.mm.plugin.fav.ui.u1.d(info.field_type, info.field_favProto);
        kotlin.jvm.internal.o.f(d17, "getGeneralMsgType(...)");
        hashMap.put("general_msg_type", d17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("favHomePage", "fav_search_res_clk", hashMap, 32903);
    }

    public final boolean W6(java.util.List list) {
        return !com.tencent.mm.sdk.platformtools.t8.L0(list) && list.contains(21);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x0075. Please report as an issue. */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> arrayList;
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.fav.ui.da daVar;
        int i19;
        com.tencent.mm.plugin.fav.ui.da daVar2 = this;
        super.onActivityResult(i17, i18, intent);
        if (daVar2.f100590u) {
            com.tencent.mm.plugin.fav.ui.c3 c3Var = daVar2.f100584o;
            if (c3Var == null) {
                kotlin.jvm.internal.o.o("mFavFinderManager");
                throw null;
            }
            if (c3Var.f100543m) {
                return;
            }
            if (i18 != -1) {
                if (i17 == 4105) {
                    android.app.Activity context = getContext();
                    com.tencent.mm.plugin.fav.ui.adapter.c cVar = daVar2.f100583n;
                    if (cVar != null) {
                        com.tencent.mm.plugin.fav.ui.ec.f(context, "", cVar.k(false), false);
                        return;
                    } else {
                        kotlin.jvm.internal.o.o("mResultAdapter");
                        throw null;
                    }
                }
                if (i17 == 4106 && daVar2.f100587r != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    o72.r2 r2Var = daVar2.f100587r;
                    kotlin.jvm.internal.o.d(r2Var);
                    arrayList2.add(r2Var);
                    com.tencent.mm.plugin.fav.ui.ec.f(getContext(), "", arrayList2, false);
                    return;
                }
                return;
            }
            kotlin.jvm.internal.o.d(intent);
            java.lang.String stringExtra = intent.getStringExtra("custom_send_text");
            java.lang.String stringExtra2 = intent.getStringExtra("Select_Conv_User");
            if (i17 == 1) {
                if (i18 != -1) {
                    return;
                }
                com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var = daVar2.f100582m;
                if (h0Var == null) {
                    kotlin.jvm.internal.o.o("mFavGallery");
                    throw null;
                }
                java.util.List list = h0Var.f100964x;
                kotlin.jvm.internal.o.f(list, "getTransList(...)");
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                    return;
                }
                kotlin.jvm.internal.o.d(stringExtra2);
                java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1((java.lang.String[]) new r26.t(",").g(stringExtra2, 0).toArray(new java.lang.String[0]));
                kotlin.jvm.internal.o.f(P1, "stringsToList(...)");
                java.util.ArrayList arrayList3 = (java.util.ArrayList) list;
                java.util.Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    if (new o72.b3().b(((com.tencent.mm.plugin.fav.ui.gallery.b1) it.next()).f100898b, true, true)) {
                        db5.e1.T(getContext(), daVar2.getString(com.tencent.mm.R.string.f489705e));
                        return;
                    }
                }
                java.util.Iterator it6 = arrayList3.iterator();
                boolean z17 = false;
                while (it6.hasNext()) {
                    com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var = (com.tencent.mm.plugin.fav.ui.gallery.b1) it6.next();
                    com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", "FavTopSearchUIC.onActivityResult: select %s for sending", stringExtra2);
                    boolean d17 = b1Var.d();
                    java.util.Iterator it7 = it6;
                    r45.gp0 gp0Var = b1Var.f100898b;
                    if (d17 || b1Var.c()) {
                        arrayList = P1;
                        str = stringExtra;
                        str2 = stringExtra2;
                        com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", "FavTopSearchUIC.onActivityResult VIDEO: dataType=%d, cdnDataUrl=%s, cdnDataKey=%s, cdnThumbUrl=%s, cdnThumbKey=%s, orgnPath=%s, orgnThumbPath=%s", java.lang.Integer.valueOf(gp0Var.I), gp0Var.f375434s, gp0Var.f375438u, gp0Var.f375412h, gp0Var.f375420m, gp0Var.V, gp0Var.X);
                        if (com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375434s) || com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375438u)) {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append("type:");
                            sb6.append(gp0Var.I);
                            sb6.append(";cdnDataUrl:");
                            sb6.append(gp0Var.f375434s);
                            sb6.append(";cdnDataKey:");
                            sb6.append(gp0Var.f375438u);
                            sb6.append(";cdnThumbUrl:");
                            sb6.append(gp0Var.f375412h);
                            sb6.append(";cdnThumbKey:");
                            sb6.append(gp0Var.f375420m);
                            sb6.append(";orgnPath:");
                            sb6.append(gp0Var.V);
                            sb6.append(";orgnThumbPath:");
                            sb6.append(gp0Var.X);
                            sb6.append(";is_data_empty:true");
                            pm0.z.a(com.tencent.mm.plugin.report.service.d1.f158158b, "fav_top_search_send_video_field_missing", true, null, null, false, false, new com.tencent.mm.plugin.fav.ui.q9(sb6), 60, null);
                        }
                        daVar = this;
                        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(getContext(), "", daVar.getString(com.tencent.mm.R.string.cax), true, false, null);
                        kotlin.jvm.internal.o.f(Q, "showProgressDlg(...)");
                        com.tencent.mm.plugin.fav.ui.s9 s9Var = new com.tencent.mm.plugin.fav.ui.s9(Q);
                        java.util.Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            com.tencent.mm.plugin.fav.ui.x5.k(getContext(), (java.lang.String) it8.next(), gp0Var, s9Var);
                        }
                    } else {
                        str2 = stringExtra2;
                        str = stringExtra;
                        arrayList = P1;
                        com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", "FavTopSearchUIC.onActivityResult IMG: dataType=%d, cdnDataUrl=%s, cdnDataKey=%s, cdnThumbUrl=%s, cdnThumbKey=%s, orgnPath=%s, orgnThumbPath=%s", java.lang.Integer.valueOf(gp0Var.I), gp0Var.f375434s, gp0Var.f375438u, gp0Var.f375412h, gp0Var.f375420m, gp0Var.V, gp0Var.X);
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375434s) || com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375438u);
                        boolean z19 = com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375412h) || com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375420m);
                        if (z18 || z19) {
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                            sb7.append("type:");
                            sb7.append(gp0Var.I);
                            sb7.append(";cdnDataUrl:");
                            sb7.append(gp0Var.f375434s);
                            sb7.append(";cdnDataKey:");
                            sb7.append(gp0Var.f375438u);
                            sb7.append(";cdnThumbUrl:");
                            sb7.append(gp0Var.f375412h);
                            sb7.append(";cdnThumbKey:");
                            sb7.append(gp0Var.f375420m);
                            sb7.append(";orgnPath:");
                            sb7.append(gp0Var.V);
                            sb7.append(";orgnThumbPath:");
                            sb7.append(gp0Var.X);
                            if (z18) {
                                sb7.append(";is_data_empty:true");
                            }
                            if (z19) {
                                sb7.append(";is_image_thumb_empty:true");
                            }
                            pm0.z.a(com.tencent.mm.plugin.report.service.d1.f158158b, "fav_top_search_send_img_field_missing", true, null, null, false, false, new com.tencent.mm.plugin.fav.ui.r9(sb7), 60, null);
                        }
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(o72.x1.x(gp0Var));
                        for (java.lang.String str3 : arrayList) {
                            java.util.Iterator it9 = arrayList4.iterator();
                            while (it9.hasNext()) {
                                java.lang.String str4 = (java.lang.String) it9.next();
                                c01.f7 b17 = o72.l2.b(gp0Var);
                                if (b17 != null) {
                                    b17.V(o72.x1.X(gp0Var));
                                }
                                k70.i0 i0Var = new k70.i0();
                                i0Var.f304642a = 3;
                                i0Var.f304657p = b17;
                                if (b17 != null && b17.y()) {
                                    i19 = 1;
                                    kotlin.jvm.internal.o.d(str4);
                                    java.lang.String r17 = c01.z1.r();
                                    kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
                                    r70.g gVar = new r70.g(str4, i19, r17, str3, i0Var);
                                    gVar.f393106h = 0;
                                    gVar.f393108j = "fav_top_send_img";
                                    ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(gVar);
                                }
                                i19 = 0;
                                kotlin.jvm.internal.o.d(str4);
                                java.lang.String r172 = c01.z1.r();
                                kotlin.jvm.internal.o.f(r172, "getUsernameFromUserInfo(...)");
                                r70.g gVar2 = new r70.g(str4, i19, r172, str3, i0Var);
                                gVar2.f393106h = 0;
                                gVar2.f393108j = "fav_top_send_img";
                                ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(gVar2);
                            }
                        }
                        daVar = this;
                    }
                    it6 = it7;
                    daVar2 = daVar;
                    stringExtra2 = str2;
                    stringExtra = str;
                    z17 = true;
                    P1 = arrayList;
                }
                java.util.ArrayList<java.lang.String> arrayList5 = P1;
                java.lang.String str5 = stringExtra;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                    for (java.lang.String str6 : arrayList5) {
                        ((dk5.s5) tg3.t1.a()).fj(str6, str5, c01.e2.C(str6), 0);
                    }
                }
                if (z17) {
                    com.tencent.mm.ui.widget.snackbar.j.c(getContext().getString(com.tencent.mm.R.string.c9u), null, getContext(), null, null);
                }
            } else if (i17 != 305) {
                switch (i17) {
                    case 4104:
                        if (intent.getBooleanExtra("key_fav_need_show_tips", false)) {
                            db5.t7.i(getContext(), i65.a.r(getContext(), com.tencent.mm.R.string.c_7), com.tencent.mm.R.raw.toast_ok);
                            break;
                        }
                        break;
                    case 4105:
                        com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", "select %s for sending", stringExtra2);
                        android.app.Activity context2 = getContext();
                        com.tencent.mm.plugin.fav.ui.adapter.c cVar2 = daVar2.f100583n;
                        if (cVar2 == null) {
                            kotlin.jvm.internal.o.o("mResultAdapter");
                            throw null;
                        }
                        com.tencent.mm.plugin.fav.ui.ec.b(context2, cVar2.k(false), stringExtra, stringExtra2, "MicroMsg.FavSearchManager");
                        break;
                    case 4106:
                        com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", "select %s for sending", stringExtra2);
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        o72.r2 r2Var2 = daVar2.f100587r;
                        kotlin.jvm.internal.o.d(r2Var2);
                        arrayList6.add(r2Var2);
                        com.tencent.mm.plugin.fav.ui.ec.b(getContext(), arrayList6, stringExtra, stringExtra2, "MicroMsg.FavSearchManager");
                        break;
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", "requestCode = EDIT_TAG_REQUEST_CODE, call update tag");
                com.tencent.mm.plugin.fav.ui.adapter.c cVar3 = daVar2.f100583n;
                if (cVar3 == null) {
                    kotlin.jvm.internal.o.o("mResultAdapter");
                    throw null;
                }
                cVar3.c();
                com.tencent.mm.plugin.fav.ui.adapter.c cVar4 = daVar2.f100583n;
                if (cVar4 == null) {
                    kotlin.jvm.internal.o.o("mResultAdapter");
                    throw null;
                }
                cVar4.notifyDataSetChanged();
            }
            P6();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        if (P6()) {
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        if (getContext() instanceof com.tencent.mm.plugin.fav.ui.FavBaseUI) {
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.ui.FavBaseUI");
            java.lang.CharSequence title = ((com.tencent.mm.plugin.fav.ui.FavBaseUI) context).getTitle();
            if (title == null || (str = title.toString()) == null) {
                str = "";
            }
            this.f100576d = str;
            if (str.length() == 0) {
                java.lang.String string = getContext().getString(com.tencent.mm.R.string.f491198cb1);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                this.f100576d = string;
            }
        }
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = new com.tencent.mm.plugin.fav.ui.adapter.c(getContext(), this.f100585p, false);
        this.f100583n = cVar;
        cVar.K = new com.tencent.mm.plugin.fav.ui.j9(this);
        cVar.F = 2;
        cVar.f100492y = this;
        cVar.I = R6();
        android.widget.ListView R6 = R6();
        com.tencent.mm.plugin.fav.ui.adapter.c cVar2 = this.f100583n;
        if (cVar2 == null) {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
        R6.setAdapter((android.widget.ListAdapter) cVar2);
        R6().setOnItemLongClickListener(this.G);
        R6().setClickable(true);
        R6().setOnTouchListener(new com.tencent.mm.plugin.fav.ui.k9(this));
        R6().setOnItemClickListener(new com.tencent.mm.plugin.fav.ui.i9(this));
        w82.k kVar = new w82.k();
        this.f100588s = kVar;
        kVar.a(findViewById(com.tencent.mm.R.id.dtg));
        w82.k kVar2 = this.f100588s;
        kotlin.jvm.internal.o.d(kVar2);
        kVar2.f443903k = new com.tencent.mm.plugin.fav.ui.e9(this);
        java.util.List v07 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().v0();
        kotlin.jvm.internal.o.f(v07, "getFavLocalIdList(...)");
        this.f100589t = v07;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        android.app.Activity context = getContext();
        java.lang.Object value = ((jz5.n) this.f100580h).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var = new com.tencent.mm.plugin.fav.ui.gallery.h0(context, (android.view.View) value, this.f100585p);
        this.f100582m = h0Var;
        h0Var.f100963w = new com.tencent.mm.plugin.fav.ui.t9(this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.dxs);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.app.Activity context2 = getContext();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        this.f100584o = new com.tencent.mm.plugin.fav.ui.c3((android.widget.FrameLayout) findViewById, (com.tencent.mm.ui.MMActivity) context2);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f100593x = false;
        this.f100591v = null;
        this.f100592w = null;
        com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var = this.f100582m;
        if (h0Var == null) {
            kotlin.jvm.internal.o.o("mFavGallery");
            throw null;
        }
        h0Var.c();
        this.f100585p.f();
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = this.f100583n;
        if (cVar != null) {
            cVar.f100478J.dead();
        } else {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = this.f100583n;
        if (cVar != null) {
            cVar.f100490w = true;
        } else {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = this.f100583n;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
        cVar.f100490w = false;
        if (cVar.f100491x) {
            cVar.notifyDataSetChanged();
        }
    }
}
