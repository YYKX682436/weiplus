package io5;

/* loaded from: classes14.dex */
public final class c implements r90.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io5.e f375064d;

    public c(io5.e eVar) {
        this.f375064d = eVar;
    }

    @Override // r90.j
    /* renamed from: onOrientationChange */
    public final void mo47333x15072581(int i17) {
        if (i17 < 0 || i17 > 360) {
            return;
        }
        if (i17 % 90 != 0) {
            i17 = ((i17 + 44) / 90) * 90;
        }
        io5.e eVar = this.f375064d;
        eVar.b();
        eVar.e();
        if (eVar.f375069d != i17) {
            eVar.f375069d = i17;
            fo5.r0 r0Var = ((fo5.o) eVar.f375066a).f346570a;
            r0Var.w();
            fo5.r0.g(r0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPDeviceController", "device rotate changed to " + i17);
        }
    }
}
