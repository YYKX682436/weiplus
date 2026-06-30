package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui;

/* loaded from: classes4.dex */
public final class o implements in5.u {
    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.a data = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.a) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data.f176093e) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        r45.zm zmVar = data.f176092d;
        java.lang.String str = zmVar.f473737g;
        if (str == null) {
            str = "";
        }
        intent.putExtra("Contact_User", str);
        java.lang.String str2 = zmVar.f473738h;
        intent.putExtra("Contact_Nick", str2 != null ? str2 : "");
        j45.l.j(itemView.getContext(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.newbizinfo.NewBizInfoSettingUI", intent, null);
    }
}
