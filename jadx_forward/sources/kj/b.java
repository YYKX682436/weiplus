package kj;

/* loaded from: classes12.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long[] f389714d;

    /* renamed from: e, reason: collision with root package name */
    public final long f389715e;

    /* renamed from: f, reason: collision with root package name */
    public final long f389716f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f389717g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f389718h;

    public b(boolean z17, java.lang.String str, long[] jArr, long j17, long j18) {
        this.f389718h = z17;
        this.f389717g = str;
        this.f389715e = j17;
        this.f389714d = jArr;
        this.f389716f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        int[] b17 = lj.f.b(android.os.Process.myPid());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        long[] jArr = this.f389714d;
        if (jArr.length > 0) {
            lj.e.d(jArr, linkedList, true, this.f389716f);
            lj.e.f(linkedList, 30, new kj.a(this));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        long c17 = lj.e.c(linkedList, sb6, sb7);
        long j17 = this.f389715e;
        long max = java.lang.Math.max(j17, c17);
        java.lang.String b18 = lj.e.b(linkedList, max);
        java.lang.Object[] objArr = new java.lang.Object[1];
        long size = linkedList.size();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(java.lang.String.format("-\n>>>>>>>>>>>>>>>>>>>>> maybe happens Jankiness!(%sms) <<<<<<<<<<<<<<<<<<<<<\n", java.lang.Long.valueOf(j17)));
        sb8.append("|* [Status]\n|*\t\tScene: ");
        java.lang.String str = this.f389717g;
        sb8.append(str);
        sb8.append("\n|*\t\tForeground: ");
        sb8.append(this.f389718h);
        sb8.append("\n|*\t\tPriority: ");
        sb8.append(b17[0]);
        sb8.append("\tNice: ");
        sb8.append(b17[1]);
        sb8.append("\n|*\t\tis64BitRuntime: ");
        sb8.append(oj.d.h());
        sb8.append("\n");
        if (size > 0) {
            sb8.append("|*\t\tStackKey: ");
            sb8.append(b18);
            sb8.append("\n");
            sb8.append(sb7.toString());
        } else {
            sb8.append(java.lang.String.format("AppMethodBeat is close[%s].", java.lang.Boolean.valueOf(com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p586x2eaf9f.C4711x5cbd1118.m41264x9cf0d20b().m41273x7a7245c3())));
            sb8.append("\n");
        }
        sb8.append("=========================================================================");
        objArr[0] = sb8.toString();
        oj.j.f("Matrix.EvilMethodTracer", "%s", objArr);
        try {
            dj.b bVar = (dj.b) ih.d.d().a(dj.b.class);
            if (bVar == null) {
                return;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            oj.d.d(jSONObject, ih.d.d().f373004b);
            jSONObject.put("detail", fj.a.NORMAL);
            jSONObject.put("cost", max);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, str);
            jSONObject.put("stack", sb6.toString());
            jSONObject.put("stackKey", b18);
            ri.d0 d0Var = new ri.d0();
            d0Var.f477393b = "Trace_EvilMethod";
            d0Var.f477395d = jSONObject;
            bVar.d(d0Var);
        } catch (org.json.JSONException e17) {
            oj.j.b("Matrix.EvilMethodTracer", "[JSONException error: %s", e17);
        }
    }
}
