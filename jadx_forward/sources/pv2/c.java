package pv2;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final fp0.o f440107a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Vector f440108b;

    public c(java.lang.String id6, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        this.f440108b = new java.util.Vector();
        fp0.o oVar = new fp0.o(new gp0.g(new gp0.b(100, Integer.MAX_VALUE), new gp0.h(i17, 5), i17, id6));
        this.f440107a = oVar;
        oVar.g(new pv2.b(this));
    }

    public final void a(pv2.e pipelineTask) {
        pv2.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pipelineTask, "pipelineTask");
        java.util.Vector vector = this.f440108b;
        java.util.Iterator it = vector.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            gVar = pipelineTask.f440109f;
            if (!hasNext) {
                i17 = -1;
                break;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((pv2.g) it.next()).b(), gVar.b())) {
                break;
            } else {
                i17++;
            }
        }
        if (i17 < 0) {
            vector.add(gVar);
        }
        this.f440107a.a(pipelineTask);
    }
}
