package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes10.dex */
public final class i1 implements com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f257149a;

    /* renamed from: b, reason: collision with root package name */
    public final int f257150b;

    /* renamed from: c, reason: collision with root package name */
    public final int f257151c;

    /* renamed from: d, reason: collision with root package name */
    public final int f257152d;

    /* renamed from: e, reason: collision with root package name */
    public final bv3.d f257153e;

    /* renamed from: f, reason: collision with root package name */
    public int f257154f;

    /* renamed from: g, reason: collision with root package name */
    public int f257155g;

    /* renamed from: h, reason: collision with root package name */
    public float f257156h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y f257157i;

    /* renamed from: j, reason: collision with root package name */
    public int f257158j;

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16992x127e9e90.EditItem f257159k;

    /* renamed from: l, reason: collision with root package name */
    public final rm5.j f257160l;

    static {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.m97812xedc5400c(new p05.f2());
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.m97811x534d5c42(2);
        xm5.b.f536931a = new p05.g2();
        rm5.l lVar = rm5.l.f479053a;
        rm5.l.f479055c = 4000L;
    }

    public i1(java.lang.String path, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f257149a = path;
        this.f257150b = i17;
        this.f257151c = i18;
        int hashCode = hashCode();
        this.f257152d = hashCode;
        this.f257153e = new bv3.d(0L, false, 3, null);
        this.f257156h = 1.0f;
        this.f257157i = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y();
        this.f257158j = -1;
        this.f257159k = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16992x127e9e90.EditItem();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogCompositionTrack", "create VLogCompositionTrack path:" + path + ", type:" + i17 + ", id:" + hashCode);
        java.lang.String i19 = com.p314xaae8f345.mm.vfs.w6.i(path, false);
        this.f257160l = new rm5.j(i19 == null ? "" : i19, i17);
    }

    public void a(long j17) {
        this.f257160l.b(j17);
    }

    public void b(float f17) {
        rm5.j jVar = this.f257160l;
        if (f17 > 0.0f) {
            jVar.f479039h = f17;
        } else {
            jVar.getClass();
        }
    }

    public void c(long j17) {
        this.f257160l.d(j17);
    }

    public void d(long j17) {
        this.f257160l.e(j17);
    }

    public void e(long j17) {
        this.f257160l.c(j17);
    }

    public /* synthetic */ i1(java.lang.String str, int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, i17, (i19 & 4) != 0 ? 0 : i18);
    }
}
