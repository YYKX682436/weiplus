package e33;

/* loaded from: classes10.dex */
public class o4 implements t23.q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f328957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 f328958b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 f328959c;

    public o4(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078) {
        this.f328959c = activityC15656x6f26b561;
        this.f328957a = j17;
        this.f328958b = abstractC15633xee433078;
    }

    @Override // t23.q2
    public void a(t23.r2 r2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561 = this.f328959c;
        if (r2Var.m165765xb2c87fbf(activityC15656x6f26b561.X.getTag())) {
            activityC15656x6f26b561.X.setTag(null);
        }
        if (r2Var.f496789e != activityC15656x6f26b561.f220126o.intValue()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b = r2Var.f496792h;
        boolean isEmpty = android.text.TextUtils.isEmpty(c15635xf0ea441b.f219977v);
        int i17 = com.p314xaae8f345.mm.R.C30859x5a72f63.f561083ab1;
        if (isEmpty) {
            java.lang.String string = activityC15656x6f26b561.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573720fj5);
            android.view.View view = activityC15656x6f26b561.V;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$30", "get", "(Lcom/tencent/mm/plugin/gallery/model/VideoAnalysisTask;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$30", "get", "(Lcom/tencent/mm/plugin/gallery/model/VideoAnalysisTask;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            activityC15656x6f26b561.U.setText(string);
            activityC15656x6f26b561.F.setEnabled(false);
            activityC15656x6f26b561.D.setEnabled(false);
            activityC15656x6f26b561.F.setTextColor(activityC15656x6f26b561.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561083ab1));
            if (activityC15656x6f26b561.f220124m.size() == 0) {
                activityC15656x6f26b561.X6(false);
                return;
            }
            return;
        }
        int i18 = c15635xf0ea441b.f219979x;
        if (i18 >= activityC15656x6f26b561.f220115f2 || (i18 > 0 && i18 < activityC15656x6f26b561.f220119h2)) {
            android.view.View view2 = activityC15656x6f26b561.V;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$30", "get", "(Lcom/tencent/mm/plugin/gallery/model/VideoAnalysisTask;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$30", "get", "(Lcom/tencent/mm/plugin/gallery/model/VideoAnalysisTask;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            activityC15656x6f26b561.U.setText(c15635xf0ea441b.f219979x >= activityC15656x6f26b561.f220115f2 ? activityC15656x6f26b561.f220117g2 : activityC15656x6f26b561.f220121i2);
            activityC15656x6f26b561.F.setEnabled(false);
            activityC15656x6f26b561.D.setEnabled(false);
            activityC15656x6f26b561.F.setTextColor(activityC15656x6f26b561.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561083ab1));
            if (activityC15656x6f26b561.f220124m.size() == 0) {
                activityC15656x6f26b561.X6(false);
            }
        } else {
            activityC15656x6f26b561.F.setEnabled(true);
            activityC15656x6f26b561.D.setEnabled(true);
            activityC15656x6f26b561.F.setTextColor(activityC15656x6f26b561.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
            android.view.View view3 = activityC15656x6f26b561.V;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$30", "get", "(Lcom/tencent/mm/plugin/gallery/model/VideoAnalysisTask;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$30", "get", "(Lcom/tencent/mm/plugin/gallery/model/VideoAnalysisTask;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (t21.d3.s() && activityC15656x6f26b561.L == 3 && activityC15656x6f26b561.f220130q && this.f328957a > j33.d0.h()) {
            boolean contains = activityC15656x6f26b561.f220125n.contains(this.f328958b);
            activityC15656x6f26b561.F.setEnabled(contains);
            activityC15656x6f26b561.D.setEnabled(contains);
            android.widget.TextView textView = activityC15656x6f26b561.F;
            android.content.res.Resources resources = activityC15656x6f26b561.getResources();
            if (contains) {
                i17 = com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0;
            }
            textView.setTextColor(resources.getColor(i17));
            android.view.View view4 = activityC15656x6f26b561.V;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$30", "get", "(Lcom/tencent/mm/plugin/gallery/model/VideoAnalysisTask;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$30", "get", "(Lcom/tencent/mm/plugin/gallery/model/VideoAnalysisTask;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (activityC15656x6f26b561.f220124m.size() == 0) {
                activityC15656x6f26b561.X6(false);
            }
        }
    }
}
