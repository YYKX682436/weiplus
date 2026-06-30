package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class qa extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f286873s;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570084wu);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ka kaVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ka();
        kaVar.a(xgVar, false);
        xgVar.setTag(kaVar);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d D0;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        java.lang.String j17 = f9Var.j();
        java.lang.String str2 = null;
        ot0.q v17 = j17 != null ? ot0.q.v(j17) : null;
        int itemId = menuItem.getItemId();
        if (itemId != 111) {
            if (itemId != 131) {
                return false;
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ra.a(dVar, menuItem, f9Var);
            return false;
        }
        if (v17 != null && (str = v17.f430227p) != null && str.length() > 0 && (D0 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().D0(v17.f430227p)) != null) {
            str2 = D0.f68099xfeae815;
        }
        android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
        intent.putExtra("Retr_Msg_content", f9Var.j());
        intent.putExtra("Retr_File_Name", str2);
        intent.putExtra("Retr_Msg_Type", 16);
        intent.putExtra("Retr_Msg_Id", f9Var.m124847x74d37ac6());
        intent.putExtra("Retr_MsgTalker", f9Var.Q0());
        intent.putExtra("scene_from", 17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dVar.a0((android.content.Intent) arrayList.get(0));
        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        if (view == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgToImg", "[onCreateContextMenu] v is null");
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        if (erVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgToImg", "[onCreateContextMenu] tag is null");
            return false;
        }
        int d17 = erVar.d();
        f9Var.j();
        ot0.q v17 = ot0.q.v(c01.w9.l(this.f286873s.D(), f9Var.j(), f9Var.A0()));
        if (v17 != null) {
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str = v17.f430179d;
            ((kt.c) i0Var).getClass();
            if (((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).nj(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(str, false, false)) && !c01.ia.x(f9Var)) {
                g4Var.c(d17, 111, 0, this.f286873s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
            }
        }
        j45.l.g("favorite");
        g4Var.c(d17, 116, 0, this.f286873s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
        if (f9Var.P0() != 5) {
            android.view.MenuItem c17 = g4Var.c(d17, 131, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b2d), com.p314xaae8f345.mm.R.raw.f79857xfd4f1a25);
            int[] iArr = new int[2];
            int width = view.getWidth();
            int height = view.getHeight();
            view.getLocationInWindow(iArr);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("img_gallery_width", width).putExtra("img_gallery_height", height).putExtra("img_gallery_left", iArr[0]).putExtra("img_gallery_top", iArr[1]);
            ((db5.h4) c17).B = intent;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564 c5348xb8e1a564 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564();
        long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
        am.b6 b6Var = c5348xb8e1a564.f135674g;
        b6Var.f87752a = m124847x74d37ac6;
        b6Var.f87753b = f9Var.Q0();
        c5348xb8e1a564.e();
        if (c5348xb8e1a564.f135675h.f87869a) {
            g4Var.c(d17, 129, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3x), com.p314xaae8f345.mm.R.raw.f79841xc8521962);
        }
        if (!f9Var.t2() && f9Var.o2() && ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(f9Var, this.f286873s) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(f9Var.Q0()))) {
            g4Var.c(d17, 123, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
        }
        if (!this.f286873s.F()) {
            g4Var.c(d17, 100, 0, this.f286873s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        int i17;
        int i18;
        int i19;
        if (view == null) {
            return true;
        }
        java.lang.String j17 = f9Var.j();
        ot0.q v17 = j17 != null ? ot0.q.v(j17) : null;
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgToImg", "content is null");
            return true;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int width = view.getWidth();
        int height = view.getHeight();
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = v17.f430179d;
        ((kt.c) i0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m j18 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(str, false, false);
        if (j18 != null) {
            i17 = height;
            i18 = 0;
            i19 = width;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.e(dVar, v17, c01.z1.r(), j18, f9Var.I0(), dVar.x());
        } else {
            i17 = height;
            i18 = 0;
            i19 = width;
        }
        java.lang.String str2 = v17.f430227p;
        if (str2 == null || str2.length() <= 0) {
            java.lang.String str3 = v17.f430207k;
            if (str3 != null && str3.length() > 0) {
                java.lang.String wi6 = ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).wi(v17.f430207k, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
                android.content.pm.PackageInfo j19 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.j(dVar.g(), v17.f430179d);
                boolean z17 = i18;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.n(dVar, wi6, wi6, j19 == null ? null : j19.versionName, j19 == null ? i18 : j19.versionCode, v17.f430179d, false, f9Var.m124847x74d37ac6(), f9Var.I0(), f9Var, v17, A(dVar, f9Var));
                return z17;
            }
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d D0 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().D0(v17.f430227p);
            if (D0 != null) {
                if (f9Var.A0() == 1) {
                    java.lang.String str4 = D0.f68099xfeae815;
                    if (!com.p314xaae8f345.mm.vfs.w6.j(str4)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgToImg", "onItemClick::bigImgPath: %s, msgId: %d, msgSvrId: %d", str4, java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Long.valueOf(f9Var.I0()));
                        android.content.Intent intent = new android.content.Intent();
                        intent.setClassName(dVar.g(), "com.tencent.mm.ui.chatting.ResourcesExceedUI");
                        intent.putExtra("clean_view_type", 1);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "onItemClick", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        dVar.a0((android.content.Intent) arrayList.get(i18));
                        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "onItemClick", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } else if (str4 != null && !str4.equals("") && com.p314xaae8f345.mm.vfs.w6.j(str4)) {
                        long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
                        long I0 = f9Var.I0();
                        java.lang.String Q0 = f9Var.Q0();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgToImg", "[ImageGalleryUI] enter");
                        android.content.Intent intent2 = new android.content.Intent(this.f286873s.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.class);
                        intent2.putExtra("img_gallery_msg_id", m124847x74d37ac6);
                        intent2.putExtra("img_gallery_talker", Q0);
                        intent2.putExtra("img_gallery_left", iArr[i18]);
                        intent2.putExtra("img_gallery_top", iArr[1]);
                        intent2.putExtra("img_gallery_width", i19);
                        intent2.putExtra("img_gallery_height", i17);
                        java.lang.String x17 = this.f286873s.x();
                        java.lang.String A = A(this.f286873s, f9Var);
                        android.os.Bundle bundle = new android.os.Bundle();
                        if (this.f286873s.D()) {
                            bundle.putInt("stat_scene", 2);
                        } else {
                            bundle.putInt("stat_scene", c01.e2.G(x17) ? 7 : 1);
                        }
                        bundle.putString("stat_msg_id", "msg_" + java.lang.Long.toString(I0));
                        bundle.putString("stat_chat_talker_username", x17);
                        bundle.putString("stat_send_msg_user", A);
                        intent2.putExtra("_stat_obj", bundle);
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bm.a(intent2, this.f286873s.g());
                        yb5.d dVar2 = this.f286873s;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent2);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(dVar2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "showImg", "(Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;[III)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        dVar2.a0((android.content.Intent) arrayList2.get(i18));
                        yj0.a.f(dVar2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "showImg", "(Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;[III)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                }
                return true;
            }
        }
        return i18;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6
    public void d(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var.k2()) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.z(f9Var);
            c01.w9.f(f9Var.m124847x74d37ac6(), f9Var.Q0());
            dVar.L(true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        int i17;
        int i18;
        ot0.q qVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ka kaVar;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        int r17;
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = dVar2.f475787d.f526833b;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ka kaVar2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ka) g0Var;
        this.f286873s = dVar;
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f7) ((sb5.e0) dVar.f542241c.a(sb5.e0.class))).n0(f9Var2);
        java.lang.String U1 = f9Var2.U1();
        ot0.q v17 = ot0.q.v(U1);
        if (v17 != null) {
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str4 = v17.f430179d;
            int i19 = v17.G;
            ((kt.c) i0Var).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m i27 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.i(str4, i19);
            java.lang.String str5 = (i27 == null || (str3 = i27.f67372x453d1e07) == null || str3.trim().length() <= 0) ? v17.H : i27.f67372x453d1e07;
            java.lang.String str6 = v17.f430179d;
            if (str6 == null || str6.length() <= 0 || !com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.y(str5)) {
                kaVar2.f285849c.setVisibility(8);
            } else {
                kaVar2.f285849c.setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Vi(dVar.g(), i27, str5));
                kaVar2.f285849c.setVisibility(0);
                if (i27 == null || !i27.k()) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.r(dVar, kaVar2.f285849c, v17.f430179d);
                } else {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.p(dVar, kaVar2.f285849c, f9Var2, v17, i27.f67386xa1e9e82c, f9Var2.I0());
                }
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.w(dVar, kaVar2.f285849c, v17.f430179d);
            }
            if (v17.f430199i == 2) {
                kaVar2.f285848b.setVisibility(0);
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d D0 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().D0(v17.f430227p);
                java.lang.String z07 = f9Var2.z0();
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                if (D0 != null) {
                    str2 = D0.f68099xfeae815;
                    bool = java.lang.Boolean.TRUE;
                } else {
                    str2 = z07;
                }
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                i17 = 0;
                i18 = 8;
                qVar = v17;
                java.lang.String str7 = str2;
                kaVar = kaVar2;
                f9Var = f9Var2;
                if (!m11.b1.Di().A4(f9Var2, kaVar2.f285848b, str7, bool.booleanValue(), i65.a.g(dVar.g()), v17.S, v17.R, true, com.p314xaae8f345.mm.R.C30861xcebc809e.bzt, kaVar2.f285854h, com.p314xaae8f345.mm.R.C30861xcebc809e.f562680lw, 0, true, null)) {
                    kaVar.f285848b.setImageResource(com.p314xaae8f345.mm.R.raw.f78779x4cfb7a6d);
                    kaVar.f285848b.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.pa(this, kaVar));
                }
                kaVar.f39493x8ad70635.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, dVar.D(), kaVar, null));
                kaVar.f39493x8ad70635.setOnClickListener(w(dVar));
                kaVar.f39493x8ad70635.setOnLongClickListener(u(dVar));
                kaVar.f39493x8ad70635.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).B1);
                r17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.r(U1);
                if (r17 != -1 || r17 >= 100 || qVar.f430215m <= 0 || f9Var.P0() == 5) {
                    android.view.View view = kaVar.f285851e;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(i18));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(i17)).intValue());
                    yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    kaVar.f285848b.setAlpha(255);
                    kaVar.f285848b.setBackgroundDrawable(null);
                } else {
                    android.view.View view2 = kaVar.f285851e;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(java.lang.Integer.valueOf(i17));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(i17)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    kaVar.f285850d.setText("" + r17 + "%");
                    kaVar.f285848b.setAlpha(64);
                    kaVar.f285848b.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bmq);
                }
                V(kaVar, dVar2, dVar.t(), dVar.D(), dVar, this);
            }
        }
        i17 = 0;
        i18 = 8;
        qVar = v17;
        kaVar = kaVar2;
        f9Var = f9Var2;
        kaVar.f39493x8ad70635.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, dVar.D(), kaVar, null));
        kaVar.f39493x8ad70635.setOnClickListener(w(dVar));
        kaVar.f39493x8ad70635.setOnLongClickListener(u(dVar));
        kaVar.f39493x8ad70635.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).B1);
        r17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.r(U1);
        if (r17 != -1) {
        }
        android.view.View view3 = kaVar.f285851e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(i17)).intValue());
        yj0.a.f(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        kaVar.f285848b.setAlpha(255);
        kaVar.f285848b.setBackgroundDrawable(null);
        V(kaVar, dVar2, dVar.t(), dVar.D(), dVar, this);
    }
}
