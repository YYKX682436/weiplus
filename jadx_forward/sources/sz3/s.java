package sz3;

/* loaded from: classes15.dex */
public final class s implements xz3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sz3.w f495648a;

    public s(sz3.w wVar) {
        this.f495648a = wVar;
    }

    @Override // xz3.g
    public void a(sz3.x0 result, int i17, long j17, int i18, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRetrievalFailed source: ");
        sb6.append(result.f495680a);
        sb6.append(", session: ");
        sb6.append(result.f495681b);
        sb6.append(", scanImageType: ");
        int i19 = result.f495682c;
        sb6.append(i19);
        sb6.append(", errCode: ");
        sb6.append(i18);
        sb6.append(", errMsg: ");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewAiImageHandler", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1259, 254);
        this.f495648a.k(result, i18, str);
        if (i19 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d.a(15, result.f495685f);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d.a(26, result.f495685f);
        }
    }

    @Override // xz3.k
    public void b(xz3.l task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        if (task instanceof xz3.f) {
            sz3.p pVar = ((xz3.f) task).f539748d;
            sz3.y0 y0Var = pVar.f495478b.f495496e;
            if (y0Var.f495694b > 0) {
                y0Var.f495703k = java.lang.System.currentTimeMillis() - pVar.f495478b.f495496e.f495694b;
            }
        }
    }

    @Override // xz3.m
    public void c(sz3.x0 result) {
        sz3.y0 y0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        sz3.w0 w0Var = (sz3.w0) kz5.n0.Z(result.f495684e);
        java.lang.Long l17 = null;
        sz3.a1 a1Var = w0Var != null ? w0Var.f495667e : null;
        if (a1Var != null) {
            a1Var.f495496e.f495704l = java.lang.System.currentTimeMillis() - a1Var.f495496e.f495695c;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUploadSuccess source: ");
        sb6.append(result.f495680a);
        sb6.append(", session: ");
        sb6.append(result.f495681b);
        sb6.append(", scanImageType: ");
        sb6.append(result.f495682c);
        sb6.append(", uploadDuration: ");
        if (a1Var != null && (y0Var = a1Var.f495496e) != null) {
            l17 = java.lang.Long.valueOf(y0Var.f495704l);
        }
        sb6.append(l17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewAiImageHandler", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1259, 251);
        this.f495648a.n(result);
    }

    @Override // xz3.m
    public void d(sz3.x0 result, int i17, long j17, int i18, int i19, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUploadFailed source: ");
        sb6.append(result.f495680a);
        sb6.append(", session: ");
        sb6.append(result.f495681b);
        sb6.append(", scanImageType: ");
        int i27 = result.f495682c;
        sb6.append(i27);
        sb6.append(", errType: ");
        sb6.append(i18);
        sb6.append(", errCode: ");
        sb6.append(i19);
        sb6.append(", errMsg: ");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewAiImageHandler", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1259, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53182x14a8432);
        this.f495648a.m(result, 1003, str);
        vz3.t.f523243a.j();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.c cVar = result.f495685f;
        if (cVar != null) {
            cVar.f240361e = result.f495686g;
        }
        boolean z17 = true;
        if (i27 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d.a(13, cVar);
            return;
        }
        if (i17 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d.a(23, cVar);
            return;
        }
        if (i17 != 4) {
            return;
        }
        if (i19 != 1003) {
            java.util.ArrayList arrayList = result.f495684e;
            if (arrayList != null && !arrayList.isEmpty()) {
                z17 = false;
            }
            if (!z17) {
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d.a(43, result.f495685f);
    }

    @Override // xz3.m
    public void e(sz3.p request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        request.f495478b.f495496e.f495695c = java.lang.System.currentTimeMillis();
    }

    @Override // xz3.a
    public void f(sz3.c1 c1Var, sz3.x0 result, yz5.l addResultCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addResultCallback, "addResultCallback");
        dz3.i.p(new sz3.r(c1Var, this.f495648a, result, addResultCallback));
    }

    @Override // xz3.k
    public void g(xz3.l task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        if (task instanceof xz3.f) {
            sz3.p pVar = ((xz3.f) task).f539748d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NewAiImageHandler", "getProductTask onTaskCancel %s", java.lang.Integer.valueOf(pVar.f495477a));
            if (pVar.f495477a == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d.a(16, pVar.f495478b.f495497f);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d.a(27, pVar.f495478b.f495497f);
            }
        }
    }

    @Override // xz3.g
    public void h(sz3.x0 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRetrievalSuccess source: ");
        sb6.append(result.f495680a);
        sb6.append(", session: ");
        long j17 = result.f495681b;
        sb6.append(j17);
        sb6.append(", scanImageType: ");
        int i17 = result.f495682c;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewAiImageHandler", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1259, 252);
        this.f495648a.l(result);
        sz3.w0 w0Var = (sz3.w0) kz5.n0.Z(result.f495684e);
        sz3.a1 a1Var = w0Var != null ? w0Var.f495667e : null;
        if (a1Var != null) {
            sz3.y0 y0Var = a1Var.f495496e;
            java.lang.String valueOf = java.lang.String.valueOf(j17);
            y0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueOf, "<set-?>");
            y0Var.f495697e = valueOf;
            sz3.y0 y0Var2 = a1Var.f495496e;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            sz3.y0 y0Var3 = a1Var.f495496e;
            y0Var2.f495705m = currentTimeMillis - y0Var3.f495696d;
            if (i17 == 1) {
                y0Var3.f495698f = 1;
            } else if (i17 == 2) {
                y0Var3.f495698f = 2;
            } else if (i17 == 3) {
                y0Var3.f495698f = 3;
            }
            y0Var3.f495709q = e04.j2.a();
            sz3.y0 y0Var4 = a1Var.f495496e;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = et5.c.f338205a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = et5.c.f338205a;
            y0Var4.f495708p = o4Var2 != null ? o4Var2.getInt("scan_code_last_frame_cost", 0) : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.e.f240407a.a(a1Var.f495496e);
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d.a(19, result.f495685f);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d.a(34, result.f495685f);
        }
    }

    @Override // xz3.g
    public void i(sz3.n request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        request.f495478b.f495496e.f495696d = java.lang.System.currentTimeMillis();
    }

    @Override // xz3.k
    public void j(xz3.l task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewAiImageHandler", "getProductTask onTaskFinish %d", java.lang.Integer.valueOf(task.hashCode()));
    }

    @Override // xz3.k
    public void k(xz3.l task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        if (task instanceof xz3.f) {
            ((xz3.f) task).f539748d.f495478b.f495496e.f495694b = java.lang.System.currentTimeMillis();
        }
    }
}
