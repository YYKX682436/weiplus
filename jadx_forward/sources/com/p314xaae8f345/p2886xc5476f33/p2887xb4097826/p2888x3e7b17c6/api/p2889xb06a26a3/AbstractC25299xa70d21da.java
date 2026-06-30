package com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/plugin/finder/detector/api/detect/FinderEventDetector;", "Lls5/m;", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, "Lcom/tencent/plugin/finder/detector/api/detect/BaseEventDetector;", "<init>", "()V", "plugin-finder-detector_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.plugin.finder.detector.api.detect.FinderEventDetector */
/* loaded from: classes10.dex */
public abstract class AbstractC25299xa70d21da<T extends ls5.m> extends com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f<T> {
    @Override // com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f
    public java.lang.Object q(ns5.a aVar, java.util.Map.Entry entry, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6516x7962e81f c6516x7962e81f, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ls5.k mo58776x51603325;
        ls5.f fVar = (ls5.f) entry.getValue();
        if (fVar != null && (mo58776x51603325 = ((ls5.m) fVar.f402664a).mo58776x51603325()) != null) {
            java.lang.String leakMsg = k(fVar, aVar);
            ls5.d dVar = (ls5.d) mo58776x51603325;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(leakMsg, "leakMsg");
            dVar.f402656c = leakMsg;
            dVar.f402657d = java.lang.System.currentTimeMillis();
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return jz5.f0.f384359a;
    }

    public boolean r(android.view.View view) {
        if (view != null) {
            java.lang.String str = "isFloatMode view: " + view + " it.rootView = " + view.getRootView() + " layoutParams: " + view.getRootView().getLayoutParams();
            java.lang.String str2 = this.f296760e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
            android.view.ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
            android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "isFloatMode type = " + layoutParams2.type + " isShown: " + view.isShown());
                if (layoutParams2.type > 99) {
                    return true;
                }
            }
        }
        return false;
    }
}
