package gx0;

/* loaded from: classes5.dex */
public final class na implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw0.d f358295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f358296e;

    public na(cw0.d dVar, gx0.ac acVar) {
        this.f358295d = dVar;
        this.f358296e = acVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        android.view.View view;
        android.view.View view2;
        ex0.r rVar = (ex0.r) obj;
        ug.m mVar = rVar != null ? rVar.f338702c : null;
        ug.m mVar2 = ug.m.Narration;
        cw0.d dVar = this.f358295d;
        gx0.ac acVar = this.f358296e;
        if (mVar == mVar2) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(rVar, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.movie_composing.timeline.viewmodel.NarrationSegmentViewModel");
            ex0.q qVar = (ex0.q) rVar;
            dVar.getClass();
            android.view.View findViewWithTag = dVar.m122811xfd5faf5d().findViewWithTag(fv0.a.f348480s);
            android.view.View findViewWithTag2 = dVar.m122811xfd5faf5d().findViewWithTag(cw0.a.f304135d);
            android.view.View findViewWithTag3 = dVar.m122811xfd5faf5d().findViewWithTag(fv0.a.f348482u);
            android.view.View findViewWithTag4 = dVar.m122811xfd5faf5d().findViewWithTag(fv0.a.f348483v);
            if (qVar.f338698t != vu0.u.f521697i) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                view = findViewWithTag4;
                view2 = findViewWithTag3;
                yj0.a.d(findViewWithTag, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "showNarrationSegmentEditOption", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/timeline/viewmodel/NarrationSegmentViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewWithTag.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewWithTag, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "showNarrationSegmentEditOption", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/timeline/viewmodel/NarrationSegmentViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewWithTag2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "showNarrationSegmentEditOption", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/timeline/viewmodel/NarrationSegmentViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewWithTag2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewWithTag2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "showNarrationSegmentEditOption", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/timeline/viewmodel/NarrationSegmentViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                view = findViewWithTag4;
                view2 = findViewWithTag3;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewWithTag, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "showNarrationSegmentEditOption", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/timeline/viewmodel/NarrationSegmentViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewWithTag.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewWithTag, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "showNarrationSegmentEditOption", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/timeline/viewmodel/NarrationSegmentViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewWithTag2, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "showNarrationSegmentEditOption", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/timeline/viewmodel/NarrationSegmentViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewWithTag2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewWithTag2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "showNarrationSegmentEditOption", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/timeline/viewmodel/NarrationSegmentViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            boolean z17 = !qVar.I().isEmpty();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
            dVar.B(view2, z17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            dVar.B(view, z17);
            dVar.m122810x3c4152c6().setVisibility(8);
            android.widget.HorizontalScrollView horizontalScrollView = dVar.C;
            if (horizontalScrollView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("containerOfOptContainer");
                throw null;
            }
            horizontalScrollView.setVisibility(0);
            android.view.View view3 = dVar.E;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("longPlayCursor");
                throw null;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "showNarrationSegmentEditOption", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/timeline/viewmodel/NarrationSegmentViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "showNarrationSegmentEditOption", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/timeline/viewmodel/NarrationSegmentViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            gx0.ac.a8(acVar, rVar);
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = qVar.f338700a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c4190xd8dd3713, "null cannot be cast to non-null type com.tencent.maas.moviecomposing.segments.NarrationSegment");
            jz5.g gVar = acVar.C;
            gx0.x4 x4Var = (gx0.x4) ((jz5.n) gVar).mo141623x754a37bb();
            com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = ((com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951) c4190xd8dd3713).f130065a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c3971x241f78, "getSegmentID(...)");
            if (!x4Var.f7(c3971x241f78)) {
                du0.o.o7((gx0.x4) ((jz5.n) gVar).mo141623x754a37bb(), c3971x241f78, false, !acVar.c8().m132411xc00617a4(), 2, null);
            }
        } else {
            dVar.m122810x3c4152c6().setVisibility(0);
            android.widget.HorizontalScrollView horizontalScrollView2 = dVar.C;
            if (horizontalScrollView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("containerOfOptContainer");
                throw null;
            }
            horizontalScrollView2.setVisibility(8);
            android.view.View view4 = dVar.E;
            if (view4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("longPlayCursor");
                throw null;
            }
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view4, arrayList6.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "showNarrationLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "showNarrationLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((gx0.x4) ((jz5.n) acVar.C).mo141623x754a37bb()).U6(false);
        }
        acVar.i8();
    }
}
