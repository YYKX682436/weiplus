package tr2;

/* loaded from: classes2.dex */
public final class j implements sr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f502918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tr2.l f502919b;

    public j(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, tr2.l lVar) {
        this.f502918a = interfaceC4987x84e327cb;
        this.f502919b = lVar;
    }

    @Override // sr.b
    public void a(int i17) {
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f502918a;
        if (interfaceC4987x84e327cb.E0() || i17 == 1) {
            tr2.l lVar = this.f502919b;
            android.content.res.Resources resources = lVar.f502923b.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561267dr);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561197c2);
            hc2.f1.z(lVar.f502932k, interfaceC4987x84e327cb, new tr2.h(dimensionPixelSize), new tr2.i(dimensionPixelSize2));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 c15276x168ec665 = lVar.f502932k;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c15276x168ec665, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c15276x168ec665, arrayList2.toArray(), "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen$onPreviewEmojiChanged$1", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c15276x168ec665.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c15276x168ec665, "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen$onPreviewEmojiChanged$1", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(c15276x168ec665, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
