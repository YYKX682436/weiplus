package ch5;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.vas.VASActivity f41629d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.ui.vas.VASActivity vASActivity) {
        super(0);
        this.f41629d = vASActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f41629d;
        if (vASActivity != null) {
            vASActivity.setVasFinishInterceptor(null);
        }
        if (vASActivity != null) {
            vASActivity.finish();
        }
        return jz5.f0.f302826a;
    }
}
