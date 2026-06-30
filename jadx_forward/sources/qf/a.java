package qf;

/* loaded from: classes7.dex */
public class a implements qf.c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f443764a;

    public a(android.content.Context context) {
        this.f443764a = context;
    }

    @Override // qf.c
    public android.webkit.WebResourceResponse a(java.lang.String str) {
        try {
            return new android.webkit.WebResourceResponse("application/javascript", com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c, this.f443764a.getAssets().open("LuggageBridge.js"));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // qf.c
    public java.lang.String b() {
        return "^luggage://bridge$";
    }
}
