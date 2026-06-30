package com.tencent.mm.plugin.clean.ui.fileindexui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheProgressUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "Lyv1/b0;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
@ul5.d(0)
/* loaded from: classes12.dex */
public final class CleanCacheProgressUI extends com.tencent.mm.ui.vas.VASActivity implements yv1.b0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f95673q = 0;

    /* renamed from: d, reason: collision with root package name */
    public final yv1.b1 f95674d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f95675e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ProgressBar f95676f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f95677g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f95678h;

    /* renamed from: i, reason: collision with root package name */
    public int f95679i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f95680m;

    /* renamed from: n, reason: collision with root package name */
    public long f95681n;

    /* renamed from: o, reason: collision with root package name */
    public long f95682o;

    /* renamed from: p, reason: collision with root package name */
    public int f95683p;

    public CleanCacheProgressUI() {
        i95.m c17 = i95.n0.c(c01.f8.class);
        kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.clean.CleanService");
        this.f95674d = (yv1.b1) c17;
        this.f95675e = jz5.h.b(cw1.m1.f223136d);
        this.f95679i = -1;
        this.f95680m = "";
    }

    public final boolean U6() {
        return ((java.lang.Boolean) ((jz5.n) this.f95675e).getValue()).booleanValue();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        android.view.View view = this.f95678h;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingLayout");
            throw null;
        }
        if (view.getVisibility() == 0) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[6];
            lVarArr[0] = new jz5.l("storage_ui_version", java.lang.Integer.valueOf(U6() ? 2 : 1));
            lVarArr[1] = new jz5.l("storage_enter_scene", java.lang.Integer.valueOf(this.f95683p));
            yv1.g1 a17 = yv1.g1.f466040p.a(this.f95679i);
            lVarArr[2] = new jz5.l("storage_manage_sessionid", a17 != null ? a17.f466043b : null);
            lVarArr[3] = new jz5.l("cache_remove_sessionid", this.f95680m);
            lVarArr[4] = new jz5.l("cache_removed_size", java.lang.Long.valueOf(this.f95681n));
            lVarArr[5] = new jz5.l("cache_remove_size", java.lang.Long.valueOf(this.f95682o));
            ((cy1.a) rVar).Hj("cache_remove_back", "view_clk", kz5.c1.k(lVarArr), 32903);
        }
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e2l;
    }

    @Override // yv1.b0
    public void j4(boolean z17, boolean z18, long j17, long j18) {
        ((ku5.t0) ku5.t0.f312615d).B(new cw1.r1(this, j17, j18, z17, z18));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01da  */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r38) {
        /*
            Method dump skipped, instructions count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheProgressUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f95674d.aj(this);
        super.onDestroy();
    }
}
