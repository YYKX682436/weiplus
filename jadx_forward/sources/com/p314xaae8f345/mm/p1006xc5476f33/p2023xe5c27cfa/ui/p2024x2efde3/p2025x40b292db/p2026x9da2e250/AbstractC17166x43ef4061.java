package com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/BaseFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "ui-repairer_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment */
/* loaded from: classes15.dex */
public abstract class AbstractC17166x43ef4061 extends com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f239610d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 f239611e;

    public static /* synthetic */ void l0(com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.AbstractC17166x43ef4061 abstractC17166x43ef4061, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: down");
        }
        if ((i18 & 1) != 0) {
            i17 = 19;
        }
        abstractC17166x43ef4061.j0(i17);
    }

    /* renamed from: getLayoutId */
    public abstract int mo68447x2ee31f5b();

    /* renamed from: initData */
    public abstract void mo68448xff8c0da();

    public void j0(int i17) {
        java.util.List list = this.f239610d;
        ((java.util.ArrayList) list).clear();
        if (i17 >= 0) {
            int i18 = 0;
            while (true) {
                ((java.util.ArrayList) list).add("测试数据" + i18);
                if (i18 == i17) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        o0();
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 m0() {
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = this.f239611e;
        if (c22851x22587864 != null) {
            return c22851x22587864;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshLayout");
        throw null;
    }

    public abstract void n0(android.view.View view);

    public void o0() {
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        android.view.View inflate = inflater.inflate(mo68447x2ee31f5b(), (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        n0(inflate);
        mo68448xff8c0da();
        return inflate;
    }

    public void p0() {
        java.util.List list = this.f239610d;
        int size = ((java.util.ArrayList) list).size();
        int i17 = size + 10;
        while (size < i17) {
            ((java.util.ArrayList) list).add("测试数据" + size);
            size++;
        }
        o0();
    }
}
