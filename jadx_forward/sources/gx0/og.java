package gx0;

/* loaded from: classes5.dex */
public final class og implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.bh f358340d;

    public og(gx0.bh bhVar) {
        this.f358340d = bhVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        ou0.g gVar = (ou0.g) obj;
        gx0.bh bhVar = this.f358340d;
        if (!bhVar.M) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar);
            if (ou0.f.c(gVar, -1000000002L)) {
                bhVar.M = true;
                return;
            }
        }
        gx0.bh.Z6(bhVar, gVar, (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) bhVar.V6().f357791y.mo3195x754a37bb());
    }
}
