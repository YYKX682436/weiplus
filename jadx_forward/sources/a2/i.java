package a2;

/* loaded from: classes10.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a2.j f82274d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a2.j jVar) {
        super(0);
        this.f82274d = jVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        a2.o oVar;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f82274d.f82285e;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            java.lang.Object obj2 = arrayList.get(0);
            float b17 = ((a2.n) obj2).f82317a.b();
            int h17 = kz5.c0.h(arrayList);
            int i17 = 1;
            if (1 <= h17) {
                while (true) {
                    java.lang.Object obj3 = arrayList.get(i17);
                    float b18 = ((a2.n) obj3).f82317a.b();
                    if (java.lang.Float.compare(b17, b18) < 0) {
                        obj2 = obj3;
                        b17 = b18;
                    }
                    if (i17 == h17) {
                        break;
                    }
                    i17++;
                }
            }
            obj = obj2;
        }
        a2.n nVar = (a2.n) obj;
        return java.lang.Float.valueOf((nVar == null || (oVar = nVar.f82317a) == null) ? 0.0f : oVar.b());
    }
}
