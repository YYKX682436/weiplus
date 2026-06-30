package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h {

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f161068g;

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.c(null);
        f161068g = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.b.f160945d);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n0 api, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff invokeContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(api, "api");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeContext, "invokeContext");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("name[");
        sb6.append(api.k());
        sb6.append("], callbackId[");
        sb6.append(invokeContext.f162549e);
        sb6.append("], appId[");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = invokeContext.f162546b;
        sb6.append(lVar.mo48798x74292566());
        sb6.append("] component[");
        sb6.append(lVar.mo50260x9f1221c2());
        sb6.append(']');
        java.lang.String sb7 = sb6.toString();
        int size = this.f171927e.size();
        int i17 = this.f171928f.get();
        org.json.JSONObject jSONObject = invokeContext.f162547c;
        long optLong = jSONObject.optLong("timeout", -1L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAuthJSAPIConcurrentQueue", "dispatch " + sb7 + ", queueLength:" + size + ", inFlightTasksCount:" + i17 + ", timeout:" + optLong);
        jSONObject.put("queueLength", size);
        a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.d(api, invokeContext, sb7, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n(api, invokeContext, optLong)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c
    public boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.a aVar) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.d task = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.d) aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n nVar = task.f160964g;
        synchronized (nVar) {
            z17 = nVar.f161178h;
        }
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c
    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.a aVar, yz5.a onEnd) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.d task = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.d) aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onEnd, "onEnd");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n0 n0Var = task.f160961d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff ffVar = task.f160962e;
        java.lang.String str = task.f160963f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n nVar = task.f160964g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.a aVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.e(str, onEnd));
        synchronized (nVar) {
            nVar.f161177g = aVar2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAuthJSAPIConcurrentQueue", "runTask " + str);
        if (ffVar.f162546b.mo50262x39e05d35()) {
            n0Var.C(ffVar, task.f160964g);
        } else {
            onEnd.mo152xb9724478();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h
    public void h() {
        this.f171927e.clear();
    }
}
