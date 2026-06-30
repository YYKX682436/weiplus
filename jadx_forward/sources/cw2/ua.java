package cw2;

/* loaded from: classes10.dex */
public final class ua implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15201xe049f190 f305586d;

    public ua(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15201xe049f190 c15201xe049f190) {
        this.f305586d = c15201xe049f190;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ig2.m mVar = ig2.m.f372926a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15201xe049f190 c15201xe049f190 = this.f305586d;
        ig2.r f17 = mVar.f(c15201xe049f190.C);
        if (f17 instanceof ig2.i) {
            ((ig2.i) f17).a();
        }
        c15201xe049f190.f212288x = true;
        yz5.a aVar = c15201xe049f190.f212279o;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
