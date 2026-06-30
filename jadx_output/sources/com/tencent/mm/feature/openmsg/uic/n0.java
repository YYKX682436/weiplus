package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes8.dex */
public final class n0 extends wm3.a {

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f67357h = jz5.h.b(com.tencent.mm.feature.openmsg.uic.b0.f67323d);

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f67358i = "ohter_entrance";

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f67359d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f67360e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f67361f;

    /* renamed from: g, reason: collision with root package name */
    public db0.j f67362g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f67359d = jz5.h.b(new com.tencent.mm.feature.openmsg.uic.m0(this));
        this.f67361f = "";
    }

    public static final boolean T6(com.tencent.mm.feature.openmsg.uic.n0 n0Var, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo) {
        java.util.LinkedList linkedList;
        n0Var.getClass();
        if (f9Var == null) {
            return false;
        }
        java.lang.String str = networkDeviceInfo.f66590h;
        boolean z17 = networkDeviceInfo.f66594o;
        if (!z17 && str == null) {
            return false;
        }
        if (z17 && ((linkedList = networkDeviceInfo.f66596q) == null || linkedList.isEmpty())) {
            return false;
        }
        return com.tencent.mm.ui.chatting.qc.f202624a.b(f9Var.getType(), f9Var, f9Var.j(), networkDeviceInfo);
    }

    public static final void U6(com.tencent.mm.feature.openmsg.uic.n0 n0Var, android.view.ViewGroup viewGroup, int i17) {
        n0Var.getClass();
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(i17);
        viewGroup.setLayoutParams(marginLayoutParams);
    }

    public final em.a V6() {
        return (em.a) ((jz5.n) this.f67359d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new com.tencent.mm.feature.openmsg.uic.l0(this));
        }
    }
}
