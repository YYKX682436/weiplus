package ft3;

/* loaded from: classes12.dex */
public final class g implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.r0 f348082a;

    /* renamed from: b, reason: collision with root package name */
    public final ft3.a f348083b = new ft3.a();

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f348084c = jz5.h.b(ft3.d.f348079d);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f348085d = jz5.h.b(ft3.e.f348080d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f348086e = jz5.h.b(new ft3.f(this));

    /* renamed from: f, reason: collision with root package name */
    public ft3.i f348087f;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (this.f348082a == null) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.duv, (android.view.ViewGroup) null);
            em.r0 r0Var = new em.r0(inflate);
            this.f348082a = r0Var;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 a17 = r0Var.a();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(inflate.getContext());
            c1162x665295de.Q(0);
            a17.mo7967x900dcbe1(c1162x665295de);
            a17.N(new ft3.c(r0Var));
            a17.mo7960x6cab2c8d(this.f348083b);
        }
        em.r0 r0Var2 = this.f348082a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0Var2);
        android.view.View view = r0Var2.f336275a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "getInflateRootView(...)");
        return view;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        ft3.i iVar = (ft3.i) pVar;
        this.f348087f = iVar;
        em.r0 r0Var = this.f348082a;
        if (r0Var != null) {
            if (r0Var.f336279e == null) {
                r0Var.f336279e = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) r0Var.f336275a.findViewById(com.p314xaae8f345.mm.R.id.f565271i34);
            }
            c1073x7e08a787 = r0Var.f336279e;
        } else {
            c1073x7e08a787 = null;
        }
        if (c1073x7e08a787 != null) {
            c1073x7e08a787.setOnClickListener(iVar != null ? iVar.f348100f : null);
            ((android.graphics.drawable.GradientDrawable) ((jz5.n) this.f348084c).mo141623x754a37bb()).setColor(iVar != null ? iVar.f348101g : 0);
            ((android.graphics.drawable.GradientDrawable) ((jz5.n) this.f348085d).mo141623x754a37bb()).setColor(iVar != null ? iVar.f348102h : 0);
            c1073x7e08a787.setBackground((android.graphics.drawable.StateListDrawable) ((jz5.n) this.f348086e).mo141623x754a37bb());
        }
        em.r0 r0Var2 = this.f348082a;
        if (r0Var2 != null) {
            if (r0Var2.f336276b == null) {
                r0Var2.f336276b = (android.widget.TextView) r0Var2.f336275a.findViewById(com.p314xaae8f345.mm.R.id.okp);
            }
            textView = r0Var2.f336276b;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setMinWidth(iVar != null ? iVar.f348098d : 0);
            textView.setMaxWidth(iVar != null ? iVar.f348099e : Integer.MAX_VALUE);
            textView.setText(iVar != null ? iVar.f348103i : null);
            textView.setMaxLines(iVar != null ? iVar.f348104m : 0);
            textView.setVisibility(iVar != null ? iVar.f348105n : 0);
        }
        em.r0 r0Var3 = this.f348082a;
        if (r0Var3 != null) {
            if (r0Var3.f336278d == null) {
                r0Var3.f336278d = (android.widget.TextView) r0Var3.f336275a.findViewById(com.p314xaae8f345.mm.R.id.s99);
            }
            textView2 = r0Var3.f336278d;
        } else {
            textView2 = null;
        }
        if (textView2 != null) {
            textView2.setMinWidth(iVar != null ? iVar.f348098d : 0);
            textView2.setMaxWidth(iVar != null ? iVar.f348099e : Integer.MAX_VALUE);
            textView2.setText(iVar != null ? iVar.f348106o : null);
            textView2.setMaxLines(iVar != null ? iVar.f348107p : 0);
            textView2.setVisibility(iVar != null ? iVar.f348108q : 8);
        }
        em.r0 r0Var4 = this.f348082a;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 a17 = r0Var4 != null ? r0Var4.a() : null;
        if (a17 != null) {
            a17.setVisibility(iVar != null ? iVar.f348110s : 8);
            java.util.List list = iVar != null ? iVar.f348109r : null;
            ft3.a aVar = this.f348083b;
            aVar.f348075d = list;
            aVar.m8146xced61ae5();
        }
        em.r0 r0Var5 = this.f348082a;
        if (r0Var5 != null) {
            if (r0Var5.f336280f == null) {
                r0Var5.f336280f = (android.widget.TextView) r0Var5.f336275a.findViewById(com.p314xaae8f345.mm.R.id.s9a);
            }
            textView3 = r0Var5.f336280f;
        } else {
            textView3 = null;
        }
        if (textView3 == null) {
            return;
        }
        textView3.setText(iVar != null ? iVar.f348111t : null);
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f348087f;
    }
}
