package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes8.dex */
public final class z extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f67384d;

    /* renamed from: e, reason: collision with root package name */
    public zh1.w0 f67385e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f67384d = jz5.h.b(new com.tencent.mm.feature.openmsg.uic.y(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgByOtherAppUIC", "onActivityResult requestCode:" + i17 + " resultCode:" + i18);
        if (i17 == 2) {
            jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            ((ht.a) vVar).getClass();
            com.tencent.mm.pluginsdk.ui.tools.f.f(activity, i17, i18, intent, true, com.tencent.mm.R.string.brq, com.tencent.mm.R.string.brr, 17);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new com.tencent.mm.feature.openmsg.uic.x(this));
        }
    }
}
