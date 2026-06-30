package g31;

/* loaded from: classes9.dex */
public final class m implements e31.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g31.p f349628a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g31.b f349629b;

    public m(g31.p pVar, g31.b bVar) {
        this.f349628a = pVar;
        this.f349629b = bVar;
    }

    @Override // e31.l
    public void d(int i17, int i18, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getSubscribeStatus onError templateId: ");
        g31.b bVar = this.f349629b;
        sb6.append(bVar.f349595b);
        sb6.append(", errType: ");
        sb6.append(i17);
        sb6.append(", errCode: ");
        sb6.append(i18);
        sb6.append(", errMsg: ");
        sb6.append(errMsg);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubscribeStatusUpdateManager", sb6.toString());
        this.f349628a.f349639a.remove(bVar.f349595b);
        e31.i iVar = bVar.f349598e;
        if (iVar != null) {
            iVar.a();
        }
    }

    @Override // e31.l
    public void e(java.lang.String bizUsername, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5) {
        java.lang.String str;
        boolean z17;
        com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 result = c11158xe7d16ed5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        g31.p pVar = this.f349628a;
        java.util.HashSet hashSet = pVar.f349639a;
        g31.b bVar = this.f349629b;
        hashSet.remove(bVar.f349595b);
        java.util.ArrayList arrayList = result.f153318h;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(arrayList.size());
        java.lang.String str2 = bVar.f349595b;
        java.lang.String str3 = "MicroMsg.SubscribeStatusUpdateManager";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubscribeStatusUpdateManager", "onUpdateSubscribeUIStatusSuccess onSuccess %d, templateId: %s", valueOf, str2);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        int i17 = -1;
        boolean z18 = false;
        int i18 = 0;
        boolean z19 = false;
        boolean z27 = false;
        boolean z28 = false;
        boolean z29 = false;
        boolean z37 = false;
        boolean z38 = false;
        boolean z39 = false;
        while (it.hasNext()) {
            java.util.Iterator it6 = it;
            com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) it.next();
            boolean z47 = z27;
            if (c11159x8f55e6d3.f153336f.equals(str2)) {
                java.lang.String str4 = c11159x8f55e6d3.f153336f;
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(c11159x8f55e6d3.f153340m);
                int i19 = result.f153317g;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "onUpdateSubscribeUIStatusSuccess templateId: %s, %d, cacheMax: %d, switchOpen: %b isForceNotifyTemplate: %b, isShowVoipSetting:%b", str4, valueOf2, java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(c11159x8f55e6d3.f153341n), java.lang.Boolean.valueOf(c11159x8f55e6d3.f153350w), java.lang.Boolean.valueOf(c11159x8f55e6d3.A));
                int i27 = c11159x8f55e6d3.f153340m;
                z29 = c11159x8f55e6d3.f153341n;
                z28 = c11159x8f55e6d3.f153347t;
                z37 = c11159x8f55e6d3.f153348u;
                z38 = c11159x8f55e6d3.f153350w;
                z39 = c11159x8f55e6d3.f153351x;
                boolean z48 = c11159x8f55e6d3.B;
                boolean z49 = c11159x8f55e6d3.C;
                int i28 = c11159x8f55e6d3.f153352y;
                boolean z57 = c11159x8f55e6d3.A;
                c11159x8f55e6d3.f153341n = result.f153322o;
                if (i19 <= 0) {
                    c11159x8f55e6d3.f153342o = java.lang.System.currentTimeMillis() + 30000;
                    z17 = z48;
                    str = str3;
                } else {
                    z17 = z48;
                    str = str3;
                    c11159x8f55e6d3.f153342o = java.lang.System.currentTimeMillis() + (i19 * 1000);
                }
                arrayList2.add(c11159x8f55e6d3);
                z18 = z49;
                i18 = i28;
                i17 = i27;
                z27 = z57;
                z19 = z17;
            } else {
                str = str3;
                z27 = z47;
            }
            result = c11158xe7d16ed5;
            it = it6;
            str3 = str;
        }
        boolean z58 = z27;
        e31.j jVar = new e31.j(i17 == 1, z29);
        jVar.f328610c = z28;
        jVar.f328611d = z37;
        jVar.f328612e = z38;
        jVar.f328613f = z39;
        jVar.f328614g = z19;
        jVar.f328615h = z18;
        jVar.f328616i = i18;
        java.lang.String str5 = bVar.f349594a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str5, "<set-?>");
        jVar.f328617j = str5;
        jVar.f328618k = z58;
        e31.k kVar = pVar.f349640b;
        if (kVar != null) {
            kVar.a(bVar.f349594a, arrayList2, z29, true, true);
        }
        e31.i iVar = bVar.f349598e;
        if (iVar != null) {
            iVar.b(str2, jVar);
        }
    }
}
