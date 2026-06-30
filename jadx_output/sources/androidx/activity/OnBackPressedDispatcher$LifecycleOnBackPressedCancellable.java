package androidx.activity;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements androidx.lifecycle.v, androidx.activity.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.o f9023d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.activity.g f9024e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.activity.a f9025f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.i f9026g;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(androidx.activity.i iVar, androidx.lifecycle.o oVar, androidx.activity.g gVar) {
        this.f9026g = iVar;
        this.f9023d = oVar;
        this.f9024e = gVar;
        oVar.a(this);
    }

    @Override // androidx.activity.a
    public void cancel() {
        this.f9023d.c(this);
        this.f9024e.removeCancellable(this);
        androidx.activity.a aVar = this.f9025f;
        if (aVar != null) {
            aVar.cancel();
            this.f9025f = null;
        }
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y yVar, androidx.lifecycle.m mVar) {
        if (mVar == androidx.lifecycle.m.ON_START) {
            this.f9025f = this.f9026g.b(this.f9024e);
            return;
        }
        if (mVar != androidx.lifecycle.m.ON_STOP) {
            if (mVar == androidx.lifecycle.m.ON_DESTROY) {
                cancel();
            }
        } else {
            androidx.activity.a aVar = this.f9025f;
            if (aVar != null) {
                aVar.cancel();
            }
        }
    }
}
