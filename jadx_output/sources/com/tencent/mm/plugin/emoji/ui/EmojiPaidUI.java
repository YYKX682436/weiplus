package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public class EmojiPaidUI extends com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI {
    public static final /* synthetic */ int K = 0;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public float f97812J;

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public void V6(z12.l lVar) {
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public void X6(boolean z17, com.tencent.mm.plugin.emoji.model.s sVar, boolean z18, boolean z19) {
        j12.b bVar;
        if (sVar != null && z17 && (bVar = this.f97649m) != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new j12.a(bVar, sVar));
        }
        if (this.f97649m != null && sVar != null && sVar.f97599a > 0) {
            android.view.View view = this.f97651o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiPaidUI", "updateView", "(Lcom/tencent/mm/plugin/emoji/model/EmotionListReqModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/EmojiPaidUI", "updateView", "(Lcom/tencent/mm/plugin/emoji/model/EmotionListReqModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f97648i.setVisibility(0);
            return;
        }
        android.view.View view2 = this.f97651o;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiPaidUI", "updateView", "(Lcom/tencent/mm/plugin/emoji/model/EmotionListReqModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/EmojiPaidUI", "updateView", "(Lcom/tencent/mm/plugin/emoji/model/EmotionListReqModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f97652p.setText(com.tencent.mm.R.string.bww);
        this.f97648i.setVisibility(8);
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public int Y6() {
        return 10;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public int b7(byte[] bArr) {
        return this.f97660x;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public int c7() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public int d7() {
        return 6;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public void i7() {
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.bwx);
        if (c01.z1.y()) {
            addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.emoji.ui.v2(this));
        }
        super.initView();
        android.view.View view = this.f97651o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiPaidUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/EmojiPaidUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f97648i.setVisibility(8);
        this.f97648i.setOnItemLongClickListener(new android.widget.AdapterView.OnItemLongClickListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiPaidUI$$a
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view2, final int i17, long j17) {
                int i18 = com.tencent.mm.plugin.emoji.ui.EmojiPaidUI.K;
                final com.tencent.mm.plugin.emoji.ui.EmojiPaidUI emojiPaidUI = com.tencent.mm.plugin.emoji.ui.EmojiPaidUI.this;
                if (i17 < 0) {
                    emojiPaidUI.getClass();
                } else if (i17 < emojiPaidUI.f97649m.getCount()) {
                    final r45.zj0 zj0Var = emojiPaidUI.f97649m.getItem(i17).f297167b;
                    view2.getLocationInWindow(new int[2]);
                    new rl5.r(emojiPaidUI).h(view2, new android.view.View.OnCreateContextMenuListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiPaidUI$$b
                        @Override // android.view.View.OnCreateContextMenuListener
                        public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view3, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
                            int i19 = com.tencent.mm.plugin.emoji.ui.EmojiPaidUI.K;
                            com.tencent.mm.plugin.emoji.ui.EmojiPaidUI emojiPaidUI2 = com.tencent.mm.plugin.emoji.ui.EmojiPaidUI.this;
                            emojiPaidUI2.getClass();
                            ((db5.g4) contextMenu).c(0, 1, 0, emojiPaidUI2.getString(com.tencent.mm.R.string.f490367t0), com.tencent.mm.R.raw.icons_outlined_delete);
                        }
                    }, new db5.t4() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiPaidUI$$c
                        @Override // db5.t4
                        public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i19) {
                            int i27 = com.tencent.mm.plugin.emoji.ui.EmojiPaidUI.K;
                            final com.tencent.mm.plugin.emoji.ui.EmojiPaidUI emojiPaidUI2 = com.tencent.mm.plugin.emoji.ui.EmojiPaidUI.this;
                            emojiPaidUI2.getClass();
                            if (menuItem.getItemId() == 1) {
                                java.lang.String string = emojiPaidUI2.getString(com.tencent.mm.R.string.bxh);
                                java.lang.String string2 = emojiPaidUI2.getString(com.tencent.mm.R.string.f490367t0);
                                java.lang.String string3 = emojiPaidUI2.getString(com.tencent.mm.R.string.f490347sg);
                                final int i28 = i17;
                                final r45.zj0 zj0Var2 = zj0Var;
                                db5.e1.B(emojiPaidUI2, string, "", string2, string3, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiPaidUI$$d
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(android.content.DialogInterface dialogInterface, int i29) {
                                        int i37 = com.tencent.mm.plugin.emoji.ui.EmojiPaidUI.K;
                                        final com.tencent.mm.plugin.emoji.ui.EmojiPaidUI emojiPaidUI3 = com.tencent.mm.plugin.emoji.ui.EmojiPaidUI.this;
                                        final com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(emojiPaidUI3, emojiPaidUI3.getString(com.tencent.mm.R.string.bvs), true, 0, null);
                                        final r45.zj0 zj0Var3 = zj0Var2;
                                        java.lang.String productId = zj0Var3.f392128d;
                                        kotlin.jvm.internal.o.g(productId, "productId");
                                        pq5.g l17 = new z12.a(productId, 1).l();
                                        l17.f(emojiPaidUI3);
                                        final int i38 = i28;
                                        l17.K(new gm5.a() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiPaidUI$$e
                                            @Override // gm5.a
                                            public final java.lang.Object call(java.lang.Object obj) {
                                                int i39;
                                                com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
                                                int i47 = com.tencent.mm.plugin.emoji.ui.EmojiPaidUI.K;
                                                com.tencent.mm.plugin.emoji.ui.EmojiPaidUI emojiPaidUI4 = com.tencent.mm.plugin.emoji.ui.EmojiPaidUI.this;
                                                emojiPaidUI4.getClass();
                                                int i48 = fVar.f70615a;
                                                int i49 = fVar.f70616b;
                                                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiPaidUI", "delete %s, errType:%s, errCode:%s", zj0Var3.f392128d, java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(i49));
                                                f17.dismiss();
                                                if (i48 != 0 || i49 != 0) {
                                                    com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(emojiPaidUI4);
                                                    u1Var.g(emojiPaidUI4.getString(com.tencent.mm.R.string.bxg));
                                                    u1Var.a(true);
                                                    u1Var.m(com.tencent.mm.R.string.f490507x1);
                                                    u1Var.q(false);
                                                    return null;
                                                }
                                                com.tencent.mm.plugin.emoji.model.s sVar = emojiPaidUI4.f97661y;
                                                if (sVar != null) {
                                                    java.util.List list = sVar.f97600b;
                                                    if (list != null && (i39 = i38) >= 0 && list.size() > i39) {
                                                        sVar.f97600b.remove(i39);
                                                    }
                                                    emojiPaidUI4.X6(true, emojiPaidUI4.f97661y, false, false);
                                                }
                                                db5.t7.h(emojiPaidUI4, emojiPaidUI4.getString(com.tencent.mm.R.string.bxf));
                                                return null;
                                            }
                                        });
                                    }
                                }, null, com.tencent.mm.R.color.f478622ch);
                            }
                        }
                    }, (int) emojiPaidUI.I, (int) emojiPaidUI.f97812J);
                    return true;
                }
                return false;
            }
        });
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
    public j12.b l7() {
        return new i12.g(getContext());
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        int i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiPaidUI", "onActivityResult . requestCode:" + i17 + "  resultCode:" + i18);
        android.app.ProgressDialog progressDialog = this.f97658v;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f97658v.dismiss();
        }
        if (intent != null) {
            i19 = intent.getIntExtra("key_err_code", 0);
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiPaidUI", "errCode:" + i19);
            str = intent.getStringExtra("key_err_msg");
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiPaidUI", "errMsg:" + str);
        } else {
            str = "";
            i19 = 0;
        }
        if (i18 != -1) {
            dp.a.makeText(this, com.tencent.mm.R.string.bxp, 0).show();
            return;
        }
        if (intent == null || i19 != 0) {
            dp.a.makeText(this, str, 0).show();
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_response_product_ids");
        if (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) {
            dp.a.makeText(this, str, 0).show();
            return;
        }
        this.f97657u = null;
        this.f97654r = -1;
        p7(false, false);
        gm0.j1.u().c().w(208900, java.lang.Boolean.TRUE);
        dp.a.makeText(this, com.tencent.mm.R.string.bxq, 0).show();
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI, com.tencent.mm.plugin.emoji.ui.EmojiBaseActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12740, 4, "", "", "", 10, 10);
        this.f97648i.setOnTouchListener(new com.tencent.mm.plugin.emoji.ui.u2(this));
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI, com.tencent.mm.plugin.emoji.ui.EmojiBaseActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI, l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (str == null || !str.equals("event_update_group")) {
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
}
