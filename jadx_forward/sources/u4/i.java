package u4;

/* loaded from: classes13.dex */
public class i extends u4.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f506022d;

    public i(p012xc85e97e9.p112x993b6d55.C1173xe703c6a5 c1173xe703c6a5, android.view.ViewGroup viewGroup) {
        this.f506022d = viewGroup;
    }

    @Override // u4.d1, u4.b1
    public void a(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975) {
        u4.s1.a(this.f506022d, true);
    }

    @Override // u4.d1, u4.b1
    public void c(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975) {
        u4.s1.a(this.f506022d, false);
    }

    @Override // u4.b1
    public void d(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975) {
        u4.s1.a(this.f506022d, false);
        abstractC1183x100d4975.E(this);
    }
}
