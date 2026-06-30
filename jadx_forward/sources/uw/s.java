package uw;

/* loaded from: classes.dex */
public final class s implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw.y f513040d;

    public s(uw.y yVar) {
        this.f513040d = yVar;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        pm0.v.X(new uw.q(this));
        if (z17) {
            uw.y yVar = this.f513040d;
            p3325xe03a0797.p3326xc267989b.l.d(yVar.f513058d, null, null, new uw.r(yVar, f18, f17, null), 3, null);
            return true;
        }
        uw.y yVar2 = this.f513040d;
        synchronized (this) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            yVar2.f513056b = p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException("Location failed"))));
            yz5.l lVar = yVar2.f513057c;
            if (lVar != null) {
                p3321xbce91901.C29043x91b2b43d c29043x91b2b43d = yVar2.f513056b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c29043x91b2b43d);
                lVar.mo146xb9724478(c29043x91b2b43d);
            }
            yVar2.f513057c = null;
        }
        return false;
    }
}
