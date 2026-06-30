package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class ml implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f214201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.nl f214202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tr f214203f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.pl f214204g;

    public ml(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.nl nlVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tr trVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.pl plVar) {
        this.f214201d = i17;
        this.f214202e = nlVar;
        this.f214203f = trVar;
        this.f214204g = plVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tr trVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderSubtitleSettingBottomSheet$RecycleViewAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.nl nlVar = this.f214202e;
        int i17 = nlVar.f214253d;
        int i18 = this.f214201d;
        if (i18 != i17) {
            java.util.List list = nlVar.f214254e;
            if (list != null && (trVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tr) kz5.n0.a0(list, i17)) != null) {
                trVar.f214683c = false;
                nlVar.m8147xed6e4d18(nlVar.f214253d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tr trVar2 = this.f214203f;
            trVar2.f214683c = true;
            nlVar.m8147xed6e4d18(i18);
            nlVar.f214253d = i18;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.sr srVar = nlVar.f214255f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.pl plVar = this.f214204g;
            if (srVar != null) {
                srVar.a(trVar2, plVar.f214381a);
            }
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a4) ((jz5.n) plVar.f214382b).mo141623x754a37bb()).dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderSubtitleSettingBottomSheet$RecycleViewAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
