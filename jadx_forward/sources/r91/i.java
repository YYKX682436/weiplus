package r91;

/* loaded from: classes4.dex */
public class i implements r91.f {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f474981a;

    public i(android.content.Context context) {
        this.f474981a = context;
    }

    @Override // r91.f
    public android.os.Bundle a(java.lang.String str, android.os.Bundle bundle) {
        java.lang.String string = bundle != null ? bundle.getString("type", com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.f7335x31ce7ede) : com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.f7335x31ce7ede;
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (string.hashCode() == 94921639) {
            string.equals(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.f7335x31ce7ede);
        }
        bundle2.putBoolean(ya.b.f77504xbb80cbe3, true);
        bundle2.putString("type", string);
        bundle2.putString(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "crash will be triggered after response");
        new android.os.Handler(this.f474981a.getMainLooper()).postDelayed(new r91.RunnableC30029x3046d8(), 100L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QualityMockCmd", "qualityMock type=%s scheduled", string);
        return bundle2;
    }
}
