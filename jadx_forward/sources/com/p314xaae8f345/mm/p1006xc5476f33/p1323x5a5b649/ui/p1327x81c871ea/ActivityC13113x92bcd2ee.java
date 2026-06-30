package com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseConvUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "cw1/c3", "cw1/d3", "cw1/e3", "app_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingChooseConvUI */
/* loaded from: classes8.dex */
public final class ActivityC13113x92bcd2ee extends com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 {

    /* renamed from: f, reason: collision with root package name */
    public static final cw1.d3 f177252f = new cw1.d3(null);

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f177253d;

    /* renamed from: e, reason: collision with root package name */
    public int f177254e;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e2q;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        mo74406x9c8c0d33(new cw1.f3(this), com.p314xaae8f345.mm.R.raw.f78354xfa054953);
        mo64405x4dab7448(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        java.lang.String str2 = "";
        mo54450xbf7c1df6("");
        java.lang.String[] stringArrayExtra = getIntent().getStringArrayExtra("u");
        long[] longArrayExtra = getIntent().getLongArrayExtra("m");
        if (stringArrayExtra == null || longArrayExtra == null || stringArrayExtra.length != longArrayExtra.length) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Invalid talker or msgId list: ");
            java.lang.String str3 = null;
            if (stringArrayExtra != null) {
                str = java.util.Arrays.toString(stringArrayExtra);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
            } else {
                str = null;
            }
            sb6.append(str);
            sb6.append(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20377xba9c5eaa);
            if (longArrayExtra != null) {
                str3 = java.util.Arrays.toString(longArrayExtra);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "toString(...)");
            }
            sb6.append(str3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CleanChattingChooseConvUI", sb6.toString());
            finish();
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(stringArrayExtra.length);
        int length = stringArrayExtra.length;
        for (int i17 = 0; i17 < length; i17++) {
            arrayList.add(new jz5.l(stringArrayExtra[i17], java.lang.Long.valueOf(longArrayExtra[i17])));
        }
        this.f177253d = arrayList;
        this.f177254e = getIntent().getIntExtra("t", 0);
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.i3p)).mo7960x6cab2c8d(new cw1.c3(this));
        int i18 = this.f177254e;
        int i19 = i18 != 1 ? i18 != 3 ? 2 : 1 : 0;
        java.lang.String[] stringArray = getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559530b4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringArray, "getStringArray(...)");
        java.lang.String[] stringArray2 = getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559528b3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringArray2, "getStringArray(...)");
        java.lang.String stringExtra = getIntent().getStringExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        if (stringExtra == null) {
            java.lang.String str4 = (i19 < 0 || i19 > stringArray.length + (-1)) ? "" : stringArray[i19];
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getOrElse(...)");
            stringExtra = java.lang.String.format(str4, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(longArrayExtra.length)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringExtra, "format(...)");
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("desc");
        if (stringExtra2 != null) {
            str2 = stringExtra2;
        } else if (i19 >= 0 && i19 <= stringArray2.length - 1) {
            str2 = stringArray2[i19];
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.obc);
        textView.setText(stringExtra);
        textView.setContentDescription(stringExtra);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
        textView2.setText(str2);
        textView2.setContentDescription(str2);
        ((v02.f0) ((a00.j) i95.n0.c(a00.j.class))).vj(kz5.z.z0(stringArrayExtra));
    }
}
