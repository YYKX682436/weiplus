package ir2;

/* loaded from: classes2.dex */
public class z1 implements ym5.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f375788d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f375789e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f375790f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f375791g;

    public z1(com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 layout, boolean z17, yz5.a aVar, yz5.a aVar2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        this.f375788d = layout;
        this.f375789e = z17;
        this.f375790f = aVar;
        this.f375791g = aVar2;
    }

    @Override // ym5.m1
    /* renamed from: onChanged */
    public void mo56048x7bb163d5() {
        this.f375788d.mo56048x7bb163d5();
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeChanged */
    public void mo56050xa44dd169(int i17, int i18, java.lang.Object obj) {
        yz5.a aVar = this.f375790f;
        this.f375788d.mo56050xa44dd169(i17 + (aVar != null ? ((java.lang.Number) aVar.mo152xb9724478()).intValue() : 0), i18, obj);
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeInserted */
    public void mo56051xb0566d03(int i17, int i18) {
        yz5.a aVar = this.f375790f;
        this.f375788d.mo56051xb0566d03(i17 + (aVar != null ? ((java.lang.Number) aVar.mo152xb9724478()).intValue() : 0), i18);
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeMoved */
    public void mo56052x5e3cd6a8(int i17, int i18, int i19) {
        yz5.a aVar = this.f375790f;
        this.f375788d.mo56052x5e3cd6a8(i17 + (aVar != null ? ((java.lang.Number) aVar.mo152xb9724478()).intValue() : 0), i18 + (aVar != null ? ((java.lang.Number) aVar.mo152xb9724478()).intValue() : 0), i19);
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeRemoved */
    public void mo56053xb9568715(int i17, int i18) {
        yz5.a aVar = this.f375790f;
        this.f375788d.mo56053xb9568715(i17 + (aVar != null ? ((java.lang.Number) aVar.mo152xb9724478()).intValue() : 0), i18);
        yz5.a aVar2 = this.f375791g;
        if (aVar2 != null) {
            aVar2.mo152xb9724478();
        }
    }
}
