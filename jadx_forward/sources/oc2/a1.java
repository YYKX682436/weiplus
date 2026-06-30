package oc2;

/* loaded from: classes3.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f425685a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f425686b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f425687c;

    /* renamed from: d, reason: collision with root package name */
    public long f425688d;

    public a1(java.lang.String callTag) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callTag, "callTag");
        this.f425685a = callTag;
        boolean z18 = false;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f387758a;
        }
        this.f425686b = z18;
        this.f425687c = jz5.h.b(oc2.z0.f425858d);
    }

    public static void a(oc2.a1 a1Var, java.lang.String tag, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            tag = "End";
        }
        a1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        if (a1Var.f425686b) {
            a1Var.b().add(new jz5.l(tag, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
            sb6.append(java.lang.Thread.currentThread().getName());
            sb6.append(')');
            java.util.LinkedList<jz5.l> b17 = a1Var.b();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
            for (jz5.l lVar : b17) {
                arrayList.add("step:" + ((java.lang.String) lVar.f384366d) + " cost:" + (((java.lang.Number) lVar.f384367e).longValue() - a1Var.f425688d));
            }
            sb6.append(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a1Var.f425685a, sb6.toString());
        }
    }

    public static void d(oc2.a1 a1Var, java.lang.String tag, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        a1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        if (a1Var.f425686b) {
            a1Var.b().add(new jz5.l(tag, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
            if (z17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
                sb6.append(java.lang.Thread.currentThread().getName());
                sb6.append(')');
                java.util.LinkedList<jz5.l> b17 = a1Var.b();
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
                for (jz5.l lVar : b17) {
                    arrayList.add("step:" + ((java.lang.String) lVar.f384366d) + " cost:" + (((java.lang.Number) lVar.f384367e).longValue() - a1Var.f425688d));
                }
                sb6.append(arrayList);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a1Var.f425685a, sb6.toString());
            }
        }
    }

    public final java.util.LinkedList b() {
        return (java.util.LinkedList) ((jz5.n) this.f425687c).mo141623x754a37bb();
    }

    public final void c() {
        if (this.f425686b) {
            b().clear();
            this.f425688d = java.lang.System.currentTimeMillis();
            b().add(new jz5.l("Start", java.lang.Long.valueOf(this.f425688d)));
        }
    }
}
