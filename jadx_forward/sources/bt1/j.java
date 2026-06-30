package bt1;

/* loaded from: classes4.dex */
public final class j implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bt1.l f105696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f105697b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f105698c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.r f105699d;

    public j(bt1.l lVar, java.util.List list, int i17, fp0.r rVar) {
        this.f105696a = lVar;
        this.f105697b = list;
        this.f105698c = i17;
        this.f105699d = rVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        fp0.r rVar = this.f105699d;
        try {
            int i17 = fVar.f152148a;
            bt1.l lVar = this.f105696a;
            if (i17 == 0 && fVar.f152149b == 0) {
                java.util.LinkedList resp_continue_flag = ((r45.xr) fVar.f152151d).f471881d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp_continue_flag, "resp_continue_flag");
                if (!resp_continue_flag.isEmpty()) {
                    bt1.l lVar2 = this.f105696a;
                    java.util.LinkedList resp_continue_flag2 = ((r45.xr) fVar.f152151d).f471881d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp_continue_flag2, "resp_continue_flag");
                    bt1.l.b(lVar2, resp_continue_flag2, bt1.g.f105688h, true, 0, 8, null);
                }
                android.os.Message mo50292x733c63a2 = lVar.f105706c.mo50292x733c63a2(1, ((r45.xr) fVar.f152151d).f471883f);
                java.util.LinkedList resp_continue_flag3 = ((r45.xr) fVar.f152151d).f471881d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp_continue_flag3, "resp_continue_flag");
                mo50292x733c63a2.arg1 = !resp_continue_flag3.isEmpty() ? 1 : 0;
                mo50292x733c63a2.sendToTarget();
            } else {
                if (i17 != 3) {
                    lVar.a(this.f105697b, bt1.g.f105689i, false, this.f105698c + 1);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.d(20845, java.lang.Integer.valueOf(fVar.f152148a), 1, fVar.f152148a + ':' + fVar.f152149b + ':' + fVar.f152150c, 1);
                g0Var.C(1465L, 100L, 1L);
                g0Var.C(1465L, ((long) 100) + ((long) fVar.f152148a), 1L);
            }
            rVar.b(fp0.u.f346823f);
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            rVar.b(fp0.u.f346823f);
            throw th6;
        }
    }
}
