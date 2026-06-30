package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/media/h0;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/webview/ui/tools/media/MpVideoDataParcelable;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes8.dex */
public final class h0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r callback) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.C19429x834b7ec5 data = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.C19429x834b7ec5) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        r45.ee eeVar = data.f267266h;
        boolean z17 = false;
        if (eeVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MPVideoTransmit", "doSendAppMsg msgInfo is null");
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.q3 q3Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.q3();
            q3Var.f33249xa1713a8c = eeVar.f454880o;
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504();
            c11286x34a5504.f33122xe4128443 = q3Var;
            c11286x34a5504.f33130x6942258 = eeVar.f454875g;
            dw4.a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.i0(eeVar));
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5987xfe669c12 c5987xfe669c12 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5987xfe669c12();
            am.jt jtVar = c5987xfe669c12.f136282g;
            jtVar.f88613a = c11286x34a5504;
            jtVar.f88616d = data.f267262d;
            jtVar.f88617e = 2;
            jtVar.f88618f = eeVar.f454881p;
            jtVar.f88619g = eeVar.f454882q;
            try {
                java.lang.String str = eeVar.f454883r;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str == null) {
                    str = "";
                }
                jtVar.f88624l = str;
                java.lang.String a17 = c01.n2.a(str);
                c01.l2 c17 = c01.n2.d().c(a17, true);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
                c17.i("sendAppMsgScene", 2);
                c17.i("preChatName", eeVar.f454884s);
                c17.i("prePublishId", eeVar.f454883r);
                c17.i("preUsername", eeVar.f454885t);
                c17.i("_DATA_CENTER_ITEM_SHOW_TYPE", -1);
                c17.i("_tmpl_webview_transfer_scene", 11);
                c17.i("_DATA_CENTER_VID", eeVar.f454874f);
                c17.i("_DATA_CENTER__DULATION", java.lang.Integer.valueOf(eeVar.f454877i));
                c17.i("_DATA_CENTER_VIDEO_WIDTH", java.lang.Integer.valueOf(eeVar.f454878m));
                c17.i("_DATA_CENTER_VIDEO_HEIGHT", java.lang.Integer.valueOf(eeVar.f454879n));
                c17.i("_DATA_CENTER_COVER_URL", eeVar.f454876h);
                c17.i("_DATA_CENTER_VIDEO_PLAY_URL", eeVar.f454873e);
                c17.i("_DATA_CENTER_VIDEO_MP_URL", eeVar.f454872d);
                c17.i("_DATA_CENTER_IS_MP_SHARE_VIDEO", java.lang.Boolean.TRUE);
                jtVar.f88629q = a17;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MPVideoTransmit", "init bunddata failed : %s", e17.getMessage());
            }
            boolean e18 = c5987xfe669c12.e();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(data.f267264f)) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361 c5990xd50ae361 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361();
                java.lang.String str2 = data.f267262d;
                am.mt mtVar = c5990xd50ae361.f136285g;
                mtVar.f88895a = str2;
                mtVar.f88896b = data.f267264f;
                mtVar.f88897c = c01.e2.C(str2);
                mtVar.f88898d = 0;
                c5990xd50ae361.e();
            }
            z17 = e18;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("ret", z17);
        callback.a(bundle);
    }
}
