package ah4;

/* loaded from: classes13.dex */
public class p extends ah4.j {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.p2255xac8f1cfd.C18548xe95a3bbe f86539e;

    /* renamed from: f, reason: collision with root package name */
    public short f86540f;

    /* renamed from: g, reason: collision with root package name */
    public short f86541g;

    /* renamed from: h, reason: collision with root package name */
    public tl.w f86542h;

    /* renamed from: i, reason: collision with root package name */
    public final tl.v f86543i = new ah4.o(this);

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.p2255xac8f1cfd.C18548xe95a3bbe c18548xe95a3bbe) {
        this.f86539e = c18548xe95a3bbe;
    }

    @Override // ah4.k
    public void Pe() {
        tl.w wVar = new tl.w(dh4.a.f314035a, 1, 2);
        this.f86542h = wVar;
        wVar.h(8, false);
        tl.w wVar2 = this.f86542h;
        wVar2.f501705y = this.f86543i;
        wVar2.g(20);
        this.f86542h.k();
        this.f86541g = (short) 0;
        this.f86540f = (short) 0;
    }

    @Override // ah4.k
    public void bf() {
        tl.w wVar = this.f86542h;
        if (wVar != null) {
            wVar.l();
            this.f86542h = null;
        }
    }

    @Override // ah4.k
    public int o1() {
        short s17 = this.f86541g;
        short s18 = this.f86540f;
        if (s17 < s18) {
            this.f86541g = s18;
        }
        short s19 = this.f86541g;
        if (s19 == 0) {
            return 0;
        }
        short s27 = (short) ((s18 * 100) / s19);
        this.f86540f = (short) 0;
        return s27;
    }

    @Override // ah4.k
    /* renamed from: start */
    public void mo2064x68ac462() {
    }
}
