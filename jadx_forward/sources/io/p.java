package io;

/* loaded from: classes5.dex */
public final class p implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.x0 f374953a;

    /* renamed from: b, reason: collision with root package name */
    public final io.l f374954b = new io.l();

    /* renamed from: c, reason: collision with root package name */
    public mf5.d f374955c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 a17;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 a18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (this.f374953a == null) {
            android.content.Context context2 = null;
            em.x0 x0Var = new em.x0(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dp7, (android.view.ViewGroup) null));
            this.f374953a = x0Var;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 a19 = x0Var.a();
            io.l lVar = this.f374954b;
            if (a19 != null) {
                a19.setClipToOutline(true);
                a19.setOutlineProvider(new io.o(context));
                em.x0 x0Var2 = this.f374953a;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de((x0Var2 == null || (a18 = x0Var2.a()) == null) ? null : a18.getContext());
                c1162x665295de.Q(1);
                a19.mo7967x900dcbe1(c1162x665295de);
                em.x0 x0Var3 = this.f374953a;
                if (x0Var3 != null && (a17 = x0Var3.a()) != null) {
                    context2 = a17.getContext();
                }
                a19.N(new io.n(context2));
                a19.mo7960x6cab2c8d(lVar);
            }
            mf5.d dVar = this.f374955c;
            if (dVar != null) {
                lVar.f374947d = dVar.f407715d;
                lVar.m8146xced61ae5();
            }
        }
        em.x0 x0Var4 = this.f374953a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(x0Var4);
        android.view.View view = x0Var4.f336438a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "getInflateRootView(...)");
        return view;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        mf5.d dVar = (mf5.d) pVar;
        this.f374955c = dVar;
        if (dVar == null) {
            return;
        }
        java.util.List list = dVar.f407715d;
        io.l lVar = this.f374954b;
        lVar.f374947d = list;
        lVar.m8146xced61ae5();
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f374955c;
    }
}
