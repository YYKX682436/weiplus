package ko0;

/* loaded from: classes5.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f391402d;

    public k0(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ko0.k0(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return new ko0.k0((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean z17;
        java.lang.Object Lc;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f391402d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            i95.m c17 = i95.n0.c(zy.u.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy.w p37 = zy.u.p3((zy.u) c17, null, 1, null);
            java.lang.String str = ko0.l0.f391418h;
            java.lang.String str2 = ko0.l0.f391419i;
            this.f391402d = 1;
            z17 = true;
            Lc = zy.w.Lc(p37, str, true, str2, 0, 0, null, null, this, 120, null);
            if (Lc == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            Lc = obj;
            z17 = true;
        }
        jz5.o oVar = (jz5.o) Lc;
        boolean booleanValue = ((java.lang.Boolean) oVar.f384374d).booleanValue();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (booleanValue) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#checkAndMakeToReady unzip dir=");
            java.lang.Object obj2 = oVar.f384376f;
            sb6.append((java.lang.String) obj2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveMakeupUtil", sb6.toString());
            java.lang.String str3 = ((java.lang.String) obj2) + "/manifest.json";
            if (!com.p314xaae8f345.mm.vfs.w6.j(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiveMakeupUtil", "#checkAndMakeToReady manifestFile not exist");
                try {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s((java.lang.String) obj2, false);
                    if (s17 != null) {
                        java.util.Iterator it = s17.iterator();
                        while (it.hasNext()) {
                            sb7.append(((com.p314xaae8f345.mm.vfs.x1) it.next()).f294765b);
                            sb7.append(",");
                        }
                    }
                    pm0.z.b(xy2.b.f539688b, "vfs_clear_health_in_makeup", false, null, null, false, false, new ko0.h0(sb7), 60, null);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiveMakeupUtil", e17.toString());
                }
                com.p314xaae8f345.mm.vfs.w6.f((java.lang.String) obj2);
                return f0Var;
            }
            pm0.z.b(xy2.b.f539688b, "vfs_clear_health_in_makeup", false, null, null, false, false, ko0.i0.f391397d, 60, null);
            try {
                java.lang.String M = com.p314xaae8f345.mm.vfs.w6.M(str3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(M);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveMakeupUtil", "#checkAndMakeToReady manifestFileText=".concat(r26.i0.t(r26.i0.t(M, "\n", "", false), " ", "", false)));
                if (M.length() == 0 ? z17 : false) {
                    return f0Var;
                }
                org.json.JSONArray jSONArray = new org.json.JSONObject(M).getJSONArray("files");
                p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
                c0Var.f391645d = z17;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONArray);
                c75.c.d(jSONArray, new ko0.j0(oVar, c0Var));
                if (!c0Var.f391645d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiveMakeupUtil", "#checkAndMakeToReady something wrong. rm dir " + ((java.lang.String) obj2));
                    com.p314xaae8f345.mm.vfs.w6.f((java.lang.String) obj2);
                    return f0Var;
                }
                ko0.l0 l0Var = ko0.l0.f391411a;
                ko0.l0.f391416f = new lo0.p0((java.lang.String) obj2);
                ko0.l0 l0Var2 = ko0.l0.f391411a;
                ko0.l0.f391415e = z17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveMakeupUtil", "#checkAndMakeToReady nice done!");
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiveMakeupUtil", "#checkAndMakeToReady package parsing failed. " + e18);
            }
        }
        return f0Var;
    }
}
