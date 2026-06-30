package ev4;

/* loaded from: classes8.dex */
public final class i implements tg0.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ev4.j f338485a;

    public i(ev4.j jVar) {
        this.f338485a = jVar;
    }

    @Override // tg0.b2
    public boolean a(int i17, android.os.Bundle res) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(res, "res");
        if (i17 != 119) {
            return false;
        }
        ev4.f fVar = new ev4.f(this.f338485a, res);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            fVar.run();
        } else {
            ((ku5.t0) ku5.t0.f394148d).D(new tg0.e2(fVar));
        }
        return true;
    }

    @Override // tg0.b2
    public void b() {
        ev4.e eVar = new ev4.e(this.f338485a);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            eVar.run();
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).D(new tg0.e2(eVar));
    }

    @Override // tg0.b2
    public void c(tg0.c1 result) {
        tg0.c2 c2Var;
        tg0.h2 h2Var;
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        fv4.i iVar = this.f338485a.f338486a;
        iVar.getClass();
        tg0.c2 c2Var2 = iVar.f348542c;
        if ((c2Var2 != null ? c2Var2.f500582d : null) == tg0.g2.f500607f) {
            fv4.g gVar = iVar.f348541b;
            gVar.getClass();
            java.lang.String str = result.f500565d;
            java.lang.String str2 = result.f500566e;
            int i17 = result.f500567f;
            int i18 = result.f500568g;
            java.lang.String str3 = result.f500569h;
            java.lang.String str4 = result.f500570i;
            fv4.i iVar2 = gVar.f348538a;
            tg0.c1 c1Var = new tg0.c1(((iVar2 == null || (view = iVar2.f348543d) == null || view.getVisibility() != 0) ? 0 : 1) ^ 1, 0, null, str, str2, i17, i18, str3, str4, null, 0, null, 0, 0, 0, 0.0d, 0L, 130566, null);
            fv4.i iVar3 = gVar.f348538a;
            if (iVar3 == null || (c2Var = iVar3.f348542c) == null || (h2Var = c2Var.f500586h) == null) {
                return;
            }
            ((ch0.h0) h2Var).a(c2Var.f500582d.f500611d, c1Var);
        }
    }

    @Override // tg0.b2
    public void d(boolean z17) {
        this.f338485a.f338486a.f348541b.e(z17);
    }

    @Override // tg0.b2
    public void e(java.lang.String funcName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(funcName, "funcName");
        int hashCode = funcName.hashCode();
        if (hashCode == -2115079805) {
            if (funcName.equals("onMoreClickInFlutter")) {
                ev4.h hVar = new ev4.h(this.f338485a, str);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
                    hVar.run();
                    return;
                }
                ((ku5.t0) ku5.t0.f394148d).D(new tg0.e2(hVar));
                return;
            }
            return;
        }
        if (hashCode == -171895335) {
            if (funcName.equals("onWebViewSizeChanged")) {
                java.lang.String content = "H5 call onWebViewSizeChanged, params: " + str;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content);
                this.f338485a.f338486a.f348541b.d(str);
                return;
            }
            return;
        }
        if (hashCode == 1484266638 && funcName.equals("onSetSearchInputWordInFlutter")) {
            ev4.g gVar = new ev4.g(this.f338485a, str);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
                gVar.run();
                return;
            }
            ((ku5.t0) ku5.t0.f394148d).D(new tg0.e2(gVar));
        }
    }
}
