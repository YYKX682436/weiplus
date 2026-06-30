package kl4;

/* loaded from: classes13.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f390441a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayDeque f390442b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f390443c;

    public h(int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f390441a = (i18 & 1) != 0 ? 5 : i17;
        this.f390442b = new java.util.ArrayDeque();
        this.f390443c = new java.lang.Object();
    }

    public final com.p314xaae8f345.p3118xeeebfacc.C26831x7765d788 a(int i17, byte[] bArr) {
        synchronized (this.f390443c) {
            com.p314xaae8f345.p3118xeeebfacc.C26831x7765d788 c26831x7765d788 = (com.p314xaae8f345.p3118xeeebfacc.C26831x7765d788) this.f390442b.poll();
            if (c26831x7765d788 != null) {
                if (!(c26831x7765d788.getData().capacity() >= i17)) {
                    c26831x7765d788 = null;
                }
                if (c26831x7765d788 != null) {
                    c26831x7765d788.getData().clear();
                    if (bArr != null) {
                        c26831x7765d788.getData().put(bArr);
                    }
                    return c26831x7765d788;
                }
            }
            com.p314xaae8f345.p3118xeeebfacc.C26831x7765d788 c26831x7765d7882 = new com.p314xaae8f345.p3118xeeebfacc.C26831x7765d788(java.lang.Math.max(i17, bArr != null ? bArr.length : i17));
            if (bArr != null) {
                c26831x7765d7882.getData().put(bArr);
            }
            return c26831x7765d7882;
        }
    }

    public final void b(com.p314xaae8f345.p3118xeeebfacc.C26831x7765d788... buffers) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffers, "buffers");
        synchronized (this.f390443c) {
            for (com.p314xaae8f345.p3118xeeebfacc.C26831x7765d788 c26831x7765d788 : buffers) {
                c26831x7765d788.getData().clear();
                if (this.f390442b.size() < this.f390441a) {
                    this.f390442b.offer(c26831x7765d788);
                }
            }
        }
    }
}
