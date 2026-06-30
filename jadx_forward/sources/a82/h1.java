package a82;

/* loaded from: classes12.dex */
public final class h1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o72.e2 f83540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f83541e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(o72.e2 e2Var, int i17) {
        super(0);
        this.f83540d = e2Var;
        this.f83541e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        o72.e2 e2Var;
        java.lang.Object obj;
        java.util.LinkedList list = a82.j1.f83579b.f455702d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "list");
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            e2Var = this.f83540d;
            if (!hasNext) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.eb4) obj).f454749d == e2Var.f67088x958756b0) {
                break;
            }
        }
        r45.eb4 eb4Var = (r45.eb4) obj;
        if (eb4Var != null) {
            eb4Var.D++;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("dataId", e2Var.f67085xf604e54a);
            jSONObject.put("dataType", e2Var.f67086x886617a9);
            jSONObject.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, e2Var.f67091x2260084a);
            jSONObject.put("url", e2Var.f67084xf47770e7);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            eb4Var.E = r26.i0.t(jSONObject2, ",", ";", false);
            eb4Var.f454754i = 3;
            eb4Var.f454756n = 5;
            eb4Var.f454757o = this.f83541e;
            a82.j1.f83578a.c(eb4Var);
        }
        return jz5.f0.f384359a;
    }
}
