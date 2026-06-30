package cf2;

/* loaded from: classes3.dex */
public class h extends com.tencent.mm.ui.widget.dialog.z2 {
    public final android.view.ViewGroup L;
    public final android.widget.EditText M;
    public final android.widget.Button N;
    public final android.content.Context P;
    public final android.widget.TextView Q;
    public android.view.View.OnClickListener R;
    public final com.tencent.mm.ui.tools.f5 S;

    public h(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        super(context, 0, 0, false);
        this.P = context;
        i(com.tencent.mm.R.layout.c8i);
        this.L = (android.view.ViewGroup) this.f212058g.findViewById(com.tencent.mm.R.id.coi);
        android.widget.EditText editText = (android.widget.EditText) this.f212058g.findViewById(com.tencent.mm.R.id.d98);
        this.M = editText;
        android.widget.Button button = (android.widget.Button) this.f212058g.findViewById(com.tencent.mm.R.id.kao);
        this.N = button;
        button.setText(str4);
        this.Q = (android.widget.TextView) this.f212058g.findViewById(com.tencent.mm.R.id.dhl);
        ((android.widget.TextView) this.f212058g.findViewById(com.tencent.mm.R.id.odf)).setText(str);
        ((android.widget.TextView) this.f212058g.findViewById(com.tencent.mm.R.id.nqq)).setText(str2);
        android.widget.Button button2 = (android.widget.Button) this.f212058g.findViewById(com.tencent.mm.R.id.f484110d23);
        button2.setText(str3);
        button2.setContentDescription(context.getResources().getString(com.tencent.mm.R.string.b9a));
        button2.setOnClickListener(new cf2.a(this));
        android.view.View view = this.G;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5((android.app.Activity) context);
        this.S = f5Var;
        f5Var.f210400e = new cf2.e(this, context);
        f5Var.f();
        l(new cf2.f(this));
    }

    public void D() {
        android.widget.Button button = this.N;
        button.setEnabled(true);
        android.content.Context context = this.P;
        button.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478838io));
        button.setBackground(context.getDrawable(com.tencent.mm.R.drawable.f481057jk));
    }

    @Override // com.tencent.mm.ui.widget.dialog.z2
    public int c() {
        return com.tencent.mm.R.layout.byn;
    }
}
