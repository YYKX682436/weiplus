package fr5;

/* loaded from: classes15.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr5.j f347495d;

    public i(fr5.j jVar) {
        this.f347495d = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float interpolation;
        fr5.j jVar = this.f347495d;
        if (jVar.f347509j) {
            int i17 = jVar.f347503d;
            if (i17 <= 0) {
                interpolation = 1.0f;
            } else {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - jVar.f347508i;
                if (currentTimeMillis < 0) {
                    currentTimeMillis = 0;
                }
                interpolation = jVar.f347504e.getInterpolation(e06.p.e(((float) currentTimeMillis) / i17, 0.0f, 1.0f));
            }
            float f17 = jVar.f347502c;
            float f18 = jVar.f347501b;
            jVar.f347505f.mo146xb9724478(java.lang.Float.valueOf(f18 + ((f17 - f18) * interpolation)));
            if (interpolation < 1.0f) {
                jVar.f347500a.postOnAnimation(jVar.f347507h);
            } else {
                jVar.f347509j = false;
                jVar.f347506g.mo152xb9724478();
            }
        }
    }
}
