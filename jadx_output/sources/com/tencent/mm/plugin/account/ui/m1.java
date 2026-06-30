package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class m1 {

    /* renamed from: a, reason: collision with root package name */
    public android.widget.TextView f74025a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f74026b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f74027c;

    /* renamed from: d, reason: collision with root package name */
    public du5.c f74028d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.z2 f74029e;

    /* renamed from: g, reason: collision with root package name */
    public wd0.c1 f74031g;

    /* renamed from: f, reason: collision with root package name */
    public boolean f74030f = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f74032h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f74033i = 3;

    public static wd0.e1 a(com.tencent.mm.plugin.account.ui.m1 m1Var, int i17, java.lang.String str) {
        m1Var.getClass();
        wd0.e1 e1Var = new wd0.e1();
        e1Var.f444703a = i17;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        e1Var.f444704b = str;
        e1Var.f444706d = "";
        return e1Var;
    }

    public void b(android.content.Context context, boolean z17) {
        if (!z17) {
            if (this.f74032h) {
                this.f74029e.q(context.getString(com.tencent.mm.R.string.p2o));
                return;
            }
            this.f74026b.setVisibility(8);
            this.f74025a.setVisibility(0);
            this.f74027c.setIconColor(context.getColor(com.tencent.mm.R.color.f478520a84));
            return;
        }
        if (this.f74032h) {
            this.f74029e.q(context.getString(com.tencent.mm.R.string.ozq));
            this.f74029e.r(context, com.tencent.mm.R.color.Red_100);
        } else {
            this.f74026b.setVisibility(0);
            this.f74025a.setVisibility(8);
            this.f74027c.setIconColor(context.getColor(com.tencent.mm.R.color.Red_100));
        }
    }
}
