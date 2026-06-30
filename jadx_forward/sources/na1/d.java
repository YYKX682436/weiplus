package na1;

/* loaded from: classes7.dex */
public class d extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o0 {

    /* renamed from: CTRL_INDEX */
    public static final int f72903x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f72904x24728b = "onStartReportCanvasData";

    /* renamed from: i, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0 f417484i;

    public void x(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, na1.c cVar, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnStartReportCanvasDataEvent", "hy: trigger event %d", java.lang.Integer.valueOf(cVar.f417483d));
        u(e9Var);
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("event", java.lang.Integer.valueOf(cVar.f417483d));
        hashMap.put("viewId", java.lang.Integer.valueOf(i17));
        t(hashMap);
        m();
    }
}
