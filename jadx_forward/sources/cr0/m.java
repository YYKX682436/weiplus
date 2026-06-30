package cr0;

/* loaded from: classes12.dex */
public final class m extends rh.o2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cr0.p f303215e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(cr0.p pVar, cr0.p pVar2) {
        super(pVar, pVar2);
        this.f303215e = pVar;
    }

    @Override // rh.o2
    public rh.d3 a() {
        cr0.p pVar = new cr0.p();
        cr0.b0 b0Var = cr0.h0.f303166k;
        rh.d3 end = this.f477018b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(end, "end");
        cr0.p pVar2 = this.f303215e;
        b0Var.b(pVar2, (cr0.h0) end, pVar);
        for (java.util.Map.Entry entry : ((cr0.p) end).e().entrySet()) {
            java.lang.Object obj = pVar2.e().get(entry.getKey());
            long j17 = 0;
            if (obj == null) {
                obj = 0L;
            }
            long longValue = ((java.lang.Number) obj).longValue();
            java.util.LinkedHashMap e17 = pVar.e();
            java.lang.Object key = entry.getKey();
            long longValue2 = ((java.lang.Number) entry.getValue()).longValue() - longValue;
            if (longValue2 >= 0) {
                j17 = longValue2;
            }
            e17.put(key, java.lang.Long.valueOf(j17));
        }
        pVar.f();
        return pVar;
    }
}
