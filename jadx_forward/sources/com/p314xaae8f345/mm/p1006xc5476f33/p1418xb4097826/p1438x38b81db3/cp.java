package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class cp extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f184619e;

    public cp(boolean z17) {
        this.f184619e = z17;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b3g;
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        if (this.f184619e) {
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.jru);
            android.content.Context context = holder.f374654e;
            p17.setPadding(0, context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz), 0, context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        }
    }
}
