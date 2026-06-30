package mg1;

/* loaded from: classes7.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f407737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1135x9fd29358.C12315x7a49df38 f407738e;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1135x9fd29358.C12315x7a49df38 c12315x7a49df38) {
        this.f407737d = o6Var;
        this.f407738e = c12315x7a49df38;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChangeLanguageEventListenerIPCMessage", "run task and dispatch");
        tj1.n nVar = new tj1.n();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C0 = this.f407737d.C0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(C0, "getService(...)");
        java.lang.String language = this.f407738e.f165774f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(language, "language");
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, language);
        nVar.t(hashMap);
        nVar.u(C0);
        nVar.m();
    }
}
