package fm3;

/* loaded from: classes10.dex */
public final class p implements fm3.o {

    /* renamed from: j, reason: collision with root package name */
    public static long f345627j;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f345628a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f345629b;

    /* renamed from: c, reason: collision with root package name */
    public long f345630c;

    /* renamed from: d, reason: collision with root package name */
    public int f345631d;

    /* renamed from: e, reason: collision with root package name */
    public int f345632e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f345633f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f345634g;

    /* renamed from: h, reason: collision with root package name */
    public long f345635h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f345636i;

    public p(java.lang.String mediaId, java.lang.String videoPath, long j17, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        this.f345628a = mediaId;
        this.f345629b = videoPath;
        this.f345630c = j17;
        this.f345631d = i17;
        this.f345632e = i18;
        this.f345634g = true;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
        this.f345636i = c19792x256d2725;
        long a17 = c01.id.a();
        long j18 = f345627j;
        if (j18 == a17) {
            f345627j = j18 + 1;
        } else {
            f345627j = a17;
        }
        java.lang.String str = "local_" + f345627j;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e();
        c19788xd7cfd73e.m76678xca029dad(videoPath);
        c19792x256d2725.m76896xfefec3e9(str);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f56 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56();
        c19793xceab7f56.m76962x74cd162e().add(c19788xd7cfd73e);
        c19792x256d2725.m76895x5bf46472(c19793xceab7f56);
    }

    @Override // fm3.o
    public void a(long j17) {
        this.f345635h = j17;
    }

    @Override // fm3.o
    public boolean b() {
        return this.f345634g;
    }

    @Override // fm3.o
    public void c(long j17) {
        this.f345630c = j17;
    }

    @Override // fm3.o
    public long d() {
        return this.f345635h;
    }

    @Override // fm3.o
    public dk4.a e() {
        dk4.a aVar = new dk4.a(this.f345628a, this.f345629b, "", this.f345631d, this.f345632e);
        aVar.f315997a = 2;
        aVar.f315998b = "xV2";
        aVar.f316001e = true;
        qc0.d1 Ai = ((pc0.g2) ((qc0.e1) i95.n0.c(qc0.e1.class))).Ai(this.f345629b, true);
        aVar.f316003g = Ai != null ? Ai.f442899d : 0L;
        aVar.f316007k = Ai != null ? Ai.f442901f : 0;
        return aVar;
    }

    @Override // fm3.o
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f() {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e2;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e3;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e = null;
        if (this.f345633f) {
            return null;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f345636i;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e2 = (m76802x2dd01666 == null || (m76962x74cd162e3 = m76802x2dd01666.m76962x74cd162e()) == null) ? null : m76962x74cd162e3.get(0);
        if (c19788xd7cfd73e2 != null) {
            c19788xd7cfd73e2.m76685x53e9ee84(this.f345631d);
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = c19792x256d2725.m76802x2dd01666();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e3 = (m76802x2dd016662 == null || (m76962x74cd162e2 = m76802x2dd016662.m76962x74cd162e()) == null) ? null : m76962x74cd162e2.get(0);
        if (c19788xd7cfd73e3 != null) {
            c19788xd7cfd73e3.m76658xf84e829(this.f345632e);
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016663 = c19792x256d2725.m76802x2dd01666();
        if (m76802x2dd016663 != null && (m76962x74cd162e = m76802x2dd016663.m76962x74cd162e()) != null) {
            c19788xd7cfd73e = m76962x74cd162e.get(0);
        }
        if (c19788xd7cfd73e != null) {
            c19788xd7cfd73e.m76682xc9923ded(a06.d.b(((float) this.f345630c) / 1000.0f));
        }
        return c19792x256d2725;
    }

    @Override // fm3.o
    /* renamed from: getDurationMs */
    public long mo129780x37a7fa50() {
        return this.f345630c;
    }

    public /* synthetic */ p(java.lang.String str, java.lang.String str2, long j17, int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, str2, j17, (i19 & 8) != 0 ? 0 : i17, (i19 & 16) != 0 ? 0 : i18);
    }
}
