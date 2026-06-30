package ji;

/* loaded from: classes12.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public static final ji.f f381412d = new ji.f();

    public f() {
        super(4);
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403[] amsMemInfos = (com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403[]) obj3;
        com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403[] debugMemInfos = (com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403[]) obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(amsMemInfos, "amsMemInfos");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(debugMemInfos, "debugMemInfos");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sum pss of all process over threshold: amsSumPss = ");
        sb6.append(intValue);
        sb6.append(" KB, debugSumPss = ");
        sb6.append(intValue2);
        sb6.append(" KB amsMemDetail: ");
        java.lang.String arrays = java.util.Arrays.toString(amsMemInfos);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "java.util.Arrays.toString(this)");
        sb6.append(arrays);
        sb6.append("\n==========\ndebugMemDetail: ");
        java.lang.String arrays2 = java.util.Arrays.toString(debugMemInfos);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays2, "java.util.Arrays.toString(this)");
        sb6.append(arrays2);
        oj.j.b("Matrix.monitor.AppBgSumPssMonitor", sb6.toString(), new java.lang.Object[0]);
        return jz5.f0.f384359a;
    }
}
