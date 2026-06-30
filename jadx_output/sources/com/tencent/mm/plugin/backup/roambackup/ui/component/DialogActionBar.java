package com.tencent.mm.plugin.backup.roambackup.ui.component;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018B\u001b\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010¨\u0006\u001a"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/component/DialogActionBar;", "Landroid/widget/FrameLayout;", "", "resId", "Ljz5/f0;", "setCancelButtonText", "Ljava/lang/Runnable;", "cb", "setCancelButtonCallback", "setCancelRadio", "setCancelBack", "setCancelClose", "textId", "setFinishButtonText", "setFinishCallback", "setTitle", "", "txt", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DialogActionBar extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f92746d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Runnable f92747e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.Button f92748f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.Button f92749g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f92750h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f92751i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f92752m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogActionBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2, 17));
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.duq, (android.view.ViewGroup) this, true);
        android.view.View childAt = getChildAt(0);
        kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.rih);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById;
        this.f92748f = button;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.rif);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.Button button2 = (android.widget.Button) findViewById2;
        this.f92749g = button2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.rig);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById3;
        this.f92750h = weImageView;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.rii);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f92751i = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.rij);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f92752m = (android.widget.TextView) findViewById5;
        button.setOnClickListener(new wo1.c1(this));
        button2.setOnClickListener(new wo1.d1(this));
        weImageView.setOnClickListener(new wo1.e1(this));
    }

    public final void a(int i17, java.lang.Runnable cb6, int i18) {
        kotlin.jvm.internal.o.g(cb6, "cb");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f92750h;
        weImageView.setVisibility(0);
        weImageView.s(i17, i18);
        this.f92749g.setVisibility(8);
        this.f92746d = cb6;
    }

    public final void setCancelBack(java.lang.Runnable cb6) {
        kotlin.jvm.internal.o.g(cb6, "cb");
        a(com.tencent.mm.R.drawable.bu7, cb6, com.tencent.mm.R.color.FG_0);
    }

    public final void setCancelButtonCallback(java.lang.Runnable cb6) {
        kotlin.jvm.internal.o.g(cb6, "cb");
        this.f92750h.setVisibility(8);
        this.f92749g.setVisibility(0);
        this.f92746d = cb6;
    }

    public final void setCancelButtonText(int i17) {
        this.f92749g.setText(getContext().getString(i17));
    }

    public final void setCancelClose(java.lang.Runnable cb6) {
        kotlin.jvm.internal.o.g(cb6, "cb");
        a(com.tencent.mm.R.drawable.bu9, cb6, com.tencent.mm.R.color.FG_0);
    }

    public final void setCancelRadio(java.lang.Runnable cb6) {
        kotlin.jvm.internal.o.g(cb6, "cb");
        a(com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.drawable.bdg : com.tencent.mm.R.drawable.bdh, cb6, com.tencent.mm.R.color.a9e);
    }

    public final void setFinishButtonText(int i17) {
        this.f92748f.setText(getContext().getString(i17));
    }

    public final void setFinishCallback(java.lang.Runnable cb6) {
        kotlin.jvm.internal.o.g(cb6, "cb");
        this.f92751i.setVisibility(8);
        this.f92748f.setVisibility(0);
        this.f92747e = cb6;
    }

    public final void setTitle(int i17) {
        java.lang.String string = getContext().getString(i17);
        android.widget.TextView textView = this.f92752m;
        textView.setText(string);
        textView.setVisibility(0);
    }

    public final void setTitle(java.lang.String txt) {
        kotlin.jvm.internal.o.g(txt, "txt");
        android.widget.TextView textView = this.f92752m;
        textView.setText(txt);
        textView.setVisibility(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogActionBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
