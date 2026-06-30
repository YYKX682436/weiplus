package ls2;

/* loaded from: classes2.dex */
public final class g extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public static final ls2.b f402561e = new ls2.b(null);

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b7a;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ls2.a item = (ls2.a) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        int color = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ie) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ie.class)).f205344p ? context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560655ql) : context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560654qk);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.jge);
        xc2.p0 p0Var = item.f402553d;
        textView.setText(p0Var.f534767a.m76523x98b23862());
        textView.setTextColor(color);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("type:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = p0Var.f534767a;
        sb6.append(c19786x6a1e2862.m76480xe2ee1ca3());
        sb6.append(", ext_info:");
        sb6.append(c19786x6a1e2862.m76489xefafd82());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ProfileMenuConvert", sb6.toString());
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).I).mo141623x754a37bb()).a(new mn2.q3(f402561e.b(context, c19786x6a1e2862), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e));
        a17.f529406d = new ls2.d(color);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.jgr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
        ((wo0.b) a17).c((android.widget.ImageView) p17);
        holder.f3639x46306858.setOnClickListener(new ls2.e(holder, item));
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        ym5.a1.h(itemView, new ls2.f(holder, item));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        int color = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ie) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ie.class)).f205344p ? context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560655ql) : context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560654qk);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.jgr);
        c22699x3dcdb352.setLayerPaint(null);
        c22699x3dcdb352.m82040x7541828(color);
    }
}
