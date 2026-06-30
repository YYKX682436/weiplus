package k55;

/* loaded from: classes8.dex */
public class i extends k55.g {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2501x31c413af.ServiceC19824xc49bdb6f f386001e;

    public i(com.p314xaae8f345.mm.p2501x31c413af.ServiceC19824xc49bdb6f serviceC19824xc49bdb6f) {
        this.f386001e = serviceC19824xc49bdb6f;
    }

    @Override // k55.h
    public void Na(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, k55.e eVar) {
        k55.b bVar;
        try {
            java.lang.Class<?> loadClass = this.f386001e.getClassLoader().loadClass(str);
            java.lang.reflect.Constructor<?>[] constructors = loadClass.getConstructors();
            if (constructors.length > 0) {
                java.lang.Object[] objArr = new java.lang.Object[constructors[0].getParameterTypes().length];
                objArr[0] = null;
                bVar = (k55.b) constructors[0].newInstance(objArr);
            } else {
                bVar = (k55.b) loadClass.newInstance();
            }
            bVar.f385997e = eVar;
            bVar.mo66824x9ad64344(str2, bundle, false);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoveService", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }
}
