package gy;

/* loaded from: classes12.dex */
public final class i extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gy.j f359026d;

    public i(gy.j jVar) {
        this.f359026d = jVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        gy.j jVar = this.f359026d;
        if (!jVar.f359030d) {
            synchronized (jVar.a()) {
                jVar.a().clear();
            }
            return;
        }
        synchronized (jVar.a()) {
            if (jVar.a().isEmpty()) {
                jVar.f359027a.mo146xb9724478(java.lang.Float.valueOf(-90.0f));
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(jVar.a());
                jVar.a().clear();
                java.util.Iterator it = arrayList.iterator();
                double d17 = 0.0d;
                while (it.hasNext()) {
                    d17 += ((java.lang.Number) it.next()).doubleValue();
                }
                double size = d17 / arrayList.size();
                jVar.f359027a.mo146xb9724478(java.lang.Float.valueOf(e06.p.e(size < 1.0d ? -90.0f : (float) (20 * java.lang.Math.log10(size / java.lang.Math.pow(32767.0d, 2.0d))), -90.0f, 0.0f)));
            }
        }
    }
}
