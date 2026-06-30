package pv2;

/* loaded from: classes10.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f440111a = new java.util.HashMap();

    public final void a(pv2.m stage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stage, "stage");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PipelineCore", "[start] taskId:" + stage.f440115d);
        synchronized (this.f440111a) {
            if (this.f440111a.containsKey(stage.f440115d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PipelineCore", "[start] task in pipeline return, taskId:" + stage.f440115d);
                return;
            }
            ov2.c cVar = (ov2.c) this;
            pv2.c cVar2 = (pv2.c) ((java.util.LinkedHashMap) cVar.f430704d).get(java.lang.Integer.valueOf(stage.a()));
            if (cVar2 == null) {
                cVar2 = cVar.f430703c;
            }
            this.f440111a.put(stage.f440115d, stage);
            ov2.d dVar = cVar.f430705e;
            if (dVar != null) {
                dVar.c(stage.f440115d, stage);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PipelineCore", "[start] exec taskId:" + stage.f440115d);
            cVar2.a(new pv2.e(this, stage));
        }
    }
}
