package xu3;

/* loaded from: classes5.dex */
public final class b implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f538784d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f538785e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f538786f;

    public b(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject, boolean z17, boolean z18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 2) != 0 ? false : z17;
        z18 = (i17 & 4) != 0 ? false : z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        this.f538784d = finderObject;
        this.f538785e = z17;
        this.f538786f = z18;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f538784d.m76784x5db1b11();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
