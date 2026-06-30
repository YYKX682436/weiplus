package com.p314xaae8f345.mm.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/ui/AtSomeOneResultReceiver;", "Landroid/support/v4/os/ResultReceiver;", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.AtSomeOneResultReceiver */
/* loaded from: classes5.dex */
public final class C21347xb96b140b extends p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21347xb96b140b(android.os.Handler handler) {
        super(handler);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c
    public void a(int i17, android.os.Bundle bundle) {
        int length;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AtSomeOneResultReceiver", "onReceiveResult resultCode:%s, resultData:%s", java.lang.Integer.valueOf(i17), bundle);
        if (!com.p314xaae8f345.mm.ui.i1.f290429f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AtSomeOneResultReceiver", "not first return from AT!!");
            return;
        }
        if (i17 != -1 || bundle == null) {
            return;
        }
        int i18 = 0;
        com.p314xaae8f345.mm.ui.i1.f290429f = false;
        java.lang.String string = bundle.getString("KSelectUserList");
        java.lang.String string2 = bundle.getString("chatroomName");
        java.lang.String[] strArr = string != null ? (java.lang.String[]) r26.n0.f0(string, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]) : null;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(string2);
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        if (string2 != null && string != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AtSomeOneResultReceiver", "update at someone record on receive result from transmit");
            ((qd0.c) ((rd0.s0) i95.n0.c(rd0.s0.class))).wi(string2, string);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(strArr);
        for (java.lang.String str : strArr) {
            java.lang.String string3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "notify@all") ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6j, "") : c01.e2.t(z07, str, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AtSomeOneResultReceiver", "atSomeOne username:%s", str);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string3);
                linkedList.add(string3);
                java.util.LinkedHashMap linkedHashMap = com.p314xaae8f345.mm.ui.i1.f290427d;
                if (linkedHashMap != null) {
                    linkedHashMap.put(string3, str);
                }
            }
        }
        android.widget.EditText editText = com.p314xaae8f345.mm.ui.i1.f290424a;
        if (editText == null) {
            return;
        }
        java.lang.String obj = editText.getText().toString();
        java.lang.String substring = obj.substring(0, com.p314xaae8f345.mm.ui.i1.f290426c);
        int i19 = com.p314xaae8f345.mm.ui.i1.f290426c;
        for (java.lang.String str2 : linkedList) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                if (i18 > 0) {
                    substring = substring + "@" + str2 + (char) 8197;
                    length = str2.length() + 2;
                } else {
                    substring = substring + str2 + (char) 8197;
                    length = str2.length() + 1;
                }
                i19 += length;
            }
            i18++;
        }
        java.lang.String str3 = substring + obj.substring(com.p314xaae8f345.mm.ui.i1.f290426c, obj.length());
        android.widget.EditText editText2 = com.p314xaae8f345.mm.ui.i1.f290424a;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        float textSize = com.p314xaae8f345.mm.ui.i1.f290424a.getTextSize();
        ((ke0.e) xVar).getClass();
        editText2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str3, textSize));
        if (i19 < 0 || i19 > com.p314xaae8f345.mm.ui.i1.f290424a.getText().length()) {
            android.widget.EditText editText3 = com.p314xaae8f345.mm.ui.i1.f290424a;
            editText3.setSelection(editText3.getText().length());
        } else {
            com.p314xaae8f345.mm.ui.i1.f290424a.setSelection(i19);
        }
        com.p314xaae8f345.mm.ui.i1.f290424a.setFocusable(true);
        com.p314xaae8f345.mm.ui.i1.f290424a.setFocusableInTouchMode(true);
        com.p314xaae8f345.mm.ui.i1.f290424a.requestFocus();
    }
}
