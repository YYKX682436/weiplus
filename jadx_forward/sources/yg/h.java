package yg;

/* loaded from: classes7.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 f543597a;

    /* renamed from: d, reason: collision with root package name */
    public android.os.Handler f543600d;

    /* renamed from: f, reason: collision with root package name */
    public int f543602f;

    /* renamed from: g, reason: collision with root package name */
    public int f543603g;

    /* renamed from: h, reason: collision with root package name */
    public float f543604h;

    /* renamed from: j, reason: collision with root package name */
    public float f543606j;

    /* renamed from: l, reason: collision with root package name */
    public int f543608l;

    /* renamed from: m, reason: collision with root package name */
    public int f543609m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f543610n;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseLongArray f543598b = new android.util.SparseLongArray();

    /* renamed from: c, reason: collision with root package name */
    public final yg.a f543599c = new yg.a();

    /* renamed from: e, reason: collision with root package name */
    public final yg.g f543601e = new yg.g(this, null);

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Queue f543605i = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final yg.f f543611o = new yg.f(this);

    /* renamed from: p, reason: collision with root package name */
    public final yg.f f543612p = new yg.f(this);

    /* renamed from: k, reason: collision with root package name */
    public boolean f543607k = false;

    public h(com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83) {
        this.f543597a = abstractC4208x204d5c83;
    }

    public yg.f a() {
        yg.f fVar;
        synchronized (this.f543597a) {
            fVar = this.f543612p;
            yg.f fVar2 = this.f543611o;
            fVar.f543582b = fVar2.f543582b;
            fVar.f543581a = fVar2.f543581a;
            fVar.f543583c = fVar2.f543583c;
            fVar.f543584d = fVar2.f543584d;
            fVar.f543585e = fVar2.f543586f / fVar2.f543587g;
            fVar2.f543582b = 0;
            fVar2.f543581a = 0;
            fVar2.f543583c = 0;
            fVar2.f543584d = 0;
            fVar2.f543586f = 0;
            fVar2.f543587g = 0;
        }
        return fVar;
    }

    public int b() {
        synchronized (this.f543597a) {
            if (this.f543597a.f130110a == 0) {
                return 0;
            }
            com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83 = this.f543597a;
            return abstractC4208x204d5c83.m34766x5e7509f2(abstractC4208x204d5c83.f130110a);
        }
    }

    public int c() {
        synchronized (this.f543597a) {
            if (this.f543597a.f130110a == 0) {
                return -1;
            }
            com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83 = this.f543597a;
            return abstractC4208x204d5c83.m34767xf931292e(abstractC4208x204d5c83.f130110a);
        }
    }

    public int d() {
        synchronized (this.f543597a) {
            if (this.f543597a.f130110a == 0) {
                return 0;
            }
            com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83 = this.f543597a;
            return abstractC4208x204d5c83.m34769x26c3e26c(abstractC4208x204d5c83.f130110a);
        }
    }

    public int e() {
        synchronized (this.f543597a) {
            if (this.f543597a.f130110a == 0) {
                return 0;
            }
            com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83 = this.f543597a;
            return abstractC4208x204d5c83.m34770xdf205631(abstractC4208x204d5c83.f130110a);
        }
    }
}
