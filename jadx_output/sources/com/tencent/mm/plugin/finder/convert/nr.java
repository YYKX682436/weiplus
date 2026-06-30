package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public class nr extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.tl f104120e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f104121f;

    public nr(com.tencent.mm.plugin.finder.feed.tl contract) {
        kotlin.jvm.internal.o.g(contract, "contract");
        this.f104120e = contract;
        this.f104121f = jz5.h.b(com.tencent.mm.plugin.finder.convert.lr.f103944d);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b4i;
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.f483373ah4);
        jz5.g gVar = this.f104121f;
        android.view.ViewGroup.LayoutParams layoutParams = p17.getLayoutParams();
        layoutParams.height = a06.d.b((((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() / 16.0f) * 9.0f);
        com.tencent.mars.xlog.Log.i("FinderNewStyleBigCardConvert", "onCreateViewHolder: screenWidth=" + ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() + ", height=" + layoutParams.height);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ah7);
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
    }

    public com.tencent.mm.plugin.finder.feed.tl n() {
        return this.f104120e;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x038a  */
    @Override // in5.r
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r23, so2.u1 r24, int r25, int r26, boolean r27, java.util.List r28) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.nr.h(in5.s0, so2.u1, int, int, boolean, java.util.List):void");
    }
}
