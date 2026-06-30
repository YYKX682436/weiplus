package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes8.dex */
public class c9 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b9 f280412d;

    public c9(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b9 b9Var) {
        this.f280412d = b9Var;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onNotifyChange event=");
        sb6.append(str);
        sb6.append(" talkerUserName=");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b9 b9Var = this.f280412d;
        sb6.append(b9Var.f280113d.x());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingW1wComponent", sb6.toString());
        if (str == null || !str.equals(b9Var.f280113d.x())) {
            return;
        }
        b9Var.n0();
        int i17 = ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).Vi().y0(b9Var.f280113d.x()).f69159x10a0fed7;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("sessionStatus=");
        sb7.append(i17);
        sb7.append(" w1wTopSysMsgView=");
        sb7.append(b9Var.f280254e != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingW1wComponent", sb7.toString());
        if (i17 != 2 || b9Var.f280254e == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingW1wComponent", "Hiding tips UI");
        android.view.View view = b9Var.f280254e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/ChattingW1wComponent$1", "onNotifyChange", "(Ljava/lang/String;Lcom/tencent/mm/sdk/storage/MStorageEventData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/component/ChattingW1wComponent$1", "onNotifyChange", "(Ljava/lang/String;Lcom/tencent/mm/sdk/storage/MStorageEventData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b9Var.m0(0);
        b9Var.f280254e = null;
    }
}
