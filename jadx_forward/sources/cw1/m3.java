package cw1;

/* loaded from: classes12.dex */
public class m3 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw1.j3 f304673d;

    public m3(cw1.j3 j3Var) {
        this.f304673d = j3Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter$3", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter$3", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter$3", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        n11.a.b().n(i17);
        cw1.j3 j3Var = this.f304673d;
        if (i17 != 2) {
            j3Var.f304564n = false;
            j3Var.f304568r.mo50302x6b17ad39(null);
            j3Var.f304568r.mo50307xb9e94560(0, 200L);
        } else {
            j3Var.f304564n = true;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter$3", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
