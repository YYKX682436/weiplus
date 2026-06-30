package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class y2 extends n3.d2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9741a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9742b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.z2 f9743c;

    public y2(androidx.appcompat.widget.z2 z2Var, int i17) {
        this.f9743c = z2Var;
        this.f9742b = i17;
    }

    @Override // n3.d2, n3.c2
    public void a(android.view.View view) {
        this.f9741a = true;
    }

    @Override // n3.c2
    public void b(android.view.View view) {
        if (this.f9741a) {
            return;
        }
        this.f9743c.f9747a.setVisibility(this.f9742b);
    }

    @Override // n3.d2, n3.c2
    public void c(android.view.View view) {
        this.f9743c.f9747a.setVisibility(0);
    }
}
