package gh;

/* loaded from: classes7.dex */
public final class l0 extends gh.c implements java.lang.Runnable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 runtime, ch.g jsThreadHandler) {
        super(runtime, jsThreadHandler);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsThreadHandler, "jsThreadHandler");
    }

    @Override // gh.c
    public gh.b b() {
        return gh.b.NativeLocker;
    }

    @Override // gh.c
    public void d() {
    }

    @Override // gh.c
    public void e() {
    }

    @Override // gh.c
    public void f() {
        this.f353335e.k(new java.lang.Runnable() { // from class: gh.l0$$a
            @Override // java.lang.Runnable
            public final void run() {
                gh.l0 this$0 = gh.l0.this;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
                com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83 = this$0.f353334d;
                if (abstractC4208x204d5c83.f130110a == 0) {
                    return;
                }
                abstractC4208x204d5c83.m34789xc0b14253(abstractC4208x204d5c83.f130110a);
            }
        }, false);
    }

    @Override // gh.c
    public void g() {
        this.f353335e.k(this, false);
    }

    @Override // java.lang.Runnable
    public void run() {
        ah.i.b("AnimationFrameHandler", "hy: start native raf looper", new java.lang.Object[0]);
        com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83 = this.f353334d;
        if (abstractC4208x204d5c83.f130110a == 0) {
            return;
        }
        abstractC4208x204d5c83.m34775x5f36765a(abstractC4208x204d5c83.f130110a);
    }
}
