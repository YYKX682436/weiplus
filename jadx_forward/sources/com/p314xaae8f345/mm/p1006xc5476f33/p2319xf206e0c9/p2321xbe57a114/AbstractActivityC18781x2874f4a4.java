package com.p314xaae8f345.mm.p1006xc5476f33.p2319xf206e0c9.p2321xbe57a114;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/updater/xlabupdater/DialogDownloadUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "plugin-updater_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.updater.xlabupdater.DialogDownloadUI */
/* loaded from: classes11.dex */
public abstract class AbstractActivityC18781x2874f4a4 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f257041g = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f257042d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f257043e = jz5.h.b(new xn4.a(this));

    /* renamed from: f, reason: collision with root package name */
    public final xn4.b f257044f = new xn4.b(this);

    public final boolean U6(java.lang.String str) {
        return com.p314xaae8f345.mm.vfs.w6.j(str) && com.p314xaae8f345.mm.vfs.w6.k(str) > 0;
    }

    public final r45.mm6 V6() {
        return (r45.mm6) ((jz5.n) this.f257043e).mo141623x754a37bb();
    }

    public abstract void W6(java.lang.String str);

    public abstract void X6(double d17);

    public abstract void Y6(r45.mm6 mm6Var);

    public abstract void Z6();

    public abstract void a7(java.lang.String str, r45.mm6 mm6Var);

    public final void b7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XUpdate.DialogDownloadUI", "startDownload!");
        xn4.c0 c0Var = xn4.c0.f537137a;
        java.lang.String cdnUrl = V6().f462210p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl, "cdnUrl");
        java.lang.String cdnUrl2 = V6().f462210p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl2, "cdnUrl");
        java.lang.String g17 = c0Var.g(cdnUrl2);
        java.lang.String cdnUrl3 = V6().f462210p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl3, "cdnUrl");
        java.lang.String f17 = c0Var.f(cdnUrl3);
        java.lang.String patchMd5 = V6().f462211q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(patchMd5, "patchMd5");
        xn4.b callback = this.f257044f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XUpdate.XUpdateHelper", "startDownloadCore() called with: cdnurl = " + cdnUrl + ", mediaId = " + g17 + ", fullPath = " + f17 + ", md5 = " + patchMd5);
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_ApkPatchDownload";
        mVar.f323344z = cdnUrl;
        mVar.f69601xaca5bdda = g17;
        mVar.f69595x6d25b0d9 = f17;
        mVar.f69593x419c9c3d = patchMd5;
        mVar.f69592xf1ebe47b = 30003;
        mVar.A = 20;
        mVar.B = 3600;
        ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ri(mVar, new java.lang.ref.WeakReference(xn4.c0.f537144h));
        java.util.Map map = xn4.c0.f537138b;
        c0Var.b(g17, map);
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
        java.lang.Object obj = linkedHashMap.get(g17);
        if (obj == null) {
            obj = new java.util.LinkedHashSet();
            linkedHashMap.put(g17, obj);
        }
        ((java.util.Set) obj).add(new java.lang.ref.WeakReference(callback));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addCallback ");
        sb6.append(g17);
        sb6.append(' ');
        sb6.append(callback.hashCode());
        sb6.append(' ');
        java.util.Set set = (java.util.Set) linkedHashMap.get(g17);
        sb6.append(set != null ? java.lang.Integer.valueOf(set.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XUpdate.XUpdateHelper", sb6.toString());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_NAME_XUPDATE_DOWNLOAD_PROGRESS");
        java.lang.String cdnUrl4 = V6().f462210p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl4, "cdnUrl");
        this.f257042d = M.getInt(c0Var.g(cdnUrl4), 0);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        overridePendingTransition(-1, -1);
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XUpdate.DialogDownloadUI", V6().mo12245xcc313de3().toString());
        if (android.text.TextUtils.isEmpty(V6().f462210p)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.XUpdate.DialogDownloadUI", "cdnUrl empty, finish!");
            finish();
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.w(new android.graphics.drawable.ColorDrawable(0));
            mo2533x106ab264.o();
        }
        db5.f.c(this, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a), null, null, new xn4.c(this, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        xn4.c0 c0Var = xn4.c0.f537137a;
        r45.mm6 info = V6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_NAME_XUPDATE_DIALOGINFO");
        java.lang.String cdnUrl = info.f462210p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl, "cdnUrl");
        M.putString(c0Var.g(cdnUrl), info.mo12245xcc313de3().toString());
    }
}
