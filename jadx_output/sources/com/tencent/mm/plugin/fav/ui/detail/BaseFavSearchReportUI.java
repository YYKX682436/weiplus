package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public abstract class BaseFavSearchReportUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {

    /* renamed from: d, reason: collision with root package name */
    public boolean f100603d = false;

    /* renamed from: e, reason: collision with root package name */
    public v82.b f100604e;

    /* renamed from: f, reason: collision with root package name */
    public long f100605f;

    public void U6(int i17) {
        if (this.f100603d) {
            this.f100604e.f434070d = ((int) (java.lang.System.currentTimeMillis() - this.f100605f)) / 1000;
            v82.b bVar = this.f100604e;
            bVar.f434067a = i17;
            bVar.b();
        }
        if (i17 == 3) {
            ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).qc(5);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1) {
            ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).wi();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f100604e = new v82.b();
        this.f100603d = this.f100604e.d((r45.fq0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ri(this, 1, 17, r45.fq0.class));
        this.f100605f = java.lang.System.currentTimeMillis();
        this.f100604e.f434073g = v82.b.a();
        this.f100604e.f434077k = this.f100605f;
    }
}
