package n5;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p125x37c711.p126x316220.p133x5ae81cb5.C1279x99253872 f416625d;

    public a(p012xc85e97e9.p125x37c711.p126x316220.p133x5ae81cb5.C1279x99253872 c1279x99253872) {
        this.f416625d = c1279x99253872;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p125x37c711.p126x316220.p133x5ae81cb5.C1279x99253872 c1279x99253872 = this.f416625d;
        java.lang.String c17 = c1279x99253872.f93992e.f93999b.c("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (android.text.TextUtils.isEmpty(c17)) {
            a5.a0.c().b(p012xc85e97e9.p125x37c711.p126x316220.p133x5ae81cb5.C1279x99253872.f94029q, "No worker to delegate to.", new java.lang.Throwable[0]);
            c1279x99253872.f94033o.i(new a5.v());
            return;
        }
        p012xc85e97e9.p125x37c711.AbstractC1260xfe49ee9f a17 = c1279x99253872.f93992e.f94003f.a(c1279x99253872.f93991d, c17, c1279x99253872.f94030i);
        c1279x99253872.f94034p = a17;
        if (a17 == null) {
            a5.a0.c().a(p012xc85e97e9.p125x37c711.p126x316220.p133x5ae81cb5.C1279x99253872.f94029q, "No worker to delegate to.", new java.lang.Throwable[0]);
            c1279x99253872.f94033o.i(new a5.v());
            return;
        }
        j5.w i17 = ((j5.g0) b5.w.c(c1279x99253872.f93991d).f99430c.n()).i(c1279x99253872.f93992e.f93998a.toString());
        if (i17 == null) {
            c1279x99253872.f94033o.i(new a5.v());
            return;
        }
        android.content.Context context = c1279x99253872.f93991d;
        f5.d dVar = new f5.d(context, b5.w.c(context).f99431d, c1279x99253872);
        dVar.b(java.util.Collections.singletonList(i17));
        if (!dVar.a(c1279x99253872.f93992e.f93998a.toString())) {
            a5.a0.c().a(p012xc85e97e9.p125x37c711.p126x316220.p133x5ae81cb5.C1279x99253872.f94029q, java.lang.String.format("Constraints not met for delegate %s. Requesting retry.", c17), new java.lang.Throwable[0]);
            c1279x99253872.f94033o.i(new a5.w());
            return;
        }
        a5.a0.c().a(p012xc85e97e9.p125x37c711.p126x316220.p133x5ae81cb5.C1279x99253872.f94029q, java.lang.String.format("Constraints met for delegate %s", c17), new java.lang.Throwable[0]);
        try {
            wa.a e17 = c1279x99253872.f94034p.e();
            e17.mo606x162a7075(new n5.b(c1279x99253872, e17), c1279x99253872.f93992e.f94001d);
        } catch (java.lang.Throwable th6) {
            a5.a0 c18 = a5.a0.c();
            java.lang.String str = p012xc85e97e9.p125x37c711.p126x316220.p133x5ae81cb5.C1279x99253872.f94029q;
            c18.a(str, java.lang.String.format("Delegated worker %s threw exception in startWork.", c17), th6);
            synchronized (c1279x99253872.f94031m) {
                if (c1279x99253872.f94032n) {
                    a5.a0.c().a(str, "Constraints were unmet, Retrying.", new java.lang.Throwable[0]);
                    c1279x99253872.f94033o.i(new a5.w());
                } else {
                    c1279x99253872.f94033o.i(new a5.v());
                }
            }
        }
    }
}
