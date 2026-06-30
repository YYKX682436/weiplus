package c20;

/* loaded from: classes9.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t10.d f119513d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t10.d dVar) {
        super(1);
        this.f119513d = dVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String m90695x1e741da2;
        com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.C24422xfe39b4d1 result = (com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.C24422xfe39b4d1) obj;
        t10.d dVar = this.f119513d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        if (result.m90707x1046a12c() == com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.EnumC24420xe11b6aea.f43679x24a738) {
            rk0.c.c("ECS_O.NativeHandler.SelectPendingProduct", "do nothing", new java.lang.Object[0]);
        } else {
            java.util.List<com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.C24421x1d904c7> m90708x2213d5df = result.m90708x2213d5df();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m90708x2213d5df, 10));
            for (com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.C24421x1d904c7 c24421x1d904c7 : m90708x2213d5df) {
                jz5.l[] lVarArr = new jz5.l[2];
                java.lang.String str2 = "";
                if (c24421x1d904c7 == null || (str = c24421x1d904c7.m90696xc0bbc7b4()) == null) {
                    str = "";
                }
                lVarArr[0] = new jz5.l("productId", str);
                if (c24421x1d904c7 != null && (m90695x1e741da2 = c24421x1d904c7.m90695x1e741da2()) != null) {
                    str2 = m90695x1e741da2;
                }
                lVarArr[1] = new jz5.l("imgUrl", str2);
                arrayList.add(kz5.c1.k(lVarArr));
            }
            try {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new org.json.JSONObject((java.util.Map) it.next()));
                }
                java.lang.String jSONArray = new org.json.JSONArray((java.util.Collection) arrayList2).toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONArray);
                dVar.getClass();
                bw5.n8 a17 = dVar.a(bw5.o8.EcsOpenRespRet_Success);
                a17.f112074h = jSONArray;
                a17.f112077n[5] = true;
                dVar.b(a17);
            } catch (org.json.JSONException e17) {
                dVar.c("encode fail: " + e17.getLocalizedMessage());
            }
        }
        return jz5.f0.f384359a;
    }
}
