package g95;

/* loaded from: classes12.dex */
public abstract class e0 {
    public static final long a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        v05.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f9Var, "<this>");
        l15.c cVar = new l15.c();
        java.lang.String j17 = f9Var.j();
        if (j17 == null) {
            j17 = "";
        }
        cVar.m126731xdc93280d(j17, true);
        v05.b k17 = cVar.k();
        if (k17 == null || (aVar = (v05.a) k17.m75936x14adae67(k17.f513848e + 8)) == null) {
            return 0L;
        }
        return aVar.m75942xfb822ef2(aVar.f449897d + 0);
    }

    public static final int b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f9Var, "<this>");
        if (!f9Var.k2()) {
            return 0;
        }
        l15.c cVar = new l15.c();
        java.lang.String j17 = f9Var.j();
        if (j17 == null) {
            j17 = "";
        }
        cVar.m126731xdc93280d(j17, true);
        v05.b k17 = cVar.k();
        if (k17 != null) {
            return k17.m75939xb282bd08(k17.f449898d + 6);
        }
        return 0;
    }

    public static final java.lang.String c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f9Var, "<this>");
        if (f9Var.A0() != 1 && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0())) {
            return c01.z1.r();
        }
        return f9Var.Q0();
    }

    public static final java.lang.String d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f9Var, "<this>");
        return f9Var.A0() == 1 ? c01.z1.r() : com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0()) ? c01.w9.s(f9Var.j()) : f9Var.Q0();
    }

    public static final int e(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f9Var, "<this>");
        return f9Var.mo78013xfb85f7b0() & 65535;
    }

    public static final java.lang.String f(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f9Var, "<this>");
        if (i(f9Var)) {
            java.lang.String r17 = c01.z1.r();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
            return r17;
        }
        java.lang.String V1 = f9Var.V1();
        if (V1 != null) {
            return V1;
        }
        java.lang.String Q0 = f9Var.Q0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
        return Q0;
    }

    public static final boolean g(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f9Var, "<this>");
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0());
    }

    public static final boolean h(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f9Var, "<this>");
        return c01.ia.y(f9Var) || c01.ia.x(f9Var) || c01.ia.A(f9Var);
    }

    public static final boolean i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f9Var, "<this>");
        return f9Var.A0() == 1;
    }

    public static final boolean j(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        p15.e eVar = new p15.e();
        java.lang.String str = f9Var != null ? f9Var.G : null;
        if (str == null) {
            str = "";
        }
        eVar.m126728xdc93280d(str);
        p15.s q17 = eVar.q();
        return q17 != null && q17.y() == 1;
    }

    public static final void k(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, up5.w message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("msgId", java.lang.Long.valueOf(message.f511624a));
        contentValues.put("msgSvrId", java.lang.Long.valueOf(message.f511625b));
        contentValues.put("type", java.lang.Integer.valueOf(message.f511626c));
        contentValues.put("status", java.lang.Integer.valueOf(message.f511627d));
        contentValues.put("isSend", java.lang.Integer.valueOf(message.f511628e));
        contentValues.put("isShowTimer", java.lang.Integer.valueOf(message.f511629f));
        contentValues.put("createTime", java.lang.Long.valueOf(message.f511630g));
        contentValues.put("talker", message.f511631h);
        java.lang.String str = message.f511632i;
        if (str == null) {
            str = "";
        }
        contentValues.put("content", str);
        contentValues.put("imgPath", message.f511633j);
        contentValues.put("reserved", message.f511634k);
        contentValues.put("lvbuffer", message.f511635l);
        contentValues.put("talkerId", java.lang.Integer.valueOf(message.f511638o));
        java.lang.String str2 = message.f511636m;
        if (str2 == null) {
            str2 = "";
        }
        contentValues.put("transContent", str2);
        java.lang.String str3 = message.f511637n;
        if (str3 == null) {
            str3 = "";
        }
        contentValues.put("transBrandWording", str3);
        java.lang.String str4 = message.f511639p;
        if (str4 == null) {
            str4 = "";
        }
        contentValues.put("bizClientMsgId", str4);
        contentValues.put("bizChatId", java.lang.Long.valueOf(message.f511640q));
        java.lang.String str5 = message.f511641r;
        if (str5 == null) {
            str5 = "";
        }
        contentValues.put("bizChatUserId", str5);
        contentValues.put("msgSeq", java.lang.Long.valueOf(message.f511642s));
        contentValues.put("flag", java.lang.Integer.valueOf(message.f511643t));
        contentValues.put("solitaireFoldInfo", message.f511644u);
        contentValues.put("fromUsername", message.f511646w);
        contentValues.put("toUsername", message.f511647x);
        contentValues.put("historyId", message.f511645v);
        f9Var.mo9762xbf5d97fd(contentValues, false);
        f9Var.m124848x92b54da6();
        f9Var.m124849x5361953a(message.f511624a);
        f9Var.f72763xa3c65b86 = f9Var.m124847x74d37ac6();
        java.lang.String j17 = f9Var.j();
        if (j17 != null && j17.length() > 2097152) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(1024);
            sb6.append("Very big message: \nmsgId = ");
            sb6.append(f9Var.m124847x74d37ac6());
            sb6.append("\nmsgSvrId = ");
            sb6.append(f9Var.I0());
            sb6.append("\ntype = ");
            sb6.append(f9Var.mo78013xfb85f7b0());
            sb6.append("\ncreateTime = ");
            sb6.append(f9Var.mo78012x3fdd41df());
            sb6.append("\ntalker = ");
            sb6.append(f9Var.Q0());
            sb6.append("\nflag = ");
            sb6.append(f9Var.w0());
            sb6.append("\ncontent.length() = ");
            sb6.append(j17.length());
            sb6.append("\ncontent = ");
            java.lang.String substring = j17.substring(0, 256);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            sb6.append(substring);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MessageEx", sb6.toString());
            f9Var.m124850x7650bebc(1);
            f9Var.d1("");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(f9Var.m124847x74d37ac6(), com.p314xaae8f345.mm.p2621x8fb0427b.f9.M1(f9Var));
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9.L1(f9Var.m124847x74d37ac6());
    }

    public static final com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] l(up5.w wVar, android.content.ContentValues cv6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cv6, "cv");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (cv6.containsKey("msgId")) {
            java.lang.Long asLong = cv6.getAsLong("msgId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(asLong, "getAsLong(...)");
            wVar.f511624a = asLong.longValue();
            arrayList.add(up5.i.f511504c);
        }
        if (cv6.containsKey("msgSvrId")) {
            java.lang.Long asLong2 = cv6.getAsLong("msgSvrId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(asLong2, "getAsLong(...)");
            wVar.f511625b = asLong2.longValue();
            arrayList.add(up5.i.f511505d);
        }
        if (cv6.containsKey("type")) {
            java.lang.Integer asInteger = cv6.getAsInteger("type");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(asInteger, "getAsInteger(...)");
            wVar.f511626c = asInteger.intValue();
            arrayList.add(up5.i.f511506e);
        }
        if (cv6.containsKey("status")) {
            java.lang.Integer asInteger2 = cv6.getAsInteger("status");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(asInteger2, "getAsInteger(...)");
            wVar.f511627d = asInteger2.intValue();
            arrayList.add(up5.i.f511507f);
        }
        if (cv6.containsKey("isSend")) {
            java.lang.Integer asInteger3 = cv6.getAsInteger("isSend");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(asInteger3, "getAsInteger(...)");
            wVar.f511628e = asInteger3.intValue();
            arrayList.add(up5.i.f511508g);
        }
        if (cv6.containsKey("isShowTimer")) {
            java.lang.Integer asInteger4 = cv6.getAsInteger("isShowTimer");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(asInteger4, "getAsInteger(...)");
            wVar.f511629f = asInteger4.intValue();
            arrayList.add(up5.i.f511509h);
        }
        if (cv6.containsKey("createTime")) {
            java.lang.Long asLong3 = cv6.getAsLong("createTime");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(asLong3, "getAsLong(...)");
            wVar.f511630g = asLong3.longValue();
            arrayList.add(up5.i.f511510i);
        }
        if (cv6.containsKey("talker")) {
            wVar.f511631h = cv6.getAsString("talker");
            arrayList.add(up5.i.f511511j);
        }
        if (cv6.containsKey("content")) {
            wVar.f511632i = cv6.getAsString("content");
            arrayList.add(up5.i.f511512k);
        }
        if (cv6.containsKey("imgPath")) {
            wVar.f511633j = cv6.getAsString("imgPath");
            arrayList.add(up5.i.f511513l);
        }
        if (cv6.containsKey("reserved")) {
            wVar.f511634k = cv6.getAsString("reserved");
            arrayList.add(up5.i.f511514m);
        }
        if (cv6.containsKey("lvbuffer")) {
            wVar.f511635l = cv6.getAsByteArray("lvbuffer");
            arrayList.add(up5.i.f511515n);
        }
        if (cv6.containsKey("talkerId")) {
            java.lang.Integer asInteger5 = cv6.getAsInteger("talkerId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(asInteger5, "getAsInteger(...)");
            wVar.f511638o = asInteger5.intValue();
            arrayList.add(up5.i.f511518q);
        }
        if (cv6.containsKey("transContent")) {
            wVar.f511636m = cv6.getAsString("transContent");
            arrayList.add(up5.i.f511516o);
        }
        if (cv6.containsKey("transBrandWording")) {
            wVar.f511637n = cv6.getAsString("transBrandWording");
            arrayList.add(up5.i.f511517p);
        }
        if (cv6.containsKey("bizClientMsgId")) {
            wVar.f511639p = cv6.getAsString("bizClientMsgId");
            arrayList.add(up5.i.f511519r);
        }
        if (cv6.containsKey("bizChatId")) {
            java.lang.Long asLong4 = cv6.getAsLong("bizChatId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(asLong4, "getAsLong(...)");
            wVar.f511640q = asLong4.longValue();
            arrayList.add(up5.i.f511520s);
        }
        if (cv6.containsKey("bizChatUserId")) {
            wVar.f511641r = cv6.getAsString("bizChatUserId");
            arrayList.add(up5.i.f511521t);
        }
        if (cv6.containsKey("msgSeq")) {
            java.lang.Long asLong5 = cv6.getAsLong("msgSeq");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(asLong5, "getAsLong(...)");
            wVar.f511642s = asLong5.longValue();
            arrayList.add(up5.i.f511522u);
        }
        if (cv6.containsKey("flag")) {
            java.lang.Integer asInteger6 = cv6.getAsInteger("flag");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(asInteger6, "getAsInteger(...)");
            wVar.f511643t = asInteger6.intValue();
            arrayList.add(up5.i.f511523v);
        }
        if (cv6.containsKey("solitaireFoldInfo")) {
            try {
                wVar.f511644u = cv6.getAsByteArray("solitaireFoldInfo");
                arrayList.add(up5.i.f511524w);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MessageEx", e17.getMessage());
            }
        }
        if (cv6.containsKey("fromUsername")) {
            wVar.f511646w = cv6.getAsString("fromUsername");
            arrayList.add(up5.i.f511526y);
        }
        if (cv6.containsKey("toUsername")) {
            wVar.f511647x = cv6.getAsString("toUsername");
            arrayList.add(up5.i.f511527z);
        }
        if (cv6.containsKey("historyId")) {
            wVar.f511645v = cv6.getAsString("historyId");
            arrayList.add(up5.i.f511525x);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]) arrayList.toArray(new com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[0]);
    }
}
