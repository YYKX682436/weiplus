package jm4;

/* loaded from: classes.dex */
public final class l2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f381929d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(java.lang.String str) {
        super(0);
        this.f381929d = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String errMsg = this.f381929d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        if (errMsg.length() == 0) {
            errMsg = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574915jz0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NativeShowErrorToast", "processPlayError, errorMsg:" + errMsg);
        il4.l lVar = il4.l.f373675a;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (errMsg == null || errMsg.length() == 0) {
            errMsg = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h4e);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(errMsg, "getString(...)");
        }
        db5.t7.m(context, errMsg);
        return jz5.f0.f384359a;
    }
}
