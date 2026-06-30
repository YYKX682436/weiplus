package hy;

/* loaded from: classes14.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final hy.b0 f367261a = new hy.b0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f367262b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f367263c;

    public final java.util.List a() {
        java.util.Collection values = f367262b.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        return kz5.n0.S0(values);
    }

    public final void b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("destroyAllSessions count=");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f367262b;
        sb6.append(concurrentHashMap.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotVoIPSessionMgr", sb6.toString());
        f367263c = false;
        java.util.Iterator it = concurrentHashMap.values().iterator();
        while (it.hasNext()) {
            ((hy.a0) it.next()).f367258e.clear();
        }
        f367262b.clear();
    }

    public final void c(hy.a0 session) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("destroySession id=");
        java.lang.String str = session.f367254a;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotVoIPSessionMgr", sb6.toString());
        session.f367258e.clear();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f367262b;
        concurrentHashMap.remove(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotVoIPSessionMgr", "unregisterSession id=" + str + " mapSize=" + concurrentHashMap.size());
    }

    public final hy.a0 d(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return (hy.a0) f367262b.get(str);
    }

    public final hy.a0 e(java.lang.String str, java.util.Optional optional, java.util.Optional welcomeInfo, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w wVar, java.util.Optional optional2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(welcomeInfo, "welcomeInfo");
        if (str3 == null || str3.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChatBotVoIPSessionMgr", "startSession: sessionID is null or empty");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotVoIPSessionMgr", "startSession identifier=" + str2 + " sessionID=" + str3 + " openScene=" + wVar);
        wx.o oVar = wx.o.f531957a;
        oVar.getClass();
        if (!wx.o.f531958b) {
            oVar.a();
        }
        int h17 = gm0.j1.b().h();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w0 w0Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w0.f298051b;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.v k17 = w0Var.k(str == null ? "" : str, optional == null ? java.util.Optional.empty() : optional, welcomeInfo, h17, str2 == null ? "" : str2, str3, wVar == null ? com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w.ChatBotOpenScene_Asst : wVar, optional2 == null ? java.util.Optional.empty() : optional2);
        if (k17 == null || k17.f298019d != 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startSession failed ret=");
            sb6.append(k17 != null ? java.lang.Integer.valueOf(k17.f298019d) : null);
            sb6.append(" for sessionID=");
            sb6.append(str3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChatBotVoIPSessionMgr", sb6.toString());
            return null;
        }
        java.lang.String str4 = k17.f298021f[2] ? k17.f298020e : "";
        if (str4 == null || str4.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChatBotVoIPSessionMgr", "startSession returned empty voipSessionID for sessionID=".concat(str3));
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotVoIPSessionMgr", "startSession success voipSessionID=" + str4 + " for sessionID=" + str3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotVoIPSessionMgr", "createSession voipSessionID=" + str4 + " openScene=" + wVar);
        hy.a0 a0Var = new hy.a0(str4, wVar, this);
        f367262b.put(str4, a0Var);
        if (f367263c) {
            a0Var.f367259f = true;
        }
        java.lang.String str5 = a0Var.f367254a;
        if (str5.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotVoIPSession", "resetActiveVoIPSession: nil ID");
        } else {
            w0Var.g(str5);
        }
        return a0Var;
    }
}
