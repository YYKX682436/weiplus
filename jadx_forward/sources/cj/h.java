package cj;

/* loaded from: classes12.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj.i f123365d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(cj.i iVar) {
        super(5);
        this.f123365d = iVar;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        java.io.File hprof = (java.io.File) obj;
        java.io.File keyFile = (java.io.File) obj2;
        java.lang.String activity = (java.lang.String) obj3;
        java.lang.String key = (java.lang.String) obj4;
        java.lang.String failure = (java.lang.String) obj5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hprof, "hprof");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyFile, "keyFile");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(failure, "failure");
        oj.j.c("Matrix.LeakProcessor.NativeForkAnalyze", "Found record " + activity + '(' + hprof.getName() + ").", new java.lang.Object[0]);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(failure);
        java.lang.String absolutePath = hprof.getAbsolutePath();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(absolutePath, "hprof.absolutePath");
        java.io.File file = com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.C4705xed2494c3.f134466a;
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.C4705xed2494c3 c4705xed2494c3 = com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.C4705xed2494c3.f134469d;
        ti.a f17 = c4705xed2494c3.f(absolutePath, key, 1200L, new com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p(c4705xed2494c3));
        java.lang.Throwable th6 = f17.f501020f;
        if (th6 != null) {
            arrayList.add(th6.toString());
        }
        wi.b bVar = wi.b.FORK_ANALYSE;
        boolean z17 = f17.f501018d;
        cj.i iVar = this.f123365d;
        long j17 = f17.f501021g;
        if (z17) {
            iVar.f123366d.f134497a.f123368e.b(activity, false);
            java.lang.String m166611x9616526c = f17.m166611x9616526c();
            iVar.f123366d.f134497a.f123367d.d(0, bVar, activity, key, m166611x9616526c, java.lang.String.valueOf(j17), 1);
            oj.j.c("Matrix.LeakProcessor.NativeForkAnalyze", "retry leak found: " + m166611x9616526c, new java.lang.Object[0]);
        } else if (th6 != null) {
            arrayList.add(th6.toString());
            iVar.f123366d.f134497a.f123367d.d(5, bVar, activity, key, kz5.n0.g0(arrayList, ";", null, null, 0, null, null, 62, null), java.lang.String.valueOf(j17), 1);
        }
        return jz5.f0.f384359a;
    }
}
