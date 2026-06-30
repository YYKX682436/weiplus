package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ql implements com.tencent.mapsdk.internal.fb {

    /* renamed from: a, reason: collision with root package name */
    private java.util.ArrayList<com.tencent.mapsdk.internal.fb> f51010a = new java.util.ArrayList<>();

    public final synchronized void a(com.tencent.mapsdk.internal.fb fbVar) {
        if (fbVar != null) {
            if (!this.f51010a.contains(fbVar)) {
                this.f51010a.add(fbVar);
            }
        }
    }

    public final synchronized void b(com.tencent.mapsdk.internal.fb fbVar) {
        this.f51010a.remove(fbVar);
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final synchronized boolean c(float f17, float f18) {
        for (int size = this.f51010a.size() - 1; size >= 0; size--) {
            if (this.f51010a.get(size).c(f17, f18)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final synchronized boolean d(float f17, float f18) {
        for (int size = this.f51010a.size() - 1; size >= 0; size--) {
            if (this.f51010a.get(size).d(f17, f18)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final synchronized boolean e(float f17, float f18) {
        for (int size = this.f51010a.size() - 1; size >= 0; size--) {
            if (this.f51010a.get(size).e(f17, f18)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final synchronized boolean f(float f17, float f18) {
        for (int size = this.f51010a.size() - 1; size >= 0; size--) {
            if (this.f51010a.get(size).f(f17, f18)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final synchronized boolean g(float f17, float f18) {
        for (int size = this.f51010a.size() - 1; size >= 0; size--) {
            if (this.f51010a.get(size).g(f17, f18)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final synchronized boolean h(float f17, float f18) {
        for (int size = this.f51010a.size() - 1; size >= 0; size--) {
            if (this.f51010a.get(size).h(f17, f18)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final synchronized boolean i(float f17, float f18) {
        for (int size = this.f51010a.size() - 1; size >= 0; size--) {
            if (this.f51010a.get(size).i(f17, f18)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final boolean j(float f17, float f18) {
        for (int size = this.f51010a.size() - 1; size >= 0; size--) {
            if (this.f51010a.get(size).j(f17, f18)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final synchronized boolean b(float f17, float f18) {
        for (int size = this.f51010a.size() - 1; size >= 0; size--) {
            if (this.f51010a.get(size).b(f17, f18)) {
                return true;
            }
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.b("notify onSingleTap");
        for (int size2 = this.f51010a.size() - 1; size2 >= 0; size2--) {
            this.f51010a.get(size2).a();
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final synchronized boolean a(float f17, float f18) {
        for (int size = this.f51010a.size() - 1; size >= 0; size--) {
            if (this.f51010a.get(size).a(f17, f18)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final synchronized boolean c() {
        for (int size = this.f51010a.size() - 1; size >= 0; size--) {
            if (this.f51010a.get(size).c()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final synchronized boolean d() {
        for (int size = this.f51010a.size() - 1; size >= 0; size--) {
            if (this.f51010a.get(size).d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final void a() {
        for (int size = this.f51010a.size() - 1; size >= 0; size--) {
            this.f51010a.get(size).a();
        }
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final synchronized boolean a(android.view.MotionEvent motionEvent, float f17, float f18) {
        for (int size = this.f51010a.size() - 1; size >= 0; size--) {
            if (this.f51010a.get(size).a(motionEvent, f17, f18)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final synchronized boolean b() {
        for (int size = this.f51010a.size() - 1; size >= 0; size--) {
            if (this.f51010a.get(size).b()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final synchronized boolean a(float f17) {
        for (int size = this.f51010a.size() - 1; size >= 0; size--) {
            if (this.f51010a.get(size).a(f17)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final synchronized boolean b(float f17) {
        for (int size = this.f51010a.size() - 1; size >= 0; size--) {
            if (this.f51010a.get(size).b(f17)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final synchronized boolean a(android.graphics.PointF pointF, android.graphics.PointF pointF2, float f17) {
        for (int size = this.f51010a.size() - 1; size >= 0; size--) {
            if (this.f51010a.get(size).a(pointF, pointF2, f17)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.fb
    public final synchronized boolean a(android.graphics.PointF pointF, android.graphics.PointF pointF2, double d17, double d18) {
        for (int size = this.f51010a.size() - 1; size >= 0; size--) {
            if (this.f51010a.get(size).a(pointF, pointF2, d17, d18)) {
                return true;
            }
        }
        return false;
    }
}
