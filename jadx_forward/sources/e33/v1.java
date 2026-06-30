package e33;

/* loaded from: classes10.dex */
public class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f329027d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f329028e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f329029f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f329030g;

    /* renamed from: h, reason: collision with root package name */
    public final e33.t1 f329031h;

    public v1(java.lang.String str, e33.b0 b0Var, android.app.ProgressDialog progressDialog, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, e33.t1 t1Var) {
        this.f329027d = str;
        this.f329028e = new java.lang.ref.WeakReference(b0Var);
        this.f329029f = new java.lang.ref.WeakReference(progressDialog);
        this.f329030g = new java.lang.ref.WeakReference(c1163xf1deaba4);
        this.f329031h = t1Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("QuerySmartGalleryAlbumMediaTask", "QuerySmartGalleryAlbumMediaTask, queryType: " + t1Var.f329003d);
    }

    public static void a(e33.v1 v1Var, java.util.List list) {
        v1Var.getClass();
        java.lang.System.currentTimeMillis();
        list.size();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            t23.l2 l2Var = (t23.l2) it.next();
            if (!com.p314xaae8f345.mm.vfs.w6.j(l2Var.f496735b)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("QuerySmartGalleryAlbumMediaTask", "filter non exist media: %s.", l2Var.f496735b);
                linkedList.add(l2Var);
            }
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            list.remove((t23.l2) it6.next());
        }
        java.lang.System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e33.v1.run():void");
    }
}
