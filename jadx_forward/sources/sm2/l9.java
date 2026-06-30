package sm2;

/* loaded from: classes3.dex */
public final class l9 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f491090a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f491091b;

    public l9(android.view.View root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        this.f491090a = root;
        this.f491091b = new java.util.ArrayList();
    }

    public static void b(sm2.l9 l9Var, java.lang.Integer num, yz5.l lVar, yz5.a init, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            num = null;
        }
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        l9Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(init, "init");
        l9Var.a(new sm2.m9(null, num, init, lVar));
    }

    public static void c(sm2.l9 l9Var, int i17, java.lang.Integer num, yz5.l lVar, yz5.a init, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            num = null;
        }
        if ((i18 & 4) != 0) {
            lVar = null;
        }
        l9Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(init, "init");
        l9Var.a(new sm2.m9(java.lang.Integer.valueOf(i17), num, init, lVar));
    }

    public final void a(sm2.m9 config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        android.os.SystemClock.elapsedRealtime();
        try {
            java.lang.Integer num = config.f491109a;
            if (num != null) {
                android.view.ViewStub viewStub = (android.view.ViewStub) this.f491090a.findViewById(num.intValue());
                if (viewStub != null) {
                    viewStub.inflate();
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l) config.f491111c.mo152xb9724478();
            if (lVar != null) {
                java.lang.Integer num2 = config.f491110b;
                if (num2 != null) {
                    lVar.K0(num2.intValue());
                }
                yz5.l lVar2 = config.f491112d;
                if (lVar2 != null) {
                    lVar2.mo146xb9724478(lVar);
                }
                ((java.util.ArrayList) this.f491091b).add(lVar);
                android.os.SystemClock.elapsedRealtime();
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}
