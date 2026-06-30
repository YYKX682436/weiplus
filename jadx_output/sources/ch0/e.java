package ch0;

/* loaded from: classes8.dex */
public final class e implements tg0.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ch0.h f41200a;

    public e(ch0.h hVar) {
        this.f41200a = hVar;
    }

    @Override // tg0.b2
    public boolean a(int i17, android.os.Bundle res) {
        kotlin.jvm.internal.o.g(res, "res");
        if (i17 != 119) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "ftsAction: AC_ON_FTS_SEARCH_DATA_READY");
        ch0.d dVar = new ch0.d(res, this.f41200a);
        if (kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            dVar.run();
        } else {
            ((ku5.t0) ku5.t0.f312615d).D(new tg0.e2(dVar));
        }
        return true;
    }

    @Override // tg0.b2
    public void b() {
        ch0.c cVar = new ch0.c(this.f41200a);
        if (kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            cVar.run();
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).D(new tg0.e2(cVar));
    }

    @Override // tg0.b2
    public void c(tg0.c1 result) {
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.String str = result.f419032d;
        java.lang.String str2 = result.f419033e;
        int i17 = result.f419034f;
        int i18 = result.f419035g;
        java.lang.String str3 = result.f419036h;
        java.lang.String str4 = result.f419037i;
        ch0.h hVar = this.f41200a;
        android.view.View view = hVar.f41215b;
        int i19 = 0;
        if (view != null && view.getVisibility() == 0) {
            i19 = 1;
        }
        hVar.d(new tg0.c1(1 ^ i19, 0, null, str, str2, i17, i18, str3, str4, null, 0, null, 0, 0, 0, 0.0d, 0L, 130566, null));
    }

    @Override // tg0.b2
    public void d(boolean z17) {
        if (z17) {
            this.f41200a.g(8);
        }
    }

    @Override // tg0.b2
    public void e(java.lang.String funcName, java.lang.String str) {
        kotlin.jvm.internal.o.g(funcName, "funcName");
        tg0.l1 l1Var = (tg0.l1) i95.n0.c(tg0.l1.class);
        java.lang.String content = "processJSBAction: ".concat(funcName);
        kotlin.jvm.internal.o.g(content, "content");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content);
        if (kotlin.jvm.internal.o.b(funcName, "onSetSearchInputWordInFlutter")) {
            if (l1Var != null) {
                if (str == null) {
                    str = "";
                }
                ((yg0.o3) l1Var).Zi("onSetSearchInputWord", str);
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.o.b(funcName, "onMoreClickInFlutter") || l1Var == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        ((yg0.o3) l1Var).Zi("onMoreClick", str);
    }
}
