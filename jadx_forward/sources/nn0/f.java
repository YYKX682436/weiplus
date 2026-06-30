package nn0;

/* loaded from: classes10.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nn0.h f420094d;

    public f(nn0.h hVar) {
        this.f420094d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        nn0.h hVar = this.f420094d;
        if (hVar.I != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("fromCustomRender", true);
            hVar.I.mo15376x8cd414a7(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46363x8f250ae2, bundle);
        }
    }
}
