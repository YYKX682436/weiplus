package com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.kinda.framework.kindalite.KindaLiteMgr$Companion$paymarsHelperLoaded$2 */
/* loaded from: classes8.dex */
public final class C3196x43a0f83f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3196x43a0f83f f12285x4fbc8495 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3196x43a0f83f();

    public C3196x43a0f83f() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public final java.lang.Boolean mo152xb9724478() {
        boolean z17;
        try {
            fp.d0.o("paymarshelper");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3194xff8cea9d.TAG, "loadLibrary paymarshelper success");
            z17 = true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3194xff8cea9d.TAG, "loadLibrary paymarshelper failed: " + th6.getMessage());
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
