package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class ql implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb {

    /* renamed from: a, reason: collision with root package name */
    private java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb> f132543a = new java.util.ArrayList<>();

    public final synchronized void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb fbVar) {
        if (fbVar != null) {
            if (!this.f132543a.contains(fbVar)) {
                this.f132543a.add(fbVar);
            }
        }
    }

    public final synchronized void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb fbVar) {
        this.f132543a.remove(fbVar);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final synchronized boolean c(float f17, float f18) {
        for (int size = this.f132543a.size() - 1; size >= 0; size--) {
            if (this.f132543a.get(size).c(f17, f18)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final synchronized boolean d(float f17, float f18) {
        for (int size = this.f132543a.size() - 1; size >= 0; size--) {
            if (this.f132543a.get(size).d(f17, f18)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final synchronized boolean e(float f17, float f18) {
        for (int size = this.f132543a.size() - 1; size >= 0; size--) {
            if (this.f132543a.get(size).e(f17, f18)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final synchronized boolean f(float f17, float f18) {
        for (int size = this.f132543a.size() - 1; size >= 0; size--) {
            if (this.f132543a.get(size).f(f17, f18)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final synchronized boolean g(float f17, float f18) {
        for (int size = this.f132543a.size() - 1; size >= 0; size--) {
            if (this.f132543a.get(size).g(f17, f18)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final synchronized boolean h(float f17, float f18) {
        for (int size = this.f132543a.size() - 1; size >= 0; size--) {
            if (this.f132543a.get(size).h(f17, f18)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final synchronized boolean i(float f17, float f18) {
        for (int size = this.f132543a.size() - 1; size >= 0; size--) {
            if (this.f132543a.get(size).i(f17, f18)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final boolean j(float f17, float f18) {
        for (int size = this.f132543a.size() - 1; size >= 0; size--) {
            if (this.f132543a.get(size).j(f17, f18)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final synchronized boolean b(float f17, float f18) {
        for (int size = this.f132543a.size() - 1; size >= 0; size--) {
            if (this.f132543a.get(size).b(f17, f18)) {
                return true;
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b("notify onSingleTap");
        for (int size2 = this.f132543a.size() - 1; size2 >= 0; size2--) {
            this.f132543a.get(size2).a();
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final synchronized boolean a(float f17, float f18) {
        for (int size = this.f132543a.size() - 1; size >= 0; size--) {
            if (this.f132543a.get(size).a(f17, f18)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final synchronized boolean c() {
        for (int size = this.f132543a.size() - 1; size >= 0; size--) {
            if (this.f132543a.get(size).c()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final synchronized boolean d() {
        for (int size = this.f132543a.size() - 1; size >= 0; size--) {
            if (this.f132543a.get(size).d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final void a() {
        for (int size = this.f132543a.size() - 1; size >= 0; size--) {
            this.f132543a.get(size).a();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final synchronized boolean a(android.view.MotionEvent motionEvent, float f17, float f18) {
        for (int size = this.f132543a.size() - 1; size >= 0; size--) {
            if (this.f132543a.get(size).a(motionEvent, f17, f18)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final synchronized boolean b() {
        for (int size = this.f132543a.size() - 1; size >= 0; size--) {
            if (this.f132543a.get(size).b()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final synchronized boolean a(float f17) {
        for (int size = this.f132543a.size() - 1; size >= 0; size--) {
            if (this.f132543a.get(size).a(f17)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final synchronized boolean b(float f17) {
        for (int size = this.f132543a.size() - 1; size >= 0; size--) {
            if (this.f132543a.get(size).b(f17)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final synchronized boolean a(android.graphics.PointF pointF, android.graphics.PointF pointF2, float f17) {
        for (int size = this.f132543a.size() - 1; size >= 0; size--) {
            if (this.f132543a.get(size).a(pointF, pointF2, f17)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb
    public final synchronized boolean a(android.graphics.PointF pointF, android.graphics.PointF pointF2, double d17, double d18) {
        for (int size = this.f132543a.size() - 1; size >= 0; size--) {
            if (this.f132543a.get(size).a(pointF, pointF2, d17, d18)) {
                return true;
            }
        }
        return false;
    }
}
