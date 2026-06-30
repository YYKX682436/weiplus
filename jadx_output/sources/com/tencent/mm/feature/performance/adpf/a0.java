package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class a0 implements android.os.PowerManager.OnThermalStatusChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f67389a;

    public a0(yz5.l lVar) {
        this.f67389a = lVar;
    }

    @Override // android.os.PowerManager.OnThermalStatusChangedListener
    public final void onThermalStatusChanged(int i17) {
        this.f67389a.invoke(java.lang.Integer.valueOf(i17));
    }
}
