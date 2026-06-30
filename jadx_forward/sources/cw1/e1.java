package cw1;

/* loaded from: classes12.dex */
public final class e1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db f304425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f304427f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f304428g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f304429h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304430i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db activityC13108x43db50db, android.widget.TextView textView, android.widget.Button button, android.widget.Button button2, android.widget.Button button3, android.view.View view) {
        super(0);
        this.f304425d = activityC13108x43db50db;
        this.f304426e = textView;
        this.f304427f = button;
        this.f304428g = button2;
        this.f304429h = button3;
        this.f304430i = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db activityC13108x43db50db = this.f304425d;
        cw1.t0 t0Var = activityC13108x43db50db.f177189d;
        if (t0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        java.util.Iterator it = t0Var.f304857d.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            j17 += ((cw1.v0) it.next()).f304895d;
        }
        cw1.t0 t0Var2 = activityC13108x43db50db.f177189d;
        if (t0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        int size = t0Var2.f304857d.size();
        java.lang.String string = activityC13108x43db50db.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bom, fp.n0.a(j17));
        android.widget.TextView textView = this.f304426e;
        textView.setText(string);
        textView.setVisibility(j17 > 0 ? 0 : 8);
        cw1.t0 t0Var3 = activityC13108x43db50db.f177189d;
        if (t0Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        java.util.List<cw1.v0> list = t0Var3.f304857d;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            for (cw1.v0 v0Var : list) {
                if (!(v0Var.f304892a < -2 || v0Var.f304894c)) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        this.f304427f.setEnabled(!z17);
        cw1.t0 t0Var4 = activityC13108x43db50db.f177189d;
        if (t0Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        java.util.List<cw1.v0> list2 = t0Var4.f304857d;
        if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
            for (cw1.v0 v0Var2 : list2) {
                if (v0Var2.f304892a >= -2 && (v0Var2.f304894c || v0Var2.f304895d > 0)) {
                    z18 = true;
                    break;
                }
            }
        }
        z18 = false;
        this.f304428g.setEnabled(z18);
        this.f304429h.setEnabled(j17 > 0);
        android.view.View view = this.f304430i;
        int i17 = size <= 0 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$initUI$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$initUI$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f384359a;
    }
}
