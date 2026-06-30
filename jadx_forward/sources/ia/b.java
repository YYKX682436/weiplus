package ia;

/* loaded from: classes13.dex */
public class b extends d3.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.text.TextPaint f371401a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d3.p f371402b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ia.c f371403c;

    public b(ia.c cVar, android.text.TextPaint textPaint, d3.p pVar) {
        this.f371403c = cVar;
        this.f371401a = textPaint;
        this.f371402b = pVar;
    }

    @Override // d3.p
    public void c(int i17) {
        ia.c cVar = this.f371403c;
        cVar.a();
        cVar.f371414k = true;
        this.f371402b.c(i17);
    }

    @Override // d3.p
    public void d(android.graphics.Typeface typeface) {
        ia.c cVar = this.f371403c;
        cVar.f371415l = android.graphics.Typeface.create(typeface, cVar.f371406c);
        cVar.d(this.f371401a, typeface);
        cVar.f371414k = true;
        this.f371402b.d(typeface);
    }
}
