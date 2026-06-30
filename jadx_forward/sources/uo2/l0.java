package uo2;

/* loaded from: classes2.dex */
public final class l0 {
    public l0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s a(android.content.Context context, r45.sd1 liteAppParam, java.lang.String str, uo2.m0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppParam, "liteAppParam");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", liteAppParam.m75945x2fec8307(0));
        if (str == null || str.length() == 0) {
            str = liteAppParam.m75945x2fec8307(2);
        } else {
            java.lang.String m75945x2fec8307 = liteAppParam.m75945x2fec8307(2);
            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                str = liteAppParam.m75945x2fec8307(2) + '&' + str;
            }
        }
        bundle.putString("query", str);
        bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, liteAppParam.m75945x2fec8307(1));
        bundle.putInt("nextAnimIn", com.p314xaae8f345.mm.R.C30854x2dc211.f559254i);
        bundle.putInt("currentAnimOut", com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
        sVar.f225700d = callback;
        callback.f511167a = sVar;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(context, bundle, true, false, sVar, null);
        return sVar;
    }
}
