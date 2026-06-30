package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public abstract class BaseEmojiStoreUI extends com.tencent.mm.plugin.emoji.ui.EmojiBaseActivity implements android.widget.AdapterView.OnItemClickListener, com.tencent.mm.modelbase.u0, l75.q0, db5.l5, android.widget.AbsListView.OnScrollListener, db5.k5, db5.j5, com.tencent.mm.plugin.emoji.model.h0, ec0.e, com.tencent.mm.plugin.emoji.model.i0 {
    public static java.util.Map H;
    public com.tencent.mm.sdk.event.IListener A;
    public z12.l D;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader f97645f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f97646g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.emoji.StoreBannerEmojiView f97647h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ListView f97648i;

    /* renamed from: m, reason: collision with root package name */
    public j12.b f97649m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMPullDownView f97650n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f97651o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f97652p;

    /* renamed from: s, reason: collision with root package name */
    public boolean f97655s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f97656t;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f97657u;

    /* renamed from: v, reason: collision with root package name */
    public android.app.ProgressDialog f97658v;

    /* renamed from: w, reason: collision with root package name */
    public z12.t f97659w;

    /* renamed from: x, reason: collision with root package name */
    public int f97660x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.model.s f97661y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.model.j0 f97662z;

    /* renamed from: q, reason: collision with root package name */
    public boolean f97653q = false;

    /* renamed from: r, reason: collision with root package name */
    public int f97654r = -1;
    public boolean B = true;
    public boolean C = true;
    public boolean E = false;
    public java.util.LinkedList F = new java.util.LinkedList();
    public java.util.LinkedList G = new java.util.LinkedList();

    /* loaded from: classes15.dex */
    public class EmotionStatusChangeL extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.EmotionStateChangeEvent> {
        public EmotionStatusChangeL() {
            super(com.tencent.mm.app.a0.f53288d);
            this.__eventId = 449099204;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.EmotionStateChangeEvent emotionStateChangeEvent) {
            j12.f fVar;
            am.t4 t4Var = emotionStateChangeEvent.f54107g;
            java.lang.String str = t4Var.f7979a;
            int i17 = t4Var.f7980b;
            int i18 = t4Var.f7981c;
            com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI baseEmojiStoreUI = com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI.this;
            j12.b bVar = baseEmojiStoreUI.f97649m;
            if (bVar == null || (fVar = bVar.f297152e) == null) {
                return false;
            }
            if (i17 == 6) {
                baseEmojiStoreUI.r7(str, i18);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "product status:%d", java.lang.Integer.valueOf(i17));
                baseEmojiStoreUI.s7(str, i17);
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

    @Override // com.tencent.mm.plugin.emoji.model.h0
    public void E5(i12.c cVar) {
        r45.zj0 zj0Var;
        java.lang.String valueOf;
        r45.zj0 zj0Var2;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = cVar.e();
        j12.i iVar = cVar.f287171c;
        if (android.text.TextUtils.isEmpty((iVar == null || (zj0Var2 = iVar.f297167b) == null) ? null : java.lang.String.valueOf(zj0Var2.A))) {
            valueOf = "";
        } else {
            j12.i iVar2 = cVar.f287171c;
            valueOf = (iVar2 == null || (zj0Var = iVar2.f297167b) == null) ? null : java.lang.String.valueOf(zj0Var.A);
        }
        objArr[1] = valueOf;
        objArr[2] = java.lang.Integer.valueOf(cVar.f());
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "[onProductClick] productId:%s, productPrice:%s, productStatus:%d", objArr);
        if (cVar.f() == 9) {
            java.lang.String string = getString(com.tencent.mm.R.string.f490583z4);
            if (isFinishing()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "[showLoadingDialog] acitivity is finished.");
            } else {
                this.f97658v = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), string, true, true, new com.tencent.mm.plugin.emoji.ui.d(this));
            }
        }
        com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct Z6 = Z6(2, null);
        if ((this instanceof com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3TopicUI) && Z6 != null) {
            this.f97662z.f97566k = Z6;
        }
        this.f97662z.c(cVar);
    }

    @Override // com.tencent.mm.plugin.emoji.model.i0
    public void I0(boolean z17) {
        this.f97657u = null;
        this.f97654r = -1;
        p7(z17, false);
    }

    @Override // db5.l5
    public boolean J6() {
        p7(true, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "[onBottomLoadData] startLoadRemoteEmoji.");
        return true;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.EmojiBaseActivity
    public void T6(android.os.Message message) {
        r45.we3 we3Var;
        int i17 = message.what;
        if (i17 == 2002) {
            java.lang.String str = (java.lang.String) message.obj;
            if (isFinishing()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "[updateLoadingDialog] acitivity is finished.");
                return;
            }
            android.app.ProgressDialog progressDialog = this.f97658v;
            if (progressDialog != null) {
                progressDialog.setMessage(str);
                return;
            }
            return;
        }
        if (i17 == 20001) {
            android.app.ProgressDialog progressDialog2 = this.f97658v;
            if (progressDialog2 == null || !progressDialog2.isShowing()) {
                return;
            }
            this.f97658v.dismiss();
            return;
        }
        if (i17 == 65537 && (we3Var = (r45.we3) message.obj) != null) {
            r45.cu5 cu5Var = we3Var.f389084d;
            if (cu5Var != null) {
                cu5Var.computeSize();
            }
            c7();
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.n5.f().e().J0(c7(), we3Var);
        }
    }

    @Override // com.tencent.mm.plugin.emoji.ui.EmojiBaseActivity
    public void U6(android.os.Message message) {
        java.lang.String string;
        java.lang.String string2;
        switch (message.what) {
            case 131074:
                j12.b bVar = this.f97649m;
                if (bVar == null) {
                    return;
                }
                bVar.notifyDataSetChanged();
                return;
            case 131075:
                if (this.f97649m == null || message.getData() == null || (string = message.getData().getString("product_id")) == null) {
                    return;
                }
                this.f97649m.r(string, message.getData().getInt("progress"));
                return;
            case 131076:
                if (this.f97649m == null || message.getData() == null || (string2 = message.getData().getString("product_id")) == null) {
                    return;
                }
                this.f97649m.s(string2, message.getData().getInt("status"));
                return;
            default:
                return;
        }
    }

    public void V6(z12.l lVar) {
        r7(lVar.f469320f, 0);
    }

    public void W6(int i17, int i18, java.lang.String str, z12.t tVar) {
        com.tencent.mm.plugin.emoji.model.s sVar;
        if (tVar != null) {
            if (tVar.f469362f == c7()) {
                this.f97655s = false;
                android.view.View view = this.f97656t;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "dealNetGetEmotionList", "(IILjava/lang/String;Lcom/tencent/mm/plugin/emoji/net/NetSceneGetEmotionList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "dealNetGetEmotionList", "(IILjava/lang/String;Lcom/tencent/mm/plugin/emoji/net/NetSceneGetEmotionList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                try {
                    sVar = z12.t.I(tVar.J());
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.emoji.BaseEmojiStoreUI", "deal NetGetEmotionList error:%s", e17.toString());
                    sVar = null;
                }
                if (sVar != null) {
                    if (i17 == 0 || i17 == 4) {
                        android.view.View view2 = this.f97651o;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "dealNetGetEmotionList", "(IILjava/lang/String;Lcom/tencent/mm/plugin/emoji/net/NetSceneGetEmotionList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "dealNetGetEmotionList", "(IILjava/lang/String;Lcom/tencent/mm/plugin/emoji/net/NetSceneGetEmotionList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        this.f97653q = false;
                        this.f97657u = tVar.f469369p;
                        if (i18 == 0) {
                            r45.we3 J2 = tVar.J();
                            h7(sVar, false, true);
                            if (this.f97654r == -1) {
                                android.os.Message obtain = android.os.Message.obtain();
                                obtain.what = 65537;
                                obtain.obj = J2;
                                com.tencent.mm.plugin.emoji.ui.r rVar = this.f97694d;
                                if (rVar != null) {
                                    rVar.sendMessage(obtain);
                                }
                            }
                            this.f97654r = 0;
                            return;
                        }
                        if (i18 == 2) {
                            r45.we3 J3 = tVar.J();
                            q7(this.f97654r, sVar, false, false);
                            j12.c.b(this.f97649m.f297152e, this);
                            if (this.f97654r == -1) {
                                android.os.Message obtain2 = android.os.Message.obtain();
                                obtain2.what = 65537;
                                obtain2.obj = J3;
                                com.tencent.mm.plugin.emoji.ui.r rVar2 = this.f97694d;
                                if (rVar2 != null) {
                                    rVar2.sendMessage(obtain2);
                                }
                            }
                            this.f97654r = 2;
                            return;
                        }
                        if (i18 == 3) {
                            q7(this.f97654r, sVar, false, false);
                            this.f97654r = 1;
                            return;
                        }
                        android.view.View view3 = this.f97651o;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "dealNetGetEmotionListUnKnow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "dealNetGetEmotionListUnKnow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        this.f97653q = true;
                        if (c7() == 7) {
                            this.f97652p.setText(com.tencent.mm.R.string.bzv);
                            return;
                        } else {
                            this.f97652p.setText(com.tencent.mm.R.string.byu);
                            return;
                        }
                    }
                }
                if (this.E) {
                    return;
                }
                android.view.View view4 = this.f97651o;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "dealNetGetEmotionListErr", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "dealNetGetEmotionListErr", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f97653q = true;
                this.f97652p.setText(com.tencent.mm.R.string.f490500wu);
                return;
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(c7());
        objArr[1] = java.lang.Integer.valueOf(tVar != null ? tVar.f469362f : -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "no some scene type. this ui type:%d callbak type:%d", objArr);
    }

    public void X6(boolean z17, com.tencent.mm.plugin.emoji.model.s sVar, boolean z18, boolean z19) {
        com.tencent.mm.plugin.emoji.model.s sVar2;
        r45.hj0 hj0Var;
        if (this.f97661y == null || !z17) {
            return;
        }
        if (j7() && (sVar2 = this.f97661y) != null && (hj0Var = sVar2.f97601c) != null && hj0Var.f376210d != null) {
            java.util.LinkedList linkedList = (java.util.LinkedList) sVar2.f97602d;
            this.F = linkedList;
            java.util.LinkedList linkedList2 = (java.util.LinkedList) sVar2.f97603e;
            this.G = linkedList2;
            if (linkedList != null) {
                this.f97645f.d(linkedList, linkedList2);
            } else {
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                this.F = linkedList3;
                linkedList3.add(this.f97661y.f97601c);
                this.f97645f.d(this.F, this.G);
            }
        }
        j12.b bVar = this.f97649m;
        if (bVar != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new j12.a(bVar, this.f97661y));
        }
        if (this.B) {
            this.B = false;
            ku5.u0 u0Var = ku5.t0.f312615d;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI baseEmojiStoreUI = com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI.this;
                    baseEmojiStoreUI.C = false;
                    com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct Z6 = baseEmojiStoreUI.Z6(1, null);
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

    public com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct Z6(int i17, j22.j jVar) {
        return null;
    }

    /* renamed from: a7 */
    public byte[] getK() {
        return null;
    }

    public int b7(byte[] bArr) {
        return this.f97660x;
    }

    public abstract int c7();

    public abstract int d7();

    public int e7() {
        return 0;
    }

    public void f7(j12.i iVar, int i17) {
        if (iVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "item is null.");
            return;
        }
        boolean g17 = this.f97649m.g(i17);
        if (iVar.f297166a == j12.h.cellset) {
            r45.kj0 kj0Var = iVar.f297169d;
            if (kj0Var == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "banner set is null. do nothing");
                return;
            } else {
                y12.m.a(getContext(), kj0Var, false);
                return;
            }
        }
        r45.zj0 zj0Var = iVar.f297167b;
        if (zj0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "summary is null. do nothing");
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("to_talker_name");
        if (!(this instanceof com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3TopicUI)) {
            y12.m.e(getContext(), zj0Var, false, getM(), iVar.f297171f, iVar.f297170e, stringExtra, d7(), g17);
            return;
        }
        j22.j jVar = new j22.j(i17, zj0Var.f392130f, zj0Var, iVar.f297176k);
        y12.m.c(getContext(), zj0Var, false, getM(), iVar.f297171f, iVar.f297170e, stringExtra, d7(), Z6(4, jVar), g17);
        m7(3, jVar);
    }

    public void g7() {
        j12.b l76 = l7();
        this.f97649m = l76;
        l76.f297153f = this;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a7q;
    }

    public void h7(com.tencent.mm.plugin.emoji.model.s sVar, boolean z17, boolean z18) {
        if (sVar != null && sVar.f97600b.size() > 0) {
            this.E = true;
            android.view.View view = this.f97651o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "initData", "(Lcom/tencent/mm/plugin/emoji/model/EmotionListReqModel;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "initData", "(Lcom/tencent/mm/plugin/emoji/model/EmotionListReqModel;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f97653q = false;
        }
        q7(this.f97654r, sVar, z17, z18);
        j12.c.b(this.f97649m.f297152e, this);
    }

    @Override // ec0.e
    public void i3(java.util.ArrayList arrayList) {
        j12.b bVar = this.f97649m;
        if (bVar == null) {
            return;
        }
        j12.c.a(arrayList, bVar.f297152e);
        com.tencent.mm.plugin.emoji.ui.s sVar = this.f97695e;
        if (sVar != null) {
            sVar.removeMessages(131074);
            this.f97695e.sendEmptyMessage(131074);
        }
    }

    public void i7() {
        com.tencent.mm.ui.base.MMPullDownView mMPullDownView = (com.tencent.mm.ui.base.MMPullDownView) findViewById(com.tencent.mm.R.id.ill);
        this.f97650n = mMPullDownView;
        if (mMPullDownView == null) {
            return;
        }
        mMPullDownView.setTopViewVisible(false);
        this.f97650n.setAtTopCallBack(this);
        this.f97650n.setOnBottomLoadDataListener(this);
        this.f97650n.setAtBottomCallBack(this);
        this.f97650n.setBottomViewVisible(false);
        this.f97650n.setIsBottomShowAll(false);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setBackBtn(new com.tencent.mm.plugin.emoji.ui.e(this, null));
        g7();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.dez);
        this.f97651o = findViewById;
        this.f97652p = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.df9);
        android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.a7p, (android.view.ViewGroup) null);
        this.f97656t = inflate;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "initMoreBottom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "initMoreBottom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (j7()) {
            this.f97645f = new com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader(getContext());
        }
        if (k7()) {
            this.f97646g = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.a8s, (android.view.ViewGroup) null);
            int i17 = com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader.a(getContext())[0];
            this.f97646g.setLayoutParams(new android.widget.AbsListView.LayoutParams(i17, ((i17 * 3) / 8) + 1));
            this.f97647h = (com.tencent.mm.pluginsdk.ui.emoji.StoreBannerEmojiView) this.f97646g.findViewById(com.tencent.mm.R.id.d_q);
        }
        android.widget.ListView listView = (android.widget.ListView) findViewById(android.R.id.list);
        this.f97648i = listView;
        listView.setOnItemClickListener(this);
        if (j7()) {
            this.f97648i.addHeaderView(this.f97645f);
        } else if (k7()) {
            this.f97648i.addHeaderView(this.f97646g);
        }
        this.f97648i.addFooterView(this.f97656t);
        this.f97648i.setAdapter((android.widget.ListAdapter) this.f97649m);
        this.f97648i.setOnScrollListener(this);
        this.f97649m.getClass();
        i7();
    }

    public boolean j7() {
        return !(this instanceof com.tencent.mm.plugin.emoji.ui.EmojiPaidUI);
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
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "[showLoadingDialog] acitivity is finished.");
        } else {
            this.f97658v = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.emoji.ui.c(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        this.f97662z.b(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.emoji.ui.EmojiBaseActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f97662z = new com.tencent.mm.plugin.emoji.model.j0();
        initView();
        this.f97660x = getIntent().getIntExtra("preceding_scence", 2);
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        if (com.tencent.mm.storage.n5.f().b() != null) {
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.n5.f().b().add(this);
        }
        com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI.EmotionStatusChangeL emotionStatusChangeL = new com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI.EmotionStatusChangeL();
        this.A = emotionStatusChangeL;
        emotionStatusChangeL.alive();
        com.tencent.mm.plugin.emoji.model.j0 j0Var = this.f97662z;
        j0Var.f97559d = this;
        j0Var.f97556a = this.f97649m;
        j0Var.f97561f = getM();
        this.f97662z.f97562g = this;
        p7(false, false);
        if (H == null) {
            H = new java.util.HashMap();
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) H).put(getClass().toString(), java.lang.Long.valueOf(currentTimeMillis));
    }

    @Override // com.tencent.mm.plugin.emoji.ui.EmojiBaseActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader emojiStoreVpHeader;
        super.onDestroy();
        j12.b bVar = this.f97649m;
        if (bVar != null) {
            bVar.a();
            this.f97649m = null;
        }
        if (j7() && (emojiStoreVpHeader = this.f97645f) != null) {
            i12.c0 c0Var = emojiStoreVpHeader.f97849i;
            if (c0Var != null) {
                java.util.LinkedList linkedList = c0Var.f287195e;
                if (linkedList != null) {
                    linkedList.clear();
                }
                java.util.ArrayList arrayList = c0Var.f287199i;
                if (arrayList != null) {
                    arrayList.clear();
                }
                c0Var.f287198h = true;
                c0Var.f287200m.f287165a = null;
                emojiStoreVpHeader.f97849i = null;
            }
            emojiStoreVpHeader.f97852o = null;
        }
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.n5.f().b().remove(this);
        this.A.dead();
        gm0.j1.n().f273288b.d(this.D);
        com.tencent.mm.plugin.emoji.model.j0 j0Var = this.f97662z;
        if (j0Var != null) {
            j0Var.f97556a = null;
            j0Var.f97562g = null;
            j0Var.f97559d = null;
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
        if (i17 < 0 || i17 >= this.f97649m.getCount()) {
            yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        } else {
            f7(this.f97649m.getItem(i17), i17);
            yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (android.text.TextUtils.isEmpty(str) || !str.equals("delete_group")) {
            return;
        }
        com.tencent.mm.plugin.emoji.ui.s sVar = this.f97695e;
        if (sVar != null) {
            sVar.removeMessages(131074);
        }
        com.tencent.mm.plugin.emoji.ui.s sVar2 = this.f97695e;
        if (sVar2 != null) {
            sVar2.sendEmptyMessageDelayed(131074, 50);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader emojiStoreVpHeader;
        super.onPause();
        gm0.j1.n().f273288b.q(411, this);
        gm0.j1.n().f273288b.q(com.tencent.wxmm.v2helper.EMethodSetNgStrength, this);
        gm0.j1.n().f273288b.q(413, this);
        gm0.j1.n().f273288b.q(717, this);
        gm0.j1.n().f273288b.d(this.f97659w);
        if (j7() && (emojiStoreVpHeader = this.f97645f) != null && emojiStoreVpHeader.f97852o != null) {
            emojiStoreVpHeader.f97853p = false;
            emojiStoreVpHeader.f97852o.removeMessages(0);
        }
        this.C = true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        j12.f fVar;
        com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader emojiStoreVpHeader;
        super.onResume();
        gm0.j1.n().f273288b.a(411, this);
        gm0.j1.n().f273288b.a(com.tencent.wxmm.v2helper.EMethodSetNgStrength, this);
        gm0.j1.n().f273288b.a(413, this);
        gm0.j1.n().f273288b.a(717, this);
        if (j7() && (emojiStoreVpHeader = this.f97645f) != null) {
            emojiStoreVpHeader.e();
        }
        this.f97662z.f97557b = false;
        j12.b bVar = this.f97649m;
        if (bVar == null || (fVar = bVar.f297152e) == null) {
            return;
        }
        fVar.d();
        this.f97649m.m();
        if (this.C && (this instanceof com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3TopicUI)) {
            m7(1, null);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = android.text.TextUtils.isEmpty(str) ? "" : str;
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "jacks [onSceneEnd] errType:%d,errCode:%d,errMsg:%s", objArr);
        android.app.ProgressDialog progressDialog = this.f97658v;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f97658v.dismiss();
        }
        int type = m1Var.getType();
        if (type == 411) {
            if (m1Var instanceof z12.t) {
                W6(i17, i18, str, (z12.t) m1Var);
                return;
            }
            return;
        }
        if (type == 413) {
            z12.w wVar = (z12.w) m1Var;
            if (i17 == 0 && i18 == 0) {
                ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
                com.tencent.mm.storage.n5.f().b().L0(wVar.f469378f);
                android.os.Message message = new android.os.Message();
                message.what = 2002;
                message.obj = getContext().getString(com.tencent.mm.R.string.f490580z1);
                com.tencent.mm.plugin.emoji.ui.s sVar = this.f97695e;
                if (sVar != null) {
                    sVar.sendMessage(message);
                }
            } else {
                android.os.Message message2 = new android.os.Message();
                message2.what = 2002;
                message2.obj = getContext().getString(com.tencent.mm.R.string.bvr);
                com.tencent.mm.plugin.emoji.ui.s sVar2 = this.f97695e;
                if (sVar2 != null) {
                    sVar2.sendMessage(message2);
                }
            }
            com.tencent.mm.plugin.emoji.ui.s sVar3 = this.f97695e;
            if (sVar3 != null) {
                sVar3.sendEmptyMessageDelayed(20001, 800);
                return;
            }
            return;
        }
        if (type != 423) {
            if (type != 717) {
                com.tencent.mars.xlog.Log.e("MicroMsg.emoji.BaseEmojiStoreUI", "unknow scene type");
                return;
            } else {
                if (i17 == 0 && i18 == 0) {
                    this.f97657u = null;
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
            java.lang.String str2 = lVar.f469320f;
            java.lang.String str3 = lVar.f469322h;
            java.lang.String str4 = lVar.f469321g;
            db5.e1.u(this, getString(com.tencent.mm.R.string.byo, str4), "", new com.tencent.mm.plugin.emoji.ui.a(this, str2, str3, str4, lVar.f469324m), new com.tencent.mm.plugin.emoji.ui.b(this));
            s7(lVar.f469320f, -1);
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
            if (this.f97654r == 0 || this.f97655s) {
                yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                return;
            } else {
                p7(true, false);
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "[onScrollStateChanged] startLoadRemoteEmoji.");
            }
        }
        if (i17 == 0 && (this instanceof com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3TopicUI)) {
            m7(1, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }

    public void p7(boolean z17, boolean z18) {
        z12.t tVar;
        this.f97655s = true;
        if (z17) {
            android.view.View view = this.f97656t;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "startLoadRemoteEmoji", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "startLoadRemoteEmoji", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        byte[] bArr = this.f97657u;
        int c76 = c7();
        int b76 = b7(bArr);
        int e76 = e7();
        if (bArr != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "[startLoadRemoteEmoji] request buffer %s", bArr.toString());
            tVar = new z12.t(c76, bArr, b76, false);
            if (c76 == 7) {
                tVar.f469364h = e76;
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "[startLoadRemoteEmoji] request buffer is null.");
            tVar = new z12.t(c76, b76);
            if (c76 == 7) {
                tVar.f469364h = e76;
            }
        }
        tVar.f469365i = getK();
        n7(tVar);
        this.f97659w = tVar;
        gm0.j1.n().f273288b.g(this.f97659w);
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "[startLoadRemoteEmoji] doScene GetEmotionListNetScene");
        if (z17 || z18) {
            return;
        }
        o7();
    }

    public void q7(int i17, com.tencent.mm.plugin.emoji.model.s sVar, boolean z17, boolean z18) {
        boolean z19 = true;
        if (i17 != -1) {
            if (i17 != 0) {
                if (i17 == 1) {
                    this.f97661y = sVar;
                } else if (i17 == 2) {
                    if (this.f97661y == null) {
                        this.f97661y = new com.tencent.mm.plugin.emoji.model.s();
                    }
                    if (sVar != null) {
                        com.tencent.mm.plugin.emoji.model.s sVar2 = this.f97661y;
                        int i18 = sVar.f97599a;
                        sVar2.getClass();
                        sVar2.f97599a += i18;
                        this.f97661y.b(sVar.f97600b, 2);
                    }
                }
            }
            z19 = false;
        } else {
            this.f97661y = sVar;
        }
        com.tencent.mm.plugin.emoji.model.s sVar3 = this.f97661y;
        if (sVar3 != null) {
            sVar3.a();
        }
        X6(z19, this.f97661y, z17, z18);
    }

    public final void r7(java.lang.String str, int i17) {
        android.os.Message obtain = android.os.Message.obtain();
        obtain.getData().putString("product_id", str);
        obtain.getData().putInt("progress", i17);
        obtain.what = 131075;
        com.tencent.mm.plugin.emoji.ui.s sVar = this.f97695e;
        if (sVar != null) {
            sVar.sendMessage(obtain);
        }
    }

    @Override // com.tencent.mm.plugin.emoji.model.i0
    public void s(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.D = new z12.l(str, str2, str3, str4, str5);
        gm0.j1.n().f273288b.g(this.D);
    }

    public final void s7(java.lang.String str, int i17) {
        android.os.Message obtain = android.os.Message.obtain();
        obtain.getData().putString("product_id", str);
        obtain.getData().putInt("status", i17);
        obtain.what = 131076;
        com.tencent.mm.plugin.emoji.ui.s sVar = this.f97695e;
        if (sVar != null) {
            sVar.sendMessage(obtain);
        }
    }
}
