package or2;

/* loaded from: classes13.dex */
public final class f extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f429156d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f429157e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.Display.Mode f429158f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        jz5.i iVar = jz5.i.f384362d;
        this.f429156d = jz5.h.a(iVar, or2.d.f429152d);
        this.f429157e = jz5.h.a(iVar, new or2.c(this));
    }

    public final void O6() {
        android.view.Display P6 = P6();
        if (P6 == null) {
            return;
        }
        float refreshRate = P6.getRefreshRate();
        float[] supportedRefreshRates = P6.getSupportedRefreshRates();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(supportedRefreshRates, "getSupportedRefreshRates(...)");
        java.util.List E0 = kz5.n0.E0(kz5.z.w0(supportedRefreshRates));
        android.view.Display.Mode[] supportedModes = P6.getSupportedModes();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dumpRefreshRateInfo currentFps:");
        sb6.append(refreshRate);
        sb6.append(" supportedFpsRate:");
        sb6.append(kz5.n0.g0(E0, ",", "[", "]", 0, null, null, 56, null));
        sb6.append(" supportedFpsRateMode:");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(supportedModes);
        java.util.ArrayList arrayList = new java.util.ArrayList(supportedModes.length);
        for (android.view.Display.Mode mode : supportedModes) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(mode);
            sb7.append(' ');
            arrayList.add(sb7.toString());
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFpsController", sb6.toString());
    }

    public final android.view.Display P6() {
        return android.os.Build.VERSION.SDK_INT >= 30 ? m158354x19263085().getWindow().getContext().getDisplay() : m158354x19263085().getWindow().getWindowManager().getDefaultDisplay();
    }

    public final void Q6(android.view.Display.Mode mode) {
        if (m158354x19263085().isFinishing() || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f429158f, mode)) {
            return;
        }
        android.view.WindowManager.LayoutParams attributes = m158354x19263085().getWindow().getAttributes();
        attributes.preferredDisplayModeId = mode.getModeId();
        m158354x19263085().getWindow().setAttributes(attributes);
        this.f429158f = mode;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFpsController", "setDisplayRefreshRate targetFps:" + mode.getRefreshRate() + " mode:" + mode);
        O6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo450x3e5a77bb(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: or2.f.mo450x3e5a77bb(android.os.Bundle):void");
    }
}
