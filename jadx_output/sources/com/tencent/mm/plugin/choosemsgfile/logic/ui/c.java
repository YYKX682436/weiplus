package com.tencent.mm.plugin.choosemsgfile.logic.ui;

/* loaded from: classes12.dex */
public class c extends com.tencent.mm.plugin.choosemsgfile.logic.ui.a {

    /* renamed from: h, reason: collision with root package name */
    public boolean f95530h;

    @Override // com.tencent.mm.plugin.choosemsgfile.logic.ui.a, com.tencent.mm.plugin.choosemsgfile.logic.ui.w
    public boolean o() {
        return this.f95530h;
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        if (i17 != 0) {
            int i18 = wv1.o.f449958s;
            return new wv1.o(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f488604ye, viewGroup, false));
        }
        int i19 = wv1.l.f449953g;
        return new wv1.l(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f488603yd, viewGroup, false));
    }
}
