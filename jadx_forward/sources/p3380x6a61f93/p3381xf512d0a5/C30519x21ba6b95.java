package p3380x6a61f93.p3381xf512d0a5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u0010"}, d2 = {"Lurgen/ur_0025/UR_F647;", "", "<init>", "()V", "URB_E885", "", "obj", "Lcom/tencent/unit_rc/BaseObjectDef;", "callback", "URB_48E9", "", com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, "", "URB_E787", "URB_6B92", "URB_045B", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: urgen.ur_0025.UR_F647 */
/* loaded from: classes13.dex */
public final class C30519x21ba6b95 {

    /* renamed from: INSTANCE */
    public static final p3380x6a61f93.p3381xf512d0a5.C30519x21ba6b95 f77116x4fbc8495 = new p3380x6a61f93.p3381xf512d0a5.C30519x21ba6b95();

    private C30519x21ba6b95() {
    }

    /* renamed from: URB_045B */
    public static final boolean m169536xe5740e6b(com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        ((kl4.k) ((jm4.w) obj)).f390458h.set(false);
        return true;
    }

    /* renamed from: URB_48E9 */
    public static final boolean m169537xe575f0d2(com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 obj, java.lang.String filePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        ((kl4.k) ((jm4.w) obj)).f390457g = filePath;
        return true;
    }

    /* renamed from: URB_6B92 */
    public static final boolean m169538xe576fd9f(com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        kl4.k kVar = (kl4.k) ((jm4.w) obj);
        if (kVar.f390458h.get()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(kVar.f390454d, "decode: already decoding, ignore");
            return false;
        }
        java.lang.String str = kVar.f390457g;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(kVar.f390454d, "decode: file path is null or empty");
            return false;
        }
        synchronized (kVar.f390460m) {
            kVar.f390458h.set(true);
            kVar.f390459i = new java.util.concurrent.CountDownLatch(1);
            ((ku5.t0) ku5.t0.f394148d).h(new kl4.j(kVar), kVar.f390455e);
        }
        return true;
    }

    /* renamed from: URB_E787 */
    public static final void m169539xe57da5cb(com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        kl4.k kVar = (kl4.k) ((jm4.w) obj);
        synchronized (kVar.f390460m) {
            kVar.f390458h.set(false);
            java.util.concurrent.CountDownLatch countDownLatch = kVar.f390459i;
            kVar.f390459i = null;
            if (countDownLatch != null) {
                try {
                    if (!countDownLatch.await(500L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(kVar.f390454d, "unInit: decode thread did not finish in 500ms");
                    }
                } catch (java.lang.InterruptedException unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(kVar.f390454d, "unInit: interrupted while waiting for decode thread");
                }
            }
            kVar.f390457g = null;
            kVar.f390456f = null;
        }
    }

    /* renamed from: URB_E885 */
    public static final void m169540xe57da98a(com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 obj, com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        ((kl4.k) ((jm4.w) obj)).f390456f = (jm4.x) callback;
    }
}
