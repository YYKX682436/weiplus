package com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3097xac8f1cfd;

/* renamed from: com.tencent.tmassistantsdk.openSDK.opensdktomsdk.component.PopDialog */
/* loaded from: classes13.dex */
public class DialogC26715xfebdfad9 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 {

    /* renamed from: DIALOG_STYLE_MUL_BTN */
    public static final int f56456x86f47bbc = 2;

    /* renamed from: DIALOG_STYLE_SINGLE_BTN */
    public static final int f56457x8dc12b4a = 1;
    protected static final java.lang.String TAG = "PopDialog";

    /* renamed from: contentLayout */
    protected android.widget.RelativeLayout f56458xdf921d03;

    /* renamed from: contentView */
    protected android.widget.TextView f56459xe8cefebe;

    /* renamed from: downloadProgressBar */
    public android.widget.ProgressBar f56460xdd1330fe;

    /* renamed from: downloadText */
    public android.widget.TextView f56461x421afdd5;

    /* renamed from: mContext */
    protected android.content.Context f56462xd6cfe882;

    /* renamed from: negativeBtn */
    private android.widget.Button f56463x114691e7;

    /* renamed from: positiveBtn */
    protected android.widget.Button f56464xf82cfda3;

    /* renamed from: positiveLayout */
    protected android.widget.FrameLayout f56465x8bab6283;

    /* renamed from: rTool */
    public com.p314xaae8f345.p3085x8ea91595.p3105x36f002.Res f56466x66e552a;

    /* renamed from: style */
    protected int f56467x68b1db1;

    /* renamed from: titleView */
    protected android.widget.TextView f56468x80b3e51d;

    public DialogC26715xfebdfad9(android.content.Context context) {
        super(context);
        this.f56467x68b1db1 = 0;
        this.f56468x80b3e51d = null;
        this.f56458xdf921d03 = null;
        this.f56459xe8cefebe = null;
        this.f56464xf82cfda3 = null;
        this.f56465x8bab6283 = null;
        this.f56460xdd1330fe = null;
        this.f56461x421afdd5 = null;
        this.f56466x66e552a = null;
        this.f56463x114691e7 = null;
        this.f56462xd6cfe882 = context;
    }

    /* renamed from: initHeaderView */
    private void m105121xac73b002() {
        this.f56468x80b3e51d.setPadding(px(30), 0, px(30), 0);
        this.f56458xdf921d03.setPadding(px(30), 0, px(30), px(30));
        this.f56459xe8cefebe.setPadding(0, px(30), 0, px(30));
    }

    /* renamed from: initMulDialog */
    private void m105122xc2c61afc() {
        this.f56463x114691e7.setHeight(px(78));
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f56463x114691e7.getLayoutParams();
        marginLayoutParams.setMargins(0, 0, px(30), 0);
        this.f56463x114691e7.setLayoutParams(marginLayoutParams);
        this.f56464xf82cfda3.setHeight(px(78));
        this.f56464xf82cfda3.setTextSize(px(30));
        this.f56460xdd1330fe.setMinimumHeight(px(78));
        this.f56461x421afdd5.setHeight(px(78));
    }

    /* renamed from: initSingleDialog */
    private void m105123x33c2b8e0() {
        this.f56465x8bab6283.setVisibility(8);
        this.f56463x114691e7.setHeight(px(78));
        this.f56463x114691e7.setText(this.f56462xd6cfe882.getString(this.f56466x66e552a.m105529xcad56011("white_list_submit")));
    }

