package hd3;

/* loaded from: classes.dex */
public final class k implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hd3.l f362095b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362096c;

    public k(java.lang.String str, hd3.l lVar, java.lang.String str2) {
        this.f362094a = str;
        this.f362095b = lVar;
        this.f362096c = str2;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBJsApiTakeHeapSnapshot", "heap snapshot evaluate done, result=" + ((java.lang.String) obj));
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(this.f362094a);
        if (!r6Var.m() || r6Var.C() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiTakeHeapSnapshot", "heap snapshot file not generated: " + this.f362094a);
            this.f362095b.s().mo146xb9724478(this.f362095b.i(lc3.x.f399469c));
            return;
        }
        long C = r6Var.C();
        ((ku5.t0) ku5.t0.f394148d).B(new hd3.j(this.f362094a, C));
        this.f362095b.s().mo146xb9724478(this.f362095b.l(kz5.c1.i(new jz5.l(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, this.f362096c), new jz5.l("physicalPath", this.f362094a), new jz5.l("size", java.lang.Long.valueOf(C)))));
    }
}
