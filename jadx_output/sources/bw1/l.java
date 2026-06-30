package bw1;

/* loaded from: classes12.dex */
public class l {

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.Comparator f24807r = new bw1.l$$a();

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String[] f24808s = {"INVALID", "IMAGE", "VOICE", "VIDEO", "ATTACH", "RECORD", "NOTE"};

    /* renamed from: a, reason: collision with root package name */
    public long f24809a;

    /* renamed from: b, reason: collision with root package name */
    public int f24810b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f24811c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f24812d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f24813e;

    /* renamed from: f, reason: collision with root package name */
    public long f24814f;

    /* renamed from: g, reason: collision with root package name */
    public long f24815g;

    /* renamed from: h, reason: collision with root package name */
    public int f24816h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f24817i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f24818j;

    /* renamed from: l, reason: collision with root package name */
    public int f24820l;

    /* renamed from: m, reason: collision with root package name */
    public int f24821m;

    /* renamed from: n, reason: collision with root package name */
    public long f24822n;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f24824p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f24825q;

    /* renamed from: k, reason: collision with root package name */
    public int f24819k = -1;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f24823o = new java.util.ArrayList();

    public void a(java.lang.String str, long j17) {
        android.util.Pair pair = new android.util.Pair(str, java.lang.Long.valueOf(j17));
        java.util.List list = this.f24824p;
        if (list == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.f24824p = arrayList;
            arrayList.add(pair);
        } else {
            if (java.util.Collections.binarySearch(list, pair, f24807r) < 0) {
                this.f24824p.add((-r2) - 1, pair);
            }
        }
    }

    public boolean b(java.util.UUID uuid) {
        java.util.List list = this.f24825q;
        if (list == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.f24825q = arrayList;
            arrayList.add(new bw1.m(uuid));
            return true;
        }
        int binarySearch = java.util.Collections.binarySearch(list, uuid);
        if (binarySearch < 0) {
            this.f24825q.add((-binarySearch) - 1, new bw1.m(uuid));
            return true;
        }
        ((bw1.m) this.f24825q.get(binarySearch)).f24827e++;
        return false;
    }

    public int c() {
        if (this.f24820l == 0) {
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTimeInMillis(this.f24815g);
            this.f24820l = ((calendar.get(2) + 1) & 255) | ((calendar.get(1) & 32767) << 8);
        }
        return this.f24820l;
    }

    public void d(bw1.l lVar) {
        if (this.f24811c == null) {
            this.f24811c = lVar.f24811c;
        }
        if (this.f24812d == null) {
            this.f24812d = lVar.f24812d;
        }
        this.f24821m = java.lang.Math.max(this.f24821m, lVar.f24821m);
        this.f24809a += lVar.f24809a;
        this.f24822n += lVar.f24822n;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(256);
        sb6.append("> ");
        int i17 = this.f24810b;
        sb6.append(i17 >= 7 ? java.lang.Integer.toString(i17) : f24808s[i17]);
        sb6.append(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG);
        sb6.append(fp.n0.a(this.f24809a));
        sb6.append(" [");
        sb6.append(((java.util.ArrayList) this.f24823o).size());
        sb6.append("] ");
        sb6.append(this.f24812d);
        if (this.f24825q != null) {
            sb6.append(", maxLink: ");
            sb6.append(this.f24821m);
            sb6.append(", linked: ");
            java.util.List list = this.f24824p;
            sb6.append(list == null ? "(null)" : java.lang.Integer.valueOf(((java.util.ArrayList) list).size()));
            sb6.append(", uuids = [");
            sb6.append(android.text.TextUtils.join(", ", this.f24825q));
            sb6.append(']');
        }
        return sb6.toString();
    }
}
