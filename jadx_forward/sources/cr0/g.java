package cr0;

/* loaded from: classes12.dex */
public final class g extends rh.o2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cr0.j f303161e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(cr0.j jVar, cr0.j jVar2) {
        super(jVar, jVar2);
        this.f303161e = jVar;
    }

    @Override // rh.o2
    public rh.d3 a() {
        cr0.j jVar = new cr0.j();
        cr0.u uVar = cr0.w.f303319h;
        rh.d3 end = this.f477018b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(end, "end");
        cr0.j jVar2 = this.f303161e;
        uVar.b(jVar2, (cr0.w) end, jVar);
        for (java.util.Map.Entry entry : ((cr0.j) end).d().entrySet()) {
            java.lang.Object obj = jVar2.d().get(entry.getKey());
            long j17 = 0;
            if (obj == null) {
                obj = 0L;
            }
            long longValue = ((java.lang.Number) obj).longValue();
            java.util.LinkedHashMap d17 = jVar.d();
            java.lang.Object key = entry.getKey();
            long longValue2 = ((java.lang.Number) entry.getValue()).longValue() - longValue;
            if (longValue2 >= 0) {
                j17 = longValue2;
            }
            d17.put(key, java.lang.Long.valueOf(j17));
        }
        jVar.e();
        return jVar;
    }
}
