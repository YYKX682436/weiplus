package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes13.dex */
public class i0 extends p012xc85e97e9.p093xedfae76a.j0 {

    /* renamed from: mSources */
    private q.h f3550x25954e8b = new q.h();

    /* renamed from: addSource */
    public void mo3194xffc8101c(p012xc85e97e9.p093xedfae76a.g0 g0Var, p012xc85e97e9.p093xedfae76a.k0 k0Var) {
        p012xc85e97e9.p093xedfae76a.h0 h0Var = new p012xc85e97e9.p093xedfae76a.h0(g0Var, k0Var);
        p012xc85e97e9.p093xedfae76a.h0 h0Var2 = (p012xc85e97e9.p093xedfae76a.h0) this.f3550x25954e8b.e(g0Var, h0Var);
        if (h0Var2 != null && h0Var2.f93161e != k0Var) {
            throw new java.lang.IllegalArgumentException("This source was already added with the different observer");
        }
        if (h0Var2 == null && m7804x22d78dfd()) {
            g0Var.mo7807xc74540ab(h0Var);
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.g0
    /* renamed from: onActive */
    public void mo520x3a2455c5() {
        java.util.Iterator it = this.f3550x25954e8b.iterator();
        while (true) {
            q.f fVar = (q.f) it;
            if (!fVar.hasNext()) {
                return;
            }
            p012xc85e97e9.p093xedfae76a.h0 h0Var = (p012xc85e97e9.p093xedfae76a.h0) ((java.util.Map.Entry) fVar.next()).getValue();
            h0Var.f93160d.mo7807xc74540ab(h0Var);
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.g0
    /* renamed from: onInactive */
    public void mo521xa6927f6a() {
        java.util.Iterator it = this.f3550x25954e8b.iterator();
        while (true) {
            q.f fVar = (q.f) it;
            if (!fVar.hasNext()) {
                return;
            }
            p012xc85e97e9.p093xedfae76a.h0 h0Var = (p012xc85e97e9.p093xedfae76a.h0) ((java.util.Map.Entry) fVar.next()).getValue();
            h0Var.f93160d.mo522xb5bdeb7a(h0Var);
        }
    }

    /* renamed from: removeSource */
    public <S> void m7811xccdcd9bf(p012xc85e97e9.p093xedfae76a.g0 g0Var) {
        p012xc85e97e9.p093xedfae76a.h0 h0Var = (p012xc85e97e9.p093xedfae76a.h0) this.f3550x25954e8b.g(g0Var);
        if (h0Var != null) {
            h0Var.f93160d.mo522xb5bdeb7a(h0Var);
        }
    }
}
