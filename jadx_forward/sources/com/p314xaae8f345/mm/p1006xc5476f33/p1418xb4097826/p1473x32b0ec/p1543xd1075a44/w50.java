package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class w50 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f201679a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f201680b;

    public w50(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f201679a = context;
        r45.q12 q12Var = new r45.q12();
        q12Var.set(0, 1);
        q12Var.set(1, 1);
        jz5.l lVar = new jz5.l("portrait", q12Var);
        r45.q12 q12Var2 = new r45.q12();
        q12Var2.set(0, 1);
        q12Var2.set(1, 2);
        jz5.l lVar2 = new jz5.l("landscape", q12Var2);
        r45.q12 q12Var3 = new r45.q12();
        q12Var3.set(0, 2);
        q12Var3.set(1, 1);
        jz5.l lVar3 = new jz5.l("single_room", q12Var3);
        r45.q12 q12Var4 = new r45.q12();
        q12Var4.set(0, 2);
        q12Var4.set(1, 2);
        jz5.l lVar4 = new jz5.l("multi_room", q12Var4);
        r45.q12 q12Var5 = new r45.q12();
        q12Var5.set(0, 2);
        q12Var5.set(1, 16);
        jz5.l lVar5 = new jz5.l("chat_room", q12Var5);
        r45.q12 q12Var6 = new r45.q12();
        q12Var6.set(0, 2);
        q12Var6.set(1, 8);
        jz5.l lVar6 = new jz5.l("ktv_option", q12Var6);
        r45.q12 q12Var7 = new r45.q12();
        q12Var7.set(0, 5);
        q12Var7.set(1, 1);
        this.f201680b = kz5.c1.k(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, new jz5.l("co_live_normal", q12Var7));
    }

    public final java.util.List a() {
        android.content.Context context = this.f201679a;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573213m05);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x50 x50Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x50("single_room", string, null, null, null, 28, null);
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573212m03);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x50 x50Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x50("multi_room", string2, null, null, null, 28, null);
        java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.olu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        return kz5.c0.i(x50Var, x50Var2, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x50("chat_room", string3, null, null, null, 28, null));
    }

    public final java.util.List b() {
        java.lang.String string = this.f201679a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.epw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return kz5.b0.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x50("ktv_option", string, null, null, null, 28, null));
    }

    public final java.util.List c(yf2.m1 m1Var) {
        android.content.Context context = this.f201679a;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oze);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80630xf55a94ff);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x50 x50Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x50("portrait", string, valueOf, null, null, 24, null);
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ozd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        return kz5.c0.i(x50Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x50("landscape", string2, valueOf, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u50.f201481d, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v50(m1Var)));
    }

    public final r45.q12 d(java.lang.String targetOptionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetOptionId, "targetOptionId");
        return (r45.q12) this.f201680b.get(targetOptionId);
    }

    public final jz5.l e(r45.q12 q12Var) {
        if (q12Var == null) {
            return new jz5.l("", "");
        }
        int m75939xb282bd08 = q12Var.m75939xb282bd08(0);
        java.lang.String str = null;
        if (m75939xb282bd08 == 1) {
            int m75939xb282bd082 = q12Var.m75939xb282bd08(1);
            if (m75939xb282bd082 == 1) {
                str = "portrait";
            } else if (m75939xb282bd082 == 2) {
                str = "landscape";
            }
            return new jz5.l("video", str);
        }
        if (m75939xb282bd08 != 2) {
            if (m75939xb282bd08 != 3 && m75939xb282bd08 == 5) {
                return new jz5.l("co_live", "co_live_normal");
            }
            return new jz5.l("game", null);
        }
        if (q12Var.m75939xb282bd08(1) == 8) {
            return new jz5.l("karaoke", "ktv_option");
        }
        int m75939xb282bd083 = q12Var.m75939xb282bd08(1);
        if (m75939xb282bd083 == 1) {
            str = "single_room";
        } else if (m75939xb282bd083 == 2) {
            str = "multi_room";
        } else if (m75939xb282bd083 == 16) {
            str = "chat_room";
        }
        return new jz5.l("chat_room", str);
    }
}
