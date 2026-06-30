package by0;

/* loaded from: classes3.dex */
public final class d implements dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f117857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f117858b;

    public d(p3325xe03a0797.p3326xc267989b.q qVar, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        this.f117857a = qVar;
        this.f117858b = interfaceC4987x84e327cb;
    }

    @Override // dr.q
    public void a(boolean z17) {
        p3325xe03a0797.p3326xc267989b.q qVar = this.f117857a;
        if (!z17) {
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(this.f117858b));
        }
    }
}
