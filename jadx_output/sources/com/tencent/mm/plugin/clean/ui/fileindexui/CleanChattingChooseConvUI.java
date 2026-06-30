package com.tencent.mm.plugin.clean.ui.fileindexui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseConvUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "cw1/c3", "cw1/d3", "cw1/e3", "app_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes8.dex */
public final class CleanChattingChooseConvUI extends com.tencent.mm.ui.vas.VASActivity {

    /* renamed from: f, reason: collision with root package name */
    public static final cw1.d3 f95719f = new cw1.d3(null);

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f95720d;

    /* renamed from: e, reason: collision with root package name */
    public int f95721e;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e2q;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        setBackBtn(new cw1.f3(this), com.tencent.mm.R.raw.actionbar_icon_dark_close);
        setActionbarColor(getColor(com.tencent.mm.R.color.aaw));
        java.lang.String str2 = "";
        setMMTitle("");
        java.lang.String[] stringArrayExtra = getIntent().getStringArrayExtra("u");
        long[] longArrayExtra = getIntent().getLongArrayExtra("m");
        if (stringArrayExtra == null || longArrayExtra == null || stringArrayExtra.length != longArrayExtra.length) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Invalid talker or msgId list: ");
            java.lang.String str3 = null;
            if (stringArrayExtra != null) {
                str = java.util.Arrays.toString(stringArrayExtra);
                kotlin.jvm.internal.o.f(str, "toString(...)");
            } else {
                str = null;
            }
            sb6.append(str);
            sb6.append(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG);
            if (longArrayExtra != null) {
                str3 = java.util.Arrays.toString(longArrayExtra);
                kotlin.jvm.internal.o.f(str3, "toString(...)");
            }
            sb6.append(str3);
            com.tencent.mars.xlog.Log.e("MicroMsg.CleanChattingChooseConvUI", sb6.toString());
            finish();
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(stringArrayExtra.length);
        int length = stringArrayExtra.length;
        for (int i17 = 0; i17 < length; i17++) {
            arrayList.add(new jz5.l(stringArrayExtra[i17], java.lang.Long.valueOf(longArrayExtra[i17])));
        }
        this.f95720d = arrayList;
        this.f95721e = getIntent().getIntExtra("t", 0);
        ((androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.i3p)).setAdapter(new cw1.c3(this));
        int i18 = this.f95721e;
        int i19 = i18 != 1 ? i18 != 3 ? 2 : 1 : 0;
        java.lang.String[] stringArray = getResources().getStringArray(com.tencent.mm.R.array.f477997b4);
        kotlin.jvm.internal.o.f(stringArray, "getStringArray(...)");
        java.lang.String[] stringArray2 = getResources().getStringArray(com.tencent.mm.R.array.f477995b3);
        kotlin.jvm.internal.o.f(stringArray2, "getStringArray(...)");
        java.lang.String stringExtra = getIntent().getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (stringExtra == null) {
            java.lang.String str4 = (i19 < 0 || i19 > stringArray.length + (-1)) ? "" : stringArray[i19];
            kotlin.jvm.internal.o.f(str4, "getOrElse(...)");
            stringExtra = java.lang.String.format(str4, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(longArrayExtra.length)}, 1));
            kotlin.jvm.internal.o.f(stringExtra, "format(...)");
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("desc");
        if (stringExtra2 != null) {
            str2 = stringExtra2;
        } else if (i19 >= 0 && i19 <= stringArray2.length - 1) {
            str2 = stringArray2[i19];
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.obc);
        textView.setText(stringExtra);
        textView.setContentDescription(stringExtra);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484050cu2);
        textView2.setText(str2);
        textView2.setContentDescription(str2);
        ((v02.f0) ((a00.j) i95.n0.c(a00.j.class))).vj(kz5.z.z0(stringArrayExtra));
    }
}
