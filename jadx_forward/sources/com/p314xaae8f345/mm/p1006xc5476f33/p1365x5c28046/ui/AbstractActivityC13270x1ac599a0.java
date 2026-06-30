package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* renamed from: com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI */
/* loaded from: classes15.dex */
public abstract class AbstractActivityC13270x1ac599a0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13278x5c32d846 implements android.widget.AdapterView.OnItemClickListener, com.p314xaae8f345.mm.p944x882e457a.u0, l75.q0, db5.l5, android.widget.AbsListView.OnScrollListener, db5.k5, db5.j5, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.h0, ec0.e, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.i0 {
    public static java.util.Map H;
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d A;
    public z12.l D;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13320x2d86e362 f179178f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f179179g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19697x5d42833e f179180h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ListView f179181i;

    /* renamed from: m, reason: collision with root package name */
    public j12.b f179182m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.GestureDetectorOnGestureListenerC21510x15ed9d8c f179183n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f179184o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f179185p;

    /* renamed from: s, reason: collision with root package name */
    public boolean f179188s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f179189t;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f179190u;

    /* renamed from: v, reason: collision with root package name */
    public android.app.ProgressDialog f179191v;

    /* renamed from: w, reason: collision with root package name */
    public z12.t f179192w;

    /* renamed from: x, reason: collision with root package name */
    public int f179193x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.s f179194y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.j0 f179195z;

    /* renamed from: q, reason: collision with root package name */
    public boolean f179186q = false;

    /* renamed from: r, reason: collision with root package name */
    public int f179187r = -1;
    public boolean B = true;
    public boolean C = true;
    public boolean E = false;
    public java.util.LinkedList F = new java.util.LinkedList();
    public java.util.LinkedList G = new java.util.LinkedList();

