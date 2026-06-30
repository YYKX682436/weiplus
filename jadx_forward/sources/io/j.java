package io;

/* loaded from: classes5.dex */
public final class j implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.w0 f374944a;

    /* renamed from: b, reason: collision with root package name */
    public final yo0.i f374945b;

    /* renamed from: c, reason: collision with root package name */
    public mf5.c f374946c;

    public j() {
        yo0.f fVar = new yo0.f();
        fVar.f545610a = true;
        fVar.f545611b = true;
        this.f374945b = fVar.a();
    }

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (this.f374944a == null) {
            this.f374944a = new em.w0(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dp6, (android.view.ViewGroup) null));
            c(null, this.f374946c);
        }
        em.w0 w0Var = this.f374944a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w0Var);
        android.view.View view = w0Var.f336416a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "getInflateRootView(...)");
        return view;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        mf5.c cVar = (mf5.c) pVar;
        mf5.c cVar2 = this.f374946c;
        this.f374946c = cVar;
        c(cVar2, cVar);
    }

    public final void c(mf5.c cVar, mf5.c cVar2) {
        em.w0 w0Var;
        if (cVar2 == null || (w0Var = this.f374944a) == null) {
            return;
        }
        io.i iVar = new io.i(cVar2, w0Var);
        android.view.View view = w0Var.f336416a;
        view.setOnClickListener(iVar);
        if (w0Var.f336417b == null) {
            w0Var.f336417b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.okp);
        }
        w0Var.f336417b.setText(cVar2.f407712d);
        java.lang.String str = cVar2.f407713e;
        jz5.f0 f0Var = null;
        if (str != null) {
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                w0Var.a().setVisibility(0);
                vo0.e eVar = vo0.e.f520000a;
                vo0.a aVar = vo0.e.f520001b;
                android.widget.ImageView a17 = w0Var.a();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getIvLogo(...)");
                aVar.c(str, a17, this.f374945b);
                f0Var = jz5.f0.f384359a;
            }
        }
        if (f0Var == null) {
            w0Var.a().setVisibility(8);
        }
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f374946c;
    }
}
