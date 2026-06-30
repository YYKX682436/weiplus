package p75;

/* loaded from: classes12.dex */
public final class e0 implements p75.k {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f434167d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26915x63d6eaa3 f434168e;

    public e0(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3, com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26915x63d6eaa3 c26915x63d6eaa3) {
        this.f434167d = c26970x63d6eaa3;
        this.f434168e = c26915x63d6eaa3;
    }

    public void a(java.lang.Object[] bindArgs) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindArgs, "bindArgs");
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = this.f434167d;
        if (c26970x63d6eaa3 != null) {
            c26970x63d6eaa3.m107795xa7daab21(bindArgs);
            return;
        }
        com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26915x63d6eaa3 c26915x63d6eaa3 = this.f434168e;
        if (c26915x63d6eaa3 != null) {
            c26915x63d6eaa3.m106523xa7daab21(bindArgs);
        }
    }

    public int b(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = this.f434167d;
        if (c26970x63d6eaa3 != null) {
            return c26970x63d6eaa3.m107872x91d1f3e9(c26987xeef691ab);
        }
        com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26915x63d6eaa3 c26915x63d6eaa3 = this.f434168e;
        if (c26915x63d6eaa3 != null) {
            return c26915x63d6eaa3.m106534x91d1f3e9();
        }
        return 0;
    }

    /* renamed from: bindLong */
    public void m157940x37fbf859(int i17, long j17) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = this.f434167d;
        if (c26970x63d6eaa3 != null) {
            c26970x63d6eaa3.m107799x37fbf859(i17, j17);
            return;
        }
        com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26915x63d6eaa3 c26915x63d6eaa3 = this.f434168e;
        if (c26915x63d6eaa3 != null) {
            c26915x63d6eaa3.m106526x37fbf859(i17, j17);
        }
    }

    /* renamed from: bindString */
    public void m157941x35198eae(int i17, java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = this.f434167d;
        if (c26970x63d6eaa3 != null) {
            c26970x63d6eaa3.m107801x35198eae(i17, value);
            return;
        }
        com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26915x63d6eaa3 c26915x63d6eaa3 = this.f434168e;
        if (c26915x63d6eaa3 != null) {
            c26915x63d6eaa3.m106528x35198eae(i17, value);
        }
    }

    public long c() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = this.f434167d;
        if (c26970x63d6eaa3 != null) {
            return c26970x63d6eaa3.m107873x58f653cf();
        }
        com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26915x63d6eaa3 c26915x63d6eaa3 = this.f434168e;
        if (c26915x63d6eaa3 != null) {
            return c26915x63d6eaa3.m106536x58f653cf();
        }
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = this.f434167d;
        if (c26970x63d6eaa3 != null) {
            c26970x63d6eaa3.m107405xb81b4f04();
            return;
        }
        com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26915x63d6eaa3 c26915x63d6eaa3 = this.f434168e;
        if (c26915x63d6eaa3 != null) {
            c26915x63d6eaa3.releaseReference();
        }
    }
}
