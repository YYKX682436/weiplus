package i12;

/* loaded from: classes15.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i12.d f368764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f368765e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i12.s f368766f;

    public p(i12.s sVar, i12.d dVar, int i17) {
        this.f368766f = sVar;
        this.f368764d = dVar;
        this.f368765e = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/adapter/EmojiStoreV2PersonAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i12.q qVar = this.f368766f.f368774r;
        if (qVar != null) {
            android.view.View view2 = this.f368764d.f368735b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.AbstractC13342x6ac9a618 abstractC13342x6ac9a618 = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.AbstractC13342x6ac9a618) qVar;
            int i17 = this.f368765e;
            if (i17 < 0) {
                abstractC13342x6ac9a618.getClass();
            } else if (i17 < ((i12.s) abstractC13342x6ac9a618.f179779u).t()) {
                abstractC13342x6ac9a618.o0(abstractC13342x6ac9a618.f179779u.getItem(i17), i17);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV2PersonAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
