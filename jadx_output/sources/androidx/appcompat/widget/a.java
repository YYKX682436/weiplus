package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class a implements n3.c2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9505a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f9506b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.b f9507c;

    public a(androidx.appcompat.widget.b bVar) {
        this.f9507c = bVar;
    }

    @Override // n3.c2
    public void a(android.view.View view) {
        this.f9505a = true;
    }

    @Override // n3.c2
    public void b(android.view.View view) {
        if (this.f9505a) {
            return;
        }
        androidx.appcompat.widget.b bVar = this.f9507c;
        bVar.f9516i = null;
        super/*android.view.View*/.setVisibility(this.f9506b);
    }

    @Override // n3.c2
    public void c(android.view.View view) {
        super/*android.view.View*/.setVisibility(0);
        this.f9505a = false;
    }
}
