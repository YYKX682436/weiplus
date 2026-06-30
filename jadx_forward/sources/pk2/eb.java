package pk2;

/* loaded from: classes3.dex */
public final class eb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437252d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(pk2.o9 o9Var) {
        super(1);
        this.f437252d = o9Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        pk2.o9 o9Var = this.f437252d;
        o9Var.d(list);
        df2.od odVar = (df2.od) o9Var.e(df2.od.class);
        if (odVar != null) {
            odVar.e7(r45.n72.kActionType_ShareLive);
        }
        if (list != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.util.Iterator it = list.iterator();
            java.lang.String str = "";
            while (it.hasNext()) {
                str = str + ((java.lang.String) it.next()) + ';';
            }
            if (r26.i0.o(str, ";", false, 2, null)) {
                str = str.substring(0, str.length() - 1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
            }
            jSONObject.put("type", "1");
            jSONObject.put(dm.i4.f66875xa013b0d5, str);
            jSONObject.put("share_scene", java.lang.String.valueOf(zl2.r4.f555483a.Z0()));
            i95.m c17 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f409895m, jSONObject.toString(), null, 4, null);
        }
        return jz5.f0.f384359a;
    }
}
