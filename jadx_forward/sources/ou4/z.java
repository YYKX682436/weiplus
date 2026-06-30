package ou4;

@j95.b
/* loaded from: classes8.dex */
public final class z extends i95.w implements ou4.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f430573d = jz5.h.b(ou4.y.f430572d);

    public void Ai(java.lang.String containerId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerId, "containerId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterContainerService", "destroyContainer: containerId=".concat(containerId));
        ou4.x xVar = (ou4.x) ((jz5.n) this.f430573d).mo141623x754a37bb();
        xVar.getClass();
        ou4.s sVar = (ou4.s) xVar.f430570b.remove(containerId);
        if (sVar != null) {
            java.util.Set set = (java.util.Set) xVar.f430571c.get(sVar.f430551b);
            if (set != null) {
                set.remove(containerId);
            }
            if (sVar.f430560k) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterContainer", "destroy: containerId=" + sVar.f430550a);
            try {
                sVar.f430557h.a();
                ((java.util.ArrayList) sVar.f430558i).clear();
                pi0.n1 n1Var = sVar.f430556g;
                if (n1Var != null) {
                    n1Var.a();
                }
                sVar.f430556g = null;
                sVar.f430555f = null;
                sVar.f430560k = true;
                ou4.x xVar2 = sVar.f430554e;
                java.lang.String containerId2 = sVar.f430550a;
                java.lang.String businessId = sVar.f430551b;
                xVar2.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerId2, "containerId");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(businessId, "businessId");
                xVar2.f430570b.remove(containerId2);
                java.util.Set set2 = (java.util.Set) xVar2.f430571c.get(businessId);
                if (set2 != null) {
                    set2.remove(containerId2);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterContainer", "destroy: success, containerId=" + sVar.f430550a);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlutterContainer", "destroy: failed, containerId=" + sVar.f430550a, e17);
            }
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterContainerService", "onCreate");
    }

    public ou4.d0 wi(java.lang.String businessId, ou4.t config) {
        java.lang.Object putIfAbsent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(businessId, "businessId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterContainerService", "createContainer: businessId=" + businessId + ", route=" + config.f430561a);
        ou4.x xVar = (ou4.x) ((jz5.n) this.f430573d).mo141623x754a37bb();
        xVar.getClass();
        ou4.o oVar = (ou4.o) xVar.f430569a.get(businessId);
        if (oVar == null) {
            throw new ou4.u(businessId);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(businessId);
        sb6.append('_');
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append('_');
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        java.lang.String substring = uuid.substring(0, 8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        sb6.append(substring);
        java.lang.String sb7 = sb6.toString();
        ou4.s sVar = new ou4.s(sb7, businessId, oVar, config, xVar);
        xVar.f430570b.put(sb7, sVar);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = xVar.f430571c;
        java.lang.Object obj = concurrentHashMap.get(businessId);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(businessId, (obj = new java.util.LinkedHashSet()))) != null) {
            obj = putIfAbsent;
        }
        ((java.util.Set) obj).add(sb7);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterContainerManager", "createContainer: containerId=".concat(sb7));
        return sVar;
    }
}
