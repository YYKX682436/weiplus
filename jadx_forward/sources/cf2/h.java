package cf2;

/* loaded from: classes3.dex */
public class h extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 {
    public final android.view.ViewGroup L;
    public final android.widget.EditText M;
    public final android.widget.Button N;
    public final android.content.Context P;
    public final android.widget.TextView Q;
    public android.view.View.OnClickListener R;
    public final com.p314xaae8f345.mm.ui.p2740x696c9db.f5 S;

    public h(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        super(context, 0, 0, false);
        this.P = context;
        i(com.p314xaae8f345.mm.R.C30864xbddafb2a.c8i);
        this.L = (android.view.ViewGroup) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.coi);
        android.widget.EditText editText = (android.widget.EditText) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.d98);
        this.M = editText;
        android.widget.Button button = (android.widget.Button) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.kao);
        this.N = button;
        button.setText(str4);
        this.Q = (android.widget.TextView) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.dhl);
        ((android.widget.TextView) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.odf)).setText(str);
        ((android.widget.TextView) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.nqq)).setText(str2);
        android.widget.Button button2 = (android.widget.Button) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.f565643d23);
        button2.setText(str3);
        button2.setContentDescription(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9a));
        button2.setOnClickListener(new cf2.a(this));
        android.view.View view = this.G;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/ui/NoticeCancelEditTipsDialog", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/ui/NoticeCancelEditTipsDialog", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D();
        this.G.setOnClickListener(new cf2.b(this));
        button.setOnClickListener(new cf2.c(this));
        editText.addTextChangedListener(new cf2.d(this));
        A(48);
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5((android.app.Activity) context);
        this.S = f5Var;
        f5Var.f291933e = new cf2.e(this, context);
        f5Var.f();
        l(new cf2.f(this));
    }

    public void D() {
        android.widget.Button button = this.N;
        button.setEnabled(true);
        android.content.Context context = this.P;
        button.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560371io));
        button.setBackground(context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562590jk));
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2
    public int c() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.byn;
    }
}
