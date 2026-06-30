package aw1;

/* loaded from: classes12.dex */
public final class t implements mt1.r0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f96212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f96213b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ aw1.o f96214c;

    public t(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, aw1.o oVar) {
        this.f96213b = c26987xeef691ab;
        this.f96214c = oVar;
    }

    @Override // mt1.r0
    public void a(boolean z17, long j17, int i17, int i18) {
        this.f96212a = z17;
    }

    @Override // mt1.r0
    /* renamed from: onProgress */
    public void mo9155x696ee52c(long j17, long j18) {
        yv1.h1.f(2, this.f96213b);
        int i17 = (int) j18;
        this.f96214c.b(4, (int) j17, i17);
    }
}
