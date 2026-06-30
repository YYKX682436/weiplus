package e00;

/* loaded from: classes3.dex */
public final class h implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f327307a;

    public h(java.lang.String str, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f327307a = qVar;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap bitmap = bVar != null ? bVar.f441067d : null;
        if (bitmap != null) {
            bitmap.getWidth();
        }
        if (bitmap != null) {
            bitmap.getHeight();
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f327307a.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Float.valueOf(bitmap != null ? bitmap.getWidth() / bitmap.getHeight() : 0.0f)));
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
