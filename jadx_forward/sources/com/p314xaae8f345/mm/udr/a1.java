package com.p314xaae8f345.mm.udr;

@j95.b
/* loaded from: classes12.dex */
public final class a1 extends i95.w implements com.p314xaae8f345.mm.udr.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.udr.C21332x6b2b8003 f277982d;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.udr.UDRFeatureService$preCleanFileEvent$1] */
    public a1() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f277982d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de>(a0Var) { // from class: com.tencent.mm.udr.UDRFeatureService$preCleanFileEvent$1
            {
                this.f39173x3fe91575 = 1489935310;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de c5189xf98047de) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de event = c5189xf98047de;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.p0 p0Var = event.f135532g;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UDRFeatureService", "leonl: received clean event, flag is " + p0Var.f89122a + ", is system " + ((p0Var.f89122a & 1) != 0));
                return false;
            }
        };
    }

    public static final void wi(com.p314xaae8f345.mm.udr.a1 a1Var, android.os.Bundle bundle, ea5.k kVar) {
        a1Var.getClass();
        long j17 = bundle.getLong("taskId");
        java.lang.String string = bundle.getString("projectId");
        java.lang.String string2 = bundle.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        if (string2 == null) {
            string2 = "";
        }
        java.lang.String str = string2;
        int i17 = bundle.getInt("version");
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r a17 = com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r.a(bundle.getInt("type"));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UDRFeatureService", "crossProcessCallBack projectId:" + string + ", name:" + str);
        if (string == null) {
            return;
        }
        com.p314xaae8f345.mm.udr.z0 z0Var = new com.p314xaae8f345.mm.udr.z0(string, str, j17, i17, a17);
        com.p314xaae8f345.mm.udr.y0 y0Var = new com.p314xaae8f345.mm.udr.y0(string, str, bundle, j17, i17, a17);
        java.lang.String string3 = bundle.getString("state");
        if (string3 != null && string3.hashCode() == -1867169789 && string3.equals(ya.b.f77504xbb80cbe3)) {
            z0Var.mo146xb9724478(kVar);
        } else {
            y0Var.mo146xb9724478(kVar);
        }
    }

    public void Ai(com.p314xaae8f345.p3133xd0ce8b26.aff.udr.p parameter, ea5.k kVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parameter, "parameter");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.a.f299062b.a(parameter, java.util.Optional.ofNullable(kVar).map(com.p314xaae8f345.mm.udr.s0.f278041a));
            return;
        }
        try {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, parameter, com.p314xaae8f345.mm.udr.j0.class, new com.p314xaae8f345.mm.udr.t0(this, kVar));
        } catch (android.os.BadParcelableException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("UDRFeatureService", e17, "batchCheck BadParcelableException ", new java.lang.Object[0]);
        }
    }

    public void Bi(com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q parameter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parameter, "parameter");
        Di(parameter, null);
    }

    public void Di(com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q parameter, ea5.k kVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parameter, "parameter");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.a.f299062b.c(parameter, java.util.Optional.ofNullable(kVar).map(com.p314xaae8f345.mm.udr.u0.f278046a));
            return;
        }
        try {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, parameter, com.p314xaae8f345.mm.udr.n0.class, new com.p314xaae8f345.mm.udr.v0(this, kVar));
        } catch (android.os.BadParcelableException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("UDRFeatureService", e17, "check BadParcelableException ", new java.lang.Object[0]);
        }
    }

    public void Ni(com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q parameter, ea5.k callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parameter, "parameter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.a.f299062b.b(parameter, java.util.Optional.ofNullable(callback).map(com.p314xaae8f345.mm.udr.w0.f278050a));
            return;
        }
        try {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, parameter, com.p314xaae8f345.mm.udr.l0.class, new com.p314xaae8f345.mm.udr.x0(this, callback));
        } catch (android.os.BadParcelableException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("UDRFeatureService", e17, "checkNoLogin BadParcelableException ", new java.lang.Object[0]);
        }
    }

    public void Ri() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            return;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.a aVar = com.p314xaae8f345.p3133xd0ce8b26.aff.udr.a.f299062b;
        aVar.d();
        aVar.q();
    }

    public com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui(java.lang.String projectId, java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x) com.p314xaae8f345.p3133xd0ce8b26.aff.udr.a.f299062b.k(projectId, name).orElse(null);
        }
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("projectId", projectId);
            bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, name);
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.udr.q0.class);
        } catch (android.os.BadParcelableException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("UDRFeatureService", e17, "getResource BadParcelableException ", new java.lang.Object[0]);
            return null;
        }
    }

    public byte[] Vi(java.lang.String projectId, java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return (byte[]) com.p314xaae8f345.p3133xd0ce8b26.aff.udr.a.f299062b.i(projectId, name).orElse(null);
        }
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("projectId", projectId);
            bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, name);
            return (byte[]) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.udr.o0.class);
        } catch (android.os.BadParcelableException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("UDRFeatureService", e17, "getResourceDecrypt BadParcelableException ", new java.lang.Object[0]);
            return null;
        }
    }

    public com.p314xaae8f345.p3133xd0ce8b26.aff.udr.w Zi(java.lang.String projectId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.udr.w) com.p314xaae8f345.p3133xd0ce8b26.aff.udr.a.f299062b.j(projectId).orElse(null);
        }
        try {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.udr.w) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(projectId), com.p314xaae8f345.mm.udr.p0.class);
        } catch (android.os.BadParcelableException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("UDRFeatureService", e17, "getResourceList BadParcelableException ", new java.lang.Object[0]);
            return null;
        }
    }

    public void aj(java.lang.String projectId, java.lang.String className) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(className, "className");
        ((com.p314xaae8f345.mm.udr.e1) ((com.p314xaae8f345.mm.udr.c0) i95.n0.c(com.p314xaae8f345.mm.udr.c0.class))).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UDRGlobalConfigFeatureService", "register projectId:%s,class name:%s", projectId, className);
        java.lang.Iterable all = ((fs.c) fs.g.f(ea5.l.class)).all();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((fs.e) all).iterator();
        while (it.hasNext()) {
            ea5.l lVar = (ea5.l) ((fs.q) it.next()).get();
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            ea5.l lVar2 = (ea5.l) it6.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(className, lVar2.getClass().getName())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UDRGlobalConfigFeatureService", "dynamic register class:%s for projectId:%s", className, projectId);
                com.p314xaae8f345.mm.udr.e1.f278013e.put(projectId, lVar2);
                com.p314xaae8f345.mm.udr.e1.f278014f.add(projectId);
                com.p314xaae8f345.p3133xd0ce8b26.aff.udr.a.f299062b.o(projectId, lVar2.mo40417x561213dd(), lVar2.mo14972x73ec24f3(), new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.g(lVar2));
            }
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UDRFeatureService", "onAccountInitialized call alive");
            mo48813x58998cd();
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UDRFeatureService", "onAccountReleased call dead");
            mo48814x2efc64();
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UDRFeatureService", "onCreate");
        super.mo8845x3e5a77bb(context);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            da5.r rVar = da5.r.f309350a;
            if (rVar.b()) {
                rVar.c();
            }
        }
    }
}
