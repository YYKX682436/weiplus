package com.tencent.mm.plugin.clean.ui.fileindexui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
@ul5.d(0)
/* loaded from: classes12.dex */
public final class CleanCacheUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f95688p = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.listview.AnimatedExpandableListView f95689d;

    /* renamed from: e, reason: collision with root package name */
    public cw1.o0 f95690e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.CancellationSignal f95691f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f95692g = kz5.p0.f313996d;

    /* renamed from: h, reason: collision with root package name */
    public long[] f95693h = new long[21];

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f95694i = cw1.s2.f223305d;

    /* renamed from: m, reason: collision with root package name */
    public long f95695m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f95696n;

    /* renamed from: o, reason: collision with root package name */
    public long f95697o;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488614yn;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.b8_);
        setBackBtn(new cw1.h2(this));
        long[] longArrayExtra = getIntent().getLongArrayExtra("tagsResult");
        if (longArrayExtra == null) {
            longArrayExtra = new long[21];
        }
        this.f95693h = longArrayExtra;
        this.f95689d = (com.tencent.mm.ui.widget.listview.AnimatedExpandableListView) findViewById(com.tencent.mm.R.id.bxa);
        cw1.o0 o0Var = new cw1.o0(this);
        o0Var.h(longArrayExtra);
        this.f95690e = o0Var;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f486799mi1);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ctb);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.crz);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.Button button2 = (android.widget.Button) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.dft);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f95694i = new cw1.y1(o0Var, textView, this, button, button2, findViewById4);
        o0Var.d(true);
        com.tencent.mm.ui.widget.listview.AnimatedExpandableListView animatedExpandableListView = this.f95689d;
        kotlin.jvm.internal.o.d(animatedExpandableListView);
        animatedExpandableListView.setAdapter(o0Var);
        animatedExpandableListView.setOnGroupClickListener(new cw1.z1(o0Var, this));
        animatedExpandableListView.setOnChildClickListener(new cw1.a2(o0Var, this));
        button.setOnClickListener(new cw1.b2(button, o0Var, this));
        button2.setOnClickListener(new cw1.e2(this));
        ku5.u0 u0Var = ku5.t0.f312615d;
        cw1.f2 f2Var = new cw1.f2(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(f2Var, 50L, false);
        long[] jArr = o0Var.f223187e;
        kotlin.jvm.internal.o.g(jArr, "<this>");
        int length = jArr.length;
        java.lang.Long[] lArr = new java.lang.Long[length];
        int length2 = jArr.length;
        for (int i17 = 0; i17 < length2; i17++) {
            lArr[i17] = java.lang.Long.valueOf(jArr[i17]);
        }
        mt1.b0.s(11, 0L, (java.lang.Long[]) java.util.Arrays.copyOf(lArr, length));
        com.tencent.mm.ui.widget.listview.AnimatedExpandableListView animatedExpandableListView2 = this.f95689d;
        kotlin.jvm.internal.o.d(animatedExpandableListView2);
        animatedExpandableListView2.setOnGroupExpandListener(new cw1.g2(o0Var, this));
        android.os.CancellationSignal cancellationSignal = new android.os.CancellationSignal();
        cancellationSignal.setOnCancelListener(cw1.i2.f222989a);
        this.f95691f = cancellationSignal;
        long j17 = this.f95693h[6];
        ((ku5.t0) ku5.t0.f312615d).g(new cw1.m2(cancellationSignal, this, j17));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        android.os.CancellationSignal cancellationSignal = this.f95691f;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        this.f95691f = null;
        super.onDestroy();
    }
}
