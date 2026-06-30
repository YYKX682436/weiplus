package ym5;

/* loaded from: classes14.dex */
public class f5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f544831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22807x4828c5d5 f544832e;

    public f5(com.p314xaae8f345.mm.p2776x373aa5.C22807x4828c5d5 c22807x4828c5d5, android.view.View view) {
        this.f544832e = c22807x4828c5d5;
        this.f544831d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2776x373aa5.C22807x4828c5d5 c22807x4828c5d5 = this.f544832e;
        com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.AbstractC22836x7ad225f4 abstractC22836x7ad225f4 = c22807x4828c5d5.f295006o;
        if (abstractC22836x7ad225f4 != null) {
            abstractC22836x7ad225f4.setVisibility(0);
            c22807x4828c5d5.f295006o.d(this.f544831d);
            android.view.WindowManager windowManager = c22807x4828c5d5.f295005n;
            com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.AbstractC22836x7ad225f4 abstractC22836x7ad225f42 = c22807x4828c5d5.f295006o;
            windowManager.updateViewLayout(abstractC22836x7ad225f42, abstractC22836x7ad225f42.mo82876xd1618356());
        }
    }
}
