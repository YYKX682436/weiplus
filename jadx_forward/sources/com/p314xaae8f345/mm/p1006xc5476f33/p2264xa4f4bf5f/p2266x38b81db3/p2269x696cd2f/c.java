package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f;

/* loaded from: classes8.dex */
public final class c extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f254791e;

    public c(yz5.a aVar) {
        this.f254791e = aVar;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.czx;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        nj4.b item = (nj4.b) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.h5z);
        imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78922x61de8d17);
        hj4.b i19 = ai4.m0.f86706a.i();
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.om8);
        int a17 = i19.a();
        java.lang.String str2 = "";
        android.content.Context context = holder.f374654e;
        textView.setText(a17 != 1 ? a17 != 2 ? "" : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jw_) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jwa, java.lang.Integer.valueOf(i19.f363194b)));
        if (i19.f363194b > 0) {
            str2 = i19.f363195c;
        } else {
            hj4.a aVar = i19.f363193a;
            if (aVar != null && (str = aVar.f363192a) != null) {
                str2 = str;
            }
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView, str2, 0.1f);
        android.view.View view = holder.f3639x46306858;
        android.widget.FrameLayout frameLayout = view instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) view : null;
        if (frameLayout != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            java.util.ArrayList arrayList = ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac.class)).f255260e;
            if (arrayList.size() > 1) {
                arrayList.get(0);
            }
            frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        }
        holder.p(com.p314xaae8f345.mm.R.id.f567022hv2).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.b(holder, this));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.f567022hv2);
        float b17 = i65.a.b(recyclerView.getContext(), 4);
        boolean z17 = (4 & 12) != 0;
        boolean z18 = (12 & 8) != 0;
        if (p17 != null) {
            p17.setOutlineProvider(new bk4.e2(z17, z18, b17));
        }
        if (p17 == null) {
            return;
        }
        p17.setClipToOutline(true);
    }
}
