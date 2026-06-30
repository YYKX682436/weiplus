package wl0;

/* loaded from: classes13.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f528552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f528553e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f528554f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f528555g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f528556h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wl0.o f528557i;

    public n(wl0.o oVar, java.lang.String str, boolean z17, java.lang.String str2, int i17, java.lang.String str3) {
        this.f528557i = oVar;
        this.f528552d = str;
        this.f528553e = z17;
        this.f528554f = str2;
        this.f528555g = i17;
        this.f528556h = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f528554f;
        if (str == null) {
            str = "";
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        wl0.o oVar = this.f528557i;
        java.util.HashSet hashSet = oVar.f528558a.f528566a;
        int i17 = this.f528555g;
        if (hashSet.contains(java.lang.Integer.valueOf(i17))) {
            if (str.endsWith("市")) {
                str = str.substring(0, str.length() - 1);
            }
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTime(new java.util.Date(currentTimeMillis));
            int i18 = calendar.get(11);
            int i19 = calendar.get(7);
            dm.qa qaVar = new dm.qa();
            java.lang.String str2 = this.f528552d;
            qaVar.f68080x29d12d0e = str2;
            qaVar.f68079x299cd32e = this.f528556h;
            qaVar.f68082x2262335f = i17;
            qaVar.f68083xfff66e8f = this.f528553e ? 1 : 0;
            qaVar.f68076x225a3d90 = str;
            qaVar.f68081x9de75411 = currentTimeMillis;
            qaVar.f68078xd557edbc = i18;
            qaVar.f68077x6f12d422 = i19;
            qaVar.f68075xf102ad1b = 11;
            oVar.f528558a.f528567b.J0(qaVar);
            if (i17 == 15) {
                oVar.f528558a.getClass();
                nl0.d a17 = nl0.c.a();
                if (a17.y0("MomentVideo", str2) != null) {
                    return;
                }
                dm.u6 u6Var = new dm.u6();
                u6Var.f68573x68eb8605 = java.lang.System.currentTimeMillis();
                u6Var.f68588x2262335f = "MomentVideo";
                u6Var.f68574xc8a07680 = str2;
                u6Var.f68589x8987ca93 = java.lang.Integer.parseInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g.replace("0x", ""), 16);
                a17.mo880xb970c2b9(u6Var);
                em0.b.b("MomentVideo", 101);
                hl0.e eVar = new hl0.e("MomentVideo", str2);
                eVar.f363589d = java.lang.System.currentTimeMillis();
                eVar.a();
            }
        }
    }
}
