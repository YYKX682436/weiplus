package rv0;

/* loaded from: classes5.dex */
public final class u5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f481811d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(rv0.z6 z6Var) {
        super(2);
        this.f481811d = z6Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        sv0.h data = (sv0.h) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        rv0.z6 z6Var = this.f481811d;
        sv0.f fVar = z6Var.f481897t;
        fVar.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList = fVar.f357503d;
        int i17 = 0;
        for (java.lang.Object obj3 : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sv0.h hVar = (sv0.h) obj3;
            if (hVar.f494759d) {
                linkedHashMap.put(java.lang.Integer.valueOf(i17), sv0.h.a(hVar, null, 0L, false, false, 7, null));
            }
            i17 = i18;
        }
        java.util.Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue2 = ((java.lang.Number) it.next()).intValue();
            sv0.h hVar2 = (sv0.h) linkedHashMap.get(java.lang.Integer.valueOf(intValue2));
            if (hVar2 != null) {
                arrayList.set(intValue2, hVar2);
                fVar.m8147xed6e4d18(intValue2);
            }
        }
        arrayList.set(intValue, sv0.h.a(data, null, 0L, false, true, 7, null));
        fVar.m8147xed6e4d18(intValue);
        z6Var.w7(data.f494756a);
        return jz5.f0.f384359a;
    }
}
