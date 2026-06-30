package zo1;

/* loaded from: classes5.dex */
public final class v2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12870x21c4817b f556331d;

    public v2(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12870x21c4817b activityC12870x21c4817b) {
        this.f556331d = activityC12870x21c4817b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageManagerUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.P);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51 c6839x89375b51 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51();
        c6839x89375b51.f141599d = 8L;
        c6839x89375b51.f141600e = 6L;
        c6839x89375b51.k();
        po1.c cVar = po1.d.f438827i;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = this.f556331d.f174372e;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgInfo");
            throw null;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u uVar = gVar.f297365g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uVar, "getTargetDevice(...)");
        po1.d a17 = cVar.a(uVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PackageManagerUI", "openLocation, device=" + a17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (a17.f438829b == po1.g.f438843h) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) ro1.v.f479547a.b();
            if (!arrayList2.isEmpty()) {
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((po1.d) it.next()).f438833f, a17.f438833f)) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            java.lang.String str = a17.f438830c;
            java.lang.String str2 = a17.f438831d;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("deviceId", a17.f438828a);
            jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, str);
            jSONObject2.put("remark", str2);
            jSONObject2.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, a17.f438832e);
            jSONObject2.put("connection", z17);
            jSONObject.put("portableDevice", jSONObject2);
        } else {
            jSONObject.put("deviceId", a17.f438828a);
        }
        lo1.g.f401633a.b(jSONObject);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageManagerUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
