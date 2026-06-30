package lf4;

/* loaded from: classes4.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f400029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lf4.j1 f400030e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(boolean z17, lf4.j1 j1Var) {
        super(0);
        this.f400029d = z17;
        this.f400030e = j1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        lf4.j1 j1Var = this.f400030e;
        boolean z17 = this.f400029d;
        if (z17) {
            int size = j1Var.f399955i.size();
            int i17 = j1Var.f399959p;
            if (i17 >= 0 && i17 < size) {
                java.util.ArrayList arrayList = j1Var.f399955i;
                java.lang.Object obj = arrayList.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
                int size2 = arrayList2.size();
                int i18 = j1Var.f399960q;
                if (i18 >= 0 && i18 < size2) {
                    arrayList2.remove(i18);
                    java.util.ArrayList arrayList3 = j1Var.f399964u;
                    java.lang.Object obj2 = arrayList3.get(j1Var.f399959p);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                    java.lang.String str = (java.lang.String) obj2;
                    j1Var.o(str, arrayList2);
                    if (arrayList2.isEmpty()) {
                        arrayList.remove(arrayList2);
                        arrayList3.remove(j1Var.f399959p);
                        j1Var.f399956m.remove(j1Var.f399959p);
                        j1Var.f399957n.remove(str);
                    }
                }
            }
        }
        ((sf4.a1) j1Var.f399952f).b(z17);
        j1Var.f399959p = -1;
        j1Var.f399960q = -1;
        return jz5.f0.f384359a;
    }
}
