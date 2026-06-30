package vi1;

/* loaded from: classes7.dex */
public class v implements vi1.g0 {
    @Override // vi1.g0
    public void Ei(android.content.Context context, java.lang.String appId, java.lang.String extDesc, vi1.j2 j2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 phoneItem, vi1.f0 f0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extDesc, "extDesc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(phoneItem, "phoneItem");
        new vi1.k3(context, appId, j2Var, extDesc, phoneItem, f0Var).e(true);
    }

    @Override // vi1.g0
    public void Ha(android.content.Context context, java.lang.String appId, yz5.p callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        nf.g a17 = nf.g.a(context);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.ActivityC12543xfc56fe.class);
        intent.putExtra("APPID", appId);
        a17.j(intent, new vi1.t(callback));
    }

    @Override // vi1.g0
    public void M6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        boolean z17 = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21348x43985120;
    }

    @Override // vi1.g0
    public vi1.d0 R5(android.content.Context context, java.lang.String appId, yz5.a onDone) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onDone, "onDone");
        return new vi1.b1(context, appId, onDone);
    }

    @Override // vi1.g0
    public vi1.h0 U1(android.content.Context context, java.lang.String appId, java.lang.String pagePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagePath, "pagePath");
        return new vi1.b2(context, appId, pagePath);
    }

    @Override // vi1.g0
    public android.text.SpannableString ka(android.content.Context context, java.lang.String appId, java.lang.String pagePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagePath, "pagePath");
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a3i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a3j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        java.lang.String format = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{string}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return new android.text.SpannableString(format);
    }

    @Override // vi1.g0
    public void o8(android.content.Context context, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        callback.mo146xb9724478(0);
    }

    @Override // vi1.g0
    public void oc(android.content.Context context, java.lang.String appId, java.lang.String pagePath, yz5.p callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagePath, "pagePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        nf.g a17 = nf.g.a(context);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.ActivityC12544xcfbd2e8a.class);
        intent.putExtra("APPID", appId);
        intent.putExtra("PAGEPATH", pagePath);
        a17.j(intent, new vi1.u(callback));
    }

    @Override // vi1.g0
    public boolean r8() {
        return true;
    }

    @Override // vi1.g0
    public void ud(vi1.j2 report) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(report, "report");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.DefaultPhoneNumberLogic", "report:" + report);
    }
}
