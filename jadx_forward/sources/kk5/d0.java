package kk5;

/* loaded from: classes.dex */
public final class d0 extends o65.d {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f390162l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kk5.h0 f390163m;

    public d0(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, kk5.h0 h0Var2) {
        this.f390162l = h0Var;
        this.f390163m = h0Var2;
    }

    @Override // o65.b
    public void a(int i17, int i18, java.lang.String str, o65.b bVar) {
        boolean z17;
        java.lang.String str2;
        boolean z18;
        j75.f m67437x4bd5310;
        wi5.n0 n0Var;
        java.util.HashMap hashMap;
        java.util.List list;
        j75.f m67437x4bd53102;
        java.lang.String str3 = str;
        o65.d dVar = (o65.d) bVar;
        boolean z19 = ((com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a) this.f390162l.f391656d).f273778a;
        kk5.h0 h0Var = this.f390163m;
        h0Var.f390178d = false;
        if (com.p314xaae8f345.mm.ui.pc.a(h0Var.m158354x19263085(), i17, i18, str3, 4)) {
            return;
        }
        java.lang.String str4 = "";
        if (i17 == 0 && i18 == 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f424751i)) {
            if (z19) {
                c01.t1.c(this.f424751i, dVar != null ? dVar.f424743a : null, h0Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572379b06), false, "");
                com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = h0Var.P6();
                if (P6 != null && (m67437x4bd53102 = P6.m67437x4bd5310()) != null) {
                    java.lang.String chatroomName = this.f424751i;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(chatroomName, "chatroomName");
                    m67437x4bd53102.B3(new wi5.d0(chatroomName, true));
                }
            }
            if (dVar != null && (list = dVar.f424747e) != null) {
                java.util.List list2 = list.isEmpty() ^ true ? list : null;
                if (list2 != null) {
                    java.lang.String str5 = "weixin://findfriend/verifycontact/" + this.f424751i + '/';
                    if (z19) {
                        c01.t1.c(this.f424751i, list2, h0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.b07), true, str5);
                    }
                }
            }
            j75.f Q6 = h0Var.Q6();
            if (Q6 != null && (n0Var = (wi5.n0) Q6.mo140437x75286adb()) != null && (hashMap = n0Var.E) != null) {
                java.lang.String str6 = this.f424751i;
                wi5.l0 l0Var = new wi5.l0();
                l0Var.f527838a = 6;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = h0Var.P6();
            if (P62 == null || (m67437x4bd5310 = P62.m67437x4bd5310()) == null) {
                return;
            }
            java.lang.String chatroomName2 = this.f424751i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(chatroomName2, "chatroomName");
            m67437x4bd5310.B3(new wi5.j(chatroomName2, true, 2L));
            return;
        }
        if (str3 == null) {
            str3 = "";
        }
        if (((en.a) ((en.k) i95.n0.c(en.k.class))).Zi(h0Var.m158354x19263085(), i17, i18, str3)) {
            return;
        }
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b08);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        if (z19) {
            if ((i17 != 0 || i18 != 0) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("") && tm.a.b("") == null) {
                if (dVar != null && dVar.f424749g.size() > 0) {
                    java.util.Iterator it = dVar.f424749g.iterator();
                    while (it.hasNext()) {
                        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4((java.lang.String) it.next())) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                if (z17) {
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_open_im_include_associate_room_show_dlg, false)) {
                        db5.e1.s(h0Var.m80379x76847179(), "", null);
                        return;
                    }
                }
            }
        } else if (dVar != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dVar.f424752j)) {
            db5.e1.s(h0Var.m158354x19263085(), dVar.f424752j, "");
            return;
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            db5.e1.s(h0Var.m158354x19263085(), str3, "");
            return;
        }
        if (i18 == -23) {
            java.lang.String string2 = h0Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i5f);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            java.lang.String string3 = h0Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i5e);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            str4 = string3;
            str2 = string2;
        } else {
            str2 = "";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
        java.util.List list3 = dVar.f424747e;
        java.util.List list4 = dVar.f424745c;
        if (list3 != null && list3.size() > 0 && (list3.size() == dVar.f424750h || (list4 != null && list4.size() > 0 && dVar.f424750h == list3.size() + list4.size()))) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            int size = list3.size();
            for (int i19 = 0; i19 < size; i19++) {
                linkedList.add(list3.get(i19));
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list4);
            iz5.a.g(null, linkedList.size() > 0);
            java.lang.String string4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b08);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(linkedList);
            arrayList.addAll(list4);
            java.lang.String string5 = h0Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcr, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(h0Var.U6(arrayList), string4));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
            db5.e1.C(h0Var.m158354x19263085(), string5, h0Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573919gb0), h0Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcq), h0Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcp), true, new kk5.f0(h0Var, linkedList), null);
            return;
        }
        java.util.List list5 = dVar.f424745c;
        if (list5 != null && list5.size() > 0 && dVar.f424750h == list5.size()) {
            str2 = h0Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573919gb0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getString(...)");
            str4 = str4 + h0Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcg, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(h0Var.U6(list5), string));
        }
        java.util.List list6 = dVar.f424744b;
        if (list6 != null && list6.size() > 0) {
            java.util.Iterator it6 = list6.iterator();
            while (true) {
                if (it6.hasNext()) {
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4((java.lang.String) it6.next())) {
                        str2 = h0Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573919gb0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getString(...)");
                        str4 = h0Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573920gb1);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getString(...)");
                        z18 = true;
                        break;
                    }
                } else {
                    z18 = false;
                    break;
                }
            }
            if (!z18) {
                str2 = h0Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573919gb0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getString(...)");
                str4 = str4 + h0Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcj, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(h0Var.U6(list6), string));
            }
        }
        if (str2.length() > 0) {
            db5.e1.s(h0Var.m158354x19263085(), str4, str2);
        } else {
            dp.a.m125854x26a183b(h0Var.m158354x19263085(), h0Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573667fc1, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
        }
    }
}
