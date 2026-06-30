package tr5;

/* loaded from: classes13.dex */
public abstract class c0 {
    public static void a(tr5.a0 a0Var, tr5.r rVar, tr5.q qVar, java.lang.String[] strArr) {
        java.util.Set c17 = a0Var.c();
        java.util.List e17 = a0Var.e();
        java.util.concurrent.CountDownLatch countDownLatch = a0Var.f502978f;
        if (countDownLatch == null) {
            throw new java.lang.IllegalStateException("mCountDownLatch".concat(" is not initialized yet"));
        }
        if (qVar.d() && !sr5.a.c(strArr)) {
            ((es5.c) a0Var.f()).c(rVar, strArr);
            if (!"Local".equals(rVar.mo11135x730bcac6().f503023a)) {
                countDownLatch.countDown();
            }
        }
        if (c17.isEmpty() && e17.isEmpty() && countDownLatch.getCount() > 0) {
            countDownLatch.countDown();
        }
        a0Var.h().c(rVar, qVar);
    }

    public static void b(tr5.r rVar, tr5.a0 a0Var) {
        if (rVar == null) {
            throw new java.lang.IllegalArgumentException("dns".concat(" can not be null"));
        }
        if (a0Var == null) {
            throw new java.lang.IllegalArgumentException("lookupContext".concat(" can not be null"));
        }
        tr5.b0 b0Var = new tr5.b0(a0Var, rVar);
        if ("Local".equals(rVar.mo11135x730bcac6().f503023a)) {
            a0Var.j().a(b0Var, false);
        } else {
            a0Var.j().a(b0Var, true);
        }
    }

    public static void c(tr5.p pVar, tr5.a0 a0Var, boolean z17) {
        if (pVar == null) {
            throw new java.lang.IllegalArgumentException("session".concat(" can not be null"));
        }
        if (a0Var == null) {
            throw new java.lang.IllegalArgumentException("lookupContext".concat(" can not be null"));
        }
        or5.b.a("prepareNonBlockLookupTask call, forRetry:%b", java.lang.Boolean.valueOf(z17));
        if (!((bs5.a) ((bs5.b) pVar).f105545n).a()) {
            if (z17) {
                return;
            }
            a0Var.e().add(pVar);
            return;
        }
        or5.b.a("prepareNonBlockLookupTask start receive", new java.lang.Object[0]);
        bs5.f fVar = (bs5.f) pVar;
        java.lang.String[] c17 = fVar.c();
        bs5.g gVar = fVar.f105556e;
        if (gVar.d() || gVar.f347881e) {
            if (!z17) {
                a0Var.e().remove(pVar);
            }
            java.util.Set c18 = a0Var.c();
            tr5.r rVar = fVar.f105554c;
            c18.remove(rVar);
            a(a0Var, rVar, gVar, c17);
        }
    }
}
