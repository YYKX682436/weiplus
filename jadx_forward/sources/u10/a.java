package u10;

/* loaded from: classes9.dex */
public final class a extends t10.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String name) {
        super(name);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
    }

    @Override // t10.c
    public boolean a(pq.a context, bw5.x7 jumpInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        if (jumpInfo.c() == null) {
            return false;
        }
        java.lang.String m12644xb5887639 = jumpInfo.c().m12644xb5887639();
        return !(m12644xb5887639 == null || m12644xb5887639.length() == 0);
    }

    @Override // t10.c
    public void b(pq.a context, bw5.x7 jumpInfo, t10.d callback) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (jumpInfo.c() == null) {
            callback.c("jumpInfo.html5Info is null");
            return;
        }
        bw5.o7 c17 = jumpInfo.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getHtml5Info(...)");
        java.lang.String m12644xb5887639 = c17.m12644xb5887639();
        if (m12644xb5887639 == null || m12644xb5887639.length() == 0) {
            callback.c("jumpInfo.html5Info.url is null");
            return;
        }
        android.content.Context c18 = context.c();
        if (c18 == null) {
            callback.c("context.context is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ECS_O.Router.H5", "jumpH5:url:%s", c17.m12644xb5887639());
        z20.e eVar = z20.e.f551076e;
        z20.b bVar = new z20.b();
        bVar.f551070a = eVar;
        bw5.q9 q9Var = new bw5.q9();
        q9Var.f113532d = "ecso_open";
        q9Var.f113546u[1] = true;
        q9Var.c(java.lang.System.currentTimeMillis());
        q9Var.b(2);
        bVar.f551071b = q9Var;
        bVar.f(java.lang.String.valueOf(context.f439088e));
        bVar.c("open_h5");
        bVar.e(kz5.b1.e(new jz5.l("url", c17.m12644xb5887639())));
        bVar.a();
        boolean[] zArr = c17.f112539i;
        if (zArr[4] && c17.f112537g && (z17 = zArr[5])) {
            bw5.n7 n7Var = z17 ? c17.f112538h : new bw5.n7();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1 n1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1(0.0f, 0.0f, null, false, false, 0, false, false, 0, false, false, 0, false, false, false, null, false, 0, false, 0, false, false, false, 8388607, null);
            boolean[] zArr2 = n7Var.f112063o;
            if (zArr2[1]) {
                n1Var.f268951a = (float) n7Var.f112055d;
            }
            if (zArr2[3]) {
                n1Var.f268967q = n7Var.f112057f;
            } else {
                n1Var.f268967q = false;
            }
            if (zArr2[4]) {
                n1Var.f268960j = !n7Var.f112058g;
            } else {
                n1Var.f268960j = true;
            }
            if (zArr2[6]) {
                n1Var.f268958h = !n7Var.f112060i;
            } else {
                n1Var.f268958h = true;
            }
            if (zArr2[7]) {
                n1Var.f268964n = n7Var.f112061m;
            } else {
                n1Var.f268964n = false;
            }
            if (zArr2[8]) {
                n1Var.f268955e = n7Var.f112062n;
            } else {
                n1Var.f268955e = false;
            }
            if (zArr2[2]) {
                int i17 = n7Var.f112056e;
                if (i17 == 1) {
                    n1Var.f268956f = 1;
                } else if (i17 == 2) {
                    n1Var.f268956f = 2;
                } else if (i17 == 3) {
                    n1Var.f268956f = -1;
                }
            }
            n1Var.f268965o = false;
            zg0.u2 u2Var = (zg0.u2) i95.n0.c(zg0.u2.class);
            java.lang.String m12644xb58876392 = jumpInfo.c().m12644xb5887639();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m12644xb58876392, "getUrl(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1) ((yg0.s2) u2Var).wi(c18, m12644xb58876392, null, n1Var)).show();
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", c17.m12644xb5887639());
            j45.l.j(c18, "webview", ".ui.tools.WebViewUI", intent, null);
        }
        callback.d(null);
    }

    @Override // t10.c
    public void c(pq.a context, bw5.x7 jumpInfo, bw5.l8 l8Var, t10.d callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        callback.d(null);
    }
}
