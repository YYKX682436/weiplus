package db2;

/* loaded from: classes2.dex */
public final class f5 extends az2.u implements zy2.jc {

    /* renamed from: g, reason: collision with root package name */
    public final int f309504g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f309505h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f309506i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(java.lang.String userName, r45.h32 noticeInfo, int i17, r45.qt2 qt2Var, java.util.LinkedList linkedList, r45.t32 t32Var, java.lang.String str, java.lang.Integer num, java.lang.String str2, long j17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(qt2Var);
        java.util.LinkedList linkedList2 = (i18 & 16) != 0 ? null : linkedList;
        r45.t32 t32Var2 = (i18 & 32) != 0 ? null : t32Var;
        java.lang.String str3 = (i18 & 64) != 0 ? null : str;
        java.lang.Integer num2 = (i18 & 128) != 0 ? 0 : num;
        java.lang.String str4 = (i18 & 256) == 0 ? str2 : null;
        long j18 = (i18 & 512) != 0 ? 0L : j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeInfo, "noticeInfo");
        this.f309504g = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findercreatelivenotice";
        lVar.f152200d = 6653;
        r45.g01 g01Var = new r45.g01();
        g01Var.set(2, userName);
        g01Var.set(3, noticeInfo);
        g01Var.set(4, java.lang.Integer.valueOf(i17));
        g01Var.set(8, str3);
        g01Var.set(11, str4);
        g01Var.set(12, java.lang.Long.valueOf(j18));
        g01Var.set(9, java.lang.Integer.valueOf(num2 != null ? num2.intValue() : 0));
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        g01Var.set(10, java.lang.Integer.valueOf(ml2.j0.f409116i.f409828e0.f409225d));
        if (linkedList2 != null) {
            g01Var.set(6, linkedList2);
        }
        if (t32Var2 != null) {
            g01Var.set(7, t32Var2);
        }
        g01Var.set(1, db2.t4.f309704a.b(6653, qt2Var));
        r45.kv0 kv0Var = (r45.kv0) g01Var.m75936x14adae67(1);
        if (kv0Var != null) {
            kv0Var.set(1, java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(7) : 0));
        }
        r45.h01 h01Var = new r45.h01();
        lVar.f152197a = g01Var;
        lVar.f152198b = h01Var;
        this.f309505h = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneCreateLiveNotice", "NetSceneCreateLiveNotice init: userName=" + userName + ", startTime=" + noticeInfo.m75939xb282bd08(0) + " ,opType=" + i17 + ", notice_starttime_type=" + noticeInfo.m75939xb282bd08(20) + ", sourceScene=" + g01Var.m75939xb282bd08(10));
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneCreateLiveNotice", "onCgiEnd: errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f309506i;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f309506i = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f309505h;
        if (oVar != null) {
            return mo9409x10f9447a(sVar, oVar, this);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rr");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 6653;
    }
}
