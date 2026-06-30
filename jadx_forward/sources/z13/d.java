package z13;

/* loaded from: classes12.dex */
public final class d implements com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z13.f f550928a;

    public d(z13.f fVar) {
        this.f550928a = fVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.s0
    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.v2 v2Var, boolean z17, boolean z18, java.lang.Boolean bool, boolean z19, boolean z27) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar2;
        z13.f fVar = this.f550928a;
        if (z19) {
            z13.f.T6(this.f550928a, bool, z17, false, 4, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
            if (!bool.booleanValue() || (vVar2 = fVar.f550932e) == null) {
                return;
            }
            vVar2.x();
            return;
        }
        if (z19 || bool.booleanValue()) {
            return;
        }
        if (!fVar.f7() && (vVar = fVar.f550932e) != null) {
            android.content.Context context = vVar.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.FTSMainUI");
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 activityC15607x502bbbb2 = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) context;
            android.view.View r17 = activityC15607x502bbbb2.mo78514x143f1b92().r(com.p314xaae8f345.mm.R.id.u8s);
            if (r17 != null && r17.getVisibility() == 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(r17, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "hideControlBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                r17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(r17, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "hideControlBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View r18 = activityC15607x502bbbb2.mo78514x143f1b92().r(com.p314xaae8f345.mm.R.id.u8q);
                if (r18 != null) {
                    r18.requestLayout();
                }
            }
        }
        z13.f.T6(this.f550928a, java.lang.Boolean.FALSE, false, true, 2, null);
    }
}
