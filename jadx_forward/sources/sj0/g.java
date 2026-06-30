package sj0;

/* loaded from: classes13.dex */
public enum g {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f489890d = null;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f489891e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f489892f = false;

    /* renamed from: g, reason: collision with root package name */
    public wu5.b f489893g = null;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f489894h = new java.lang.Object();

    g() {
    }

    public void h() {
        synchronized (this.f489894h) {
            if (this.f489892f) {
                wu5.b bVar = this.f489893g;
                if (bVar != null) {
                    bVar.b();
                }
                this.f489892f = false;
                java.util.HashMap hashMap = this.f489891e;
                if (hashMap != null) {
                    hashMap.clear();
                }
            }
        }
    }
}
