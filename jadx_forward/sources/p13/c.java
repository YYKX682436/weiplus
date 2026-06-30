package p13;

/* loaded from: classes12.dex */
public abstract class c implements java.lang.Comparable {

    /* renamed from: f, reason: collision with root package name */
    public boolean f432599f;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f432602i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f432603m;

    /* renamed from: h, reason: collision with root package name */
    public long f432601h = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f432597d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public boolean f432598e = false;

    /* renamed from: g, reason: collision with root package name */
    public long f432600g = 0;

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return this.f432597d - ((p13.c) obj).f432597d;
    }

    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "";
    }

    /* renamed from: getPriority */
    public int mo63528x3662b71a() {
        return this.f432597d;
    }

    public final void h() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            try {
                i();
            } catch (java.lang.Exception e17) {
                throw e17;
            }
        } finally {
            this.f432600g += java.lang.System.currentTimeMillis() - currentTimeMillis;
        }
    }

    public abstract boolean i();

    public java.lang.String j() {
        return "";
    }

    public int k() {
        return -1;
    }

    public java.lang.String l() {
        java.util.List list = this.f432602i;
        if (list == null) {
            return "";
        }
        if (((java.util.ArrayList) list).size() <= 1) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i17 = 1; i17 < ((java.util.ArrayList) this.f432602i).size(); i17++) {
            p13.b bVar = (p13.b) ((java.util.ArrayList) this.f432602i).get(i17 - 1);
            p13.b bVar2 = (p13.b) ((java.util.ArrayList) this.f432602i).get(i17);
            stringBuffer.append("{");
            stringBuffer.append(bVar2.f432595a);
            stringBuffer.append(":");
            stringBuffer.append(bVar2.f432596b - bVar.f432596b);
            stringBuffer.append("}");
        }
        return java.lang.String.format("%s", stringBuffer.toString());
    }

    public boolean m() {
        return this.f432598e;
    }

    public void n() {
        this.f432598e = true;
    }

    public void o(java.lang.String str) {
        if (this.f432602i == null) {
            this.f432602i = new java.util.ArrayList();
        }
        p13.b bVar = new p13.b(this);
        bVar.f432595a = str;
        bVar.f432596b = java.lang.System.currentTimeMillis();
        this.f432602i.add(bVar);
    }
}
