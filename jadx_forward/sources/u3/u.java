package u3;

/* loaded from: classes13.dex */
public final class u extends u3.s {

    /* renamed from: t, reason: collision with root package name */
    public u3.v f505769t;

    /* renamed from: u, reason: collision with root package name */
    public float f505770u;

    public u(java.lang.Object obj, u3.t tVar) {
        super(obj, tVar);
        this.f505769t = null;
        this.f505770u = Float.MAX_VALUE;
    }

    @Override // u3.s
    public void b() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new android.util.AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f505763f) {
            c(true);
        }
        float f17 = this.f505770u;
        if (f17 != Float.MAX_VALUE) {
            u3.v vVar = this.f505769t;
            if (vVar == null) {
                this.f505769t = new u3.v(f17);
            } else {
                vVar.f505779i = f17;
            }
            this.f505770u = Float.MAX_VALUE;
        }
    }

    public void e() {
        u3.v vVar = this.f505769t;
        if (vVar == null) {
            throw new java.lang.UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d17 = (float) vVar.f505779i;
        if (d17 > Float.MAX_VALUE) {
            throw new java.lang.UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        float f17 = this.f505764g;
        if (d17 < f17) {
            throw new java.lang.UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double abs = java.lang.Math.abs(this.f505766i * 0.75f);
        vVar.f505774d = abs;
        vVar.f505775e = abs * 62.5d;
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new android.util.AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z17 = this.f505763f;
        if (z17 || z17) {
            return;
        }
        this.f505763f = true;
        if (!this.f505760c) {
            this.f505759b = this.f505762e.a(this.f505761d);
        }
        float f18 = this.f505759b;
        if (f18 > Float.MAX_VALUE || f18 < f17) {
            throw new java.lang.IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        java.lang.ThreadLocal threadLocal = u3.f.f505742f;
        if (threadLocal.get() == null) {
            threadLocal.set(new u3.f());
        }
        u3.f fVar = (u3.f) threadLocal.get();
        java.util.ArrayList arrayList = fVar.f505744b;
        if (arrayList.size() == 0) {
            if (fVar.f505746d == null) {
                fVar.f505746d = new u3.e(fVar.f505745c);
            }
            u3.e eVar = (u3.e) fVar.f505746d;
            eVar.f505740b.postFrameCallback(eVar.f505741c);
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public u(java.lang.Object obj, u3.t tVar, float f17) {
        super(obj, tVar);
        this.f505769t = null;
        this.f505770u = Float.MAX_VALUE;
        this.f505769t = new u3.v(f17);
    }
}
