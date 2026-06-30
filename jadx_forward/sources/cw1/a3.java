package cw1;

/* loaded from: classes12.dex */
public class a3 implements cw1.b3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f304251a = java.lang.System.currentTimeMillis();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304252b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304253c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f304254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304256f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304257g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f304258h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304259i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f304260j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194 f304261k;

    public a3(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194 abstractActivityC13112xefd3d194, android.widget.TextView textView, android.view.View view, long j17, android.view.View view2, android.widget.TextView textView2, android.widget.TextView textView3, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, android.view.View view3, int i17) {
        this.f304261k = abstractActivityC13112xefd3d194;
        this.f304252b = textView;
        this.f304253c = view;
        this.f304254d = j17;
        this.f304255e = view2;
        this.f304256f = textView2;
        this.f304257g = textView3;
        this.f304258h = z2Var;
        this.f304259i = view3;
        this.f304260j = i17;
    }

    public long a(boolean z17, long j17) {
        android.widget.TextView textView = this.f304252b;
        textView.setVisibility(0);
        android.view.View view = this.f304253c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI$4", "onDone", "(ZJ)J", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI$4", "onDone", "(ZJ)J", "android/view/View_EXEC_", "setVisibility", "(I)V");
        long j18 = this.f304254d;
        long j19 = j17 > j18 ? j18 : j17;
        android.widget.TextView textView2 = this.f304257g;
        android.widget.TextView textView3 = this.f304256f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.f304258h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194 abstractActivityC13112xefd3d194 = this.f304261k;
        if (z17) {
            android.view.View view2 = this.f304255e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI$4", "onDone", "(ZJ)J", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI$4", "onDone", "(ZJ)J", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView3.setText(abstractActivityC13112xefd3d194.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b8k));
            textView2.setText(abstractActivityC13112xefd3d194.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d4c, fp.n0.a(j19), fp.n0.a(j18 - j19)));
            textView.setTextColor(abstractActivityC13112xefd3d194.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abs));
            z2Var.x(0);
            z2Var.y(abstractActivityC13112xefd3d194.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
        } else {
            android.view.View view3 = this.f304259i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI$4", "onDone", "(ZJ)J", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI$4", "onDone", "(ZJ)J", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView3.setText(abstractActivityC13112xefd3d194.getString(this.f304260j == 1 ? com.p314xaae8f345.mm.R.C30867xcad56011.d1e : com.p314xaae8f345.mm.R.C30867xcad56011.d1f));
            textView2.setText(abstractActivityC13112xefd3d194.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572450d74, fp.n0.a(j19)));
            z2Var.x(1);
            z2Var.y(abstractActivityC13112xefd3d194.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d1x));
        }
        java.util.Objects.requireNonNull(z2Var);
        z2Var.F = new v61.C30646x56d4592(z2Var);
        return j19;
    }

    public void b(int i17, int i18) {
        if (i18 <= 0) {
            i18 = 1;
        }
        if (i17 > i18) {
            i17 = i18;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f304251a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194 abstractActivityC13112xefd3d194 = this.f304261k;
        if (currentTimeMillis > com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
            this.f304257g.setText(abstractActivityC13112xefd3d194.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d4a, java.lang.Long.valueOf(((((currentTimeMillis / i17) * i18) - currentTimeMillis) / 60000) + 1)));
        }
        this.f304256f.setText(abstractActivityC13112xefd3d194.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b8w, java.lang.Integer.valueOf((i17 * 100) / i18)));
    }
}
