package com.tencent.mm.plugin.brandservice.ui.userinfo.ui;

/* loaded from: classes4.dex */
public final class o implements in5.u {
    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        com.tencent.mm.plugin.brandservice.ui.userinfo.ui.a data = (com.tencent.mm.plugin.brandservice.ui.userinfo.ui.a) cVar;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(data, "data");
        if (data.f94560e) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        r45.zm zmVar = data.f94559d;
        java.lang.String str = zmVar.f392204g;
        if (str == null) {
            str = "";
        }
        intent.putExtra("Contact_User", str);
        java.lang.String str2 = zmVar.f392205h;
        intent.putExtra("Contact_Nick", str2 != null ? str2 : "");
        j45.l.j(itemView.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.newbizinfo.NewBizInfoSettingUI", intent, null);
    }
}
