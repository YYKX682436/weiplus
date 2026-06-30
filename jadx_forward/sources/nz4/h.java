package nz4;

/* loaded from: classes12.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public int f423152a;

    /* renamed from: b, reason: collision with root package name */
    public int f423153b;

    /* renamed from: c, reason: collision with root package name */
    public int f423154c;

    /* renamed from: d, reason: collision with root package name */
    public int f423155d;

    /* renamed from: e, reason: collision with root package name */
    public final lz4.a f423156e;

    public h(lz4.a aVar) {
        this.f423156e = aVar;
        this.f423152a = -1;
        this.f423153b = -1;
        this.f423154c = -1;
        this.f423155d = -1;
    }

    public int a() {
        int i17;
        int i18;
        int i19;
        int i27 = this.f423152a;
        if (i27 >= 0 && (i17 = this.f423153b) >= 0 && (i18 = this.f423154c) >= 0 && (i19 = this.f423155d) >= 0 && i27 <= i18 && (i27 != i18 || i17 <= i19)) {
            lz4.a aVar = this.f423156e;
            iz4.c l17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar).J1.l(i27);
            iz4.c l18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar).J1.l(this.f423154c);
            if (l17 != null && l18 != null) {
                int i28 = this.f423152a;
                int i29 = this.f423154c;
                if (i28 == i29 && this.f423153b == this.f423155d) {
                    return 1;
                }
                return (i28 == i29 && l17.d() == 1) ? 2 : 3;
            }
        }
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m150331x9616526c() {
        return "NoteSelectInfo{sp=" + this.f423152a + ", so=" + this.f423153b + ", ep=" + this.f423154c + ", eo=" + this.f423155d + '}';
    }

    public h(lz4.a aVar, int i17, int i18, int i19, int i27) {
        this.f423156e = aVar;
        this.f423152a = i17;
        this.f423153b = i18;
        this.f423154c = i19;
        this.f423155d = i27;
    }
}
