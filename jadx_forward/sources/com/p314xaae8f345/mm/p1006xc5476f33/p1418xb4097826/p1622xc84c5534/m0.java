package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes4.dex */
public final class m0 implements i95.m {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.m0 f206653d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.m0();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f206654e = new java.util.HashMap();

    public java.lang.String b(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append('-');
        java.lang.Object obj = f206654e.get(java.lang.Integer.valueOf(i17));
        if (obj == null) {
            obj = 0L;
        }
        sb6.append(((java.lang.Number) obj).longValue());
        return sb6.toString();
    }

    public void c(int i17, int i18, java.lang.String sourceUsr, java.lang.String str, java.lang.String str2, int i19, java.lang.String userName, java.lang.String str3, long j17, java.lang.String messageSvrId) {
        java.lang.String str4 = str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceUsr, "sourceUsr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(messageSvrId, "messageSvrId");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String b17 = b(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedCardReporter", "report22144 entersessionId=" + b17 + ", entersession=" + i17 + ", eventTime=" + currentTimeMillis + ", cardType=" + i18 + ", sourceUsr=" + sourceUsr + ", feedId=" + str4 + ", sourceCommentScene=" + i19);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[12];
        objArr[0] = b17;
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Long.valueOf(currentTimeMillis);
        objArr[3] = java.lang.Integer.valueOf(i18);
        objArr[4] = sourceUsr;
        if (str4 == null) {
            str4 = "";
        }
        objArr[5] = str4;
        objArr[6] = str == null ? "" : str;
        objArr[7] = java.lang.Integer.valueOf(i19);
        objArr[8] = userName;
        objArr[9] = str3 != null ? str3 : "";
        objArr[10] = java.lang.Long.valueOf(j17);
        objArr[11] = messageSvrId;
        g0Var.d(22144, objArr);
    }
}
