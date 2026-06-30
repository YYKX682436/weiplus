package kp3;

/* loaded from: classes10.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp3.x f392572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f392573e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f392574f;

    public s(kp3.x xVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2) {
        this.f392572d = xVar;
        this.f392573e = f0Var;
        this.f392574f = f0Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f392573e.f391649d;
        int i18 = this.f392574f.f391649d;
        kp3.x xVar = this.f392572d;
        if (xVar.f392593s <= 0.0f || xVar.f392594t <= 0.0f) {
            xVar.f392593s = i17 * 0.5f;
            xVar.f392594t = i18 * 0.54f;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintCameraSettingUIC", "[setFocusOn] run： " + xVar.f392593s + ", " + xVar.f392594t + " , screen： " + i17 + ", " + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17013x966ea0d1 c17013x966ea0d1 = xVar.f392584g;
        if (c17013x966ea0d1 != null) {
            float f17 = xVar.f392593s;
            float f18 = xVar.f392594t;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitRecordViewLayout", "focusOn >> " + f17 + "  " + f18);
            c17013x966ea0d1.f237340f.h(f17, f18);
        }
    }
}
