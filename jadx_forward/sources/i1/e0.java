package i1;

/* loaded from: classes13.dex */
public final class e0 extends n0.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(i1.d0 root) {
        super(root);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
    }

    @Override // n0.e
    public void b(int i17, int i18) {
        k((i1.d0) this.f414959c).e(i17, i18);
    }

    @Override // n0.e
    public void e(int i17, int i18, int i19) {
        i1.b k17 = k((i1.d0) this.f414959c);
        java.util.List list = k17.f368350c;
        int i27 = 0;
        if (i17 > i18) {
            while (i27 < i19) {
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                i1.d0 d0Var = (i1.d0) arrayList.get(i17);
                arrayList.remove(i17);
                arrayList.add(i18, d0Var);
                i18++;
                i27++;
            }
        } else {
            while (i27 < i19) {
                java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
                i1.d0 d0Var2 = (i1.d0) arrayList2.get(i17);
                arrayList2.remove(i17);
                arrayList2.add(i18 - 1, d0Var2);
                i27++;
            }
        }
        k17.c();
    }

    @Override // n0.e
    public void f(int i17, java.lang.Object obj) {
        i1.d0 instance = (i1.d0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instance, "instance");
        i1.b k17 = k((i1.d0) this.f414959c);
        k17.getClass();
        java.util.List list = k17.f368350c;
        if (i17 < ((java.util.ArrayList) list).size()) {
            ((java.util.ArrayList) list).set(i17, instance);
        } else {
            ((java.util.ArrayList) list).add(instance);
        }
        instance.d(k17.f368355h);
        k17.c();
    }

    @Override // n0.e
    public void g(int i17, java.lang.Object obj) {
        i1.d0 instance = (i1.d0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instance, "instance");
    }

    @Override // n0.a
    public void j() {
        i1.b k17 = k((i1.d0) this.f414957a);
        k17.e(0, ((java.util.ArrayList) k17.f368350c).size());
    }

    public final i1.b k(i1.d0 d0Var) {
        if (d0Var instanceof i1.b) {
            return (i1.b) d0Var;
        }
        throw new java.lang.IllegalStateException("Cannot only insert VNode into Group".toString());
    }
}
