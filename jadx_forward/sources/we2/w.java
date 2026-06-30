package we2;

/* loaded from: classes3.dex */
public class w extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f526796f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f526797g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f526798h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f526796f = "FinderLiveMsgRespChain";
        this.f526797g = jz5.h.b(new we2.v(liveContext));
        this.f526798h = kz5.c0.i(new ze2.c(), new ze2.e(liveContext), new ze2.d(), new af2.m(liveContext), new af2.i(liveContext), new af2.g(), new af2.k(), new af2.j(liveContext), new af2.o(liveContext), new df2.mm(liveContext), new af2.n(liveContext), new af2.l(liveContext), new af2.f(liveContext), new xe2.n(liveContext), new af2.e(liveContext), new ye2.a(liveContext), new af2.b(), new we2.d0(liveContext), new af2.c(liveContext), new af2.a(liveContext), new af2.d(liveContext));
    }

    public final void N6() {
        mo528x82b764cd();
        ((mm2.e5) m147920xbba4bfc0(mm2.e5.class)).f410536g = new we2.u(this);
    }

    public final void O6(java.util.LinkedList msgList, java.util.LinkedList appMsgList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appMsgList, "appMsgList");
        xe2.n nVar = (xe2.n) ((jz5.n) this.f526797g).mo141623x754a37bb();
        r45.r71 r71Var = new r45.r71();
        r71Var.set(2, msgList);
        r71Var.set(14, appMsgList);
        nVar.b(new we2.b(r71Var, 0, 2, null));
    }

    public boolean P6(we2.c cgiResp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiResp, "cgiResp");
        java.util.Iterator it = Q6().iterator();
        boolean z17 = false;
        while (it.hasNext() && (z17 = ((we2.c0) it.next()).a(cgiResp))) {
        }
        return z17;
    }

    public java.util.List Q6() {
        return this.f526798h;
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        java.util.List Q6 = Q6();
        java.util.ArrayList<we2.c0> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : Q6) {
            if (((we2.c0) obj) instanceof we2.x) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (we2.c0 c0Var : arrayList) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.component.msginterceptor.IAfterCheckInterceptor");
            arrayList2.add((we2.x) c0Var);
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((we2.x) it.next()).c();
        }
    }
}
