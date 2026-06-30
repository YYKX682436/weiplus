package r64;

/* loaded from: classes4.dex */
public final class b implements q64.b, q64.a {

    /* renamed from: a, reason: collision with root package name */
    public p64.b f474597a;

    /* renamed from: b, reason: collision with root package name */
    public p64.a f474598b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2114xc84af846.ipc.p2115x316220.BinderC17751xdbf8942c f474599c;

    public final void a(android.os.Bundle bundle) {
        java.lang.reflect.Method[] methods;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callbackFromServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        p64.a aVar = this.f474598b;
        if (bundle != null && aVar != null) {
            bundle.setClassLoader(r64.b.class.getClassLoader());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("shouldCallbackToClientInMainThread", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
            p64.a aVar2 = this.f474598b;
            boolean z17 = false;
            if (aVar2 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldCallbackToClientInMainThread", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
            } else {
                try {
                    methods = p64.a.class.getMethods();
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("SimpleRemoteRequest", th6, "shouldCallbackToClientInMainThread error", new java.lang.Object[0]);
                }
                if (a84.b0.d(methods)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SimpleRemoteRequest", "shouldCallbackToClientInMainThread, the interface is empty!");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldCallbackToClientInMainThread", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                } else {
                    java.lang.reflect.Method method = aVar2.getClass().getMethod(methods[0].getName(), android.os.Bundle.class);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SimpleRemoteRequest", "shouldCallbackToClientInMainThread, onCallbackFromServerMethod is " + method);
                    if (method != null) {
                        o64.b bVar = (o64.b) method.getAnnotation(o64.b.class);
                        if (bVar != null) {
                            z17 = bVar.m150696x6ac9171();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldCallbackToClientInMainThread", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SimpleRemoteRequest", "shouldCallbackToClientInMainThread, annotation is null");
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldCallbackToClientInMainThread", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                }
            }
            if (z17) {
                ((ku5.t0) ku5.t0.f394148d).B(new r64.a(this, aVar, bundle));
            } else {
                aVar.mo69375xe57d25f1(bundle);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callbackFromServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
    }

    public final android.os.Bundle b(q64.b bVar, android.os.Bundle bundle) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calledOnServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        if (bundle != null) {
            bundle.setClassLoader(r64.b.class.getClassLoader());
            java.lang.String k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "key_server_class");
            if (!android.text.TextUtils.isEmpty(k17)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("objectFromString", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                try {
                    obj = java.lang.Class.forName(k17).newInstance();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("objectFromString", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("SimpleRemoteRequest", th6, "objectFromString error", new java.lang.Object[0]);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("objectFromString", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                    obj = null;
                }
                if (obj instanceof p64.b) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SimpleRemoteRequest", "calledOnServer the onServer is called.");
                    android.os.Bundle a17 = ((p64.b) obj).a(bVar, bundle);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calledOnServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                    return a17;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SimpleRemoteRequest", "calledOnServer the object is not IOnIPCServerCall" + k17);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SimpleRemoteRequest", "calledOnServer the params is null ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calledOnServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        return null;
    }

    public final android.os.Bundle c(android.os.Bundle bundle) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clientRequestToServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        android.os.Bundle bundle2 = null;
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SimpleRemoteRequest", "the input args is null, are you sure?");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clientRequestToServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getServerName", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        p64.b bVar = this.f474597a;
        if (bVar != null) {
            str = bVar.getClass().getName();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getServerName", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getServerName", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SimpleRemoteRequest", "put serverName = ".concat(str));
        bundle.putCharSequence("key_server_class", str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callToRemoteServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2114xc84af846.ipc.p2115x316220.BinderC17751xdbf8942c binderC17751xdbf8942c = this.f474599c;
        if (binderC17751xdbf8942c != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClassName", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
            java.lang.String name = r64.b.class.getName();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClassName", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
            java.lang.Object m142014x6c2fab7 = binderC17751xdbf8942c.m142014x6c2fab7("calledOnServer", name, bundle);
            if (m142014x6c2fab7 instanceof android.os.Bundle) {
                bundle2 = (android.os.Bundle) m142014x6c2fab7;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callToRemoteServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clientRequestToServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                return bundle2;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SimpleRemoteRequest", "callToRemoteServer return null with mRemoteProxy = " + this.f474599c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callToRemoteServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clientRequestToServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        return bundle2;
    }

    public k55.e d() {
        k55.e eVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClientCallback", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2114xc84af846.ipc.p2115x316220.BinderC17751xdbf8942c binderC17751xdbf8942c = this.f474599c;
        if (binderC17751xdbf8942c != null && (eVar = binderC17751xdbf8942c.f385997e) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClientCallback", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
            return eVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SimpleRemoteRequest", "getClientCallback return null with mRemoteProxy = " + this.f474599c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClientCallback", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        return null;
    }

    public final void e(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2114xc84af846.ipc.p2115x316220.BinderC17751xdbf8942c binderC17751xdbf8942c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("serverResponseToClient", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        if (bundle != null && (binderC17751xdbf8942c = this.f474599c) != null) {
            binderC17751xdbf8942c.m142013x77b46a52("callbackFromServer", bundle);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("serverResponseToClient", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
    }
}
