package oy1;

/* loaded from: classes15.dex */
public final class h extends oy1.l {

    /* renamed from: e, reason: collision with root package name */
    public boolean f431405e;

    @Override // ez1.a
    public void Na(long j17, boolean z17, android.app.Activity activity) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            a(null);
            b();
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.h g17 = g();
        if (g17 != null) {
            g17.e(0, 2, oy1.b.f431376a);
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.h g18 = g();
        if (g18 != null) {
            java.lang.System.currentTimeMillis();
            g18.j(c01.id.c(), oy1.c.f431378a);
        }
    }

    @Override // oy1.l
    public void c(int i17, java.util.List reportInfoList, boolean z17) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.h g17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfoList, "reportInfoList");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            if (!this.f431405e) {
                java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.vfs.q7.c("sdk_data_report"), false);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.h g18 = g();
                this.f431405e = g18 != null ? g18.b(i18) : false;
            }
            bw5.r4 r4Var = new bw5.r4();
            java.util.Iterator it = reportInfoList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                linkedList = r4Var.f113933d;
                if (!hasNext) {
                    break;
                }
                oy1.n nVar = (oy1.n) it.next();
                bw5.q4 q4Var = new bw5.q4();
                q4Var.f113454d = i17;
                boolean[] zArr = q4Var.f113469v;
                zArr[1] = true;
                q4Var.f113455e = nVar.f431433f;
                zArr[2] = true;
                q4Var.f113456f = nVar.f431434g;
                zArr[3] = true;
                q4Var.f113457g = nVar.f431435h;
                zArr[4] = true;
                q4Var.f113459i = nVar.f431437m;
                zArr[6] = true;
                q4Var.f113458h = nVar.f431436i;
                zArr[5] = true;
                q4Var.f113460m = nVar.f431438n;
                zArr[7] = true;
                q4Var.f113461n = nVar.f431439o;
                zArr[8] = true;
                q4Var.f113462o = nVar.f431440p;
                zArr[9] = true;
                q4Var.f113463p = c01.id.c();
                zArr[10] = true;
                q4Var.f113464q = nVar.f431441q;
                zArr[11] = true;
                q4Var.f113465r = nVar.f431432e;
                zArr[12] = true;
                q4Var.f113466s = "3.1.1";
                zArr[13] = true;
                q4Var.f113467t = sz1.a.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                zArr[14] = true;
                q4Var.f113468u = sz1.a.d();
                zArr[15] = true;
                if (z17) {
                    linkedList.add(q4Var);
                    r4Var.f113934e[1] = true;
                } else {
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.h g19 = g();
                    if (g19 != null) {
                        g19.d(q4Var, oy1.d.f431398a);
                    }
                }
            }
            if (linkedList.isEmpty() || (g17 = g()) == null) {
                return;
            }
            g17.c(r4Var, oy1.e.f431399a);
        }
    }

    @Override // oy1.l
    public void d(java.lang.String str) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.h g17 = g();
        if (g17 != null) {
            g17.e(0, 1, oy1.f.f431401a);
        }
    }

    @Override // oy1.l
    public void e(boolean z17) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.h g17 = g();
        if (g17 != null) {
            g17.f(z17, oy1.g.f431402a);
        }
    }

    @Override // oy1.l
    public void f(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.f(context);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.h g17 = g();
        if (g17 != null) {
            g17.i("onIdKeyReport");
        }
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.h g() {
        if (gm0.j1.h() && gm0.j1.a()) {
            ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
            return com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.h.f298139c;
        }
        jx3.f.INSTANCE.t(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46358xc68d61b8, 79);
        return null;
    }

    public void h(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            a(context);
            b();
            ez1.g.f339373i.P(this);
        }
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.vfs.q7.c("sdk_data_report"), false);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.h g17 = g();
        this.f431405e = g17 != null ? g17.b(i17) : false;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.h g18 = g();
        if (g18 != null) {
            g18.g("onIdKeyReport", oy1.a.f431371a);
        }
    }
}
