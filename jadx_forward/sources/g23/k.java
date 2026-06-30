package g23;

/* loaded from: classes12.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    public long f349470b;

    /* renamed from: c, reason: collision with root package name */
    public long f349471c;

    /* renamed from: d, reason: collision with root package name */
    public int f349472d;

    /* renamed from: e, reason: collision with root package name */
    public int f349473e;

    /* renamed from: f, reason: collision with root package name */
    public int f349474f;

    /* renamed from: g, reason: collision with root package name */
    public int f349475g;

    /* renamed from: h, reason: collision with root package name */
    public int f349476h;

    /* renamed from: i, reason: collision with root package name */
    public int f349477i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f349478j;

    /* renamed from: k, reason: collision with root package name */
    public int f349479k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f349480l;

    /* renamed from: m, reason: collision with root package name */
    public int f349481m;

    /* renamed from: n, reason: collision with root package name */
    public int f349482n;

    /* renamed from: o, reason: collision with root package name */
    public int f349483o;

    /* renamed from: p, reason: collision with root package name */
    public int f349484p;

    /* renamed from: q, reason: collision with root package name */
    public int f349485q;

    /* renamed from: r, reason: collision with root package name */
    public int f349486r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f349487s;

    /* renamed from: t, reason: collision with root package name */
    public int f349488t;

    /* renamed from: u, reason: collision with root package name */
    public int f349489u;

    /* renamed from: v, reason: collision with root package name */
    public int f349490v;

    /* renamed from: w, reason: collision with root package name */
    public int f349491w;

    /* renamed from: x, reason: collision with root package name */
    public int f349492x;

    /* renamed from: y, reason: collision with root package name */
    public int f349493y;

    /* renamed from: z, reason: collision with root package name */
    public int f349494z;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f349469a = "";
    public java.lang.String A = "";
    public long B = 0;
    public boolean C = false;
    public int D = 0;
    public final java.util.List E = new java.util.ArrayList();
    public java.lang.String F = "";
    public java.lang.String G = "";
    public boolean H = true;
    public java.util.LinkedList I = null;

    /* renamed from: J, reason: collision with root package name */
    public int f349468J = 0;
    public int K = Integer.MAX_VALUE;
    public java.lang.String L = "";
    public final java.util.List M = new java.util.ArrayList();
    public final java.util.List N = new java.util.ArrayList();

    public void a(int i17) {
        ((java.util.ArrayList) this.E).add(java.lang.Integer.valueOf(i17));
        if (i17 == 31) {
            this.F = this.f349480l;
        } else if (i17 == 5) {
            this.F = this.f349478j;
        } else if (i17 == 19) {
            this.F = this.f349487s;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSSearchStaticsObj", "addClickItemType %s, currentClickUserName %s.", java.lang.Integer.valueOf(i17), this.F);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r13 != 21) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
    
        if (r17.f505302l == 2) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        r2 = 25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
    
        r2 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x009e, code lost:
    
        if (r17.f505302l == 2) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ae, code lost:
    
        if (r1 == (-32)) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(u13.g r17) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g23.k.b(u13.g):void");
    }

    public final int c(int i17) {
        int i18 = i17 > this.K ? this.f349468J : 0;
        java.util.LinkedList linkedList = this.I;
        if (linkedList != null) {
            for (int size = linkedList.size() - 1; size >= 0; size--) {
                if (i17 > ((java.lang.Integer) this.I.get(size)).intValue()) {
                    return (i17 - size) + i18;
                }
            }
        }
        return i17 + i18;
    }

    public final java.lang.String d(t13.i iVar) {
        java.util.List list = iVar.f496103f;
        if (list == null || list.size() <= 0 || iVar.f496103f.get(0) == null) {
            return null;
        }
        return ((p13.y) iVar.f496103f.get(0)).f432720e;
    }

    public void e() {
        this.f349469a = "";
        this.f349471c = 0L;
        this.f349472d = 0;
        this.f349473e = 0;
        this.f349474f = 0;
        this.f349476h = 0;
        this.f349477i = 0;
        this.f349481m = 0;
        this.f349483o = 0;
        this.f349484p = 0;
        this.f349479k = 0;
        this.f349485q = 0;
        this.f349486r = 0;
        this.B = 0L;
        this.f349488t = 0;
        this.f349489u = 0;
        this.f349490v = 0;
        this.f349491w = 0;
        this.f349475g = 0;
        this.f349492x = 0;
        this.f349493y = 0;
        ((java.util.ArrayList) this.N).clear();
        ((java.util.ArrayList) this.E).clear();
        this.f349478j = "";
        this.f349480l = "";
        this.f349487s = "";
        this.F = "";
        this.G = "";
        this.I = null;
        this.f349468J = 0;
        this.K = Integer.MAX_VALUE;
        this.L = "";
        this.H = true;
        ((java.util.ArrayList) this.M).clear();
    }

    public void f(int i17) {
        this.f349493y = i17;
        java.util.List list = this.N;
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            p13.e eVar = (p13.e) it.next();
            if ("SearchContactBar".equals(eVar.f432612g)) {
                eVar.f432607b = this.f349493y + 1;
            }
        }
        int i18 = this.f349493y;
        java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
        while (it6.hasNext()) {
            p13.e eVar2 = (p13.e) it6.next();
            if (eVar2.f432612g.startsWith("SOSRelevant:")) {
                eVar2.f432607b = i18;
            }
        }
    }
}
