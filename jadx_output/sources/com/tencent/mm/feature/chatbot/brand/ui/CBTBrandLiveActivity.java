package com.tencent.mm.feature.chatbot.brand.ui;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/feature/chatbot/brand/ui/CBTBrandLiveActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "feature-chatbot_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes14.dex */
public final class CBTBrandLiveActivity extends com.tencent.mm.ui.MMActivity {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f65279e;

    /* renamed from: f, reason: collision with root package name */
    public ay.l f65280f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f65281g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f65282h;

    /* renamed from: m, reason: collision with root package name */
    public int f65284m;

    /* renamed from: n, reason: collision with root package name */
    public int f65285n;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f65278d = "ChatBot.CBTBrandLiveActivity";

    /* renamed from: i, reason: collision with root package name */
    public final xx.y f65283i = new xx.y();

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488240e01;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e1  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.chatbot.brand.ui.CBTBrandLiveActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.ui.tools.f5 f5Var = this.f65279e;
        if (f5Var != null) {
            f5Var.d();
        }
        a31.m mVar = ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).f452619d;
        if (mVar != null) {
            mVar.j();
        }
        ay.l lVar = this.f65280f;
        if (lVar != null) {
            lVar.P6(false);
        } else {
            kotlin.jvm.internal.o.o("viewModel");
            throw null;
        }
    }
}
