package e04;

/* loaded from: classes15.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5967xa7660a29 f327674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f327675e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f327676f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f327677g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f327678h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e04.p f327679i;

    public w0(e04.p pVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5967xa7660a29 c5967xa7660a29, android.content.Context context, int i17, java.lang.String str, int i18) {
        this.f327679i = pVar;
        this.f327674d = c5967xa7660a29;
        this.f327675e = context;
        this.f327676f = i17;
        this.f327677g = str;
        this.f327678h = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5967xa7660a29 c5967xa7660a29 = this.f327674d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c5967xa7660a29.f136265h.f89745a);
        android.content.Context context = this.f327675e;
        e04.p pVar = this.f327679i;
        if (!K0) {
            if (context != null) {
                dp.a.m125854x26a183b(context, c5967xa7660a29.f136265h.f89745a, 1).show();
            }
            pVar.t(false, null);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c5967xa7660a29.f136265h.f89747c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.QBarStringHandler", "resp url is null!");
            pVar.t(false, null);
        } else {
            if (c5967xa7660a29.f136265h.f89746b == 1) {
                ((ng0.q) ((og0.o) i95.n0.c(og0.o.class))).Ni(this.f327675e, c5967xa7660a29.f136265h.f89747c, this.f327676f, this.f327677g, this.f327678h, null);
                pVar.t(true, null);
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", c5967xa7660a29.f136265h.f89747c);
            ((com.p314xaae8f345.mm.app.y7) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.i1.a()).D(intent, context);
            pVar.t(true, null);
        }
    }
}
