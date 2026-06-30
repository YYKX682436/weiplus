package zg2;

/* loaded from: classes3.dex */
public final class e implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.k0 f554356d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f554357e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14226x69ca5d17 f554358f;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14226x69ca5d17 c14226x69ca5d17, p012xc85e97e9.p093xedfae76a.k0 originObserver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originObserver, "originObserver");
        this.f554358f = c14226x69ca5d17;
        this.f554356d = originObserver;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14226x69ca5d17 c14226x69ca5d17 = this.f554358f;
        yz5.p pVar = c14226x69ca5d17.f193192e;
        if (pVar != null ? ((java.lang.Boolean) pVar.mo149xb9724478(this.f554357e, obj)).booleanValue() : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f554357e, obj)) {
            c14226x69ca5d17.getClass();
        } else {
            this.f554357e = obj;
            this.f554356d.mo525x7bb163d5(obj);
        }
    }
}
