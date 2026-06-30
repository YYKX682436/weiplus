package a2;

/* loaded from: classes10.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a2.j f738d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a2.j jVar) {
        super(0);
        this.f738d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        a2.o oVar;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f738d.f752e;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            java.lang.Object obj2 = arrayList.get(0);
            float c17 = ((a2.n) obj2).f784a.c();
            int h17 = kz5.c0.h(arrayList);
            int i17 = 1;
            if (1 <= h17) {
                while (true) {
                    java.lang.Object obj3 = arrayList.get(i17);
                    float c18 = ((a2.n) obj3).f784a.c();
                    if (java.lang.Float.compare(c17, c18) < 0) {
                        obj2 = obj3;
                        c17 = c18;
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
        return java.lang.Float.valueOf((nVar == null || (oVar = nVar.f784a) == null) ? 0.0f : oVar.c());
    }
}
