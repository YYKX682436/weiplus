package w35;

/* loaded from: classes8.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w35.q f524287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f524288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f524289f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f524290g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f524291h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w f524292i;

    public p(w35.q qVar, android.content.Intent intent, java.lang.String str, android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar) {
        this.f524287d = qVar;
        this.f524288e = intent;
        this.f524289f = str;
        this.f524290g = context;
        this.f524291h = f4Var;
        this.f524292i = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        w35.q qVar = this.f524287d;
        long d17 = com.p314xaae8f345.mm.vfs.w6.d(qVar.f524259d, qVar.f524295g, false);
        android.content.Intent intent = this.f524288e;
        java.lang.String str2 = this.f524289f;
        intent.setPackage(str2);
        if (d17 > 0) {
            str = qVar.f524295g;
        } else {
            str = qVar.f524259d;
            if (str == null) {
                str = "";
            }
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.e(this.f524290g, this.f524288e, r6Var, qVar.f524256a.f270843c, qVar.f524258c, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(qVar.f524293e, "try open file: " + qVar.f524259d + ", " + qVar.f524258c + ", by: " + str2 + ", copyRet:" + d17);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.i0.f272496a.a(str2, qVar.f524258c);
        d75.b.g(new w35.o(this.f524291h, this.f524287d, this.f524290g, this.f524288e, this.f524292i, r6Var, this.f524289f));
    }
}
