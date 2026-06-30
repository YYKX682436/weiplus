package jw2;

/* loaded from: classes9.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1654xc5476f33.p1655x373aa5.C15207xe9913b6c f383844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f383845e;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1654xc5476f33.p1655x373aa5.C15207xe9913b6c c15207xe9913b6c, int i17) {
        this.f383844d = c15207xe9913b6c;
        this.f383845e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/plugin/view/RecordTypeSelectView$RecordTypeAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((jw2.f) this.f383844d.f212330m).mo146xb9724478(java.lang.Integer.valueOf(this.f383845e));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/plugin/view/RecordTypeSelectView$RecordTypeAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
