package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2;

/* loaded from: classes14.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.AbstractC13342x6ac9a618 f179888d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.AbstractC13342x6ac9a618 abstractC13342x6ac9a618) {
        this.f179888d = abstractC13342x6ac9a618;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.AbstractC13342x6ac9a618 abstractC13342x6ac9a618 = this.f179888d;
        if (!abstractC13342x6ac9a618.m78667x564fc359()) {
            yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = abstractC13342x6ac9a618.P;
        if (onMenuItemClickListener != null) {
            abstractC13342x6ac9a618.mo7438x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.c) onMenuItemClickListener).f179886d.mo78409x676b27cd().finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
