package cp4;

/* loaded from: classes10.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.r f302528d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(cp4.r rVar) {
        super(4);
        this.f302528d = rVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String key = (java.lang.String) obj2;
        int intValue2 = ((java.lang.Number) obj3).intValue();
        java.util.ArrayList arrayList = (java.util.ArrayList) obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        cp4.r rVar = this.f302528d;
        synchronized (rVar.f302605w) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callback key:");
            sb6.append(key);
            sb6.append(" ret:");
            sb6.append(intValue2);
            sb6.append(" size:");
            sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorCaptionPlugin", sb6.toString());
            if (intValue2 != 0) {
                ((java.util.HashSet) rVar.f302602t.get(intValue)).add(key);
                if (((java.util.HashSet) rVar.f302602t.get(intValue)).size() >= ((java.util.HashMap) rVar.f302599q.get(intValue)).size()) {
                    int i17 = intValue2 == -2 ? com.p314xaae8f345.mm.R.C30867xcad56011.k87 : com.p314xaae8f345.mm.R.C30867xcad56011.f574982k84;
                    android.content.Context context = rVar.f302593h;
                    db5.t7.m123883x26a183b(context, i65.a.r(context, i17), 0).show();
                    rVar.D().i(intValue, i65.a.r(rVar.f302593h, com.p314xaae8f345.mm.R.C30867xcad56011.k6k));
                    rVar.f302604v = true;
                }
            }
            rVar.E(intValue);
            rVar.G(intValue);
        }
        return jz5.f0.f384359a;
    }
}
