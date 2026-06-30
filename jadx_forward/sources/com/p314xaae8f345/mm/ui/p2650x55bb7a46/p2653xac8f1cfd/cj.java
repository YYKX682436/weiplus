package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class cj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ej f280425d;

    public cj(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ej ejVar) {
        this.f280425d = ejVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/RecordSelectComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ej ejVar = this.f280425d;
        if (!ejVar.f280515m && !ejVar.n0()) {
            a14.a.a().f82115a.f141894h = ejVar.m0();
        }
        ejVar.f280515m = true;
        sb5.z zVar = (sb5.z) ejVar.f280113d.f542241c.a(sb5.z.class);
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = (com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) view.getTag();
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).W.contains(c16564xb55e1d5)) {
            a14.a.a().f82119e++;
        } else {
            a14.a.a().f82118d++;
        }
        if (!((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).W0(c16564xb55e1d5)) {
            a14.a.a().f82116b++;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.recordSelect.RecordSelectComponent", "setOnEditModeItemClickListener msgId:%s", c16564xb55e1d5);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/RecordSelectComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