    private int px(int i17) {
        int m105125xe946cf29 = m105125xe946cf29();
        int m105126xd6cf2784 = m105126xd6cf2784();
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, " width = " + m105126xd6cf2784 + "  height = " + m105125xe946cf29);
        if (m105125xe946cf29 <= m105126xd6cf2784) {
            m105125xe946cf29 = m105126xd6cf2784;
        }
        int i18 = (int) ((i17 * (m105125xe946cf29 + 0.0f)) / 1280.0f);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "rtn" + i17 + ":" + i18);
        return i18;
    }

    /* renamed from: relayoutView */
    private void m105124x3fb42f62() {
        m105121xac73b002();
        int i17 = this.f56467x68b1db1;
        if (i17 == 1) {
            m105123x33c2b8e0();
        } else {
            if (i17 != 2) {
                return;
            }
            m105122xc2c61afc();
        }
    }

    /* renamed from: getScreenHeight */
    public int m105125xe946cf29() {
        android.content.Context context = this.f56462xd6cfe882;
        if (context != null) {
            return context.getResources().getDisplayMetrics().heightPixels;
        }
        return 0;
    }

    /* renamed from: getScreenWidth */
    public int m105126xd6cf2784() {
        android.content.Context context = this.f56462xd6cfe882;
        if (context != null) {
            return context.getResources().getDisplayMetrics().widthPixels;
        }
        return 0;
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.Res res = new com.p314xaae8f345.p3085x8ea91595.p3105x36f002.Res(this.f56462xd6cfe882);
        this.f56466x66e552a = res;
        super.setContentView(res.m105528xbddafb2a("com_tencent_tmassistant_sdk_white_list_dlg"));
        super.getWindow().setLayout(px(662), px(662));
        setCancelable(false);
        this.f56468x80b3e51d = (android.widget.TextView) findViewById(this.f56466x66e552a.id("dlg_title_tv"));
        this.f56458xdf921d03 = (android.widget.RelativeLayout) findViewById(this.f56466x66e552a.id("content"));
        this.f56459xe8cefebe = (android.widget.TextView) findViewById(this.f56466x66e552a.id("dlg_body_tv"));
        this.f56464xf82cfda3 = (android.widget.Button) findViewById(this.f56466x66e552a.id("positive_btn"));
        this.f56465x8bab6283 = (android.widget.FrameLayout) findViewById(this.f56466x66e552a.id("positive_btn_frame_layout"));
        this.f56460xdd1330fe = (android.widget.ProgressBar) findViewById(this.f56466x66e552a.id("download_pb"));
        this.f56461x421afdd5 = (android.widget.TextView) findViewById(this.f56466x66e552a.id("progress_txt_tv"));
        this.f56463x114691e7 = (android.widget.Button) findViewById(this.f56466x66e552a.id("negtive_btn"));
        m105124x3fb42f62();
    }

    /* renamed from: setContent */
    public void m105127xe9f5bdb7(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f56459xe8cefebe.setText(str);
    }

    /* renamed from: setNegativeBtnClickListener */
    public void m105128x80c96e37(android.view.View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            this.f56463x114691e7.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: setNegativeBtnText */
    public void m105129x21ad6af2(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f56463x114691e7.setText(str);
    }

    /* renamed from: setPositiveBtnBgResource */
    public void m105130xf12f0e34(int i17) {
        if (i17 != 0) {
            this.f56464xf82cfda3.setBackgroundResource(i17);
        }
    }

    /* renamed from: setPositiveBtnClickListener */
    public void m105131x11c8f3fb(android.view.View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            this.f56464xf82cfda3.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: setPositiveBtnEnable */
    public void m105132x9179cc4(boolean z17) {
        android.widget.Button button = this.f56464xf82cfda3;
        if (button != null) {
            button.setEnabled(z17);
        }
    }

    /* renamed from: setPositiveBtnTag */
    public void m105133x322f77f9(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26716x46bbe528 c26716x46bbe528) {
        if (c26716x46bbe528 != null) {
            this.f56464xf82cfda3.setTag(c26716x46bbe528);
        }
    }

    /* renamed from: setPositiveBtnText */
    public void m105134x13bf98ae(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f56461x421afdd5.setText(str);
    }

    /* renamed from: setTitle */
    public void m105135x53bfe316(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f56468x80b3e51d.setText(str);
    }

    public DialogC26715xfebdfad9(android.content.Context context, int i17) {
        super(context, i17);
        this.f56467x68b1db1 = 0;
        this.f56468x80b3e51d = null;
        this.f56458xdf921d03 = null;
        this.f56459xe8cefebe = null;
        this.f56464xf82cfda3 = null;
        this.f56465x8bab6283 = null;
        this.f56460xdd1330fe = null;
        this.f56461x421afdd5 = null;
        this.f56466x66e552a = null;
        this.f56463x114691e7 = null;
        this.f56462xd6cfe882 = context;
    }

    public DialogC26715xfebdfad9(android.content.Context context, int i17, int i18) {
        super(context, i17);
        this.f56468x80b3e51d = null;
        this.f56458xdf921d03 = null;
        this.f56459xe8cefebe = null;
        this.f56464xf82cfda3 = null;
        this.f56465x8bab6283 = null;
        this.f56460xdd1330fe = null;
        this.f56461x421afdd5 = null;
        this.f56466x66e552a = null;
        this.f56463x114691e7 = null;
        this.f56462xd6cfe882 = context;
        this.f56467x68b1db1 = i18;
    }
}
