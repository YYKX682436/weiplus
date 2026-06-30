package kp4;

/* loaded from: classes10.dex */
public class c1 extends kp4.a {

    /* renamed from: o, reason: collision with root package name */
    public static final kp4.b1 f392628o = new kp4.b1(null);

    /* renamed from: p, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 f392629p = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1("", 0, 0);

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 f392630n;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 track) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(track, "track");
        this.f392630n = track;
        rm5.j jVar = track.f257160l;
        long j17 = jVar.f479049r;
        if (j17 >= 0) {
            this.f392607d = jVar.f479037f + (j17 - jVar.f479035d);
        }
        long j18 = jVar.f479050s;
        if (j18 >= 0) {
            this.f392608e = jVar.f479038g + (j18 - jVar.f479036e);
        }
    }

    @Override // kp4.a
    public long a() {
        return this.f392630n.f257160l.f479036e;
    }

    @Override // kp4.a
    public float b() {
        return this.f392630n.f257160l.f479039h;
    }

    @Override // kp4.a
    public long c() {
        return this.f392630n.f257160l.f479035d;
    }

    @Override // kp4.a
    public long d() {
        return this.f392630n.f257160l.f479041j;
    }

    @Override // kp4.a
    public boolean e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = f392629p;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var2 = this.f392630n;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(i1Var2, i1Var)) {
            return true;
        }
        return i1Var2.f257149a.length() == 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c1(rm5.j originTrack, boolean z17, boolean z18) {
        this(new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1(originTrack.f479032a, originTrack.f479033b, 0));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originTrack, "originTrack");
        this.f392607d = originTrack.f479037f;
        this.f392608e = originTrack.f479038g - originTrack.f479048q.f479064c;
        if (z17) {
            this.f392607d = 0L;
        }
        if (z18) {
            this.f392608e = originTrack.f479041j;
        }
    }
}
