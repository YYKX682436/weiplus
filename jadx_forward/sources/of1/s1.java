package of1;

/* loaded from: classes7.dex */
public final class s1 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ of1.w1 f426537a;

    public s1(of1.w1 w1Var) {
        this.f426537a = w1Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 mo32091x9a3f0ba2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C0;
        java.lang.String str = (java.lang.String) obj;
        if ((str == null || str.length() == 0) || (mo32091x9a3f0ba2 = this.f426537a.m151232xaf156f4a().mo32091x9a3f0ba2()) == null || (C0 = mo32091x9a3f0ba2.C0()) == null) {
            return;
        }
        C0.g("onDumpWebviewDom", str);
    }
}
