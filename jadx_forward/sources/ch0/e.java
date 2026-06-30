package ch0;

/* loaded from: classes8.dex */
public final class e implements tg0.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ch0.h f122733a;

    public e(ch0.h hVar) {
        this.f122733a = hVar;
    }

    @Override // tg0.b2
    public boolean a(int i17, android.os.Bundle res) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(res, "res");
        if (i17 != 119) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "ftsAction: AC_ON_FTS_SEARCH_DATA_READY");
        ch0.d dVar = new ch0.d(res, this.f122733a);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            dVar.run();
        } else {
            ((ku5.t0) ku5.t0.f394148d).D(new tg0.e2(dVar));
        }
        return true;
    }

    @Override // tg0.b2
    public void b() {
        ch0.c cVar = new ch0.c(this.f122733a);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            cVar.run();
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).D(new tg0.e2(cVar));
    }

    @Override // tg0.b2
    public void c(tg0.c1 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.String str = result.f500565d;
        java.lang.String str2 = result.f500566e;
        int i17 = result.f500567f;
        int i18 = result.f500568g;
        java.lang.String str3 = result.f500569h;
        java.lang.String str4 = result.f500570i;
        ch0.h hVar = this.f122733a;
        android.view.View view = hVar.f122748b;
        int i19 = 0;
        if (view != null && view.getVisibility() == 0) {
            i19 = 1;
        }
        hVar.d(new tg0.c1(1 ^ i19, 0, null, str, str2, i17, i18, str3, str4, null, 0, null, 0, 0, 0, 0.0d, 0L, 130566, null));
    }

    @Override // tg0.b2
    public void d(boolean z17) {
        if (z17) {
            this.f122733a.g(8);
        }
    }

    @Override // tg0.b2
    public void e(java.lang.String funcName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(funcName, "funcName");
        tg0.l1 l1Var = (tg0.l1) i95.n0.c(tg0.l1.class);
        java.lang.String content = "processJSBAction: ".concat(funcName);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(funcName, "onSetSearchInputWordInFlutter")) {
            if (l1Var != null) {
                if (str == null) {
                    str = "";
                }
                ((yg0.o3) l1Var).Zi("onSetSearchInputWord", str);
                return;
            }
            return;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(funcName, "onMoreClickInFlutter") || l1Var == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        ((yg0.o3) l1Var).Zi("onMoreClick", str);
    }
}
