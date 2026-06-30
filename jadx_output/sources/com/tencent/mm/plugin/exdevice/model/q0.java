package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public abstract class q0 {
    public static void a(v32.b bVar, r45.nv3 nv3Var, r45.ov3 ov3Var) {
        if (bVar == null) {
            return;
        }
        if (ov3Var != null) {
            bVar.field_connProto = ov3Var.f382541g;
            bVar.field_connStrategy = ov3Var.f382542h;
            bVar.field_closeStrategy = ov3Var.f382543i;
            bVar.field_mac = a42.i.h(a42.i.k(ov3Var.f382540f));
            bVar.field_authKey = ov3Var.f382539e;
            bVar.field_brandName = ov3Var.f382538d;
            bVar.f237106y = ov3Var.f382547p;
            bVar.G = ov3Var.f382555x;
            bVar.D = ov3Var.f382552u;
            bVar.C = ov3Var.f382551t;
            bVar.B = ov3Var.f382550s;
            bVar.E = ov3Var.f382553v;
            bVar.f237107z = ov3Var.f382548q;
            bVar.F = ov3Var.f382554w;
            bVar.A = ov3Var.f382549r;
            bVar.H = ov3Var.f382556y;
            bVar.I = ov3Var.f382557z;
            bVar.f237087J = ov3Var.A;
            bVar.K = ov3Var.B;
            bVar.f237101t = true;
        }
        if (nv3Var != null) {
            bVar.field_deviceID = nv3Var.f381692e;
            bVar.field_deviceType = nv3Var.f381691d;
            bVar.field_md5Str = kk.k.g(new java.lang.String(nv3Var.f381691d + nv3Var.f381692e).getBytes());
            if (com.tencent.mm.sdk.platformtools.t8.K0(bVar.field_brandName)) {
                bVar.field_brandName = nv3Var.f381691d;
            }
        }
    }

    public static boolean b(v32.b bVar) {
        return bVar != null && (bVar.G & 1) == 1 && lq1.a.b();
    }

    public static boolean c(android.content.Context context, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceLogic", "Jump to webview failed, url is null or nil.");
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        return true;
    }
}
