package dk5;

/* loaded from: classes12.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f316245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f316246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f316247f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316248g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f316249h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f316250i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f316251m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f316252n;

    public l0(java.util.List list, com.p314xaae8f345.mm.vfs.r6 r6Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, java.lang.String str, int i17, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, boolean z17, int i18) {
        this.f316245d = list;
        this.f316246e = r6Var;
        this.f316247f = u3Var;
        this.f316248g = str;
        this.f316249h = i17;
        this.f316250i = activityC0065xcd7aa112;
        this.f316251m = z17;
        this.f316252n = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List list;
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a;
        java.util.List list2 = this.f316245d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f316247f;
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f316246e;
        java.lang.String str = this.f316248g;
        int i17 = this.f316249h;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f316250i;
        int i18 = 0;
        int i19 = 0;
        for (java.lang.Object obj : list2) {
            int i27 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String str2 = (java.lang.String) obj;
            if (u3Var.isShowing()) {
                d75.b.g(new dk5.j0(u3Var, activityC0065xcd7aa112, i19, list2));
                o70.k kVar = new o70.k(r6Var);
                kVar.f424792g.add(new o70.i(str2, null, 0L));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
                kVar.f424788c = str;
                kVar.f424791f = i18;
                kVar.f424789d = i17;
                o70.l lVar = (o70.l) kz5.n0.Z(((b80.u) i95.n0.c(b80.u.class)).oj(kVar));
                if (lVar != null) {
                    k70.i0 i0Var = new k70.i0();
                    i0Var.f386175a = i17;
                    java.lang.String r17 = c01.z1.r();
                    if (r17 == null) {
                        r17 = "";
                    }
                    list = list2;
                    r70.g gVar = new r70.g(str2, 0, r17, str, i0Var);
                    gVar.f474641j = "forward_img_from_gallery";
                    p3325xe03a0797.p3326xc267989b.p3328x30012e.j oj6 = ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).oj(gVar, lVar);
                    java.lang.String str3 = gVar.f474635d;
                    gm0.b bVar = gm0.j1.b().f354778h;
                    if (bVar != null && (c20976x6ba6452a = bVar.f354678e) != null) {
                        v65.i.b(c20976x6ba6452a, null, new dk5.i0(oj6, "processImageShareFromSystemGallery", str3, null), 1, null);
                    }
                    i19 = i27;
                    list2 = list;
                    i18 = 0;
                }
            }
            list = list2;
            i19 = i27;
            list2 = list;
            i18 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgUpload.ImgRetransmitLogic", "delete pre build folder after send ret:" + com.p314xaae8f345.mm.vfs.w6.g(this.f316246e.o(), true));
        if (this.f316247f.isShowing()) {
            ((ku5.t0) ku5.t0.f394148d).B(new dk5.k0(this.f316247f, this.f316250i, this.f316251m, this.f316248g, this.f316252n));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgUpload.ImgRetransmitLogic", "dialog is dismiss do nothing");
        }
    }
}
