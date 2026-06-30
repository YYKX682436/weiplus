package com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class BizPCRecentReadUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f94062h = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f94064e;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f94063d = "MicroMsg.BizPCRecentReadUI";

    /* renamed from: f, reason: collision with root package name */
    public final xr1.d f94065f = new xr1.d();

    /* renamed from: g, reason: collision with root package name */
    public final xr1.m f94066g = new xr1.m();

    public final void T6(r45.ip3 ip3Var, boolean z17, yz5.a aVar) {
        if (ip3Var != null) {
            kotlinx.coroutines.l.d(v65.m.b(this), null, null, new vr1.e0(this, ip3Var, z17, aVar, null), 3, null);
        } else {
            com.tencent.mars.xlog.Log.i(this.f94063d, "oldSettingResp == null");
            db5.t7.g(getContext(), getString(com.tencent.mm.R.string.f490748am4));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488220kx;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            return kz5.q1.i(importUIComponents, kz5.z.D0(new java.lang.Class[]{vr1.o.class, vr1.b0.class}));
        }
        return null;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i(this.f94063d, "onCreate");
        this.f94064e = getIntent().getLongExtra("biz_time_line_line_session_id", 0L);
        setMMTitle(getResources().getString(com.tencent.mm.R.string.als));
        hideActionbarLine();
        setBackBtn(new vr1.c0(this));
        ul5.k bounceView = getBounceView();
        if (bounceView != null) {
            bounceView.setBgColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        }
        addIconOptionMenu(0, com.tencent.mm.R.string.f489812cf, com.tencent.mm.R.raw.icons_outlined_more, new vr1.d0(this));
    }
}
