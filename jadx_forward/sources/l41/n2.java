package l41;

/* loaded from: classes4.dex */
public class n2 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l41.o2 f397414a;

    public n2(l41.q2 q2Var, l41.o2 o2Var) {
        this.f397414a = o2Var;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap bitmap;
        if (bVar.f441064a != 0 || (bitmap = bVar.f441067d) == null || bitmap.isRecycled()) {
            return;
        }
        this.f397414a.f397422a = bVar.f441067d;
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
