package cw1;

/* loaded from: classes3.dex */
public final class y1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw1.o0 f305042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f305043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d f305044f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f305045g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f305046h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f305047i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(cw1.o0 o0Var, android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d activityC13111x890e232d, android.widget.Button button, android.widget.Button button2, android.view.View view) {
        super(0);
        this.f305042d = o0Var;
        this.f305043e = textView;
        this.f305044f = activityC13111x890e232d;
        this.f305045g = button;
        this.f305046h = button2;
        this.f305047i = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        cw1.o0 o0Var = this.f305042d;
        long f17 = o0Var.f();
        java.lang.String string = this.f305044f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bom, fp.n0.a(f17));
        android.widget.TextView textView = this.f305043e;
        textView.setText(string);
        boolean[] zArr = o0Var.f304721f;
        int length = zArr.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                z17 = true;
                break;
            }
            if (!zArr[i17]) {
                z17 = false;
                break;
            }
            i17++;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        android.widget.Button button = this.f305045g;
        button.setTag(valueOf);
        button.setText(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.aq8 : com.p314xaae8f345.mm.R.C30867xcad56011.f571527hu);
        this.f305046h.setEnabled(f17 > 0);
        textView.setVisibility(f17 > 0 ? 0 : 8);
        android.view.View view = this.f305047i;
        int i18 = o0Var.getGroupCount() <= 0 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheUI$initUI$1", "invoke", "()Ljava/lang/Boolean;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheUI$initUI$1", "invoke", "()Ljava/lang/Boolean;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        button.setEnabled(o0Var.getGroupCount() > 0);
        return java.lang.Boolean.TRUE;
    }
}
