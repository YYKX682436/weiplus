package ox3;

/* loaded from: classes10.dex */
public final class s extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f431307e;

    public s(yz5.p onClickRingtone) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClickRingtone, "onClickRingtone");
        this.f431307e = onClickRingtone;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570951dd5;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        t45.f fVar;
        vx3.i a17;
        t45.o0 o0Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        ox3.g item = (ox3.g) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        item.mo2128x1ed62e84();
        java.util.Objects.toString(list != null ? list.get(0) : null);
        t45.n0 n0Var = item.f431282d;
        t45.g gVar2 = n0Var.f497150f;
        if (gVar2 == null || (fVar = gVar2.f497093d) == null || (a17 = qx3.d.a(fVar.f497082d)) == null || (o0Var = n0Var.f497155n) == null || (gVar = o0Var.f497158d) == null) {
            return;
        }
        bw5.lb0 mo11468x92b714fd = new bw5.lb0().mo11468x92b714fd(gVar.f273689a);
        long j17 = mo11468x92b714fd.f111251i / 1000;
        java.lang.String b17 = mo11468x92b714fd.b();
        java.lang.String b18 = b17 == null || b17.length() == 0 ? a17.f522827k : mo11468x92b714fd.b();
        ((android.widget.CheckBox) holder.p(com.p314xaae8f345.mm.R.id.btf)).setChecked(item.f431286h);
        ((android.widget.CheckBox) holder.p(com.p314xaae8f345.mm.R.id.btf)).setOnCheckedChangeListener(new ox3.q(item, this, holder, i17));
        boolean[] zArr = mo11468x92b714fd.f111257r;
        holder.s(com.p314xaae8f345.mm.R.id.odf, zArr[3] ? mo11468x92b714fd.f111248f : "");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.cl7);
        if (imageView != null) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            ya2.l lVar = ya2.l.f542035a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b18);
            lVar.k(b18, imageView, a17.e());
        }
        holder.s(com.p314xaae8f345.mm.R.id.ptx, zArr[4] ? mo11468x92b714fd.f111249g : "");
        long j18 = 60;
        java.lang.String format = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf((j17 % 3600) / j18), java.lang.Long.valueOf(j17 % j18)}, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        holder.s(com.p314xaae8f345.mm.R.id.f565672d55, format);
        holder.f3639x46306858.setOnClickListener(new ox3.r(item, holder, this, i17));
        n(holder);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    public final void n(in5.s0 s0Var) {
        boolean isChecked = ((android.widget.CheckBox) s0Var.p(com.p314xaae8f345.mm.R.id.btf)).isChecked();
        android.view.View view = s0Var.f3639x46306858;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((java.lang.Object) ((android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.odf)).getText());
        sb6.append(", ");
        sb6.append((java.lang.Object) ((android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.ptx)).getText());
        sb6.append(", ");
        sb6.append((java.lang.Object) ((android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.f565672d55)).getText());
        sb6.append(", ");
        sb6.append(s0Var.f374654e.getString(isChecked ? com.p314xaae8f345.mm.R.C30867xcad56011.d_ : com.p314xaae8f345.mm.R.C30867xcad56011.f571376db));
        view.setContentDescription(sb6.toString());
    }
}
