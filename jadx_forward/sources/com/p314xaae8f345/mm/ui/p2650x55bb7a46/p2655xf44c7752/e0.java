package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes9.dex */
public final class e0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f282420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h0 f282421e;

    public e0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h0 h0Var) {
        this.f282420d = f9Var;
        this.f282421e = h0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f282420d;
        if (f9Var != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h0 h0Var = this.f282421e;
            h0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmojiHistoryListAdapter", "[handleSelectedItem] index: " + i17 + ", msgId: " + f9Var.m124847x74d37ac6());
            boolean z17 = h0Var.f282506f;
            android.content.Context context = h0Var.f282504d;
            if (i17 != 0) {
                if (i17 != 1) {
                    return;
                }
                if (z17) {
                    de5.a.f310929a.k(18, 7, 8);
                } else {
                    de5.a.f(de5.a.f310929a, 18, 8, 0, 0, 12, null);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmojiHistoryListAdapter", "[handleDel] msgId: " + f9Var.m124847x74d37ac6());
                if (h0Var.x(f9Var.m124847x74d37ac6())) {
                    java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet();
                    copyOnWriteArraySet.add(tg3.l1.a(f9Var));
                    db5.e1.A(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bav), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.boo), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.a0(h0Var, copyOnWriteArraySet, f9Var), null);
                    return;
                }
                return;
            }
            if (z17) {
                de5.a.f310929a.k(17, 7, 8);
            } else {
                de5.a.f(de5.a.f310929a, 17, 8, 0, 0, 12, null);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[goToChattingUI] username: ");
            java.lang.String str = h0Var.f282505e;
            sb6.append(str);
            sb6.append(", msgId: ");
            sb6.append(f9Var.m124847x74d37ac6());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmojiHistoryListAdapter", sb6.toString());
            if (h0Var.x(f9Var.m124847x74d37ac6())) {
                if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
                    if (n17 == null || !n17.r2()) {
                        if (n17 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("EmojiHistoryListAdapter", "[gotoChattingUIWithPosition] contact is null! username:%s", str);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("EmojiHistoryListAdapter", "[gotoChattingUIWithPosition] isContact not ! username:%s", str);
                        }
                        db5.e1.t(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hy6), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jz9), null);
                        return;
                    }
                } else if (((com.p314xaae8f345.mm.p2621x8fb0427b.b3) c01.d9.b().l()).z0(str) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("EmojiHistoryListAdapter", "[gotoChattingUIWithPosition] member is null! username:%s", str);
                    db5.e1.t(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hy6), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jz9), null);
                    return;
                }
                android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", str).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", f9Var.m124847x74d37ac6());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(putExtra, "putExtra(...)");
                putExtra.setClass(context, com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
                android.content.Context context2 = h0Var.f282504d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(putExtra);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/EmojiHistoryListAdapter", "goToChattingUI", "(Ljava/lang/String;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context2, "com/tencent/mm/ui/chatting/gallery/EmojiHistoryListAdapter", "goToChattingUI", "(Ljava/lang/String;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }
}
