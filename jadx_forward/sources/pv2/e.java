package pv2;

/* loaded from: classes10.dex */
public final class e extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final pv2.g f440109f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pv2.f f440110g;

    public e(pv2.f fVar, pv2.g stage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stage, "stage");
        this.f440110g = fVar;
        this.f440109f = stage;
    }

    @Override // fp0.d
    public void a() {
        pv2.m mVar;
        pv2.g gVar = this.f440109f;
        if (gVar instanceof pv2.m) {
            pv2.g to6 = ((pv2.m) gVar).c();
            pv2.g from = this.f440109f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PipelineCore", "[dealNextStage] taskId:" + this.f440109f.b());
            if (to6 instanceof pv2.m) {
                pv2.g gVar2 = this.f440109f;
                mVar = gVar2 instanceof pv2.m ? (pv2.m) gVar2 : null;
                if (mVar != null) {
                    mVar.e(to6);
                }
            } else if (to6 instanceof pv2.l) {
                pv2.g gVar3 = this.f440109f;
                mVar = gVar3 instanceof pv2.m ? (pv2.m) gVar3 : null;
                if (mVar != null) {
                    mVar.e(to6);
                }
            } else if (to6 instanceof pv2.d) {
                pv2.g gVar4 = this.f440109f;
                mVar = gVar4 instanceof pv2.m ? (pv2.m) gVar4 : null;
                if (mVar != null) {
                    mVar.d(to6);
                }
            } else if (to6 instanceof pv2.n) {
                pv2.g gVar5 = this.f440109f;
                mVar = gVar5 instanceof pv2.m ? (pv2.m) gVar5 : null;
                if (mVar != null) {
                    mVar.f(to6);
                }
            }
            pv2.f fVar = this.f440110g;
            synchronized (fVar.f440111a) {
                fVar.f440111a.put(this.f440109f.b(), to6);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PipelineCore", "[dealNextStage] add next stage, taskId:" + this.f440109f.b());
            }
            pv2.f fVar2 = this.f440110g;
            java.lang.String taskId = this.f440109f.b();
            fVar2.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(to6, "to");
            ov2.d dVar = ((ov2.c) this.f440110g).f430705e;
            if (dVar != null) {
                dVar.a(this.f440109f.b(), from, to6);
            }
            ov2.c cVar = (ov2.c) this.f440110g;
            cVar.getClass();
            pv2.c cVar2 = (pv2.c) ((java.util.LinkedHashMap) cVar.f430704d).get(java.lang.Integer.valueOf(to6.a()));
            if (cVar2 == null) {
                cVar2 = cVar.f430703c;
            }
            cVar2.a(new pv2.e(this.f440110g, to6));
        } else if (gVar instanceof pv2.a) {
            ((pv2.a) gVar).c();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PipelineCore", "[call] taskId:" + ((pv2.a) this.f440109f).f440105d);
            pv2.f fVar3 = this.f440110g;
            synchronized (fVar3.f440111a) {
                fVar3.f440111a.remove(this.f440109f.b());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PipelineCore", "[call] remove taskId:" + ((pv2.a) this.f440109f).f440105d);
            }
            ov2.d dVar2 = ((ov2.c) this.f440110g).f430705e;
            if (dVar2 != null) {
                dVar2.b(this.f440109f.b(), this.f440109f);
            }
            pv2.f fVar4 = this.f440110g;
            pv2.g finalStage = this.f440109f;
            java.lang.String taskId2 = ((pv2.a) finalStage).f440105d;
            ov2.c cVar3 = (ov2.c) fVar4;
            cVar3.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId2, "taskId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finalStage, "finalStage");
            cVar3.b(finalStage);
        }
        b(fp0.u.f346823f);
    }

    @Override // fp0.d
    public java.lang.String d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        pv2.g gVar = this.f440109f;
        sb6.append(gVar.getClass().getSimpleName());
        sb6.append('_');
        sb6.append(gVar.b());
        return sb6.toString();
    }
}
