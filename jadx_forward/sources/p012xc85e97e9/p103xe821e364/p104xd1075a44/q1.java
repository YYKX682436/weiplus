package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes12.dex */
public abstract class q1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.k f93733d;

    public q1(p012xc85e97e9.p103xe821e364.p104xd1075a44.d0 d0Var) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.d dVar = new p012xc85e97e9.p103xe821e364.p104xd1075a44.d(this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.e eVar = new p012xc85e97e9.p103xe821e364.p104xd1075a44.e(d0Var);
        if (eVar.f93537a == null) {
            synchronized (p012xc85e97e9.p103xe821e364.p104xd1075a44.e.f93535b) {
                if (p012xc85e97e9.p103xe821e364.p104xd1075a44.e.f93536c == null) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.e.f93536c = java.util.concurrent.Executors.newFixedThreadPool(2);
                }
            }
            eVar.f93537a = p012xc85e97e9.p103xe821e364.p104xd1075a44.e.f93536c;
        }
        this.f93733d = new p012xc85e97e9.p103xe821e364.p104xd1075a44.k(dVar, new p012xc85e97e9.p103xe821e364.p104xd1075a44.f(null, eVar.f93537a, d0Var));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f93733d.f93638e.size();
    }
}
