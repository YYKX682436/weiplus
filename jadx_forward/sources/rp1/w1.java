package rp1;

/* loaded from: classes14.dex */
public class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f480082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f480083e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f480084f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 f480085g;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 c12931xa4a39700, int i17, int i18, boolean z17) {
        this.f480085g = c12931xa4a39700;
        this.f480082d = i17;
        this.f480083e = i18;
        this.f480084f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700.I;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 c12931xa4a39700 = this.f480085g;
        c12931xa4a39700.j(this.f480082d, this.f480083e);
        dp1.l lVar = c12931xa4a39700.f175112g;
        if (lVar != null) {
            lVar.f323696e = this.f480084f;
            lVar.m8146xced61ae5();
        }
    }
}
