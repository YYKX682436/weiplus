package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class ho extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b2v;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        jo2.c item = (jo2.c) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.i3k);
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        android.view.View O6 = ((com.tencent.mm.plugin.finder.member.preview.k) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.member.preview.k.class)).O6();
        if (O6.getParent() != null) {
            android.view.ViewParent parent = O6.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(O6);
        }
        viewGroup.addView(O6);
    }
}
