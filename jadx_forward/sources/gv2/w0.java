package gv2;

/* loaded from: classes10.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jv2.i f357623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gv2.c1 f357624e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f357625f;

    public w0(jv2.i iVar, gv2.c1 c1Var, in5.s0 s0Var) {
        this.f357623d = iVar;
        this.f357624e = c1Var;
        this.f357625f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$onBindViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jv2.i iVar = this.f357623d;
        r45.xk m141446x37f6d02b = iVar.f383756d.m141446x37f6d02b();
        in5.s0 s0Var = this.f357625f;
        if (m141446x37f6d02b != null) {
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.String m75945x2fec8307 = m141446x37f6d02b.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            so2.g0.a(iVar, context, m75945x2fec8307, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3) this.f357624e.f357529e).f211905i);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            java.lang.String L0 = iVar.f383756d.L0();
            android.content.Context context2 = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            so2.g0.c(iVar, L0, context2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$onBindViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
