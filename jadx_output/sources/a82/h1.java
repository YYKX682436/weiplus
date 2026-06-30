package a82;

/* loaded from: classes12.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o72.e2 f2007d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2008e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(o72.e2 e2Var, int i17) {
        super(0);
        this.f2007d = e2Var;
        this.f2008e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        o72.e2 e2Var;
        java.lang.Object obj;
        java.util.LinkedList list = a82.j1.f2046b.f374169d;
        kotlin.jvm.internal.o.f(list, "list");
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            e2Var = this.f2007d;
            if (!hasNext) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.eb4) obj).f373216d == e2Var.field_favLocalId) {
                break;
            }
        }
        r45.eb4 eb4Var = (r45.eb4) obj;
        if (eb4Var != null) {
            eb4Var.D++;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("dataId", e2Var.field_dataId);
            jSONObject.put("dataType", e2Var.field_dataType);
            jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, e2Var.field_path);
            jSONObject.put("url", e2Var.field_cdnUrl);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            eb4Var.E = r26.i0.t(jSONObject2, ",", ";", false);
            eb4Var.f373221i = 3;
            eb4Var.f373223n = 5;
            eb4Var.f373224o = this.f2008e;
            a82.j1.f2045a.c(eb4Var);
        }
        return jz5.f0.f302826a;
    }
}
