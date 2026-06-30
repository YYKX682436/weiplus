package com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p852x5b09653;

@com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10645x23f31ae6(m45130xc1458579 = {"com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI"})
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J \u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\"\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"com/tencent/mm/matrix/battery/debug/AdpfExamples$TestCallbackWithAdvancedConf", "Lob0/d;", "Lob0/c;", "Lob0/b;", "Ljz5/f0;", "onSuspend", "onResume", "", "", "runThreadWithLowEnergy", "Lob0/g;", "allStates", "", "currState", "", "onOrOff", "onStateChanged", "tid", "I", "getTid", "()I", "setTid", "(I)V", "<init>", "()V", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
@com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10649x58c45a3c
@com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10648x6e95a725
@com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10647xe75d5c00(m45131xb408cb78 = {})
/* renamed from: com.tencent.mm.matrix.battery.debug.AdpfExamples$TestCallbackWithAdvancedConf */
/* loaded from: classes12.dex */
public final class C10876x5f0bf405 extends ob0.d implements ob0.c, ob0.b {

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p852x5b09653.C10876x5f0bf405 f29733x4fbc8495 = new com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p852x5b09653.C10876x5f0bf405();
    private static int tid;

    private C10876x5f0bf405() {
        super("TestCallbackWithLowEnergyMode");
    }

    /* renamed from: getTid */
    public final int m46780xb5887159() {
        return tid;
    }

    @Override // ob0.d
    /* renamed from: onResume */
    public void mo46781x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdpfExamples", "couldResume");
    }

    @Override // ob0.b
    /* renamed from: onStateChanged */
    public void mo46782xaba1ac62(ob0.g allStates, java.lang.String currState, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(allStates, "allStates");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currState, "currState");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdpfExamples", currState + ">>" + z17);
        boolean mo40960xab2f7f06 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.k2.f148972a.e(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28890x98f1cdd1).mo40960xab2f7f06();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isBattTempVeryHigh=");
        sb6.append(mo40960xab2f7f06);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdpfExamples", sb6.toString());
    }

    @Override // ob0.d
    /* renamed from: onSuspend */
    public void mo46783xe142a15d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdpfExamples", "shouldPause");
    }

    @Override // ob0.c
    /* renamed from: runThreadWithLowEnergy */
    public java.util.List<java.lang.Integer> mo46784xc6f2d661() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdpfExamples", "runWithLowEnergy");
        return kz5.b0.c(java.lang.Integer.valueOf(tid));
    }

    /* renamed from: setTid */
    public final void m46785xca0298cd(int i17) {
        tid = i17;
    }
}
