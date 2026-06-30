package w01;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f523405a = false;

    /* renamed from: b, reason: collision with root package name */
    public r45.e67 f523406b;

    public void a(java.lang.String str) {
        if (this.f523406b != null) {
            return;
        }
        if (!this.f523405a) {
            r45.b67 b67Var = new r45.b67();
            b67Var.f452111d = 0;
            gm0.j1.n().f354821b.g(new r01.f3(str, 2, b67Var, new r01.v1(new r45.c67(), str)));
            this.f523405a = true;
        }
        r45.e67 e67Var = null;
        try {
            byte[] j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("brandService", 1, null).j(r01.w1.a(str, 2, null));
            r45.e67 e67Var2 = new r45.e67();
            e67Var2.mo11468x92b714fd(j17);
            e67Var = e67Var2;
        } catch (java.lang.Throwable unused) {
        }
        this.f523406b = e67Var;
    }

    public void b(android.app.Activity activity) {
        java.lang.String str;
        r45.e67 e67Var = this.f523406b;
        if (e67Var == null) {
            return;
        }
        int i17 = e67Var.f454590d;
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            r45.g67 g67Var = e67Var.f454592f;
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1 c11300x89dbd7a1 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1();
            c11300x89dbd7a1.f33249xa1713a8c = g67Var.f456463d;
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504(c11300x89dbd7a1);
            c11286x34a5504.f33130x6942258 = g67Var.f456465f;
            c11286x34a5504.f33121x993583fc = g67Var.f456466g;
            try {
                c11286x34a5504.f33128x4f3b3aa0 = android.util.Base64.decode(g67Var.f456464e.f273689a, 0);
            } catch (java.lang.Throwable unused) {
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req req = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req();
            req.f32866x7fa0d2de = "com.tencent.wework.webpage";
            req.f33049x38eb0007 = c11286x34a5504;
            req.f33050x683188c = 0;
            w01.b.b(activity, req);
            return;
        }
        r45.f67 f67Var = e67Var.f454591e;
        if (f67Var == null) {
            return;
        }
        java.lang.String str2 = f67Var.f455602d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str = null;
        } else {
            str = g83.a.b() + kk.k.g(str2.getBytes());
        }
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenSdkBridge", "doSendImage bad img_url=" + f67Var.f455602d);
            return;
        }
        o11.f fVar = new o11.f();
        fVar.f423615f = str;
        fVar.f423611b = true;
        fVar.f423610a = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenSdkBridge", "doSendImage fullPath=%s", str);
        n11.a.b().d(f67Var.f455602d, fVar.a(), new w01.a(str, new java.lang.ref.WeakReference(activity)));
    }
}
