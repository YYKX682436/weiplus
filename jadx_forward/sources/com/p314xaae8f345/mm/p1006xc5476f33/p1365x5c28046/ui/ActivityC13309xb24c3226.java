package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiPaidUI */
/* loaded from: classes15.dex */
public class ActivityC13309xb24c3226 extends com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0 {
    public static final /* synthetic */ int K = 0;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public float f179345J;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public void V6(z12.l lVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public void X6(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.s sVar, boolean z18, boolean z19) {
        j12.b bVar;
        if (sVar != null && z17 && (bVar = this.f179182m) != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new j12.a(bVar, sVar));
        }
        if (this.f179182m != null && sVar != null && sVar.f179132a > 0) {
            android.view.View view = this.f179184o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiPaidUI", "updateView", "(Lcom/tencent/mm/plugin/emoji/model/EmotionListReqModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/EmojiPaidUI", "updateView", "(Lcom/tencent/mm/plugin/emoji/model/EmotionListReqModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f179181i.setVisibility(0);
            return;
        }
        android.view.View view2 = this.f179184o;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiPaidUI", "updateView", "(Lcom/tencent/mm/plugin/emoji/model/EmotionListReqModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/EmojiPaidUI", "updateView", "(Lcom/tencent/mm/plugin/emoji/model/EmotionListReqModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f179185p.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bww);
        this.f179181i.setVisibility(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public int Y6() {
        return 10;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public int b7(byte[] bArr) {
        return this.f179193x;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public int c7() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public int d7() {
        return 6;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public void i7() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.bwx);
        if (c01.z1.y()) {
            mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2(this));
        }
        super.mo43517x10010bd5();
        android.view.View view = this.f179184o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiPaidUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/EmojiPaidUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f179181i.setVisibility(8);
        this.f179181i.setOnItemLongClickListener(new android.widget.AdapterView.OnItemLongClickListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiPaidUI$$a
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view2, final int i17, long j17) {
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13309xb24c3226.K;
                final com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13309xb24c3226 activityC13309xb24c3226 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13309xb24c3226.this;
                if (i17 < 0) {
                    activityC13309xb24c3226.getClass();
                } else if (i17 < activityC13309xb24c3226.f179182m.getCount()) {
                    final r45.zj0 zj0Var = activityC13309xb24c3226.f179182m.getItem(i17).f378700b;
                    view2.getLocationInWindow(new int[2]);
                    new rl5.r(activityC13309xb24c3226).h(view2, new android.view.View.OnCreateContextMenuListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiPaidUI$$b
                        @Override // android.view.View.OnCreateContextMenuListener
                        public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view3, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
                            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13309xb24c3226.K;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13309xb24c3226 activityC13309xb24c32262 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13309xb24c3226.this;
                            activityC13309xb24c32262.getClass();
                            ((db5.g4) contextMenu).c(0, 1, 0, activityC13309xb24c32262.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0), com.p314xaae8f345.mm.R.raw.f80075x444ae503);
                        }
                    }, new db5.t4() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiPaidUI$$c
                        @Override // db5.t4
                        /* renamed from: onMMMenuItemSelected */
                        public final void mo888x34063ac(android.view.MenuItem menuItem, int i19) {
                            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13309xb24c3226.K;
                            final com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13309xb24c3226 activityC13309xb24c32262 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13309xb24c3226.this;
                            activityC13309xb24c32262.getClass();
                            if (menuItem.getItemId() == 1) {
                                java.lang.String string = activityC13309xb24c32262.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bxh);
                                java.lang.String string2 = activityC13309xb24c32262.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0);
                                java.lang.String string3 = activityC13309xb24c32262.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
                                final int i28 = i17;
                                final r45.zj0 zj0Var2 = zj0Var;
                                db5.e1.B(activityC13309xb24c32262, string, "", string2, string3, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiPaidUI$$d
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(android.content.DialogInterface dialogInterface, int i29) {
                                        int i37 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13309xb24c3226.K;
                                        final com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13309xb24c3226 activityC13309xb24c32263 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13309xb24c3226.this;
                                        final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(activityC13309xb24c32263, activityC13309xb24c32263.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bvs), true, 0, null);
                                        final r45.zj0 zj0Var3 = zj0Var2;
                                        java.lang.String productId = zj0Var3.f473661d;
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productId, "productId");
                                        pq5.g l17 = new z12.a(productId, 1).l();
                                        l17.f(activityC13309xb24c32263);
                                        final int i38 = i28;
                                        l17.K(new gm5.a() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiPaidUI$$e
                                            @Override // gm5.a
                                            /* renamed from: call */
                                            public final java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
                                                int i39;
                                                com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
                                                int i47 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13309xb24c3226.K;
                                                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13309xb24c3226 activityC13309xb24c32264 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13309xb24c3226.this;
                                                activityC13309xb24c32264.getClass();
                                                int i48 = fVar.f152148a;
                                                int i49 = fVar.f152149b;
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiPaidUI", "delete %s, errType:%s, errCode:%s", zj0Var3.f473661d, java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(i49));
                                                f17.dismiss();
                                                if (i48 != 0 || i49 != 0) {
                                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC13309xb24c32264);
                                                    u1Var.g(activityC13309xb24c32264.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bxg));
                                                    u1Var.a(true);
                                                    u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
                                                    u1Var.q(false);
                                                    return null;
                                                }
                                                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.s sVar = activityC13309xb24c32264.f179194y;
                                                if (sVar != null) {
                                                    java.util.List list = sVar.f179133b;
                                                    if (list != null && (i39 = i38) >= 0 && list.size() > i39) {
                                                        sVar.f179133b.remove(i39);
                                                    }
                                                    activityC13309xb24c32264.X6(true, activityC13309xb24c32264.f179194y, false, false);
                                                }
                                                db5.t7.h(activityC13309xb24c32264, activityC13309xb24c32264.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bxf));
                                                return null;
                                            }
                                        });
                                    }
                                }, null, com.p314xaae8f345.mm.R.C30859x5a72f63.f560155ch);
                            }
                        }
                    }, (int) activityC13309xb24c3226.I, (int) activityC13309xb24c3226.f179345J);
                    return true;
                }
                return false;
            }
        });
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public j12.b l7() {
        return new i12.g(mo55332x76847179());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        int i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiPaidUI", "onActivityResult . requestCode:" + i17 + "  resultCode:" + i18);
        android.app.ProgressDialog progressDialog = this.f179191v;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f179191v.dismiss();
        }
        if (intent != null) {
            i19 = intent.getIntExtra("key_err_code", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiPaidUI", "errCode:" + i19);
            str = intent.getStringExtra("key_err_msg");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiPaidUI", "errMsg:" + str);
        } else {
            str = "";
            i19 = 0;
        }
        if (i18 != -1) {
            dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.bxp, 0).show();
            return;
        }
        if (intent == null || i19 != 0) {
            dp.a.m125854x26a183b(this, str, 0).show();
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_response_product_ids");
        if (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) {
            dp.a.m125854x26a183b(this, str, 0).show();
            return;
        }
        this.f179190u = null;
        this.f179187r = -1;
        p7(false, false);
        gm0.j1.u().c().w(208900, java.lang.Boolean.TRUE);
        dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.bxq, 0).show();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13278x5c32d846, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12740, 4, "", "", "", 10, 10);
        this.f179181i.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.u2(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13278x5c32d846, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0, l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        if (str == null || !str.equals("event_update_group")) {
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
}
