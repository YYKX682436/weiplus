package hb2;

/* loaded from: classes2.dex */
public final class q extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.q f361615e = new hb2.q();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f361616f = "Finder.FinderModPersonalizedSetting";

    @Override // hb2.w0
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g c(java.lang.Object obj) {
        r45.ti2 cmdBufItem = (r45.ti2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        return com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(cmdBufItem.mo14344x5f01b1f6());
    }

    @Override // hb2.w0
    public int i() {
        return 18;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f361616f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.e33 e33Var;
        r45.e33 e33Var2;
        r45.ti2 cmdBufItem = (r45.ti2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdRef, "cmdRef");
        int m75939xb282bd08 = cmdRef.m75939xb282bd08(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f361616f, "opType=" + cmdBufItem.m75939xb282bd08(0) + " scene=" + cmdBufItem.m75939xb282bd08(1) + " retCode:" + m75939xb282bd08);
        if (m75939xb282bd08 != -1) {
            if (cmdBufItem.m75939xb282bd08(1) != 3 && cmdBufItem.m75939xb282bd08(1) != 4) {
                if (cmdBufItem.m75939xb282bd08(1) == 1) {
                    if (cmdBufItem.m75939xb282bd08(0) == 1) {
                        pm0.v.X(hb2.n.f361605d);
                    }
                    new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5518xee2c723b().e();
                    return;
                }
                return;
            }
            if (cmdBufItem.m75939xb282bd08(0) == 0) {
                g92.b bVar = g92.b.f351302e;
                m92.f fVar = new m92.f();
                if (cmdBufItem.m75939xb282bd08(1) == 3) {
                    r45.e33 e33Var3 = (r45.e33) fVar.d().m75936x14adae67(17);
                    if (e33Var3 != null) {
                        e33Var3.set(2, java.lang.Boolean.FALSE);
                    }
                } else if (cmdBufItem.m75939xb282bd08(1) == 4 && (e33Var2 = (r45.e33) fVar.d().m75936x14adae67(17)) != null) {
                    e33Var2.set(3, java.lang.Boolean.FALSE);
                }
                bVar.S1(fVar, m92.j.A);
                return;
            }
            g92.b bVar2 = g92.b.f351302e;
            m92.f fVar2 = new m92.f();
            if (cmdBufItem.m75939xb282bd08(1) == 3) {
                r45.e33 e33Var4 = (r45.e33) fVar2.d().m75936x14adae67(17);
                if (e33Var4 != null) {
                    e33Var4.set(2, java.lang.Boolean.TRUE);
                }
            } else if (cmdBufItem.m75939xb282bd08(1) == 4 && (e33Var = (r45.e33) fVar2.d().m75936x14adae67(17)) != null) {
                e33Var.set(3, java.lang.Boolean.TRUE);
            }
            bVar2.S1(fVar2, m92.j.A);
        }
    }

    public final void n(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa dataList, yz5.a onRemove) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onRemove, "onRemove");
        boolean a17 = hc2.e.a();
        java.lang.String str = f361616f;
        if (a17) {
            if (pm0.v.b0(dataList, hb2.o.f361609d)) {
                onRemove.mo152xb9724478();
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var.f293309c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.eso);
                e4Var.b(com.p314xaae8f345.mm.R.raw.f81211xadecd6f4);
                e4Var.c();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "openPersonalizedSetting: personalized recommend video is opened");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "openPersonalizedSetting");
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.j9.a(ya2.r.f542058a, true, 1, null, 4, null);
        g92.b bVar = g92.b.f351302e;
        m92.f fVar = new m92.f();
        if (((r45.e33) fVar.d().m75936x14adae67(17)) == null) {
            fVar.d().set(17, new r45.e33());
        }
        r45.e33 e33Var = (r45.e33) fVar.d().m75936x14adae67(17);
        if (e33Var != null) {
            e33Var.set(0, java.lang.Boolean.TRUE);
        }
        bVar.S1(fVar, m92.j.f406538w);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[LOOP:0: B:8:0x0029->B:49:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(android.content.Context r18, com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 r19, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa r20, java.lang.Integer r21, int r22) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hb2.q.o(android.content.Context, com.tencent.mm.view.RefreshLoadMoreLayout, com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer, java.lang.Integer, int):boolean");
    }
}
