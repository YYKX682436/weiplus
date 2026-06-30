package xk3;

/* loaded from: classes8.dex */
public final class w extends xk3.i {
    public w(vk3.a aVar) {
        super(com.p314xaae8f345.mm.R.C30864xbddafb2a.bxn, aVar);
    }

    @Override // xk3.i, in5.r
    public void g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        uk3.a item = (uk3.a) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.p(holder, item, i17, i18, z17, list);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.crp);
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jvb);
        jz5.f0 f0Var = null;
        imageView2.setImageDrawable(null);
        imageView.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = item.f510057d;
        java.lang.String m75945x2fec8307 = c16601x7ed0e40c.f66792x98981ec.m75945x2fec8307(5);
        if (m75945x2fec8307 != null) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec8307)) {
                vo0.e.f520001b.c(m75945x2fec8307, imageView2, this.f536574g);
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(holder.f374654e, wk3.a.f528490a.a(c16601x7ed0e40c.f66793x2262335f), com.p314xaae8f345.mm.R.C30859x5a72f63.f77768x20e836));
            imageView.setVisibility(0);
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
        return z17 ? n17 : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gvi);
    }
}
