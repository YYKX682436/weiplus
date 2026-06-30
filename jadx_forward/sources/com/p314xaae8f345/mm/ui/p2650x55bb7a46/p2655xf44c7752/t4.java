package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class t4 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.e implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4, wf0.u1, c01.i {

    /* renamed from: e, reason: collision with root package name */
    public java.util.HashMap f282932e;

    /* renamed from: f, reason: collision with root package name */
    public final c01.k f282933f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f282934g;

    public t4(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var) {
        super(k1Var);
        this.f282934g = false;
        this.f282932e = new java.util.HashMap();
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.o2.Ui().b(this, android.os.Looper.getMainLooper());
        this.f282933f = new c01.k();
    }

    @Override // c01.i
    public void P0() {
    }

    @Override // c01.i
    public void U5() {
    }

    @Override // c01.i
    public void V3() {
    }

    @Override // c01.i
    public void g3() {
    }

    @Override // wf0.u1
    public void h(wf0.r1 r1Var) {
        java.util.HashMap hashMap;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p8 p8Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        t21.v2 p17;
        java.lang.String str = r1Var.f527062a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (hashMap = this.f282932e) == null || (p8Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p8) hashMap.get(str)) == null || (f9Var = p8Var.f282802a) == null || f9Var.z0() == null || !f9Var.z0().equals(str) || (p17 = p(f9Var)) == null) {
            return;
        }
        if (f9Var.z2() || p17.f496544i == 198) {
            if (q(p8Var)) {
                dp.a.m125853x26a183b(this.f282419d.f282625g, com.p314xaae8f345.mm.R.C30867xcad56011.k78, 0).show();
                return;
            }
            return;
        }
        int g17 = t21.d3.g(p17);
        int i17 = p8Var.f282803b;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta k17 = k(i17);
        if (this.f282419d.f282625g.I7() == i17 && k17 != null) {
            k17.c();
            k17.f282964i.setVisibility(0);
            k17.c();
            k17.f282964i.m81381x3ae760af(g17);
        } else if (k17 == null) {
            return;
        }
        k17.d();
        if (g17 >= k17.f282964i.m81376xb588562e() && q(p8Var)) {
            r(f9Var, k17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.e
    public boolean i(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        super.i(taVar, f9Var, i17);
        android.graphics.Bitmap a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.a(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(f9Var, f9Var.z0(), false), 1.0f);
        java.util.HashMap hashMap = this.f282932e;
        if (hashMap != null) {
            hashMap.put(f9Var.z0(), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p8(f9Var, i17));
        }
        t(taVar, false);
        taVar.c();
        android.view.View view = (android.view.View) taVar.f282961f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", "filling", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;Lcom/tencent/mm/storage/MsgInfo;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", "filling", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;Lcom/tencent/mm/storage/MsgInfo;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        taVar.c();
        taVar.f282962g.setImageBitmap(a17);
        taVar.c();
        taVar.f282962g.setVisibility(0);
        taVar.c();
        android.view.View view2 = taVar.f282965j;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", "filling", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;Lcom/tencent/mm/storage/MsgInfo;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", "filling", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;Lcom/tencent/mm/storage/MsgInfo;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String z07 = f9Var.z0();
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(z07);
        taVar.f282965j.setTag(h17);
        r45.uf6 uf6Var = h17 == null ? null : h17.E;
        if (uf6Var == null) {
            taVar.f282966k.setVisibility(8);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uf6Var.f468866d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGallerySightHandler", " there is no attachurl, show more info btn");
            java.lang.String str = uf6Var.f468868f;
            java.lang.String str2 = uf6Var.f468869g;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                taVar.f282966k.setVisibility(8);
            } else {
                taVar.f282966k.setText(str);
                taVar.f282966k.setVisibility(0);
                taVar.f282966k.setTag(f9Var);
            }
        } else {
            taVar.f282966k.setVisibility(0);
            taVar.f282966k.setText(this.f282419d.f282625g.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j8h, java.lang.Integer.valueOf(uf6Var.f468867e)));
            java.lang.String string = this.f282419d.f282625g.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j8h);
            if (uf6Var.f468867e / 60 > 0) {
                string = string + this.f282419d.f282625g.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j8j, java.lang.Integer.valueOf(uf6Var.f468867e / 60));
            }
            if (uf6Var.f468867e % 60 > 0) {
                string = string + this.f282419d.f282625g.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j8k, java.lang.Integer.valueOf(uf6Var.f468867e % 60));
            }
            taVar.f282966k.setText(string + this.f282419d.f282625g.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j8i));
            taVar.f282966k.setTag(f9Var);
        }
        taVar.c();
        if (!(taVar.f282961f instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7)) {
            return true;
        }
        android.widget.TextView textView = taVar.f282966k;
        taVar.c();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v7.a(textView, (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7) taVar.f282961f);
        return true;
    }

    public final void n(t21.v2 v2Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar) {
        if (v2Var == null) {
            return;
        }
        t21.d3.B(v2Var.d());
        taVar.c();
        taVar.f282964i.setVisibility(0);
        taVar.c();
        taVar.f282964i.m81381x3ae760af(t21.d3.g(v2Var));
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.o2.Ui().b(this, android.os.Looper.getMainLooper());
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta v17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = this.f282419d;
        if (k1Var == null || (v17 = k1Var.v()) == null || v17.f282960e == null) {
            return false;
        }
        v17.c();
        if (v17.f282960e.getVisibility() != 0) {
            return false;
        }
        t(v17, true);
        return false;
    }

    public t21.v2 p(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String z07 = f9Var.z0();
        ((vf0.y1) x1Var).getClass();
        return t21.d3.h(z07);
    }

    public final boolean q(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p8 p8Var) {
        if (p8Var == null) {
            return false;
        }
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.o2.Ui().A(this);
        int I7 = this.f282419d.f282625g.I7();
        int i17 = p8Var.f282803b;
        if (I7 != i17) {
            this.f282419d.f282631p.m(i17);
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta k17 = k(i17);
        if (k17 == null) {
            return true;
        }
        k17.c();
        k17.f282964i.setVisibility(8);
        return true;
    }

    public final void r(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar) {
        if (this.f282934g) {
            return;
        }
        taVar.c();
        android.view.View view = taVar.f282965j;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f104104s, f9Var.z0(), false);
        ((rq3.k) ((cc0.l) i95.n0.c(cc0.l.class))).fj(rj6, f9Var.m124847x74d37ac6(), 3);
        if (f9Var.z2()) {
            dp.a.m125853x26a183b(this.f282419d.f282625g, com.p314xaae8f345.mm.R.C30867xcad56011.k78, 0).show();
            return;
        }
        if (rj6 == null || !com.p314xaae8f345.mm.vfs.w6.j(rj6)) {
            dp.a.m125853x26a183b(this.f282419d.f282625g, com.p314xaae8f345.mm.R.C30867xcad56011.k78, 0).show();
            return;
        }
        this.f282419d.f282625g.mo55332x76847179().getWindow().addFlags(128);
        java.lang.Boolean bool = (java.lang.Boolean) taVar.f282959d.get(rj6);
        if (bool == null || !bool.booleanValue()) {
            taVar.c();
            ((android.view.View) taVar.f282961f).setTag(rj6);
            taVar.c();
            taVar.f282963h.setVisibility(8);
            taVar.c();
            taVar.f282961f.mo69303x360802();
            if (this.f282419d.f282625g.M7(f9Var.m124847x74d37ac6()) == 3) {
                taVar.c();
                taVar.f282961f.mo69318x764d819b(true);
            } else {
                taVar.c();
                taVar.f282961f.mo69318x764d819b(false);
            }
            taVar.c();
            if (taVar.f282961f instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7) {
                taVar.c();
                ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7) taVar.f282961f).m69291xf400af4c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.E(f9Var));
            }
            taVar.c();
            taVar.f282961f.mo69327xab3268fe(rj6);
            taVar.c();
            if (taVar.f282961f.c(this.f282419d.f282625g.mo55332x76847179(), false)) {
                taVar.c();
                android.view.View view2 = (android.view.View) taVar.f282961f;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                taVar.c();
                taVar.f282962g.setVisibility(8);
            } else {
                taVar.c();
                taVar.f282963h.setVisibility(0);
                taVar.c();
                taVar.f282963h.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.s4(this, taVar));
                taVar.c();
                android.view.View view3 = (android.view.View) taVar.f282961f;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                taVar.c();
                taVar.f282962g.setVisibility(0);
            }
            this.f282933f.c(this);
        }
        taVar.c();
        android.view.View view4 = (android.view.View) taVar.f282961f;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void s() {
        android.util.SparseArray sparseArray = this.f282419d.f310004f;
        for (int i17 = 0; i17 < sparseArray.size(); i17++) {
            int keyAt = sparseArray.keyAt(i17);
            if (sparseArray.get(keyAt) != null && ((android.view.View) sparseArray.get(keyAt)).getTag() != null) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta) ((android.view.View) sparseArray.get(keyAt)).getTag();
                if (taVar.f282960e != null) {
                    taVar.c();
                    if (taVar.f282960e.getVisibility() == 0) {
                        taVar.c();
                        taVar.f282961f.mo69326x360a109e(null);
                        taVar.c();
                        if (((android.view.View) taVar.f282961f).getVisibility() == 0) {
                            t(taVar, false);
                            taVar.c();
                            if (taVar.f282961f != null) {
                                taVar.c();
                                taVar.f282961f.mo69303x360802();
                            }
                            this.f282933f.a();
                            this.f282419d.f282625g.mo55332x76847179().getWindow().clearFlags(128);
                        }
                    }
                }
            }
        }
    }

    public void t(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar, boolean z17) {
        if (taVar == null) {
            return;
        }
        taVar.c();
        taVar.f282964i.setVisibility(8);
        if (z17) {
            taVar.c();
            taVar.f282962g.setVisibility(8);
            taVar.c();
            android.view.View view = (android.view.View) taVar.f282961f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", "switchState", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", "switchState", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        taVar.c();
        taVar.f282962g.setVisibility(0);
        taVar.c();
        android.view.View view2 = (android.view.View) taVar.f282961f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", "switchState", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", "switchState", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
