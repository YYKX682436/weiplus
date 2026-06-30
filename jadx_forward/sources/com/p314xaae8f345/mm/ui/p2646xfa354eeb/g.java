package com.p314xaae8f345.mm.ui.p2646xfa354eeb;

/* loaded from: classes11.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI f279496d;

    public g(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f279496d = bizChatConversationFmUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatConversationFmUI", "updateChatInfoFromSvr");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        s01.g aj6 = r01.q3.aj();
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI bizChatConversationFmUI = this.f279496d;
        android.database.Cursor L0 = aj6.L0(bizChatConversationFmUI.f279436m);
        if (L0.moveToFirst()) {
            while (!L0.isAfterLast()) {
                s01.b bVar = new s01.b();
                bVar.mo9015xbf5d97fd(L0);
                L0.moveToNext();
                s01.h z07 = r01.q3.Ui().z0(bVar.f69064xa6206081);
                if (z07.z0()) {
                    if (z07.y0()) {
                        linkedList2.add(z07.f69169xf75e5c37);
                    } else {
                        linkedList.add(z07.f69169xf75e5c37);
                    }
                }
            }
        }
        L0.close();
        if (linkedList2.size() > 0) {
            r01.q3.Ni().a(linkedList2, bizChatConversationFmUI.f279436m);
        }
        bizChatConversationFmUI.getClass();
        if (linkedList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatConversationFmUI", "userIdList is empty");
        } else {
            android.content.SharedPreferences m78391xc8c7209d = bizChatConversationFmUI.m78391xc8c7209d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0);
            if (m78391xc8c7209d.getBoolean("FIRST_TIME_IN_BIZCHAT_CONV_" + bizChatConversationFmUI.f279436m, true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatConversationFmUI", "updateData");
                java.lang.System.currentTimeMillis();
                l75.k0 k0Var = r01.q3.Vi().f483392e;
                long F = k0Var != null ? k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId())) : 0L;
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    s01.h D0 = r01.q3.Ui().D0(str);
                    if (D0 != null && !D0.y0()) {
                        s01.a0 y07 = r01.q3.Vi().y0(str);
                        java.lang.String str2 = y07 != null ? y07.f65841xdde069b : null;
                        if (str2 != null && !str2.equals(D0.f69171x736d1fa8)) {
                            D0.f69171x736d1fa8 = str2;
                            r01.q3.Ui().P0(D0);
                        }
                    }
                }
                if (k0Var != null) {
                    k0Var.w(java.lang.Long.valueOf(F));
                }
                m78391xc8c7209d.edit().putBoolean("FIRST_TIME_IN_BIZCHAT_CONV_" + bizChatConversationFmUI.f279436m, false).commit();
                java.lang.System.currentTimeMillis();
            }
        }
        if (linkedList.size() > 0) {
            r01.q3.Ni().b(linkedList, bizChatConversationFmUI.f279436m);
        }
    }
}
