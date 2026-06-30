package xq5;

/* loaded from: classes11.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed f537659d;

    public c(com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed) {
        this.f537659d = c22991x5a0fbed;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p093xedfae76a.o b17;
        br5.e eVar;
        com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed = this.f537659d;
        if (c22991x5a0fbed.isAttachedToWindow()) {
            p012xc85e97e9.p093xedfae76a.y a17 = p012xc85e97e9.p093xedfae76a.n1.a(c22991x5a0fbed);
            if (a17 == null || (b17 = a17.mo273xed6858b4()) == null) {
                android.content.Context context = c22991x5a0fbed.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                b17 = dr5.c.b(context);
            }
            if (b17 == null || (eVar = c22991x5a0fbed.get_subsamplingEngine()) == null) {
                return;
            }
            com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.m0 m0Var = eVar.f105287c;
            m0Var.getClass();
            zq5.b.d();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m0Var.f296544t, b17)) {
                return;
            }
            p012xc85e97e9.p093xedfae76a.o oVar = m0Var.f296544t;
            p012xc85e97e9.p093xedfae76a.v vVar = m0Var.f296538n;
            if (oVar != null) {
                oVar.c(vVar);
            }
            m0Var.f296544t = b17;
            if (m0Var.f296530f != null) {
                b17.a(vVar);
            }
        }
    }
}
