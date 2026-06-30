package bp4;

/* loaded from: classes10.dex */
public final class i4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.o4 f23199d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(bp4.o4 o4Var) {
        super(1);
        this.f23199d = o4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bp4.o4 o4Var = this.f23199d;
            bundle.putLong("EDIT_VLOG_TRACK_CROP_START", o4Var.f23328u);
            bundle.putLong("EDIT_VLOG_TRAKC_CROP_END", o4Var.f23329v);
            bundle.putBoolean("EDIT_VLOG_TRACK_CROP_CONFIRM", o4Var.f23324q);
            bundle.putBoolean("EDIT_VLOG_TRACK_CROP_CHANGE", false);
            bundle.putInt("EDIT_TRACK_DURATION_CUT_COUNT", o4Var.z().getCutCnt());
            bundle.putInt("EDIT_TRACK_DURATION_SCROLL_COUNT", o4Var.z().getDragCnt());
            o4Var.f465332d.w(ju3.c0.f301876f2, bundle);
        }
        return jz5.f0.f302826a;
    }
}
