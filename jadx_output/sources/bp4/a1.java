package bp4;

/* loaded from: classes10.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.b1 f23094d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(bp4.b1 b1Var) {
        super(0);
        this.f23094d = b1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup timeCropViewGroup = (com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup) this.f23094d.a().findViewById(com.tencent.mm.R.id.f487391oi4);
        com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar seekSlider = timeCropViewGroup.getSeekSlider();
        if (seekSlider != null) {
            seekSlider.d();
        }
        return timeCropViewGroup;
    }
}
