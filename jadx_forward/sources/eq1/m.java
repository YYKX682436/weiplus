package eq1;

/* loaded from: classes.dex */
public final class m implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eq1.u f337364d;

    public m(eq1.u uVar) {
        this.f337364d = uVar;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        pm0.v.X(new eq1.k(this));
        if (z17) {
            eq1.u uVar = this.f337364d;
            p3325xe03a0797.p3326xc267989b.l.d(uVar.f337402d, null, null, new eq1.l(uVar, f18, f17, null), 3, null);
            return true;
        }
        eq1.u uVar2 = this.f337364d;
        synchronized (this) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            uVar2.f337400b = p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException("Location failed"))));
            yz5.l lVar = uVar2.f337401c;
            if (lVar != null) {
                p3321xbce91901.C29043x91b2b43d c29043x91b2b43d = uVar2.f337400b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c29043x91b2b43d);
                lVar.mo146xb9724478(c29043x91b2b43d);
            }
            uVar2.f337401c = null;
        }
        return false;
    }
}
