package ah4;

/* loaded from: classes13.dex */
public class p extends ah4.j {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.talkroom.component.v2engine f5006e;

    /* renamed from: f, reason: collision with root package name */
    public short f5007f;

    /* renamed from: g, reason: collision with root package name */
    public short f5008g;

    /* renamed from: h, reason: collision with root package name */
    public tl.w f5009h;

    /* renamed from: i, reason: collision with root package name */
    public final tl.v f5010i = new ah4.o(this);

    public p(com.tencent.mm.plugin.talkroom.component.v2engine v2engineVar) {
        this.f5006e = v2engineVar;
    }

    @Override // ah4.k
    public void Pe() {
        tl.w wVar = new tl.w(dh4.a.f232502a, 1, 2);
        this.f5009h = wVar;
        wVar.h(8, false);
        tl.w wVar2 = this.f5009h;
        wVar2.f420172y = this.f5010i;
        wVar2.g(20);
        this.f5009h.k();
        this.f5008g = (short) 0;
        this.f5007f = (short) 0;
    }

    @Override // ah4.k
    public void bf() {
        tl.w wVar = this.f5009h;
        if (wVar != null) {
            wVar.l();
            this.f5009h = null;
        }
    }

    @Override // ah4.k
    public int o1() {
        short s17 = this.f5008g;
        short s18 = this.f5007f;
        if (s17 < s18) {
            this.f5008g = s18;
        }
        short s19 = this.f5008g;
        if (s19 == 0) {
            return 0;
        }
        short s27 = (short) ((s18 * 100) / s19);
        this.f5007f = (short) 0;
        return s27;
    }

    @Override // ah4.k
    public void start() {
    }
}
