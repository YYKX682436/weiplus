package db2;

/* loaded from: classes3.dex */
public final class b1 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final db2.z0 f309439t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f309440u;

    public /* synthetic */ b1(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.Integer num, java.lang.String str4, db2.z0 z0Var, r45.qt2 qt2Var, int i18, java.lang.Integer num2, java.util.LinkedList linkedList, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i19 & 1) != 0 ? "" : str, (i19 & 2) != 0 ? "" : str2, (i19 & 4) == 0 ? str3 : "", (i19 & 8) != 0 ? 0 : i17, (i19 & 16) != 0 ? null : num, (i19 & 32) != 0 ? null : str4, (i19 & 64) != 0 ? null : z0Var, (i19 & 128) == 0 ? qt2Var : null, (i19 & 256) != 0 ? 0 : i18, (i19 & 512) != 0 ? 0 : num2, (i19 & 1024) != 0 ? new java.util.LinkedList() : linkedList);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.v71 resp = (r45.v71) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309440u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
        pm0.v.X(new db2.a1(this, i17, i18, str, resp));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(java.lang.String noticeId, java.lang.String appid, java.lang.String anchorFinderUsername, int i17, java.lang.Integer num, java.lang.String str, db2.z0 z0Var, r45.qt2 qt2Var, int i18, java.lang.Integer num2, java.util.LinkedList noticeTypeList) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeId, "noticeId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appid, "appid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorFinderUsername, "anchorFinderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeTypeList, "noticeTypeList");
        this.f309439t = z0Var;
        this.f309440u = "Finder.CgiFinderGetLiveNotice";
        r45.u71 u71Var = new r45.u71();
        u71Var.set(1, noticeId);
        if ((appid.length() > 0) || num != null || str != null) {
            r45.u32 u32Var = new r45.u32();
            u32Var.set(0, java.lang.Integer.valueOf(num != null ? num.intValue() : 1));
            u32Var.set(3, str);
            u32Var.set(1, appid);
            u71Var.set(2, u32Var);
        }
        u71Var.set(3, anchorFinderUsername);
        u71Var.set(4, java.lang.Integer.valueOf(i17));
        u71Var.set(5, java.lang.Integer.valueOf(i18));
        u71Var.set(6, java.lang.Integer.valueOf(num2 != null ? num2.intValue() : 0));
        u71Var.set(7, noticeTypeList);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = u71Var;
        r45.v71 v71Var = new r45.v71();
        v71Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) v71Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = v71Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetlivenotice";
        lVar.f152200d = 5872;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderGetLiveNotice", "init noticeId:" + noticeId + " order:" + i18 + " appid:" + appid);
    }
}
