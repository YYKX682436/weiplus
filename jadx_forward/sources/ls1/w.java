package ls1;

/* loaded from: classes7.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls1.e0 f402547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f402548e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ls1.e0 e0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59) {
        super(0);
        this.f402547d = e0Var;
        this.f402548e = c22633x83752a59;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d A[Catch: Exception -> 0x0045, TryCatch #1 {Exception -> 0x0045, blocks: (B:3:0x0002, B:5:0x0013, B:13:0x0038, B:18:0x003d, B:19:0x0044, B:23:0x002e, B:12:0x001e), top: B:2:0x0002, inners: #0 }] */
    @Override // yz5.a
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo152xb9724478() {
        /*
            r5 = this;
            ls1.e0 r0 = r5.f402547d
            android.content.Intent r1 = r0.d0()     // Catch: java.lang.Exception -> L45
            java.lang.String r2 = com.p314xaae8f345.mm.ui.w2.f292732l     // Catch: java.lang.Exception -> L45
            java.lang.String r3 = "KTmplSession"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)     // Catch: java.lang.Exception -> L45
            byte[] r1 = r1.getByteArrayExtra(r2)     // Catch: java.lang.Exception -> L45
            if (r1 == 0) goto L37
            int r2 = r1.length     // Catch: java.lang.Exception -> L45
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L1a
            r2 = r3
            goto L1b
        L1a:
            r2 = r4
        L1b:
            r2 = r2 ^ r3
            if (r2 == 0) goto L37
            java.lang.Class<r45.zb5> r2 = r45.zb5.class
            java.lang.Object r2 = r2.newInstance()     // Catch: java.lang.Exception -> L2d
            r3 = r2
            com.tencent.mm.protobuf.f r3 = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) r3     // Catch: java.lang.Exception -> L2d
            r3.mo11468x92b714fd(r1)     // Catch: java.lang.Exception -> L2d
            com.tencent.mm.protobuf.f r2 = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) r2     // Catch: java.lang.Exception -> L2d
            goto L38
        L2d:
            r1 = move-exception
            java.lang.String r2 = "Intent.decodeProtoBuffer"
            java.lang.String r3 = "decode ProtoBuffer"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L45
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r1, r3, r4)     // Catch: java.lang.Exception -> L45
        L37:
            r2 = 0
        L38:
            r45.zb5 r2 = (r45.zb5) r2     // Catch: java.lang.Exception -> L45
            if (r2 == 0) goto L3d
            goto Lab
        L3d:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException     // Catch: java.lang.Exception -> L45
            java.lang.String r2 = "TmplSession"
            r1.<init>(r2)     // Catch: java.lang.Exception -> L45
            throw r1     // Catch: java.lang.Exception -> L45
        L45:
            r1 = move-exception
            java.lang.String r2 = r0.B1()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "session is null, "
            r3.<init>(r4)
            java.lang.String r1 = r1.getMessage()
            r3.append(r1)
            r1 = 32
            r3.append(r1)
            android.content.Intent r1 = r0.d0()
            java.lang.String r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.w.d(r1)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r1)
            r1 = 153(0x99, float:2.14E-43)
            ax4.a.c(r1)
            com.tencent.mm.plugin.report.service.g0 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.content.Intent r0 = r0.d0()
            java.lang.String r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.w.d(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            r2 = 17260(0x436c, float:2.4186E-41)
            r1.d(r2, r0)
            com.tencent.mm.ui.widget.MMWebView r0 = r5.f402548e
            android.content.Context r1 = r0.m81400x569210f3()
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 == 0) goto La6
            android.content.Context r0 = r0.m81400x569210f3()
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r0, r1)
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
        La6:
            r45.zb5 r2 = new r45.zb5
            r2.<init>()
        Lab:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ls1.w.mo152xb9724478():java.lang.Object");
    }
}
