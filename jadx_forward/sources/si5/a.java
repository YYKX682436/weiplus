package si5;

/* loaded from: classes.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final si5.e a(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact, p13.l lVar, p13.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.a3 chatroomMember) {
        java.lang.Object obj;
        java.lang.CharSequence charSequence;
        java.lang.String l17;
        java.lang.Object bj6;
        java.lang.CharSequence concat;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatroomMember, "chatroomMember");
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String d17 = contact.d1();
        java.lang.String str = chatroomMember.f69088x37548063;
        ((sg3.a) v0Var).getClass();
        java.lang.String f17 = c01.a2.f(d17, str);
        jz5.f0 f0Var = null;
        java.lang.String str2 = lVar != null ? lVar.f432647e : null;
        if (lVar == null || str2 == null) {
            obj = null;
            charSequence = null;
        } else {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f17, lVar.f432648f)) {
                android.text.SpannableString bj7 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(activity, f17, i65.a.h(activity, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
                p13.i iVar = new p13.i();
                iVar.f432626a = bj7;
                iVar.f432627b = rVar;
                iVar.f432628c = lVar.f432651i;
                iVar.f432629d = lVar.f432652j;
                bj6 = o13.q.e(iVar).f432638a;
                concat = null;
            } else {
                bj6 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(activity, f17, i65.a.h(activity, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
                android.text.SpannableString bj8 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(activity, lVar.f432648f, i65.a.h(activity, com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2));
                p13.i iVar2 = new p13.i();
                iVar2.f432626a = bj8;
                iVar2.f432627b = rVar;
                iVar2.f432628c = lVar.f432651i;
                iVar2.f432629d = lVar.f432652j;
                concat = android.text.TextUtils.concat(lVar.f432649g, o13.q.e(iVar2).f432638a);
            }
            charSequence = concat;
            obj = bj6;
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            obj = d(activity, f17, i65.a.h(activity, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f17, contact.P0())) {
                java.lang.CharSequence concat2 = android.text.TextUtils.concat(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icz), d(activity, contact.P0(), i65.a.h(activity, com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja)));
                tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String d18 = contact.d1();
                ((sg3.a) v0Var2).getClass();
                if (f17.equals(c01.a2.a(d18)) && (l17 = c01.v1.l(contact.d1(), chatroomMember.f69088x37548063)) != null) {
                    if (l17.length() > 0) {
                        concat2 = android.text.TextUtils.concat(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ict), l17);
                    }
                }
                charSequence = concat2;
            }
        }
        si5.e eVar = new si5.e();
        eVar.f489862a = (java.lang.CharSequence) obj;
        eVar.f489863b = charSequence;
        return eVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0044. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.CharSequence] */
    public final si5.e b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, p13.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact, p13.y yVar, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var) {
        java.lang.CharSequence charSequence;
        jz5.f0 f0Var;
        java.lang.Object obj;
        java.lang.String string;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z27;
        java.lang.CharSequence charSequence2;
        boolean z28;
        boolean z29;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        if (yVar == null || rVar == null) {
            charSequence = null;
            f0Var = null;
            obj = null;
        } else {
            android.content.res.Resources resources = activity.getResources();
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String d17 = contact.d1();
            ((sg3.a) v0Var).getClass();
            java.lang.String c17 = c01.a2.c(contact, d17);
            int i17 = yVar.f432718c;
            if (i17 == 11) {
                java.util.List d18 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.p) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).fj()).d(contact.D0());
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                java.lang.String[] phrases = rVar.f432664c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(phrases, "phrases");
                for (java.lang.String str2 : phrases) {
                    java.util.Iterator it = ((java.util.ArrayList) d18).iterator();
                    while (it.hasNext()) {
                        java.lang.String str3 = (java.lang.String) it.next();
                        java.util.HashMap hashMap = o13.n.f423774a;
                        java.lang.String c18 = o13.s.c(str3.toLowerCase());
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c18);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                        if (r26.n0.B(c18, str2, false)) {
                            stringBuffer.append(str3);
                            stringBuffer.append(",");
                        }
                    }
                }
                stringBuffer.trimToSize();
                java.lang.String substring = stringBuffer.length() == 0 ? "" : stringBuffer.substring(0, stringBuffer.length() - 1);
                string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574478id4);
                z17 = false;
                z18 = false;
                z19 = false;
                r1 = substring;
                z27 = true;
                charSequence2 = null;
            } else if (i17 != 38) {
                switch (i17) {
                    case 1:
                        z17 = false;
                        z28 = false;
                        z29 = true;
                        charSequence2 = null;
                        z27 = false;
                        z18 = z29;
                        z19 = z28;
                        string = null;
                        break;
                    case 2:
                        z17 = false;
                        z28 = true;
                        z29 = true;
                        charSequence2 = null;
                        z27 = false;
                        z18 = z29;
                        z19 = z28;
                        string = null;
                        break;
                    case 3:
                        z17 = true;
                        z28 = true;
                        z29 = true;
                        charSequence2 = null;
                        z27 = false;
                        z18 = z29;
                        z19 = z28;
                        string = null;
                        break;
                    case 4:
                        str = contact.f318122y1;
                        string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icv);
                        charSequence2 = null;
                        z18 = false;
                        z19 = false;
                        z27 = true;
                        r1 = str;
                        z17 = false;
                        break;
                    case 5:
                        str = contact.P0();
                        string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icz);
                        charSequence2 = null;
                        z18 = false;
                        z19 = false;
                        z27 = true;
                        r1 = str;
                        z17 = false;
                        break;
                    case 6:
                        java.lang.String P0 = contact.P0();
                        string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icz);
                        charSequence2 = null;
                        z18 = false;
                        z27 = true;
                        z19 = true;
                        r1 = P0;
                        z17 = false;
                        break;
                    case 7:
                        java.lang.String P02 = contact.P0();
                        string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icz);
                        charSequence2 = null;
                        z18 = false;
                        z27 = true;
                        z19 = true;
                        r1 = P02;
                        z17 = true;
                        break;
                    default:
                        switch (i17) {
                            case 15:
                                str = contact.t0();
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                                    str = contact.d1();
                                }
                                string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574479id5);
                                charSequence2 = null;
                                z18 = false;
                                z19 = false;
                                z27 = true;
                                r1 = str;
                                z17 = false;
                                break;
                            case 16:
                                str = yVar.f432723h;
                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                                    java.lang.String[] strArr = (java.lang.String[]) new r26.t("\u200b").g(str, 0).toArray(new java.lang.String[0]);
                                    int length = strArr.length;
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 < length) {
                                            java.lang.String str4 = strArr[i18];
                                            java.lang.String originQuery = rVar.f432662a;
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(originQuery, "originQuery");
                                            if (r26.i0.A(str4, originQuery, false, 2, null)) {
                                                str = str4;
                                            } else {
                                                i18++;
                                            }
                                        }
                                    }
                                }
                                string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icy);
                                charSequence2 = null;
                                z18 = false;
                                z19 = false;
                                z27 = true;
                                r1 = str;
                                z17 = false;
                                break;
                            case 17:
                            case 18:
                                str = yVar.f432723h;
                                string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icw);
                                charSequence2 = null;
                                z18 = false;
                                z19 = false;
                                z27 = true;
                                r1 = str;
                                z17 = false;
                                break;
                            default:
                                z17 = false;
                                z28 = false;
                                z29 = false;
                                charSequence2 = null;
                                z27 = false;
                                z18 = z29;
                                z19 = z28;
                                string = null;
                                break;
                        }
                }
            } else {
                p75.n0 n0Var = dm.x1.N;
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                linkedList.add(dm.x1.R);
                p75.d dVar = dm.x1.Q;
                java.lang.String d19 = contact.d1();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d19, "getUsername(...)");
                p75.m0 j17 = dVar.j(d19);
                p75.i0 g17 = dm.x1.N.g(linkedList);
                g17.f434190d = j17;
                g17.f434192f = linkedList2;
                g17.f434193g = linkedList3;
                g17.c(1, 0);
                java.lang.String p17 = g17.a().p(gm0.j1.u().f354686f);
                r1 = p17 != null ? com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.d(activity, yVar.f432729n, (java.lang.String[]) r26.n0.f0(p17, new java.lang.String[]{";"}, false, 0, 6, null).toArray(new java.lang.String[0]), rVar, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d.f219569e, contact.d1()) : null;
                string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icx);
                charSequence2 = r1;
                z17 = false;
                z19 = false;
                r1 = "";
                z27 = true;
                z18 = true;
            }
            java.lang.Object bj6 = z18 ? o13.q.e(p13.i.d(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(activity, c17, i65.a.h(activity, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia)), rVar, z19, z17)).f432638a : ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(activity, c17, i65.a.h(activity, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
            if (!z27) {
                charSequence2 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(activity, r1, i65.a.h(activity, com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2));
            } else if (charSequence2 == null) {
                charSequence2 = o13.q.e(p13.i.d(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(activity, r1, i65.a.h(activity, com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2)), rVar, z19, z17)).f432638a;
            }
            java.lang.CharSequence concat = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) || charSequence2 == null) ? charSequence2 : android.text.TextUtils.concat(string, charSequence2);
            obj = bj6;
            java.lang.CharSequence charSequence3 = concat;
            f0Var = jz5.f0.f384359a;
            charSequence = charSequence3;
        }
        if (f0Var == null) {
            obj = d(activity, ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).wi(contact), i65.a.h(activity, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
        }
        si5.e eVar = new si5.e();
        eVar.f489862a = (java.lang.CharSequence) obj;
        eVar.f489863b = charSequence;
        return eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x010b, code lost:
    
        if (r14 == null) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final si5.d c(int r12, com.p314xaae8f345.mm.p2621x8fb0427b.z3 r13, com.p314xaae8f345.mm.p2621x8fb0427b.a3 r14) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: si5.a.c(int, com.tencent.mm.storage.z3, com.tencent.mm.storage.a3):si5.d");
    }

    public final android.text.SpannableString d(android.content.Context context, java.lang.String str, int i17) {
        return ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, str, i17);
    }
}
