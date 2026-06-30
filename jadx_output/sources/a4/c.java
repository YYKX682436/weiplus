package a4;

/* loaded from: classes13.dex */
public class c extends androidx.lifecycle.j0 implements androidx.loader.content.d {

    /* renamed from: d, reason: collision with root package name */
    public final int f1155d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Bundle f1156e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.loader.content.e f1157f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.lifecycle.y f1158g;

    /* renamed from: h, reason: collision with root package name */
    public a4.d f1159h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.loader.content.e f1160i;

    public c(int i17, android.os.Bundle bundle, androidx.loader.content.e eVar, androidx.loader.content.e eVar2) {
        this.f1155d = i17;
        this.f1156e = bundle;
        this.f1157f = eVar;
        this.f1160i = eVar2;
        eVar.registerListener(i17, this);
    }

    public void b() {
        androidx.lifecycle.y yVar = this.f1158g;
        a4.d dVar = this.f1159h;
        if (yVar == null || dVar == null) {
            return;
        }
        super.removeObserver(dVar);
        observe(yVar, dVar);
    }

    @Override // androidx.lifecycle.g0
    public void onActive() {
        this.f1157f.startLoading();
    }

    @Override // androidx.lifecycle.g0
    public void onInactive() {
        this.f1157f.stopLoading();
    }

    @Override // androidx.lifecycle.g0
    public void removeObserver(androidx.lifecycle.k0 k0Var) {
        super.removeObserver(k0Var);
        this.f1158g = null;
        this.f1159h = null;
    }

    @Override // androidx.lifecycle.j0, androidx.lifecycle.g0
    public void setValue(java.lang.Object obj) {
        super.setValue(obj);
        androidx.loader.content.e eVar = this.f1160i;
        if (eVar != null) {
            eVar.reset();
            this.f1160i = null;
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(64);
        sb6.append("LoaderInfo{");
        sb6.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb6.append(" #");
        sb6.append(this.f1155d);
        sb6.append(" : ");
        m3.b.a(this.f1157f, sb6);
        sb6.append("}}");
        return sb6.toString();
    }
}
