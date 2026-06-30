package gp0;

/* loaded from: classes10.dex */
public final class b implements gp0.d {

    /* renamed from: a, reason: collision with root package name */
    public final int f355700a;

    /* renamed from: b, reason: collision with root package name */
    public final hp0.f f355701b = new hp0.f(100);

    public b(int i17, int i18) {
        this.f355700a = i17;
    }

    @Override // gp0.d
    public boolean a(fp0.d task) {
        boolean k17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        java.lang.String d17 = task.d();
        hp0.f fVar = this.f355701b;
        synchronized (fVar) {
            kk.j jVar = fVar.f364445a;
            if (jVar == null) {
                throw new java.lang.NullPointerException("mData == null");
            }
            k17 = ((lt0.f) jVar).k(d17);
        }
        if (k17) {
            long i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            java.lang.String d18 = task.d();
            kk.j jVar2 = fVar.f364445a;
            if (jVar2 == null) {
                throw new java.lang.NullPointerException("mData == null");
            }
            gp0.a aVar = (gp0.a) ((lt0.f) jVar2).i(d18);
            if (aVar.f355699b >= this.f355700a && i17 - aVar.f355698a < Integer.MAX_VALUE) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("DefaultRetrySg", "check block by recentdown: " + task.d() + " count " + aVar.f355699b + "  time: " + (i17 - aVar.f355698a));
                return false;
            }
            if (i17 - aVar.f355698a > Integer.MAX_VALUE) {
                task.d();
                aVar = new gp0.a(this, i17, 0);
            }
            aVar.f355699b++;
            aVar.f355698a = i17;
            fVar.a(task.d(), aVar);
        } else {
            fVar.a(task.d(), new gp0.a(this, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), 1));
        }
        return true;
    }
}
