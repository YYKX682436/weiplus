package ak5;

@j95.b
/* loaded from: classes8.dex */
public final class g0 extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c6 {

    /* renamed from: d, reason: collision with root package name */
    public final kk.l f87208d = new kk.l(50);

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f87209e;

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ai(android.content.Context context, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.db dbVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        ak5.r rVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (i17 != 0) {
            if (i17 != 1) {
                if (i17 == 2) {
                    if (dbVar != null) {
                        java.lang.String t07 = dbVar.t0();
                        long j17 = dbVar.w0().f454138f;
                        int i18 = dbVar.w0().f454139g;
                        java.lang.String MsgUserName = dbVar.w0().f454141i;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(MsgUserName, "MsgUserName");
                        java.lang.String MsgSummary = dbVar.w0().f454140h;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(MsgSummary, "MsgSummary");
                        rVar = new ak5.r(i17, t07, j17, i18, MsgUserName, MsgSummary, null, 0, null);
                    } else if (f9Var != null) {
                        rVar = new ak5.r(i17, f9Var);
                    }
                }
                rVar = null;
            } else {
                if (f9Var != null) {
                    rVar = new ak5.r(i17, f9Var);
                }
                rVar = null;
            }
            if (rVar == null) {
                return;
            }
            ak5.e0 e0Var = new ak5.e0(this, i17, dbVar, context);
            com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getNetSceneQueue(...)");
            p012xc85e97e9.p093xedfae76a.y yVar = context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null;
            if (yVar != null) {
                d17.f152307q.a(11965, yVar, e75.g.f69659x9393ed43, new q01.j(e0Var));
            } else {
                d17.a(11965, e0Var);
            }
            d17.g(rVar);
            this.f87209e = new java.lang.ref.WeakReference(db5.e1.P(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx), 3, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx), false, true, new ak5.f0(rVar, e0Var)));
        }
    }

    public final ak5.v Bi(java.lang.String str) {
        if (str == null) {
            return null;
        }
        kk.l lVar = this.f87208d;
        ak5.v vVar = (ak5.v) lVar.get(str);
        if (vVar != null) {
            return vVar;
        }
        ak5.v vVar2 = new ak5.v(str);
        lVar.put(str, vVar2);
        return vVar2;
    }

    public final java.lang.String Di(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return "";
        }
        if (str2 == null || r26.n0.N(str2)) {
            return "";
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            java.lang.String u17 = c01.e2.u(str, str2, true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u17);
            return u17;
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(str2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
        return e17;
    }

    public final java.lang.String Ni(java.lang.String userName, java.lang.String nickName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickName, "nickName");
        return "<_wc_custom_link_ href='weixin://contacts/profile/" + userName + "'>" + nickName + "</_wc_custom_link_>";
    }

    public java.util.List Ri(java.lang.String str) {
        java.util.List b17;
        if (str == null) {
            return new java.util.LinkedList();
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        ak5.v Bi = Bi(str);
        if (Bi != null && (b17 = Bi.b()) != null) {
            linkedList.addAll(b17);
        }
        return linkedList;
    }

    public final void wi(java.lang.String chatRoomName, int i17) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatRoomName, "chatRoomName");
        ak5.v Bi = Bi(chatRoomName);
        if (Bi != null) {
            java.util.Iterator it = Bi.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((com.p314xaae8f345.mm.p2621x8fb0427b.db) obj).u0() == i17) {
                        break;
                    }
                }
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.db dbVar = (com.p314xaae8f345.mm.p2621x8fb0427b.db) obj;
            if (dbVar != null) {
                dbVar.A0(true);
                dbVar.m125182xee5c84a2(ak5.v.f87227d.a().Q4(), true);
            }
        }
    }
}
