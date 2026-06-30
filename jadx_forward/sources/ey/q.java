package ey;

@j95.b
/* loaded from: classes15.dex */
public final class q extends i95.w implements ey.u, com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.d {

    /* renamed from: d, reason: collision with root package name */
    public boolean f338816d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.c f338817e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f338818f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f338819g = new java.util.HashMap();

    public final java.lang.String Ai(java.lang.String str, java.lang.String str2) {
        return str + "::" + str2;
    }

    public void Bi(ey.k listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.lang.String a17 = listener.a();
        java.lang.String b17 = listener.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionCallService", "registerFunctionCallEndListener " + a17 + ' ' + b17 + ' ' + listener);
        java.util.HashMap hashMap = this.f338819g;
        java.lang.String Ai = Ai(a17, b17);
        java.lang.Object obj = hashMap.get(Ai);
        if (obj == null) {
            obj = new java.util.ArrayList();
            hashMap.put(Ai, obj);
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        if (arrayList.contains(listener)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FunctionCallService", "registerFunctionCallEndListener duplicate");
        } else {
            arrayList.add(listener);
        }
    }

    public void Di(ey.t listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.lang.String a17 = listener.a();
        java.lang.String b17 = listener.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionCallService", "registerFunctionCallStartListener " + a17 + ' ' + b17 + ' ' + listener);
        java.util.HashMap hashMap = this.f338818f;
        java.lang.String Ai = Ai(a17, b17);
        java.lang.Object obj = hashMap.get(Ai);
        if (obj == null) {
            obj = new java.util.ArrayList();
            hashMap.put(Ai, obj);
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        if (arrayList.contains(listener)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FunctionCallService", "registerFunctionCallStartListener duplicate");
        } else {
            arrayList.add(listener);
        }
    }

    public void Ni(ey.k listener) {
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.lang.String a17 = listener.a();
        java.lang.String b17 = listener.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionCallService", "unregisterFunctionCallEndListener " + a17 + ' ' + b17 + ' ' + listener);
        java.util.HashMap hashMap = this.f338819g;
        if (!hashMap.containsKey(Ai(a17, b17)) || (arrayList = (java.util.ArrayList) hashMap.get(Ai(a17, b17))) == null) {
            return;
        }
        arrayList.remove(listener);
    }

    public void Ri(ey.t listener) {
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.lang.String a17 = listener.a();
        java.lang.String b17 = listener.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionCallService", "unregisterFunctionCallStartListener " + a17 + ' ' + b17 + ' ' + listener);
        java.util.HashMap hashMap = this.f338818f;
        if (!hashMap.containsKey(Ai(a17, b17)) || (arrayList = (java.util.ArrayList) hashMap.get(Ai(a17, b17))) == null) {
            return;
        }
        arrayList.remove(listener);
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionCallService", "onAccountInitialized inited " + this.f338816d);
        wi();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        ey.o.f338814a.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionCall", "unInitModules");
        for (ey.o oVar : ey.l.f338811b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionCall", "unregister module: " + oVar.a());
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.i iVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.i.f298429b;
            java.util.Set keySet = oVar.b().keySet();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(keySet, 10));
            java.util.Iterator it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(oVar.a() + "::" + ((java.lang.String) it.next()));
            }
            iVar.c(new java.util.ArrayList(arrayList), oVar.a(), ey.n.f338813a);
        }
        this.f338816d = false;
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionCallService", "onCreate");
        wi();
    }

    public final void wi() {
        if (this.f338816d) {
            return;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.i.f298429b.a(new com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.b(this), ey.p.f338815a);
        ey.o.f338814a.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionCall", "initModules");
        for (ey.o oVar : ey.l.f338811b) {
            for (java.util.Map.Entry entry : oVar.b().entrySet()) {
                java.lang.String str = oVar.a() + "::" + ((java.lang.String) entry.getKey());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionCall", "register function: " + str);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.i.f298429b.b(str, oVar.a(), kz5.c0.d(com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.n.SCHEME_DEFAULT, com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.n.SCHEME_TEST), new com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.k(new ey.v((yz5.p) entry.getValue())), ey.m.f338812a);
            }
        }
        this.f338816d = true;
    }
}