    /* renamed from: com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI$EmotionStatusChangeL */
    /* loaded from: classes15.dex */
    public class EmotionStatusChangeL extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4> {
        public EmotionStatusChangeL() {
            super(com.p314xaae8f345.mm.app.a0.f134821d);
            this.f39173x3fe91575 = 449099204;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4 c5327x7bab71d4) {
            j12.f fVar;
            am.t4 t4Var = c5327x7bab71d4.f135640g;
            java.lang.String str = t4Var.f89512a;
            int i17 = t4Var.f89513b;
            int i18 = t4Var.f89514c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0 abstractActivityC13270x1ac599a0 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0.this;
            j12.b bVar = abstractActivityC13270x1ac599a0.f179182m;
            if (bVar == null || (fVar = bVar.f378685e) == null) {
                return false;
            }
            if (i17 == 6) {
                abstractActivityC13270x1ac599a0.r7(str, i18);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "product status:%d", java.lang.Integer.valueOf(i17));
                abstractActivityC13270x1ac599a0.s7(str, i17);
            }
            fVar.g(str);
            return false;
        }
    }

    @Override // db5.j5
    public boolean A5() {
        return false;
    }

    @Override // db5.k5
    public boolean E0() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.h0
    public void E5(i12.c cVar) {
        r45.zj0 zj0Var;
        java.lang.String valueOf;
        r45.zj0 zj0Var2;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = cVar.e();
        j12.i iVar = cVar.f368704c;
        if (android.text.TextUtils.isEmpty((iVar == null || (zj0Var2 = iVar.f378700b) == null) ? null : java.lang.String.valueOf(zj0Var2.A))) {
            valueOf = "";
        } else {
            j12.i iVar2 = cVar.f368704c;
            valueOf = (iVar2 == null || (zj0Var = iVar2.f378700b) == null) ? null : java.lang.String.valueOf(zj0Var.A);
        }
        objArr[1] = valueOf;
        objArr[2] = java.lang.Integer.valueOf(cVar.f());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "[onProductClick] productId:%s, productPrice:%s, productStatus:%d", objArr);
        if (cVar.f() == 9) {
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572116z4);
            if (isFinishing()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "[showLoadingDialog] acitivity is finished.");
            } else {
                this.f179191v = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), string, true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.d(this));
            }
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6419xd51df726 Z6 = Z6(2, null);
        if ((this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13368x4f5eb0ab) && Z6 != null) {
            this.f179195z.f179099k = Z6;
        }
        this.f179195z.c(cVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.i0
    public void I0(boolean z17) {
        this.f179190u = null;
        this.f179187r = -1;
        p7(z17, false);
    }

    @Override // db5.l5
    public boolean J6() {
        p7(true, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "[onBottomLoadData] startLoadRemoteEmoji.");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13278x5c32d846
    public void T6(android.os.Message message) {
        r45.we3 we3Var;
        int i17 = message.what;
        if (i17 == 2002) {
            java.lang.String str = (java.lang.String) message.obj;
            if (isFinishing()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "[updateLoadingDialog] acitivity is finished.");
                return;
            }
            android.app.ProgressDialog progressDialog = this.f179191v;
            if (progressDialog != null) {
                progressDialog.setMessage(str);
                return;
            }
            return;
        }
        if (i17 == 20001) {
            android.app.ProgressDialog progressDialog2 = this.f179191v;
            if (progressDialog2 == null || !progressDialog2.isShowing()) {
                return;
            }
            this.f179191v.dismiss();
            return;
        }
        if (i17 == 65537 && (we3Var = (r45.we3) message.obj) != null) {
            r45.cu5 cu5Var = we3Var.f470617d;
            if (cu5Var != null) {
                cu5Var.mo75928xcd1e8d8();
            }
            c7();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().e().J0(c7(), we3Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13278x5c32d846
    public void U6(android.os.Message message) {
        java.lang.String string;
        java.lang.String string2;
        switch (message.what) {
            case 131074:
                j12.b bVar = this.f179182m;
                if (bVar == null) {
                    return;
                }
                bVar.notifyDataSetChanged();
                return;
            case 131075:
                if (this.f179182m == null || message.getData() == null || (string = message.getData().getString("product_id")) == null) {
                    return;
                }
                this.f179182m.r(string, message.getData().getInt("progress"));
                return;
            case 131076:
                if (this.f179182m == null || message.getData() == null || (string2 = message.getData().getString("product_id")) == null) {
                    return;
                }
                this.f179182m.s(string2, message.getData().getInt("status"));
                return;
            default:
                return;
        }
    }

    public void V6(z12.l lVar) {
        r7(lVar.f550853f, 0);
    }

    public void W6(int i17, int i18, java.lang.String str, z12.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.s sVar;
        if (tVar != null) {
            if (tVar.f550895f == c7()) {
                this.f179188s = false;
                android.view.View view = this.f179189t;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "dealNetGetEmotionList", "(IILjava/lang/String;Lcom/tencent/mm/plugin/emoji/net/NetSceneGetEmotionList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "dealNetGetEmotionList", "(IILjava/lang/String;Lcom/tencent/mm/plugin/emoji/net/NetSceneGetEmotionList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                try {
                    sVar = z12.t.I(tVar.J());
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.emoji.BaseEmojiStoreUI", "deal NetGetEmotionList error:%s", e17.toString());
                    sVar = null;
                }
                if (sVar != null) {
                    if (i17 == 0 || i17 == 4) {
                        android.view.View view2 = this.f179184o;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "dealNetGetEmotionList", "(IILjava/lang/String;Lcom/tencent/mm/plugin/emoji/net/NetSceneGetEmotionList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "dealNetGetEmotionList", "(IILjava/lang/String;Lcom/tencent/mm/plugin/emoji/net/NetSceneGetEmotionList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        this.f179186q = false;
                        this.f179190u = tVar.f550902p;
                        if (i18 == 0) {
                            r45.we3 J2 = tVar.J();
                            h7(sVar, false, true);
                            if (this.f179187r == -1) {
                                android.os.Message obtain = android.os.Message.obtain();
                                obtain.what = 65537;
                                obtain.obj = J2;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.r rVar = this.f179227d;
                                if (rVar != null) {
                                    rVar.mo50308x2936bf5f(obtain);
                                }
                            }
                            this.f179187r = 0;
                            return;
                        }
                        if (i18 == 2) {
                            r45.we3 J3 = tVar.J();
                            q7(this.f179187r, sVar, false, false);
                            j12.c.b(this.f179182m.f378685e, this);
                            if (this.f179187r == -1) {
                                android.os.Message obtain2 = android.os.Message.obtain();
                                obtain2.what = 65537;
                                obtain2.obj = J3;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.r rVar2 = this.f179227d;
                                if (rVar2 != null) {
                                    rVar2.mo50308x2936bf5f(obtain2);
                                }
                            }
                            this.f179187r = 2;
                            return;
                        }
                        if (i18 == 3) {
                            q7(this.f179187r, sVar, false, false);
                            this.f179187r = 1;
                            return;
                        }
                        android.view.View view3 = this.f179184o;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "dealNetGetEmotionListUnKnow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "dealNetGetEmotionListUnKnow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        this.f179186q = true;
                        if (c7() == 7) {
                            this.f179185p.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bzv);
                            return;
                        } else {
                            this.f179185p.setText(com.p314xaae8f345.mm.R.C30867xcad56011.byu);
                            return;
                        }
                    }
                }
                if (this.E) {
                    return;
                }
                android.view.View view4 = this.f179184o;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "dealNetGetEmotionListErr", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "dealNetGetEmotionListErr", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f179186q = true;
                this.f179185p.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu);
                return;
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(c7());
        objArr[1] = java.lang.Integer.valueOf(tVar != null ? tVar.f550895f : -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "no some scene type. this ui type:%d callbak type:%d", objArr);
    }

    public void X6(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.s sVar, boolean z18, boolean z19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.s sVar2;
        r45.hj0 hj0Var;
        if (this.f179194y == null || !z17) {
            return;
        }
        if (j7() && (sVar2 = this.f179194y) != null && (hj0Var = sVar2.f179134c) != null && hj0Var.f457743d != null) {
            java.util.LinkedList linkedList = (java.util.LinkedList) sVar2.f179135d;
            this.F = linkedList;
            java.util.LinkedList linkedList2 = (java.util.LinkedList) sVar2.f179136e;
            this.G = linkedList2;
            if (linkedList != null) {
                this.f179178f.d(linkedList, linkedList2);
            } else {
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                this.F = linkedList3;
                linkedList3.add(this.f179194y.f179134c);
                this.f179178f.d(this.F, this.G);
            }
        }
        j12.b bVar = this.f179182m;
        if (bVar != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new j12.a(bVar, this.f179194y));
        }
        if (this.B) {
            this.B = false;
            ku5.u0 u0Var = ku5.t0.f394148d;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0 abstractActivityC13270x1ac599a0 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0.this;
                    abstractActivityC13270x1ac599a0.C = false;
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6419xd51df726 Z6 = abstractActivityC13270x1ac599a0.Z6(1, null);
                    if (Z6 != null) {
                        Z6.k();
                    }
                }
            };
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(runnable, 500L, false);
        }
    }

    /* renamed from: Y6 */
    public abstract int getM();

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6419xd51df726 Z6(int i17, j22.j jVar) {
        return null;
    }

    /* renamed from: a7 */
    public byte[] getK() {
        return null;
    }

    public int b7(byte[] bArr) {
        return this.f179193x;
    }

    public abstract int c7();

    public abstract int d7();

    public int e7() {
        return 0;
    }

    public void f7(j12.i iVar, int i17) {
        if (iVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "item is null.");
            return;
        }
        boolean g17 = this.f179182m.g(i17);
        if (iVar.f378699a == j12.h.cellset) {
            r45.kj0 kj0Var = iVar.f378702d;
            if (kj0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "banner set is null. do nothing");
                return;
            } else {
                y12.m.a(mo55332x76847179(), kj0Var, false);
                return;
            }
        }
        r45.zj0 zj0Var = iVar.f378700b;
        if (zj0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "summary is null. do nothing");
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("to_talker_name");
        if (!(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13368x4f5eb0ab)) {
            y12.m.e(mo55332x76847179(), zj0Var, false, getM(), iVar.f378704f, iVar.f378703e, stringExtra, d7(), g17);
            return;
        }
        j22.j jVar = new j22.j(i17, zj0Var.f473663f, zj0Var, iVar.f378709k);
        y12.m.c(mo55332x76847179(), zj0Var, false, getM(), iVar.f378704f, iVar.f378703e, stringExtra, d7(), Z6(4, jVar), g17);
        m7(3, jVar);
    }

    public void g7() {
        j12.b l76 = l7();
        this.f179182m = l76;
        l76.f378686f = this;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a7q;
    }

    public void h7(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.s sVar, boolean z17, boolean z18) {
        if (sVar != null && sVar.f179133b.size() > 0) {
            this.E = true;
            android.view.View view = this.f179184o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "initData", "(Lcom/tencent/mm/plugin/emoji/model/EmotionListReqModel;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "initData", "(Lcom/tencent/mm/plugin/emoji/model/EmotionListReqModel;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f179186q = false;
        }
        q7(this.f179187r, sVar, z17, z18);
        j12.c.b(this.f179182m.f378685e, this);
    }

    @Override // ec0.e
    public void i3(java.util.ArrayList arrayList) {
        j12.b bVar = this.f179182m;
        if (bVar == null) {
            return;
        }
        j12.c.a(arrayList, bVar.f378685e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.s sVar = this.f179228e;
        if (sVar != null) {
            sVar.mo50303x856b99f0(131074);
            this.f179228e.mo50305x3d8a09a2(131074);
        }
    }

    public void i7() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.GestureDetectorOnGestureListenerC21510x15ed9d8c gestureDetectorOnGestureListenerC21510x15ed9d8c = (com.p314xaae8f345.mm.ui.p2642x2e06d1.GestureDetectorOnGestureListenerC21510x15ed9d8c) findViewById(com.p314xaae8f345.mm.R.id.ill);
        this.f179183n = gestureDetectorOnGestureListenerC21510x15ed9d8c;
        if (gestureDetectorOnGestureListenerC21510x15ed9d8c == null) {
            return;
        }
        gestureDetectorOnGestureListenerC21510x15ed9d8c.m79098x563f5e7a(false);
        this.f179183n.m79079xcab5c565(this);
        this.f179183n.m79090x3b8dba10(this);
        this.f179183n.m79078x1c273745(this);
        this.f179183n.m79082x1e1922a0(false);
        this.f179183n.m79085xcc8bf2ed(false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.e(this, null));
        g7();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.dez);
        this.f179184o = findViewById;
        this.f179185p = (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.df9);
        android.view.View inflate = getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a7p, (android.view.ViewGroup) null);
        this.f179189t = inflate;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "initMoreBottom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "initMoreBottom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (j7()) {
            this.f179178f = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13320x2d86e362(mo55332x76847179());
        }
        if (k7()) {
            this.f179179g = android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a8s, (android.view.ViewGroup) null);
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13320x2d86e362.a(mo55332x76847179())[0];
            this.f179179g.setLayoutParams(new android.widget.AbsListView.LayoutParams(i17, ((i17 * 3) / 8) + 1));
            this.f179180h = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19697x5d42833e) this.f179179g.findViewById(com.p314xaae8f345.mm.R.id.d_q);
        }
        android.widget.ListView listView = (android.widget.ListView) findViewById(android.R.id.list);
        this.f179181i = listView;
        listView.setOnItemClickListener(this);
        if (j7()) {
            this.f179181i.addHeaderView(this.f179178f);
        } else if (k7()) {
            this.f179181i.addHeaderView(this.f179179g);
        }
        this.f179181i.addFooterView(this.f179189t);
        this.f179181i.setAdapter((android.widget.ListAdapter) this.f179182m);
        this.f179181i.setOnScrollListener(this);
        this.f179182m.getClass();
        i7();
    }

    public boolean j7() {
        return !(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13309xb24c3226);
    }

    public boolean k7() {
        return false;
    }

    public abstract j12.b l7();

    public void m7(int i17, j22.j jVar) {
    }

    public void n7(z12.t tVar) {
    }

    public void o7() {
        if (isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "[showLoadingDialog] acitivity is finished.");
        } else {
            this.f179191v = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.c(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        this.f179195z.b(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13278x5c32d846, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f179195z = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.j0();
        mo43517x10010bd5();
        this.f179193x = getIntent().getIntExtra("preceding_scence", 2);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b() != null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().add(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0.EmotionStatusChangeL emotionStatusChangeL = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0.EmotionStatusChangeL();
        this.A = emotionStatusChangeL;
        emotionStatusChangeL.mo48813x58998cd();
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.j0 j0Var = this.f179195z;
        j0Var.f179092d = this;
        j0Var.f179089a = this.f179182m;
        j0Var.f179094f = getM();
        this.f179195z.f179095g = this;
        p7(false, false);
        if (H == null) {
            H = new java.util.HashMap();
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) H).put(getClass().toString(), java.lang.Long.valueOf(currentTimeMillis));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13278x5c32d846, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13320x2d86e362 c13320x2d86e362;
        super.onDestroy();
        j12.b bVar = this.f179182m;
        if (bVar != null) {
            bVar.a();
            this.f179182m = null;
        }
        if (j7() && (c13320x2d86e362 = this.f179178f) != null) {
            i12.c0 c0Var = c13320x2d86e362.f179382i;
            if (c0Var != null) {
                java.util.LinkedList linkedList = c0Var.f368728e;
                if (linkedList != null) {
                    linkedList.clear();
                }
                java.util.ArrayList arrayList = c0Var.f368732i;
                if (arrayList != null) {
                    arrayList.clear();
                }
                c0Var.f368731h = true;
                c0Var.f368733m.f368698a = null;
                c13320x2d86e362.f179382i = null;
            }
            c13320x2d86e362.f179385o = null;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().mo49775xc84af884(this);
        this.A.mo48814x2efc64();
        gm0.j1.n().f354821b.d(this.D);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.j0 j0Var = this.f179195z;
        if (j0Var != null) {
            j0Var.f179089a = null;
            j0Var.f179095g = null;
            j0Var.f179092d = null;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (j7() || k7()) {
            if (i17 == 0) {
                yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            i17--;
        }
        if (i17 < 0 || i17 >= this.f179182m.getCount()) {
            yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        } else {
            f7(this.f179182m.getItem(i17), i17);
            yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        if (android.text.TextUtils.isEmpty(str) || !str.equals("delete_group")) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.s sVar = this.f179228e;
        if (sVar != null) {
            sVar.mo50303x856b99f0(131074);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.s sVar2 = this.f179228e;
        if (sVar2 != null) {
            sVar2.mo50307xb9e94560(131074, 50);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13320x2d86e362 c13320x2d86e362;
        super.onPause();
        gm0.j1.n().f354821b.q(411, this);
        gm0.j1.n().f354821b.q(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60877x93282336, this);
        gm0.j1.n().f354821b.q(413, this);
        gm0.j1.n().f354821b.q(717, this);
        gm0.j1.n().f354821b.d(this.f179192w);
        if (j7() && (c13320x2d86e362 = this.f179178f) != null && c13320x2d86e362.f179385o != null) {
            c13320x2d86e362.f179386p = false;
            c13320x2d86e362.f179385o.mo50303x856b99f0(0);
        }
        this.C = true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        j12.f fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13320x2d86e362 c13320x2d86e362;
        super.onResume();
        gm0.j1.n().f354821b.a(411, this);
        gm0.j1.n().f354821b.a(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60877x93282336, this);
        gm0.j1.n().f354821b.a(413, this);
        gm0.j1.n().f354821b.a(717, this);
        if (j7() && (c13320x2d86e362 = this.f179178f) != null) {
            c13320x2d86e362.e();
        }
        this.f179195z.f179090b = false;
        j12.b bVar = this.f179182m;
        if (bVar == null || (fVar = bVar.f378685e) == null) {
            return;
        }
        fVar.d();
        this.f179182m.m();
        if (this.C && (this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13368x4f5eb0ab)) {
            m7(1, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = android.text.TextUtils.isEmpty(str) ? "" : str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "jacks [onSceneEnd] errType:%d,errCode:%d,errMsg:%s", objArr);
        android.app.ProgressDialog progressDialog = this.f179191v;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f179191v.dismiss();
        }
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        if (mo808xfb85f7b0 == 411) {
            if (m1Var instanceof z12.t) {
                W6(i17, i18, str, (z12.t) m1Var);
                return;
            }
            return;
        }
        if (mo808xfb85f7b0 == 413) {
            z12.w wVar = (z12.w) m1Var;
            if (i17 == 0 && i18 == 0) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
                com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().L0(wVar.f550911f);
                android.os.Message message = new android.os.Message();
                message.what = 2002;
                message.obj = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572113z1);
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.s sVar = this.f179228e;
                if (sVar != null) {
                    sVar.mo50308x2936bf5f(message);
                }
            } else {
                android.os.Message message2 = new android.os.Message();
                message2.what = 2002;
                message2.obj = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bvr);
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.s sVar2 = this.f179228e;
                if (sVar2 != null) {
                    sVar2.mo50308x2936bf5f(message2);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.s sVar3 = this.f179228e;
            if (sVar3 != null) {
                sVar3.mo50307xb9e94560(20001, 800);
                return;
            }
            return;
        }
        if (mo808xfb85f7b0 != 423) {
            if (mo808xfb85f7b0 != 717) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.BaseEmojiStoreUI", "unknow scene type");
                return;
            } else {
                if (i17 == 0 && i18 == 0) {
                    this.f179190u = null;
                    p7(false, true);
                    return;
                }
                return;
            }
        }
        if (m1Var instanceof z12.l) {
            z12.l lVar = (z12.l) m1Var;
            if (i17 == 0 && i18 == 0) {
                V6(lVar);
                return;
            }
            java.lang.String str2 = lVar.f550853f;
            java.lang.String str3 = lVar.f550855h;
            java.lang.String str4 = lVar.f550854g;
            db5.e1.u(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.byo, str4), "", new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.a(this, str2, str3, str4, lVar.f550857m), new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.b(this));
            s7(lVar.f550853f, -1);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 0 && absListView.getLastVisiblePosition() == absListView.getCount() - 1) {
            if (this.f179187r == 0 || this.f179188s) {
                yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                return;
            } else {
                p7(true, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "[onScrollStateChanged] startLoadRemoteEmoji.");
            }
        }
        if (i17 == 0 && (this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13368x4f5eb0ab)) {
            m7(1, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }

    public void p7(boolean z17, boolean z18) {
        z12.t tVar;
        this.f179188s = true;
        if (z17) {
            android.view.View view = this.f179189t;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "startLoadRemoteEmoji", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "startLoadRemoteEmoji", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        byte[] bArr = this.f179190u;
        int c76 = c7();
        int b76 = b7(bArr);
        int e76 = e7();
        if (bArr != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "[startLoadRemoteEmoji] request buffer %s", bArr.toString());
            tVar = new z12.t(c76, bArr, b76, false);
            if (c76 == 7) {
                tVar.f550897h = e76;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "[startLoadRemoteEmoji] request buffer is null.");
            tVar = new z12.t(c76, b76);
            if (c76 == 7) {
                tVar.f550897h = e76;
            }
        }
        tVar.f550898i = getK();
        n7(tVar);
        this.f179192w = tVar;
        gm0.j1.n().f354821b.g(this.f179192w);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "[startLoadRemoteEmoji] doScene GetEmotionListNetScene");
        if (z17 || z18) {
            return;
        }
        o7();
    }

    public void q7(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.s sVar, boolean z17, boolean z18) {
        boolean z19 = true;
        if (i17 != -1) {
            if (i17 != 0) {
                if (i17 == 1) {
                    this.f179194y = sVar;
                } else if (i17 == 2) {
                    if (this.f179194y == null) {
                        this.f179194y = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.s();
                    }
                    if (sVar != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.s sVar2 = this.f179194y;
                        int i18 = sVar.f179132a;
                        sVar2.getClass();
                        sVar2.f179132a += i18;
                        this.f179194y.b(sVar.f179133b, 2);
                    }
                }
            }
            z19 = false;
        } else {
            this.f179194y = sVar;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.s sVar3 = this.f179194y;
        if (sVar3 != null) {
            sVar3.a();
        }
        X6(z19, this.f179194y, z17, z18);
    }

    public final void r7(java.lang.String str, int i17) {
        android.os.Message obtain = android.os.Message.obtain();
        obtain.getData().putString("product_id", str);
        obtain.getData().putInt("progress", i17);
        obtain.what = 131075;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.s sVar = this.f179228e;
        if (sVar != null) {
            sVar.mo50308x2936bf5f(obtain);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.i0
    public void s(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.D = new z12.l(str, str2, str3, str4, str5);
        gm0.j1.n().f354821b.g(this.D);
    }

    public final void s7(java.lang.String str, int i17) {
        android.os.Message obtain = android.os.Message.obtain();
        obtain.getData().putString("product_id", str);
        obtain.getData().putInt("status", i17);
        obtain.what = 131076;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.s sVar = this.f179228e;
        if (sVar != null) {
            sVar.mo50308x2936bf5f(obtain);
        }
    }
}
