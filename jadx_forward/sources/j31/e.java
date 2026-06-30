package j31;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final j31.e f378925a = new j31.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f378926b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static java.util.List f378927c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static int f378928d;

    public static final void a(int i17, j31.c reportInfo, int i18, int i19, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfo, "reportInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubscribeMsgReporter", "reportFooterRejectMsgOp opType: %s, username: %s, jumpType: %s, jumpInfo: %s businessType: " + i18 + " containerType: " + i19 + ' ', java.lang.Integer.valueOf(i17), reportInfo.f378902a, java.lang.Integer.valueOf(reportInfo.f378908g), reportInfo.f378909h);
        jx3.f fVar = jx3.f.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[28];
        objArr[0] = reportInfo.f378902a;
        objArr[1] = reportInfo.f378904c;
        objArr[2] = java.lang.Integer.valueOf(reportInfo.f378905d);
        objArr[3] = reportInfo.f378906e;
        objArr[4] = reportInfo.f378907f;
        objArr[5] = java.lang.Integer.valueOf(i17);
        objArr[6] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        objArr[7] = java.lang.Integer.valueOf(reportInfo.f378908g);
        objArr[8] = reportInfo.f378909h;
        objArr[9] = java.lang.Integer.valueOf(reportInfo.f378903b);
        objArr[10] = java.lang.Integer.valueOf(i18);
        objArr[11] = java.lang.Integer.valueOf(i19);
        objArr[12] = java.lang.Integer.valueOf(reportInfo.f378910i);
        objArr[13] = java.lang.Integer.valueOf(reportInfo.f378911j);
        objArr[14] = java.lang.Integer.valueOf(reportInfo.f378912k);
        objArr[15] = reportInfo.f378913l;
        objArr[16] = java.lang.Integer.valueOf(reportInfo.f378914m);
        objArr[17] = reportInfo.f378916o;
        objArr[18] = reportInfo.f378915n;
        objArr[19] = str;
        objArr[20] = i17 == 17 ? reportInfo.f378917p : null;
        objArr[21] = reportInfo.f378918q;
        objArr[22] = java.lang.Integer.valueOf(reportInfo.f378919r);
        objArr[23] = java.lang.Integer.valueOf(reportInfo.f378920s);
        objArr[24] = java.lang.Integer.valueOf(reportInfo.f378921t);
        objArr[25] = reportInfo.f378922u;
        objArr[26] = java.lang.Integer.valueOf(reportInfo.f378923v);
        objArr[27] = reportInfo.f378924w;
        fVar.d(21811, objArr);
    }

    public static final void b(int i17, j31.c reportInfo, int i18, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfo, "reportInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubscribeMsgReporter", "reportNewBizTypeMsgOp opType: %s, username: %s, jumpType: %s, jumpInfo: %s businessType: " + i18, java.lang.Integer.valueOf(i17), reportInfo.f378902a, java.lang.Integer.valueOf(reportInfo.f378908g), reportInfo.f378909h);
        jx3.f fVar = jx3.f.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[28];
        objArr[0] = reportInfo.f378902a;
        objArr[1] = reportInfo.f378904c;
        objArr[2] = java.lang.Integer.valueOf(reportInfo.f378905d);
        objArr[3] = reportInfo.f378906e;
        objArr[4] = reportInfo.f378907f;
        objArr[5] = java.lang.Integer.valueOf(i17);
        objArr[6] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        objArr[7] = java.lang.Integer.valueOf(reportInfo.f378908g);
        objArr[8] = reportInfo.f378909h;
        objArr[9] = java.lang.Integer.valueOf(reportInfo.f378903b);
        objArr[10] = java.lang.Integer.valueOf(i18);
        objArr[11] = 0;
        objArr[12] = java.lang.Integer.valueOf(reportInfo.f378910i);
        objArr[13] = java.lang.Integer.valueOf(reportInfo.f378911j);
        objArr[14] = java.lang.Integer.valueOf(reportInfo.f378912k);
        objArr[15] = reportInfo.f378913l;
        objArr[16] = java.lang.Integer.valueOf(reportInfo.f378914m);
        objArr[17] = reportInfo.f378916o;
        objArr[18] = reportInfo.f378915n;
        objArr[19] = str;
        objArr[20] = i17 == 17 ? reportInfo.f378917p : null;
        objArr[21] = reportInfo.f378918q;
        objArr[22] = java.lang.Integer.valueOf(reportInfo.f378919r);
        objArr[23] = java.lang.Integer.valueOf(reportInfo.f378920s);
        objArr[24] = java.lang.Integer.valueOf(reportInfo.f378921t);
        objArr[25] = reportInfo.f378922u;
        objArr[26] = java.lang.Integer.valueOf(reportInfo.f378923v);
        objArr[27] = reportInfo.f378924w;
        fVar.d(21811, objArr);
    }

    public static final void d(int i17, com.p314xaae8f345.mm.p965xc41bc71e.p967xc84c5534.C11163x161e898f reportInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfo, "reportInfo");
        jx3.f.INSTANCE.d(21814, reportInfo.f153373e, java.lang.Long.valueOf(reportInfo.f153374f), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(reportInfo.f153375g ? 1 : 0), java.lang.Integer.valueOf(reportInfo.f153376h), kz5.n0.g0(reportInfo.f153377i, "#", null, null, 0, null, null, 62, null), kz5.n0.g0(reportInfo.f153380o, "#", null, null, 0, null, null, 62, null), kz5.n0.g0(reportInfo.f153379n, "#", null, null, 0, null, null, 62, null), kz5.n0.g0(reportInfo.f153378m, "#", null, null, 0, null, null, 62, null), kz5.n0.g0(reportInfo.f153381p, "#", null, null, 0, null, null, 62, null), java.lang.Integer.valueOf(reportInfo.f153372d));
    }

    public final void c(int i17, j31.b reportInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfo, "reportInfo");
        if (i17 != 5) {
            jx3.f.INSTANCE.d(21802, reportInfo.f378896a, reportInfo.f378898c, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), kz5.n0.g0(reportInfo.f378899d, "#", null, null, 0, null, null, 62, null), kz5.n0.g0(reportInfo.f378900e, "#", null, null, 0, null, null, 62, null), java.lang.Integer.valueOf(reportInfo.f378901f), reportInfo.f378897b, 1);
        } else {
            jx3.f.INSTANCE.d(21802, reportInfo.f378896a, reportInfo.f378898c, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "", "", 0, reportInfo.f378897b);
        }
    }

    public final void e(java.lang.String bizUsername, int i17, java.lang.String templateId, int i18, java.lang.String templateName, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateName, "templateName");
        jx3.f.INSTANCE.d(17638, bizUsername, java.lang.Integer.valueOf(i17), templateId, java.lang.Integer.valueOf(i18), templateName, java.lang.Integer.valueOf(i19));
    }
}
