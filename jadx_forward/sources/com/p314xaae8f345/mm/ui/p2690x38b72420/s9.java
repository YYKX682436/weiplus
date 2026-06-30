package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes.dex */
public class s9 extends o65.d {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a f288709l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 f288710m;

    public s9(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8, com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a aVar) {
        this.f288710m = activityC22325x8baa24f8;
        this.f288709l = aVar;
    }

    @Override // o65.b
    public void a(int i17, int i18, java.lang.String str, o65.b bVar) {
        java.lang.String str2;
        o65.d dVar = (o65.d) bVar;
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8 = this.f288710m;
        activityC22325x8baa24f8.O1 = false;
        if (com.p314xaae8f345.mm.ui.pc.a(activityC22325x8baa24f8, i17, i18, str, 4)) {
            return;
        }
        boolean z17 = true;
        java.lang.String str3 = "";
        com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a aVar = this.f288709l;
        if (i17 == 0 && i18 == 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f424751i)) {
            if (aVar.f273778a) {
                c01.t1.c(this.f424751i, dVar.f424743a, activityC22325x8baa24f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572379b06), false, "");
            }
            java.util.List list = dVar.f424747e;
            if (list != null && list.size() > 0) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                for (int i19 = 0; i19 < list.size(); i19++) {
                    linkedList.add((java.lang.String) list.get(i19));
                }
                java.lang.String str4 = "weixin://findfriend/verifycontact/" + this.f424751i + "/";
                if (aVar.f273778a) {
                    c01.t1.c(this.f424751i, linkedList, activityC22325x8baa24f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b07), true, str4);
                }
            }
            activityC22325x8baa24f8.H7(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(new java.lang.String[]{this.f424751i}), false);
            return;
        }
        boolean z18 = aVar.f273778a;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b08);
        if (!z18) {
            if (dVar != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dVar.f424752j)) {
                db5.e1.s(activityC22325x8baa24f8, dVar.f424752j, "");
                return;
            } else if (!z18 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                db5.e1.s(activityC22325x8baa24f8, str, "");
                return;
            }
        }
        if (i18 == -23) {
            java.lang.String string2 = activityC22325x8baa24f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i5f);
            str3 = activityC22325x8baa24f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i5e);
            str2 = string2;
        } else {
            str2 = "";
        }
        java.util.List list2 = dVar.f424747e;
        java.util.List list3 = dVar.f424745c;
        if (list2 != null && list2.size() > 0 && (list2.size() == dVar.f424750h || (list3 != null && list3.size() > 0 && dVar.f424750h == list2.size() + list3.size()))) {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            for (int i27 = 0; i27 < list2.size(); i27++) {
                linkedList2.add((java.lang.String) list2.get(i27));
            }
            iz5.a.g(null, linkedList2.size() > 0);
            java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b08);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(linkedList2);
            arrayList.addAll(list3);
            db5.e1.C(activityC22325x8baa24f8, activityC22325x8baa24f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcr, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC22325x8baa24f8.P7(arrayList), string3)), activityC22325x8baa24f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573919gb0), activityC22325x8baa24f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcq), activityC22325x8baa24f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcp), true, new com.p314xaae8f345.mm.ui.p2690x38b72420.w9(activityC22325x8baa24f8, linkedList2), null);
            return;
        }
        java.util.List list4 = dVar.f424745c;
        if (list4 != null && list4.size() > 0 && dVar.f424750h == list4.size()) {
            str2 = activityC22325x8baa24f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573919gb0);
            str3 = str3 + activityC22325x8baa24f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcg, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC22325x8baa24f8.P7(list4), string));
        }
        java.util.List list5 = dVar.f424744b;
        if (list5 != null && list5.size() > 0) {
            java.util.Iterator it = list5.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4((java.lang.String) it.next())) {
                        str2 = activityC22325x8baa24f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573919gb0);
                        str3 = activityC22325x8baa24f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573920gb1);
                        break;
                    }
                } else {
                    z17 = false;
                    break;
                }
            }
            if (!z17) {
                str2 = activityC22325x8baa24f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573919gb0);
                str3 = str3 + activityC22325x8baa24f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcj, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC22325x8baa24f8.P7(list5), string));
            }
        }
        if (str2 == null || str2.length() <= 0) {
            android.widget.Toast.makeText(activityC22325x8baa24f8, activityC22325x8baa24f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573667fc1, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
        } else {
            db5.e1.s(activityC22325x8baa24f8, str3, str2);
        }
    }
}
