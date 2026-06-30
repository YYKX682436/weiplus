package i33;

/* loaded from: classes10.dex */
public final class a0 extends i33.c implements i33.l1 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f369677f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f369678g;

    /* renamed from: h, reason: collision with root package name */
    public int f369679h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f369680i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.p f369681m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f369682n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f369683o;

    /* renamed from: p, reason: collision with root package name */
    public v23.b f369684p;

    /* renamed from: q, reason: collision with root package name */
    public u23.e0 f369685q;

    /* renamed from: r, reason: collision with root package name */
    public u23.s f369686r;

    /* renamed from: s, reason: collision with root package name */
    public u23.n f369687s;

    /* renamed from: t, reason: collision with root package name */
    public final i33.x f369688t;

    /* renamed from: u, reason: collision with root package name */
    public final i33.w f369689u;

    /* renamed from: v, reason: collision with root package name */
    public final i33.y f369690v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f369677f = "MicroMsg.AlbumQueryMediaUIC";
        this.f369679h = -1;
        this.f369682n = new java.util.ArrayList();
        this.f369683o = "";
        this.f369688t = new i33.x(this, activity);
        this.f369689u = new i33.w(this);
        this.f369690v = new i33.y(this);
    }

    public final v23.b W6(java.util.List list, java.lang.String str, java.lang.String str2) {
        java.lang.Object obj;
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            v23.b bVar = (v23.b) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar.f514419a, str) && (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, bVar.f514421c))) {
                break;
            }
        }
        v23.b bVar2 = (v23.b) obj;
        return bVar2 == null ? (v23.b) list.get(0) : bVar2;
    }

    public final java.lang.String X6() {
        java.lang.String str;
        v23.b bVar = this.f369684p;
        return (bVar == null || (str = bVar.f514419a) == null) ? "" : str;
    }

    public void Y6(java.lang.String folderName, boolean z17, java.lang.String targetBucketId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(folderName, "folderName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetBucketId, "targetBucketId");
        v23.b W6 = W6(this.f369682n, folderName, targetBucketId);
        yz5.a aVar = this.f369678g;
        e33.b0 b0Var = aVar != null ? (e33.b0) aVar.mo152xb9724478() : null;
        java.lang.String str = this.f369677f;
        if (b0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "switchFolderByName: adapter null");
            return;
        }
        if (z17) {
            this.f369684p = W6;
        }
        yz5.p pVar = this.f369681m;
        if (pVar != null) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "switchFolderByName: " + W6.f514421c + ", targetBucketId=" + targetBucketId + ", media size=" + W6.f514420b.size());
    }
}
