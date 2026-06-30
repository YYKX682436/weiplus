package com.tencent.mm.plugin.brandservice.ui.userinfo.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/userinfo/ui/BrandServiceUserInfoManageUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/j", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BrandServiceUserInfoManageUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f94554h = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f94555d = 251658241;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f94556e = jz5.h.b(new com.tencent.mm.plugin.brandservice.ui.userinfo.ui.l(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f94557f = jz5.h.b(new com.tencent.mm.plugin.brandservice.ui.userinfo.ui.k(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f94558g = jz5.h.b(com.tencent.mm.plugin.brandservice.ui.userinfo.ui.p.f94582d);

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488251o5;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f94555d = getIntent().getIntExtra("intent_service_type", 251658241);
        setMMTitle("");
        setBackBtn(new com.tencent.mm.plugin.brandservice.ui.userinfo.ui.m(this));
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j9_);
        android.text.TextPaint paint = textView != null ? textView.getPaint() : null;
        if (paint != null) {
            paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        }
        android.text.TextPaint paint2 = textView != null ? textView.getPaint() : null;
        if (paint2 != null) {
            paint2.setStrokeWidth(0.8f);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.f483456ax0);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f483457ax1);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.awz);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.awt);
        jz5.g gVar = this.f94557f;
        ((xm3.t0) ((jz5.n) gVar).getValue()).B = (com.tencent.mm.plugin.brandservice.ui.userinfo.ui.o) ((jz5.n) this.f94558g).getValue();
        recyclerView.setAdapter((xm3.t0) ((jz5.n) gVar).getValue());
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
        ((com.tencent.mm.plugin.mvvmlist.MvvmList) ((jz5.n) this.f94556e).getValue()).f152071u.observe(this, new com.tencent.mm.plugin.brandservice.ui.userinfo.ui.n(this, recyclerView, findViewById, findViewById2, progressBar));
        if (this.f94555d == 1) {
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.j9_)).setText(getString(com.tencent.mm.R.string.n67));
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.awy)).setText(getString(com.tencent.mm.R.string.f490765n65));
        }
    }
}
