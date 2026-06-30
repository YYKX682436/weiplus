package androidx.appcompat.app;

/* loaded from: classes15.dex */
public class s extends n3.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.t f9216a;

    public s(androidx.appcompat.app.t tVar) {
        this.f9216a = tVar;
    }

    @Override // n3.c2
    public void b(android.view.View view) {
        androidx.appcompat.app.t tVar = this.f9216a;
        tVar.f9219d.f9121s.setAlpha(1.0f);
        tVar.f9219d.f9124v.d(null);
        tVar.f9219d.f9124v = null;
    }

    @Override // n3.d2, n3.c2
    public void c(android.view.View view) {
        this.f9216a.f9219d.f9121s.setVisibility(0);
    }
}
