package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class ExdeviceBindDeviceGuideUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {
    public java.util.ArrayList A;
    public java.lang.String B;
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;
    public final android.content.BroadcastReceiver F = new com.tencent.mm.plugin.exdevice.ui.z(this);

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f99175d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.ui.b0 f99176e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f99177f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f99178g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f99179h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ScrollView f99180i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f99181m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f99182n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f99183o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f99184p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f99185q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f99186r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f99187s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f99188t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f99189u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f99190v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f99191w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f99192x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f99193y;

    /* renamed from: z, reason: collision with root package name */
    public long f99194z;

    public final void T6(int i17) {
        switch (i17) {
            case 1:
                this.f99177f.setText(getContext().getString(com.tencent.mm.R.string.c2x));
                this.f99178g.setText(getContext().getString(com.tencent.mm.R.string.f491134c26));
                this.f99179h.setText(getContext().getString(com.tencent.mm.R.string.c2y));
                break;
            case 2:
                this.f99177f.setText(getContext().getString(com.tencent.mm.R.string.c2q));
                this.f99178g.setVisibility(8);
                this.f99179h.setText(getContext().getString(com.tencent.mm.R.string.c2p));
                break;
            case 3:
                this.f99181m.setImageResource(com.tencent.mm.R.raw.bluetooth_logo);
                this.f99182n.setText(com.tencent.mm.R.string.c2j);
                this.f99183o.setText(com.tencent.mm.R.string.c28);
                break;
            case 4:
                this.f99181m.setImageResource(com.tencent.mm.R.raw.bluetooth_logo);
                this.f99182n.setText(com.tencent.mm.R.string.c2h);
                this.f99183o.setText("");
                break;
            case 5:
                this.f99181m.setImageResource(com.tencent.mm.R.raw.wifi_logo);
                this.f99182n.setText(com.tencent.mm.R.string.c2j);
                this.f99183o.setText(com.tencent.mm.R.string.c2e);
                break;
            case 6:
                this.f99181m.setImageResource(com.tencent.mm.R.raw.bluetooth_logo);
                this.f99182n.setText(com.tencent.mm.R.string.c2j);
                this.f99183o.setText(com.tencent.mm.R.string.c3j);
                break;
        }
        switch (i17) {
            case 1:
            case 2:
                this.f99181m.setVisibility(8);
                this.f99182n.setVisibility(8);
                this.f99183o.setVisibility(8);
                this.f99175d.setVisibility(0);
                this.f99180i.setVisibility(0);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                this.f99181m.setVisibility(0);
                this.f99182n.setVisibility(0);
                this.f99175d.setVisibility(8);
                this.f99180i.setVisibility(8);
                if (i17 == 4) {
                    this.f99183o.setVisibility(8);
                    return;
                } else {
                    this.f99183o.setVisibility(0);
                    return;
                }
            default:
                return;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a9i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ac  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r6) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getContext().unregisterReceiver(this.F);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
    }
}
