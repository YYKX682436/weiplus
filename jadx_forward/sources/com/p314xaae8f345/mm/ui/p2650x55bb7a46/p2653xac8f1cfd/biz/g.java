package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz;

/* loaded from: classes11.dex */
public class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f280312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a f280313e;

    public g(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar, java.util.LinkedList linkedList) {
        this.f280313e = aVar;
        this.f280312d = linkedList;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r45.tj tjVar = new r45.tj();
        int i18 = 0;
        while (true) {
            java.util.LinkedList linkedList = this.f280312d;
            if (i18 >= linkedList.size()) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar = this.f280313e;
                aVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "updateBizChatMemberList()");
                java.lang.String string = aVar.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4_);
                s01.y Ni = r01.q3.Ni();
                s01.h hVar = aVar.f280277f;
                java.lang.String str = hVar.f69170x75756b18;
                java.lang.String str2 = hVar.f69169xf75e5c37;
                Ni.getClass();
                s01.q0 q0Var = new s01.q0(str, str2, null, tjVar, aVar);
                gm0.j1.n().f354821b.g(q0Var);
                yb5.d dVar = aVar.f280113d;
                dVar.W(dVar.g(), aVar.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), string, true, true, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.i(aVar, q0Var));
                return;
            }
            r45.sj sjVar = new r45.sj();
            sjVar.f467301d = (java.lang.String) linkedList.get(i18);
            tjVar.f468027d.add(sjVar);
            i18++;
        }
    }
}
