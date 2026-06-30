package ew0;

/* loaded from: classes5.dex */
public final class f implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ew0.a f338547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ew0.l f338548e;

    public f(ew0.a aVar, ew0.l lVar) {
        this.f338547d = aVar;
        this.f338548e = lVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 c4189xeb0c3951;
        sw0.e eVar = (sw0.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        this.f338547d.m157187xd75f96ed(eVar);
        sw0.m mVar = eVar.f494961c;
        boolean z17 = mVar instanceof sw0.h;
        ew0.l lVar = this.f338548e;
        if (z17) {
            p3325xe03a0797.p3326xc267989b.l.d(lVar.m158345xefc66565(), null, null, new ew0.e(lVar, null), 3, null);
            return;
        }
        if (mVar instanceof sw0.i) {
            if (lVar.f338563y.isShowing()) {
                lVar.f338563y.dismiss();
                return;
            }
            return;
        }
        if (mVar instanceof sw0.j) {
            return;
        }
        if (!(mVar instanceof sw0.k ? true : mVar instanceof sw0.l) || (c4189xeb0c3951 = lVar.f338561w) == null) {
            return;
        }
        sw0.d dVar = (sw0.d) kz5.n0.a0(eVar.f494959a, eVar.f494960b.f494968b);
        if (zu0.i.f557209f == (dVar != null ? dVar.f494956b : null)) {
            java.lang.String str = dVar.f494955a.f129757b;
            com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = c4189xeb0c3951.f130065a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c3971x241f78, "getSegmentID(...)");
            ex0.q z76 = lVar.z7(c3971x241f78);
            if (z76 == null) {
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            z76.O(str);
            sw0.b bVar = lVar.f430651q;
            lVar.f430651q = bVar != null ? sw0.b.a(bVar, null, str, null, null, null, 29, null) : null;
            lVar.E7(z76, c4189xeb0c3951);
        }
    }
}
