package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes10.dex */
public final class jl extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 {

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f285803s = "ChattingItemFinderLiveNotifyTmpl";

    /* renamed from: t, reason: collision with root package name */
    public final java.util.HashMap f285804t;

    /* renamed from: u, reason: collision with root package name */
    public yb5.d f285805u;

    public jl() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f285804t = hashMap;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = xe5.g0.f535559g;
        hashMap.put("TipsTempl_MultiReason_Live", new xe5.g0());
        int i17 = xe5.f.f535554i;
        hashMap.put("TipsTempl_GamePurchaseTeamUp_Live", new xe5.f());
        int i18 = xe5.g.f535557i;
        hashMap.put("TipsTempl_GamePurchaseRefund_Success", new xe5.g());
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view == null || view.getTag() == null) {
            view = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570020uk);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.fl flVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.fl(this.f285804t);
            flVar.f285512c = view.findViewById(com.p314xaae8f345.mm.R.id.bkn);
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.bkf);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type android.widget.CheckBox");
            flVar.f39492x5b9aa3a3 = (android.widget.CheckBox) findViewById;
            flVar.f39496x10665fb1 = view.findViewById(com.p314xaae8f345.mm.R.id.bpa);
            flVar.f285513d = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21902xee4207b0) view.findViewById(com.p314xaae8f345.mm.R.id.vna);
            android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.f565229br1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            flVar.f39500xcbecde0f = (android.widget.TextView) findViewById2;
            java.util.Set entrySet = flVar.f285511b.entrySet();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
            java.util.Iterator it = entrySet.iterator();
            while (it.hasNext()) {
                xe5.i iVar = (xe5.i) ((xe5.h0) ((java.util.Map.Entry) it.next()).getValue());
                iVar.getClass();
                android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.odv);
                iVar.f535573a = findViewById3;
                if (findViewById3 != null) {
                    iVar.f535586n = (android.widget.ImageView) findViewById3.findViewById(com.p314xaae8f345.mm.R.id.fs7);
                    iVar.f535574b = (android.widget.ImageView) findViewById3.findViewById(com.p314xaae8f345.mm.R.id.kgj);
                    iVar.f535575c = (android.widget.TextView) findViewById3.findViewById(com.p314xaae8f345.mm.R.id.kgp);
                    iVar.f535576d = (android.widget.ImageView) findViewById3.findViewById(com.p314xaae8f345.mm.R.id.kgi);
                    iVar.f535577e = findViewById3.findViewById(com.p314xaae8f345.mm.R.id.kgo);
                    android.widget.TextView textView = (android.widget.TextView) findViewById3.findViewById(com.p314xaae8f345.mm.R.id.i0j);
                    iVar.f535578f = textView;
                    com.p314xaae8f345.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
                    iVar.f535579g = (android.widget.LinearLayout) findViewById3.findViewById(com.p314xaae8f345.mm.R.id.kgm);
                    iVar.f535580h = findViewById3.findViewById(com.p314xaae8f345.mm.R.id.f566404fs5);
                    iVar.f535581i = (android.widget.TextView) findViewById3.findViewById(com.p314xaae8f345.mm.R.id.kgs);
                    iVar.f535582j = findViewById3.findViewById(com.p314xaae8f345.mm.R.id.kgq);
                    iVar.f535583k = (android.widget.TextView) findViewById3.findViewById(com.p314xaae8f345.mm.R.id.kgg);
                    iVar.f535584l = (android.widget.TextView) findViewById3.findViewById(com.p314xaae8f345.mm.R.id.rac);
                    iVar.f535585m = (android.widget.LinearLayout) findViewById3.findViewById(com.p314xaae8f345.mm.R.id.rad);
                    android.view.View findViewById4 = findViewById3.findViewById(com.p314xaae8f345.mm.R.id.kgk);
                    iVar.f535587o = findViewById4;
                    boolean z17 = iVar.f535589q;
                    if (findViewById4 != null) {
                        int dimensionPixelOffset = view.getContext().getResources().getDimensionPixelOffset(z17 ? com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn : com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
                        findViewById4.setPadding(findViewById4.getPaddingLeft(), dimensionPixelOffset, findViewById4.getPaddingRight(), dimensionPixelOffset);
                    }
                    iVar.f535588p = findViewById3.findViewById(com.p314xaae8f345.mm.R.id.ums);
                    android.view.View view2 = iVar.f535580h;
                    if (view2 != null) {
                        view2.getLayoutParams().width = view.getContext().getResources().getDimensionPixelOffset(z17 ? com.p314xaae8f345.mm.R.C30860x5b28f31.f561202c6 : com.p314xaae8f345.mm.R.C30860x5b28f31.f561195c0);
                        view2.getLayoutParams().height = view.getContext().getResources().getDimensionPixelOffset(z17 ? com.p314xaae8f345.mm.R.C30860x5b28f31.f561214ch : com.p314xaae8f345.mm.R.C30860x5b28f31.f561208cc);
                        view2.requestLayout();
                    }
                }
            }
            view.setTag(flVar);
        }
        return view;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean N() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        if (item.getItemId() != 111) {
            return false;
        }
        if (!(ui6.g() instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f9Var);
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.j(), "msg", null);
        java.lang.String str = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_id");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        long Z = pm0.v.Z(str);
        java.lang.String str2 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_nonce_id");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 ml6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ml(Z, str2 == null ? "" : str2, 65, false, true, "", new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.hl(this, ui6));
        d0(false, f9Var);
        if (ml6 == null) {
            return true;
        }
        e0(ui6, ml6);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        java.lang.Object tag = v17.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
        int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) tag).d();
        yb5.d dVar = this.f285805u;
        boolean z17 = false;
        if (dVar != null && !dVar.F()) {
            z17 = true;
        }
        if (z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f9Var);
            java.util.Map d18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.j(), "msg", null);
            java.lang.String str = (java.lang.String) d18.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_id");
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            long Z = pm0.v.Z(str);
            java.lang.String str2 = (java.lang.String) d18.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.live_id");
            long Z2 = pm0.v.Z(str2 != null ? str2 : "");
            if (Z == 0 || Z2 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f285803s, "onCreateContextMenu feedId:" + Z + ", liveId:" + Z2);
            } else {
                d0(true, f9Var);
                yb5.d dVar2 = this.f285805u;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar2);
                menu.c(d17, 111, 0, dVar2.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
            }
            menu.c(d17, 100, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return false;
    }

    public final void d0(boolean z17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var != null ? f9Var.j() : null, "msg", null);
        java.lang.String str = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.live_id");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_id");
        ((b92.y0) ((m40.i0) i95.n0.c(m40.i0.class))).wi(z17, kz5.c1.i(new jz5.l("share_scene", "6"), new jz5.l("liveid", str), new jz5.l("feedid", str2 != null ? str2 : "")));
    }

    public final void e0(yb5.d dVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        zy2.db dbVar = (zy2.db) i95.n0.c(zy2.db.class);
        android.app.Activity g17 = dVar.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(g17, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ((b92.s2) dbVar).Di((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) g17, c19792x256d2725, null, 1, 6, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.il(c19792x256d2725));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public com.p314xaae8f345.mm.p2621x8fb0427b.a9 i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a componentProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(componentProvider, "componentProvider");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gl glVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gl(f9Var);
        com.p314xaae8f345.mm.p2621x8fb0427b.a9 a9Var = f9Var != null ? f9Var.f275460g2 : null;
        if (!(a9Var instanceof com.p314xaae8f345.mm.p2621x8fb0427b.o5)) {
            return glVar;
        }
        ((com.p314xaae8f345.mm.p2621x8fb0427b.oa) ((com.p314xaae8f345.mm.p2621x8fb0427b.o5) a9Var)).C = glVar;
        return a9Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 holder, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.e6 e6Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        this.f285805u = ui6;
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.j(), "msg", null);
        if (d17 == null) {
            return;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.templateid");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f285803s, "tmplId = " + str2);
        xe5.i0 i0Var = (xe5.i0) this.f285804t.get(str2);
        if (i0Var != null) {
            java.lang.String str3 = (java.lang.String) d17.get(".msg.fromusername");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str3 == null) {
                str3 = "";
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 u17 = u(ui6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u17, "getLongClickListener(...)");
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(msgData, str3);
            erVar.f285441d = holder;
            xe5.i iVar = ((xe5.g0) i0Var).f535561b;
            iVar.getClass();
            android.view.View view = iVar.f535573a;
            if (view != null) {
                view.setOnLongClickListener(u17);
            }
            android.view.View view2 = iVar.f535573a;
            if (view2 != null) {
                view2.setTag(erVar);
            }
            sb5.z zVar = (sb5.z) ui6.f542241c.a(sb5.z.class);
            if (zVar != null && (e6Var = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).B1) != null) {
                iVar.getClass();
                android.view.View view3 = iVar.f535573a;
                if (view3 != null) {
                    view3.setOnTouchListener(e6Var);
                }
            }
            i0Var.a((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.fl) holder, d17, f9Var, ui6);
        }
    }
}
