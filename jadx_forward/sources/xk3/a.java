package xk3;

/* loaded from: classes8.dex */
public final class a extends xk3.i {

    /* renamed from: i, reason: collision with root package name */
    public final int f536552i;

    public a(vk3.a aVar) {
        super(com.p314xaae8f345.mm.R.C30864xbddafb2a.bxn, aVar);
        this.f536552i = 4;
    }

    @Override // xk3.i, in5.r
    public void g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String m75945x2fec8307;
        java.lang.String str;
        uk3.a item = (uk3.a) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.p(holder, item, i17, i18, z17, list);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jvb);
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jvj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = item.f510057d;
        r45.lr4 v07 = c16601x7ed0e40c.v0();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16601x7ed0e40c.v0().m75945x2fec8307(8))) {
            wk3.a aVar = wk3.a.f528490a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
            if (v07 == null || (str = v07.m75945x2fec8307(0)) == null) {
                str = "";
            }
            textView.setText(aVar.c(textView, str, this.f536552i));
        }
        jz5.f0 f0Var = null;
        imageView.setImageDrawable(null);
        r45.lr4 v08 = c16601x7ed0e40c.v0();
        if (v08 != null && (m75945x2fec8307 = v08.m75945x2fec8307(5)) != null) {
            vo0.e.f520001b.c(m75945x2fec8307, imageView, this.f536574g);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22643xbdaadc7d c22643xbdaadc7d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22643xbdaadc7d) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.crp);
            c22643xbdaadc7d.setVisibility(0);
            c22643xbdaadc7d.setImageResource(com.p314xaae8f345.mm.R.raw.f81128xd0eae9f9);
        }
    }

    @Override // xk3.i, in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
    }

    @Override // xk3.i
    public java.lang.String n(android.content.Context context, uk3.a item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.String n17 = super.n(context, item);
        boolean z17 = false;
        if (n17 != null) {
            if (n17.length() > 0) {
                z17 = true;
            }
        }
        return z17 ? n17 : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gvb);
    }
}
