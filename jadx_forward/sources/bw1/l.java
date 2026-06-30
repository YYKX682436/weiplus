package bw1;

/* loaded from: classes12.dex */
public class l {

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.Comparator f106340r = new bw1.C1351x31a3f5();

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String[] f106341s = {"INVALID", "IMAGE", "VOICE", "VIDEO", "ATTACH", "RECORD", "NOTE"};

    /* renamed from: a, reason: collision with root package name */
    public long f106342a;

    /* renamed from: b, reason: collision with root package name */
    public int f106343b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f106344c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f106345d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f106346e;

    /* renamed from: f, reason: collision with root package name */
    public long f106347f;

    /* renamed from: g, reason: collision with root package name */
    public long f106348g;

    /* renamed from: h, reason: collision with root package name */
    public int f106349h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f106350i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f106351j;

    /* renamed from: l, reason: collision with root package name */
    public int f106353l;

    /* renamed from: m, reason: collision with root package name */
    public int f106354m;

    /* renamed from: n, reason: collision with root package name */
    public long f106355n;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f106357p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f106358q;

    /* renamed from: k, reason: collision with root package name */
    public int f106352k = -1;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f106356o = new java.util.ArrayList();

    public void a(java.lang.String str, long j17) {
        android.util.Pair pair = new android.util.Pair(str, java.lang.Long.valueOf(j17));
        java.util.List list = this.f106357p;
        if (list == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.f106357p = arrayList;
            arrayList.add(pair);
        } else {
            if (java.util.Collections.binarySearch(list, pair, f106340r) < 0) {
                this.f106357p.add((-r2) - 1, pair);
            }
        }
    }

    public boolean b(java.util.UUID uuid) {
        java.util.List list = this.f106358q;
        if (list == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.f106358q = arrayList;
            arrayList.add(new bw1.m(uuid));
            return true;
        }
        int binarySearch = java.util.Collections.binarySearch(list, uuid);
        if (binarySearch < 0) {
            this.f106358q.add((-binarySearch) - 1, new bw1.m(uuid));
            return true;
        }
        ((bw1.m) this.f106358q.get(binarySearch)).f106360e++;
        return false;
    }

    public int c() {
        if (this.f106353l == 0) {
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTimeInMillis(this.f106348g);
            this.f106353l = ((calendar.get(2) + 1) & 255) | ((calendar.get(1) & 32767) << 8);
        }
        return this.f106353l;
    }

    public void d(bw1.l lVar) {
        if (this.f106344c == null) {
            this.f106344c = lVar.f106344c;
        }
        if (this.f106345d == null) {
            this.f106345d = lVar.f106345d;
        }
        this.f106354m = java.lang.Math.max(this.f106354m, lVar.f106354m);
        this.f106342a += lVar.f106342a;
        this.f106355n += lVar.f106355n;
    }

    /* renamed from: toString */
    public java.lang.String m11437x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(256);
        sb6.append("> ");
        int i17 = this.f106343b;
        sb6.append(i17 >= 7 ? java.lang.Integer.toString(i17) : f106341s[i17]);
        sb6.append(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20377xba9c5eaa);
        sb6.append(fp.n0.a(this.f106342a));
        sb6.append(" [");
        sb6.append(((java.util.ArrayList) this.f106356o).size());
        sb6.append("] ");
        sb6.append(this.f106345d);
        if (this.f106358q != null) {
            sb6.append(", maxLink: ");
            sb6.append(this.f106354m);
            sb6.append(", linked: ");
            java.util.List list = this.f106357p;
            sb6.append(list == null ? "(null)" : java.lang.Integer.valueOf(((java.util.ArrayList) list).size()));
            sb6.append(", uuids = [");
            sb6.append(android.text.TextUtils.join(", ", this.f106358q));
            sb6.append(']');
        }
        return sb6.toString();
    }
}
