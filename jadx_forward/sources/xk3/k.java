package xk3;

/* loaded from: classes8.dex */
public final class k extends xk3.i {
    public k(vk3.a aVar) {
        super(com.p314xaae8f345.mm.R.C30864xbddafb2a.bxn, aVar);
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String m75945x2fec8307;
        uk3.a item = (uk3.a) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.p(holder, item, i17, i18, z17, list);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22643xbdaadc7d c22643xbdaadc7d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22643xbdaadc7d) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jvb);
        jz5.f0 f0Var = null;
        c22643xbdaadc7d.setImageDrawable(null);
        r45.lr4 v07 = item.f510057d.v0();
        if (v07 != null && (m75945x2fec8307 = v07.m75945x2fec8307(5)) != null) {
            vo0.e.f520001b.c(m75945x2fec8307, c22643xbdaadc7d, this.f536574g);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22643xbdaadc7d c22643xbdaadc7d2 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22643xbdaadc7d) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.crp);
            c22643xbdaadc7d2.setVisibility(0);
            c22643xbdaadc7d2.setImageResource(com.p314xaae8f345.mm.R.raw.f79372x58047973);
        }
    }

    @Override // xk3.i
    public java.lang.String n(android.content.Context context, uk3.a item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.String m75945x2fec8307 = item.f510057d.v0().m75945x2fec8307(0);
        return m75945x2fec8307 == null ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o9w) : m75945x2fec8307;
    }
}
