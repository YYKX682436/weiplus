package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class l extends androidx.appcompat.widget.f1 {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.m f9637p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.widget.m mVar, android.view.View view, androidx.appcompat.widget.q qVar) {
        super(view);
        this.f9637p = mVar;
    }

    @Override // androidx.appcompat.widget.f1
    public o.k0 b() {
        androidx.appcompat.widget.n nVar = this.f9637p.f9645f.A;
        if (nVar == null) {
            return null;
        }
        return nVar.a();
    }

    @Override // androidx.appcompat.widget.f1
    public boolean c() {
        this.f9637p.f9645f.o();
        return true;
    }

    @Override // androidx.appcompat.widget.f1
    public boolean d() {
        androidx.appcompat.widget.q qVar = this.f9637p.f9645f;
        if (qVar.C != null) {
            return false;
        }
        qVar.l();
        return true;
    }
}
