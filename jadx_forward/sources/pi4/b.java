package pi4;

/* loaded from: classes11.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.p2270x5c4d208.C18602xa9b36ec3 f436356d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.p2270x5c4d208.C18602xa9b36ec3 c18602xa9b36ec3) {
        this.f436356d = c18602xa9b36ec3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/error/TopicErrorLayout$update$1$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mj4.h hVar = (mj4.h) view.getTag();
        java.lang.Integer valueOf = hVar != null ? java.lang.Integer.valueOf(((mj4.k) hVar).f408600b.f76549x29d3a50c) : null;
        if (valueOf != null && valueOf.intValue() == 5) {
            oj4.j.f427348a.d(hVar);
        }
        this.f436356d.removeView(view);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/topic/error/TopicErrorLayout$update$1$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
