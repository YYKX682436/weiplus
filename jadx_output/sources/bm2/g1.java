package bm2;

/* loaded from: classes3.dex */
public final class g1 {
    public g1(kotlin.jvm.internal.i iVar) {
    }

    public final void a(bm2.h1 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = holder.f21927e;
        mMNeat7extView.setVisibility(0);
        mMNeat7extView.setMaxLines(Integer.MAX_VALUE);
        mMNeat7extView.setEllipsize(null);
        mMNeat7extView.setSpacingAdd(0);
        mMNeat7extView.setOnClickListener(null);
        mMNeat7extView.setClickable(false);
        android.view.View view = holder.f21930h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$Companion", "resetHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$Companion", "resetHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = holder.itemView;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$Companion", "resetHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$Companion", "resetHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view3 = holder.f21931i;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(4);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$Companion", "resetHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$Companion", "resetHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        holder.f21928f.setVisibility(8);
        android.view.View view4 = holder.f21932m;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$Companion", "resetHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$Companion", "resetHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        holder.f21935p.setVisibility(8);
        android.widget.FrameLayout frameLayout = holder.f21933n;
        frameLayout.setVisibility(8);
        frameLayout.removeAllViews();
        android.widget.FrameLayout frameLayout2 = holder.f21934o;
        frameLayout2.setVisibility(8);
        frameLayout2.removeAllViews();
        holder.f21929g.setBackground(holder.itemView.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a1k));
        android.view.ViewParent parent = mMNeat7extView.getParent();
        android.widget.RelativeLayout relativeLayout = parent instanceof android.widget.RelativeLayout ? (android.widget.RelativeLayout) parent : null;
        if (relativeLayout != null) {
            we2.i iVar = we2.o.f445236i;
            int b17 = iVar.b();
            jz5.g gVar = we2.o.f445239l;
            relativeLayout.setPadding(b17, ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue(), iVar.b(), ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue());
        }
    }
}
