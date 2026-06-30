package com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R.\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR.\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001b0\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001a¨\u0006#"}, d2 = {"com/tencent/matrix/battery/TaskProfiler$AccTaskJiffyStats", "Lcom/tencent/matrix/battery/accumulate/persist/FlattParcelable;", "", "getCurrVer", "getSize", "describeContents", "", "accProcName", "Ljava/lang/String;", "getAccProcName", "()Ljava/lang/String;", "setAccProcName", "(Ljava/lang/String;)V", "", "accBeginTime", "J", "getAccBeginTime", "()J", "setAccBeginTime", "(J)V", "", "accRunTaskStats", "Ljava/util/Map;", "getAccRunTaskStats", "()Ljava/util/Map;", "setAccRunTaskStats", "(Ljava/util/Map;)V", "Lcom/tencent/matrix/battery/TaskProfiler$Timer;", "accFinTaskStats", "getAccFinTaskStats", "setAccFinTaskStats", "<init>", "()V", "Companion", "kh/m1", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.matrix.battery.TaskProfiler$AccTaskJiffyStats */
/* loaded from: classes12.dex */
public final class C4625xbe665255 extends com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.AbstractC4629x1dfec73e {

    /* renamed from: ACC_FIELD_COUNT */
    private static final int f19864x14d7aa6c = 4;

    /* renamed from: VERSION */
    private static final int f19867x3fc0a8b8 = 1;

    @com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0(m40842x5fb28d2 = 2, m40843x368f3a = long.class, m40844x211ee07 = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18)
    private long accBeginTime;

    /* renamed from: Companion */
    public static final kh.m1 f19866x233c02ec = new kh.m1(null);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.C4625xbe665255> f19865x681a0c0c = new kh.l1();

    @com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0(m40842x5fb28d2 = 1, m40843x368f3a = java.lang.String.class, m40844x211ee07 = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18)
    private java.lang.String accProcName = "";

    @com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0(m40842x5fb28d2 = 3, m40843x368f3a = java.util.Map.class, m40844x211ee07 = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18)
    private java.util.Map<java.lang.String, java.lang.Long> accRunTaskStats = new java.util.LinkedHashMap();

    @com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0(m40842x5fb28d2 = 4, m40843x368f3a = java.util.Map.class, m40844x211ee07 = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18)
    private java.util.Map<java.lang.String, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.C4626xf3e017af> accFinTaskStats = new java.util.LinkedHashMap();

    @Override // com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.AbstractC4629x1dfec73e, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long getAccBeginTime() {
        return this.accBeginTime;
    }

    /* renamed from: getAccFinTaskStats */
    public final java.util.Map<java.lang.String, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.C4626xf3e017af> m40762x2b761f3a() {
        return this.accFinTaskStats;
    }

    public final java.lang.String getAccProcName() {
        return this.accProcName;
    }

    /* renamed from: getAccRunTaskStats */
    public final java.util.Map<java.lang.String, java.lang.Long> m40764x828240ba() {
        return this.accRunTaskStats;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.AbstractC4629x1dfec73e
    /* renamed from: getCurrVer */
    public int mo40765x80f8bfdb() {
        return 1;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.AbstractC4629x1dfec73e
    /* renamed from: getSize */
    public int mo40766xfb854877() {
        return 4;
    }

    /* renamed from: setAccBeginTime */
    public final void m40767xc5e2f917(long j17) {
        this.accBeginTime = j17;
    }

    /* renamed from: setAccFinTaskStats */
    public final void m40768x624cb8ae(java.util.Map<java.lang.String, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.C4626xf3e017af> map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "<set-?>");
        this.accFinTaskStats = map;
    }

    /* renamed from: setAccProcName */
    public final void m40769x71a77ce0(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.accProcName = str;
    }

    /* renamed from: setAccRunTaskStats */
    public final void m40770xb958da2e(java.util.Map<java.lang.String, java.lang.Long> map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "<set-?>");
        this.accRunTaskStats = map;
    }
}
