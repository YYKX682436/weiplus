package g90;

@j95.b
/* loaded from: classes12.dex */
public final class u extends i95.w implements h90.w {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f351295d = "MicroMsg.DeviceFileExtInfoFeatureService";

    public int Ai(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        if (f9Var != null && f9Var.m124847x74d37ac6() > 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.Q0())) {
            lf3.d dVar = lf3.d.f399847a;
            long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
            java.lang.String Q0 = f9Var.Q0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
            up5.o b17 = dVar.b(m124847x74d37ac6, Q0, i17);
            if (b17 != null) {
                java.lang.Boolean saved = b17.f511560f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(saved, "saved");
                if (saved.booleanValue()) {
                    return 4;
                }
                java.lang.Boolean deleted = b17.f511558d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(deleted, "deleted");
                return (deleted.booleanValue() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17.f511557c)) ? 2 : 3;
            }
        }
        return 1;
    }

    public int Bi(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        if (f9Var != null && f9Var.m124847x74d37ac6() > 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.Q0())) {
            lf3.d dVar = lf3.d.f399847a;
            long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
            java.lang.String Q0 = f9Var.Q0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
            up5.o b17 = dVar.b(m124847x74d37ac6, Q0, i17);
            if (b17 != null) {
                java.lang.Boolean deleted = b17.f511558d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(deleted, "deleted");
                return (deleted.booleanValue() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17.f511557c)) ? 2 : 3;
            }
        }
        return 1;
    }

    public java.lang.String Di(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        if (f9Var != null && f9Var.m124847x74d37ac6() > 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.Q0())) {
            lf3.d dVar = lf3.d.f399847a;
            long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
            java.lang.String Q0 = f9Var.Q0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
            up5.o b17 = dVar.b(m124847x74d37ac6, Q0, i17);
            if (b17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17.f511557c) || dVar.f(b17) != 0) {
                return null;
            }
            return b17.f511557c;
        }
        return null;
    }

    public jz5.l Ni(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f ret) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        if (f9Var != null) {
            if (f9Var.m124847x74d37ac6() <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.Q0())) {
                return new jz5.l(null, null);
            }
            lf3.d dVar = lf3.d.f399847a;
            long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
            java.lang.String Q0 = f9Var.Q0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
            up5.o b17 = dVar.b(m124847x74d37ac6, Q0, i17);
            if (b17 != null) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17.f511557c)) {
                    return new jz5.l(null, null);
                }
                int f17 = dVar.f(b17);
                ret.f38864x6ac9171 = f17;
                return (f17 == 0 || f17 == 1) ? new jz5.l(b17.f511557c, b17.f511561g) : new jz5.l(null, null);
            }
        }
        return new jz5.l(null, null);
    }

    public void Ri(com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5, int i17, java.lang.String str, java.lang.Long l17) {
        if (c16564xb55e1d5 != null) {
            java.lang.String a17 = c16564xb55e1d5.a();
            long j17 = c16564xb55e1d5.f231013d;
            if (j17 <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f351295d, "insertOrUpdate error, " + j17 + ", " + a17 + ", filePath:" + str + ", uriId: " + l17);
                return;
            }
            lf3.d dVar = lf3.d.f399847a;
            up5.o b17 = dVar.b(j17, a17, i17);
            if (b17 == null) {
                b17 = new up5.o();
            }
            b17.f511555a = dVar.g(j17, a17, java.lang.Integer.valueOf(i17));
            b17.f511556b = i17;
            b17.f511557c = str;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            b17.f511558d = bool;
            b17.f511560f = bool;
            if (l17 != null) {
                l17.longValue();
                b17.f511561g = l17;
            }
            dVar.e(b17);
        }
    }

    public void Ui(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, java.lang.String str, java.lang.Long l17) {
        if (f9Var != null) {
            Ri(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(f9Var.m124847x74d37ac6(), f9Var.Q0()), i17, str, l17);
        }
    }

    public void Vi(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        if (f9Var == null || f9Var.m124847x74d37ac6() <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.Q0())) {
            return;
        }
        lf3.d dVar = lf3.d.f399847a;
        long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
        java.lang.String Q0 = f9Var.Q0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
        up5.o b17 = dVar.b(m124847x74d37ac6, Q0, i17);
        if (b17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f351295d, "[setFileDeleted] file not exist, msgId:" + f9Var.m124847x74d37ac6() + ", talker:" + f9Var.Q0() + ", path:" + b17.f511557c);
            b17.f511558d = java.lang.Boolean.TRUE;
            dVar.e(b17);
        }
    }

    public void Zi(java.lang.String str, long j17, int i17) {
        if (j17 <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        lf3.d dVar = lf3.d.f399847a;
        up5.o b17 = dVar.b(j17, str == null ? "" : str, i17);
        if (b17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f351295d, "[setFileSaved] file not exist, msgId:" + j17 + ", talker:" + str + ", path:" + b17.f511557c);
            b17.f511560f = java.lang.Boolean.TRUE;
            dVar.e(b17);
        }
    }

    public void aj(java.lang.String str, long j17, long j18, int i17) {
        if (j17 <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        lf3.d dVar = lf3.d.f399847a;
        up5.o b17 = dVar.b(j17, str == null ? "" : str, i17);
        if (b17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f351295d, "setIdForUri, msgId:" + j17 + ", talker:" + str + ", path:" + b17.f511557c + ", uriId: " + j18);
            b17.f511561g = java.lang.Long.valueOf(j18);
            dVar.e(b17);
        }
    }

    public void wi(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        if (f9Var == null || f9Var.m124847x74d37ac6() <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.Q0())) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f351295d, "do delete, msgId:" + f9Var.m124847x74d37ac6() + ", talker:" + f9Var.Q0());
        lf3.d.f399847a.a(f9Var.m124847x74d37ac6(), f9Var.Q0(), java.lang.Integer.valueOf(i17));
    }
}
