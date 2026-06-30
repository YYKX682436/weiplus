package o25;

/* loaded from: classes4.dex */
public final class d2 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f424035a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o25.c2 f424036b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f424037c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f424038d;

    public d2(java.lang.String str, o25.c2 c2Var, java.lang.String str2, java.lang.String str3) {
        this.f424035a = str;
        this.f424036b = c2Var;
        this.f424037c = str2;
        this.f424038d = str3;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenBusinessViewAsLiteAppHandler", "handle for sessionId:" + this.f424035a + ", start fail");
        o25.g2.f424060a.b(this.f424037c, this.f424038d, this.f424035a, -3, null, null);
        o25.c2 c2Var = this.f424036b;
        if (c2Var != null) {
            c2Var.c();
        }
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenBusinessViewAsLiteAppHandler", "handle for sessionId:" + this.f424035a + ", start success");
    }
}
