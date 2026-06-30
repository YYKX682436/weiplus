package com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p852x5b09653;

@com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10649x58c45a3c
@com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10648x6e95a725(m45132x8870b973 = true)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¨\u0006\u000b"}, d2 = {"com/tencent/mm/matrix/battery/debug/AdpfExamples$TestCallbackWithBatchSchedulerAndLowEnergyMode", "Lob0/d;", "Lob0/c;", "Ljz5/f0;", "onSuspend", "onResume", "", "", "runThreadWithLowEnergy", "<init>", "()V", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.matrix.battery.debug.AdpfExamples$TestCallbackWithBatchSchedulerAndLowEnergyMode */
/* loaded from: classes10.dex */
public final class C10878x6e4d9ac8 extends ob0.d implements ob0.c {

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p852x5b09653.C10878x6e4d9ac8 f29735x4fbc8495 = new com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p852x5b09653.C10878x6e4d9ac8();

    private C10878x6e4d9ac8() {
        super("TestCallbackWithBatchSchedulerAndLowEnergyMode");
    }

    @Override // ob0.d
    /* renamed from: onResume */
    public void mo46781x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdpfExamples", "couldResume");
    }

    @Override // ob0.d
    /* renamed from: onSuspend */
    public void mo46783xe142a15d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdpfExamples", "shouldPause");
    }

    @Override // ob0.c
    /* renamed from: runThreadWithLowEnergy */
    public java.util.List<java.lang.Integer> mo46784xc6f2d661() {
        return kz5.p0.f395529d;
    }
}
