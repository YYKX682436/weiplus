package df2;

/* loaded from: classes3.dex */
public final class cw implements if2.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.kw f311445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yg2.b f311446b;

    public cw(df2.kw kwVar, yg2.b bVar) {
        this.f311445a = kwVar;
        this.f311446b = bVar;
    }

    @Override // if2.l0
    public java.util.List a() {
        return kz5.p0.f395529d;
    }

    @Override // if2.l0
    public java.util.List b() {
        return kz5.p0.f395529d;
    }

    @Override // if2.l0
    public void c(boolean z17) {
        df2.kw kwVar = this.f311445a;
        if (z17) {
            java.util.Iterator it = ((java.util.LinkedHashMap) kwVar.f312137n).entrySet().iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl) ((java.util.Map.Entry) it.next()).getValue()).dismiss();
            }
        } else {
            java.util.Iterator it6 = ((java.util.LinkedHashMap) kwVar.f312137n).entrySet().iterator();
            while (it6.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl) ((java.util.Map.Entry) it6.next()).getValue()).d(this.f311446b);
            }
        }
    }

    @Override // if2.l0
    public void d(boolean z17) {
    }
}
