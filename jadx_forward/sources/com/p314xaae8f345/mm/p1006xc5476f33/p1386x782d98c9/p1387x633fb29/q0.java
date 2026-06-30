package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public abstract class q0 {
    public static void a(v32.b bVar, r45.nv3 nv3Var, r45.ov3 ov3Var) {
        if (bVar == null) {
            return;
        }
        if (ov3Var != null) {
            bVar.f66604x76f6f117 = ov3Var.f464074g;
            bVar.f66605xb06879e4 = ov3Var.f464075h;
            bVar.f66603x2e78a306 = ov3Var.f464076i;
            bVar.f66609x4b6e688a = a42.i.h(a42.i.k(ov3Var.f464073f));
            bVar.f66601x4e093552 = ov3Var.f464072e;
            bVar.f66602x6bae49ad = ov3Var.f464071d;
            bVar.f318639y = ov3Var.f464080p;
            bVar.G = ov3Var.f464088x;
            bVar.D = ov3Var.f464085u;
            bVar.C = ov3Var.f464084t;
            bVar.B = ov3Var.f464083s;
            bVar.E = ov3Var.f464086v;
            bVar.f318640z = ov3Var.f464081q;
            bVar.F = ov3Var.f464087w;
            bVar.A = ov3Var.f464082r;
            bVar.H = ov3Var.f464089y;
            bVar.I = ov3Var.f464090z;
            bVar.f318620J = ov3Var.A;
            bVar.K = ov3Var.B;
            bVar.f318634t = true;
        }
        if (nv3Var != null) {
            bVar.f66606x5fdff396 = nv3Var.f463225e;
            bVar.f66607xe7b73b15 = nv3Var.f463224d;
            bVar.f66610x56df6b8 = kk.k.g(new java.lang.String(nv3Var.f463224d + nv3Var.f463225e).getBytes());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f66602x6bae49ad)) {
                bVar.f66602x6bae49ad = nv3Var.f463224d;
            }
        }
    }

    public static boolean b(v32.b bVar) {
        return bVar != null && (bVar.G & 1) == 1 && lq1.a.b();
    }

    public static boolean c(android.content.Context context, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceLogic", "Jump to webview failed, url is null or nil.");
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        return true;
    }
}
