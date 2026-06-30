package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes5.dex */
public final class h extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new com.tencent.mm.feature.openmsg.uic.e(this));
        }
    }
}
