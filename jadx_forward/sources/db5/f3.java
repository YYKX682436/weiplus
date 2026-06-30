package db5;

/* loaded from: classes.dex */
public class f3 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 {
    public final android.widget.TextView L;
    public final android.widget.EditText M;
    public final android.widget.Button N;
    public final android.content.Context P;
    public final int Q;
    public final android.widget.TextView R;

    public f3(android.content.Context context, boolean z17) {
        super(context, 0, 0, z17);
        this.Q = 36;
        this.P = context;
        i(com.p314xaae8f345.mm.R.C30864xbddafb2a.bit);
        this.L = (android.widget.TextView) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.f568864ob2);
        android.widget.EditText editText = (android.widget.EditText) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.d98);
        this.M = editText;
        android.widget.Button button = (android.widget.Button) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.kao);
        this.N = button;
        this.R = (android.widget.TextView) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.dhl);
        android.widget.ImageView imageView = (android.widget.ImageView) this.f293591g.findViewById(com.p314xaae8f345.mm.R.id.f565643d23);
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79678x41464de0, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5)));
        imageView.setContentDescription(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9a));
        imageView.setOnClickListener(new db5.z2(this));
        android.view.View view = this.G;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/MMHalfBottomEditDialog", "<init>", "(Landroid/content/Context;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/base/MMHalfBottomEditDialog", "<init>", "(Landroid/content/Context;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        button.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29));
        button.setBackground(context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562601jy));
        button.setEnabled(false);
        this.G.setOnClickListener(new db5.a3(this));
        editText.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(36), new db5.e3(this)});
        editText.addTextChangedListener(new db5.b3(this));
        A(48);
    }

    public void D() {
        android.widget.Button button = this.N;
        button.setEnabled(false);
        android.content.Context context = this.P;
        button.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29));
        button.setBackground(context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562601jy));
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2
    public int c() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.byn;
    }
}
