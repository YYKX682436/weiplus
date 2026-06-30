package dq0;

/* loaded from: classes7.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dq0.a0 f323864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fq0.x f323865e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(dq0.a0 a0Var, fq0.x xVar) {
        super(0);
        this.f323864d = a0Var;
        this.f323865e = xVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        hq0.k0 k0Var;
        fq0.x xVar;
        hq0.k0 k0Var2;
        dq0.a0 a0Var = this.f323864d;
        a0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("flushing ");
        fq0.x xVar2 = this.f323865e;
        sb6.append(xVar2);
        java.lang.String str = "MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", sb6.toString());
        java.util.HashSet hashSet = a0Var.f323828n;
        boolean contains = hashSet.contains(xVar2.f347011b);
        java.util.concurrent.CopyOnWriteArraySet<java.lang.Integer> copyOnWriteArraySet = xVar2.f347014e;
        if (contains) {
            for (java.lang.Integer num : copyOnWriteArraySet) {
                hq0.i0 t17 = a0Var.t();
                if (t17 != null && (k0Var2 = t17.f364531m) != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
                    hq0.j0 a17 = k0Var2.a(num.intValue());
                    if (a17 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "trigger flush pre created canvas " + a17.f364545a);
                        a0Var.r(a17);
                    }
                }
            }
        }
        java.lang.String str2 = xVar2.f347011b;
        hashSet.remove(str2);
        java.util.HashSet hashSet2 = a0Var.f323829o;
        if (hashSet2.contains(str2)) {
            for (java.lang.Integer num2 : copyOnWriteArraySet) {
                hq0.i0 t18 = a0Var.t();
                if (t18 != null && (k0Var = t18.f364531m) != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
                    hq0.j0 a18 = k0Var.a(num2.intValue());
                    if (a18 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "trigger flush pre layout canvas " + a18.f364545a);
                        java.lang.String str3 = str;
                        java.lang.String str4 = str2;
                        java.util.HashSet hashSet3 = hashSet2;
                        fq0.x xVar3 = xVar2;
                        a0Var.f323821d.d(a18.b(), a18.f364547c, a18.f364548d, a0Var.g(a18.f364549e, a18.f364546b), a18.f364550f);
                        if (a18.f364553i) {
                            a0Var.f323821d.a(a18.b());
                            boolean z17 = a18.f364559o;
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("preCreateCanvas", z17);
                            xVar = xVar3;
                            a0Var.w(xVar, jSONObject);
                        } else {
                            xVar = xVar3;
                        }
                        a18.f364553i = false;
                        xVar2 = xVar;
                        str = str3;
                        str2 = str4;
                        hashSet2 = hashSet3;
                    }
                }
            }
        }
        java.lang.String str5 = str;
        java.lang.String str6 = str2;
        hashSet2.remove(str6);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("frameSetId: ");
        sb7.append(str6);
        sb7.append(", flush tasks size: ");
        java.util.HashMap hashMap = a0Var.f323827m;
        java.util.LinkedList linkedList = (java.util.LinkedList) hashMap.get(str6);
        sb7.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, sb7.toString());
        java.util.LinkedList linkedList2 = (java.util.LinkedList) hashMap.get(str6);
        if (linkedList2 != null) {
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
        }
        java.util.LinkedList linkedList3 = (java.util.LinkedList) hashMap.get(str6);
        if (linkedList3 != null) {
            linkedList3.clear();
        }
        return jz5.f0.f384359a;
    }
}
