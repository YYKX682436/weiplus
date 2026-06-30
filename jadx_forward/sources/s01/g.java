package s01;

/* loaded from: classes11.dex */
public class g extends l75.n0 implements l75.z0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f483403f = {l75.n0.m145250x3fdc6f77(s01.b.W, "BizChatConversation")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f483404d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.v0 f483405e;

    public g(l75.k0 k0Var) {
        super(k0Var, s01.b.W, "BizChatConversation", null);
        boolean z17;
        this.f483405e = new s01.d(this);
        this.f483404d = k0Var;
        ((ku5.t0) ku5.t0.f394148d).k(new s01.c(this, k0Var), 30000L);
        android.database.Cursor f17 = k0Var.f("PRAGMA table_info( BizChatConversation)", null, 2);
        while (true) {
            if (!f17.moveToNext()) {
                z17 = false;
                break;
            }
            int columnIndex = f17.getColumnIndex(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
            if (columnIndex >= 0 && "flag".equalsIgnoreCase(f17.getString(columnIndex))) {
                z17 = true;
                break;
            }
        }
        f17.close();
        if (!z17) {
            k0Var.A("BizChatConversation", "update BizChatConversation set flag = lastMsgTime");
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
    }

    public static long W0(s01.b bVar, int i17, long j17) {
        if (bVar == null) {
            return 0L;
        }
        if (j17 == 0) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            j17 = java.lang.System.currentTimeMillis();
        }
        return i17 != 2 ? i17 != 3 ? i17 != 4 ? b1(bVar, j17) : b1(bVar, j17) & 4611686018427387904L : b1(bVar, j17) & (-4611686018427387905L) : b1(bVar, j17) | 4611686018427387904L;
    }

    public static long b1(s01.b bVar, long j17) {
        return (j17 & 72057594037927935L) | (bVar.f69071x225ba391 & (-72057594037927936L));
    }

    public boolean D0(long j17) {
        s01.b J0 = J0(j17);
        boolean mo9951xb06685ab = super.mo9951xb06685ab(J0, "bizChatId");
        if (mo9951xb06685ab) {
            s01.e eVar = new s01.e();
            eVar.f483394a = J0.f69064xa6206081;
            eVar.f483395b = J0;
            l75.v0 v0Var = this.f483405e;
            v0Var.d(eVar);
            v0Var.c();
        }
        return mo9951xb06685ab;
    }

    public s01.b J0(long j17) {
        s01.b bVar = new s01.b();
        bVar.f69064xa6206081 = j17;
        super.get(bVar, new java.lang.String[0]);
        return bVar;
    }

    public android.database.Cursor L0(java.lang.String str) {
        return this.f483404d.B("select * from BizChatConversation where brandUserName = '" + str + "' order by flag desc , lastMsgTime desc", null);
    }

    public int P0(java.lang.String str) {
        android.database.Cursor f17 = this.f483404d.f("select count(*) from BizChatConversation where brandUserName = '" + str + "' ", null, 2);
        if (f17 != null) {
            r0 = f17.moveToFirst() ? f17.getInt(0) : 0;
            f17.close();
        }
        return r0;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: d1, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(s01.b bVar) {
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizConversationStorage", "insert wrong argument");
            return false;
        }
        boolean mo880xb970c2b9 = super.mo880xb970c2b9(bVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizConversationStorage", "BizChatConversationStorage insert res:%s", java.lang.Boolean.valueOf(mo880xb970c2b9));
        if (mo880xb970c2b9) {
            s01.e eVar = new s01.e();
            eVar.f483394a = bVar.f69064xa6206081;
            eVar.f483395b = bVar;
            l75.v0 v0Var = this.f483405e;
            v0Var.d(eVar);
            v0Var.c();
        }
        return mo880xb970c2b9;
    }

    public boolean f1(s01.b bVar) {
        if (bVar != null) {
            return W0(bVar, 4, 0L) != 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizConversationStorage", "isPlacedTop failed, conversation null");
        return false;
    }

    /* renamed from: finalize */
    public void m163489xd764dc1e() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizConversationStorage", "onNotifyChange");
        if (obj == null || !(obj instanceof java.lang.String)) {
            return;
        }
        java.lang.String str = (java.lang.String) obj;
        if (!r01.z.g(str) || c01.e2.J(str)) {
            return;
        }
        s01.r.b(str, true, null);
    }

    public boolean i1(long j17) {
        J0(j17);
        s01.b J0 = J0(j17);
        boolean A = this.f483404d.A("BizChatConversation", "update BizChatConversation set flag = " + W0(J0, 2, J0.f69074x2c252eb3) + " where bizChatId = " + J0.f69064xa6206081);
        if (A) {
            s01.b J02 = J0(J0.f69064xa6206081);
            s01.e eVar = new s01.e();
            eVar.f483394a = J02.f69064xa6206081;
            eVar.f483395b = J02;
            l75.v0 v0Var = this.f483405e;
            v0Var.d(eVar);
            v0Var.c();
        }
        return A;
    }

    public boolean k1(long j17) {
        s01.b J0 = J0(j17);
        boolean A = this.f483404d.A("BizChatConversation", "update BizChatConversation set flag = " + W0(J0, 3, J0.f69074x2c252eb3) + " where bizChatId = " + J0.f69064xa6206081);
        if (A) {
            s01.b J02 = J0(J0.f69064xa6206081);
            s01.e eVar = new s01.e();
            eVar.f483394a = J02.f69064xa6206081;
            eVar.f483395b = J02;
            l75.v0 v0Var = this.f483405e;
            v0Var.d(eVar);
            v0Var.c();
        }
        return A;
    }

    public boolean n1(s01.b bVar) {
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizConversationStorage", "update wrong argument");
            return false;
        }
        boolean mo11260x413cb2b4 = super.mo11260x413cb2b4(bVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizConversationStorage", "BizChatConversationStorage update res:%s", java.lang.Boolean.valueOf(mo11260x413cb2b4));
        if (mo11260x413cb2b4) {
            s01.r.r(r01.q3.Ui().z0(bVar.f69064xa6206081));
            s01.e eVar = new s01.e();
            eVar.f483394a = bVar.f69064xa6206081;
            eVar.f483395b = bVar;
            l75.v0 v0Var = this.f483405e;
            v0Var.d(eVar);
            v0Var.c();
        }
        return mo11260x413cb2b4;
    }

    public boolean o1(long j17) {
        s01.b J0 = J0(j17);
        if (J0.f69079xa35b5abb == 0 && J0.f69064xa6206081 == j17) {
            return true;
        }
        J0.f69079xa35b5abb = 0;
        J0.f69063x49a5aa57 = 0;
        J0.f69062x28d584e9 = 0;
        n1(J0);
        return true;
    }

    public void y0(s01.b bVar, int i17, int i18) {
        int i19 = bVar.f69075xcfb74bb3;
        if (i19 == 0) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f69065x75756b18)) {
                bVar.f69075xcfb74bb3 = ((r01.s1) ((r01.x2) i95.n0.c(r01.x2.class))).Bi(null).m(bVar.f69065x75756b18, bVar.f69064xa6206081);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizConversationStorage", "getMsgCount from message table");
        } else if (i17 > 0) {
            int i27 = i19 - i17;
            bVar.f69075xcfb74bb3 = i27;
            if (i27 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizConversationStorage", "msg < 0 ,some path must be ignore!");
                bVar.f69075xcfb74bb3 = 0;
            }
        } else if (i18 > 0) {
            bVar.f69075xcfb74bb3 = i19 + i18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizConversationStorage", "countMsg %d talker :%s deleteCount:%d insertCount:%d", java.lang.Integer.valueOf(bVar.f69075xcfb74bb3), java.lang.Long.valueOf(bVar.f69064xa6206081), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public boolean z0(java.lang.String str) {
        java.lang.String str2 = "delete from BizChatConversation where brandUserName = '" + str + "' ";
        boolean A = this.f483404d.A("BizChatConversation", str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizConversationStorage", "deleteByBrandUserName sql %s,%s", str2, java.lang.Boolean.valueOf(A));
        if (A) {
            s01.b bVar = new s01.b();
            s01.e eVar = new s01.e();
            eVar.f483394a = -1L;
            eVar.f483395b = bVar;
            l75.v0 v0Var = this.f483405e;
            v0Var.d(eVar);
            v0Var.c();
        }
        return A;
    }
}
