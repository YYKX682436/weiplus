package cw2;

/* loaded from: classes8.dex */
public final class db implements rm5.k {

    /* renamed from: a, reason: collision with root package name */
    public final long f305188a;

    /* renamed from: b, reason: collision with root package name */
    public final rm5.k f305189b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f305190c;

    public db(long j17, rm5.k thumbFetcher, yz5.a destroyCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbFetcher, "thumbFetcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destroyCallback, "destroyCallback");
        this.f305188a = j17;
        this.f305189b = thumbFetcher;
        this.f305190c = destroyCallback;
    }

    @Override // rm5.k
    public void a(java.util.List times, yz5.p callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(times, "times");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(times, 10));
        java.util.Iterator it = times.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(((java.lang.Number) it.next()).longValue() + this.f305188a));
        }
        this.f305189b.a(arrayList, new cw2.cb(callback, this));
    }

    @Override // rm5.k
    public void b(long j17) {
        this.f305189b.b(j17 + this.f305188a);
    }

    @Override // rm5.k
    /* renamed from: destroy */
    public void mo122875x5cd39ffa() {
        this.f305189b.mo122875x5cd39ffa();
        this.f305190c.mo152xb9724478();
    }

    @Override // rm5.k
    /* renamed from: setSize */
    public void mo122876x76500f83(int i17, int i18) {
        this.f305189b.mo122876x76500f83(i17, i18);
    }
}
