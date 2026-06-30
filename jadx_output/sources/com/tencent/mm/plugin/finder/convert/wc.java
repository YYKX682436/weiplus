package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class wc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f104862e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104863f;

    public wc(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, java.lang.String str) {
        this.f104861d = s0Var;
        this.f104862e = baseFinderFeed;
        this.f104863f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshMemberVisitant$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        in5.s0 s0Var = this.f104861d;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if ((nyVar != null ? nyVar.f135380n : 0) == 172) {
            intent.putExtra("key_member_inlet_source", 28);
        } else {
            intent.putExtra("key_member_inlet_source", 27);
        }
        intent.putExtra("key_member_preview_mode", this.f104862e.getForceMemberPreviewMode() ? 1 : 0);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        android.content.Context context2 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        i0Var.Kk(context2, intent, this.f104863f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshMemberVisitant$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
