package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf;

/* loaded from: classes11.dex */
public final class q extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.p f254780e;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.u mOnItemClickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mOnItemClickListener, "mOnItemClickListener");
        this.f254780e = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.p(mOnItemClickListener);
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cz6;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        lj4.e item = (lj4.e) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.oqh)).setText(item.f400516d);
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        android.view.WindowManager windowManager = activity.getWindowManager();
        android.content.res.Resources resources = activity.getResources();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) holder.p(com.p314xaae8f345.mm.R.id.m8m);
        float min = java.lang.Math.min(windowManager.getDefaultDisplay().getWidth(), windowManager.getDefaultDisplay().getHeight()) - resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561843u7);
        float dimension = resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561844u8);
        float dimension2 = resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561842u6);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(activity, (int) ((min + dimension2) / (dimension + dimension2)));
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.mo7967x900dcbe1(c1161x57298f5d);
        }
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.textstatus.convert.dowhat.DoWhatItemGroupConvert$buildItemConverts$1
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    return type == 0 ? new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.o(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.q.this.f254780e) : new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.o(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.q.this.f254780e);
                }
            }, item.f400517e, false));
        }
        ((android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.f78309xcc53afe2)).setBackground(context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b6i));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
