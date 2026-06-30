package androidx.lifecycle;

/* loaded from: classes13.dex */
class FullLifecycleObserverAdapter implements androidx.lifecycle.v {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.h f11578d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.v f11579e;

    public FullLifecycleObserverAdapter(androidx.lifecycle.h hVar, androidx.lifecycle.v vVar) {
        this.f11578d = hVar;
        this.f11579e = vVar;
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y yVar, androidx.lifecycle.m mVar) {
        int i17 = androidx.lifecycle.i.f11631a[mVar.ordinal()];
        androidx.lifecycle.h hVar = this.f11578d;
        switch (i17) {
            case 1:
                hVar.onCreate(yVar);
                break;
            case 2:
                hVar.onStart(yVar);
                break;
            case 3:
                hVar.onResume(yVar);
                break;
            case 4:
                hVar.onPause(yVar);
                break;
            case 5:
                hVar.onStop(yVar);
                break;
            case 6:
                hVar.onDestroy(yVar);
                break;
            case 7:
                throw new java.lang.IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        androidx.lifecycle.v vVar = this.f11579e;
        if (vVar != null) {
            vVar.onStateChanged(yVar, mVar);
        }
    }
}
