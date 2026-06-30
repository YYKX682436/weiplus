package tl1;

/* loaded from: classes15.dex */
public class i implements v51.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f501740a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12786x94e8a515 f501741b;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12786x94e8a515 c12786x94e8a515, int i17) {
        this.f501741b = c12786x94e8a515;
        this.f501740a = i17;
    }

    @Override // v51.c
    public void a(int i17) {
        tl1.v vVar = this.f501741b.f173335g;
        if (vVar != null) {
            int[] iArr = {this.f501740a, i17};
            tl1.u uVar = vVar.f501765u;
            if (uVar != null) {
                uVar.a(iArr);
            }
        }
    }
}
