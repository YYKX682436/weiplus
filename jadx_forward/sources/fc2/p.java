package fc2;

/* loaded from: classes2.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc2.q f342506d;

    public p(fc2.q qVar) {
        this.f342506d = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fc2.q qVar = this.f342506d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = qVar.f342509d;
        if (abstractC14490x69736cb5 != null) {
            fc2.s sVar = new fc2.s(3);
            sVar.f342514e = abstractC14490x69736cb5;
            sVar.f342517h = qVar.f342507b;
            sVar.f342515f = abstractC14490x69736cb5.mo2128x1ed62e84();
            sVar.f342516g = abstractC14490x69736cb5.w();
            qVar.f342507b = abstractC14490x69736cb5.mo2128x1ed62e84();
            qVar.a(sVar);
        }
    }
}
