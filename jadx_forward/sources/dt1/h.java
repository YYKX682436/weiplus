package dt1;

/* loaded from: classes4.dex */
public final class h extends com.p314xaae8f345.mm.p944x882e457a.i {

    /* renamed from: m, reason: collision with root package name */
    public final bt1.g f324688m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.wr f324689n;

    public h(java.util.List selector, bt1.g source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selector, "selector");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f324688m = source;
        r45.wr wrVar = new r45.wr();
        this.f324689n = wrVar;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : selector) {
            int intValue = ((java.lang.Number) obj).intValue();
            java.util.List list = bt1.a.f105676a;
            if (bt1.a.f105677b.contains(java.lang.Integer.valueOf(intValue))) {
                arrayList.add(obj);
            }
        }
        wrVar.f470927d = new java.util.LinkedList(arrayList);
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BYP_KEY_BUFF_STRING_SYNC, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        byte[] h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h((java.lang.String) m17);
        r45.wr wrVar2 = this.f324689n;
        r45.ur urVar = new r45.ur();
        urVar.mo11468x92b714fd(h17);
        wrVar2.f470928e = urVar;
        r45.wr wrVar3 = this.f324689n;
        wrVar3.f470929f = this.f324688m.f105692d;
        lVar.f152197a = wrVar3;
        r45.xr xrVar = new r45.xr();
        xrVar.mo11485x1f73abb4(new r45.ie());
        xrVar.mo11484xe92ab0a8().f458493e = new r45.du5();
        lVar.f152198b = xrVar;
        lVar.f152199c = "/cgi-bin/micromsg-bin/bypsync";
        lVar.f152200d = 3673;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Byp.CgiBypSync", "[CgiBypSync] selector=" + this.f324689n.f470927d + " scene=" + this.f324688m.f105692d + " size=" + h17.length);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17;
        boolean z18;
        java.util.LinkedList<r45.vr> linkedList;
        java.lang.Object obj;
        r45.xr resp = (r45.xr) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(" selector=");
        r45.wr wrVar = this.f324689n;
        sb6.append(wrVar.f470927d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Byp.CgiBypSync", sb6.toString());
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Byp.CgiBypSync", "[onFailed] " + wrVar.f470927d);
            return;
        }
        r45.ur urVar = resp.f471882e;
        r45.ur urVar2 = wrVar.f470928e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(urVar2);
        boolean z19 = urVar != null ? urVar.f469117e : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Byp.CgiBypSync", "[onSuccessfully] isReset=" + z19 + ", item size=" + resp.f471883f.size());
        if (z19) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BYP_KEY_BUFF_STRING_SYNC, "");
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[mergeSyncKey] req: ");
        sb7.append(s(urVar2));
        sb7.append(" resp: ");
        sb7.append(urVar != null ? s(urVar) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Byp.CgiBypSync", sb7.toString());
        if (urVar == null || (linkedList = urVar.f469116d) == null) {
            z17 = false;
            z18 = false;
        } else {
            boolean z27 = false;
            z18 = false;
            for (r45.vr vrVar : linkedList) {
                java.util.LinkedList sync_key_pair_list = urVar2.f469116d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sync_key_pair_list, "sync_key_pair_list");
                java.util.Iterator it = sync_key_pair_list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((r45.vr) obj).f469985d == vrVar.f469985d) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                r45.vr vrVar2 = (r45.vr) obj;
                if (vrVar2 != null) {
                    long j17 = vrVar2.f469986e;
                    long j18 = vrVar.f469986e;
                    if (j17 < j18) {
                        vrVar2.f469986e = j18;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Byp.CgiBypSync", "[mergeSyncKey] modify " + vrVar.f469985d + '=' + vrVar.f469986e);
                        z27 = true;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Byp.CgiBypSync", "[mergeSyncKey] value(" + vrVar.f469986e + ") is invalid, client value=" + vrVar2.f469986e + ' ');
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Byp.CgiBypSync", "[mergeSyncKey] insert " + vrVar.f469985d + '=' + vrVar.f469986e);
                    sync_key_pair_list.add(vrVar);
                    z18 = true;
                }
            }
            z17 = z27;
        }
        if (z17 || z18) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BYP_KEY_BUFF_STRING_SYNC, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(urVar2.mo14344x5f01b1f6()));
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    public pq5.g l() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1465L, this.f324688m.f105692d, 1L);
        pq5.g l17 = super.l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "run(...)");
        return l17;
    }

    public final java.lang.String s(r45.ur urVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(urVar, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.LinkedList<r45.vr> sync_key_pair_list = urVar.f469116d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sync_key_pair_list, "sync_key_pair_list");
        for (r45.vr vrVar : sync_key_pair_list) {
            sb6.append(vrVar.f469985d);
            sb6.append("=");
            sb6.append(vrVar.f469986e);
            sb6.append(", ");
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}
