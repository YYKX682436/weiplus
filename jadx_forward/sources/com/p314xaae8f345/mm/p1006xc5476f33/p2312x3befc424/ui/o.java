package com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui;

/* loaded from: classes.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18770xd1a110d4 f256865d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18770xd1a110d4 activityC18770xd1a110d4) {
        this.f256865d = activityC18770xd1a110d4;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
        intent.addFlags(268435456);
        intent.putExtra("android.intent.extra.EMAIL", new java.lang.String[]{"WeChat_Log@qq.com"});
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18770xd1a110d4.f256837i;
        com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18770xd1a110d4 activityC18770xd1a110d4 = this.f256865d;
        java.lang.String string = activityC18770xd1a110d4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i1x);
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18770xd1a110d4.f256837i);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
            java.lang.String str3 = a17.f294812f;
            int lastIndexOf = str3.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                str3 = str3.substring(lastIndexOf + 1);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                int indexOf = str3.indexOf(".");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(string);
                sb6.append("_");
                if (indexOf <= 0) {
                    indexOf = str3.length();
                }
                sb6.append(str3.substring(0, indexOf));
                string = sb6.toString();
            }
        }
        intent.putExtra("android.intent.extra.SUBJECT", string);
        intent.putExtra("android.intent.extra.STREAM", com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(activityC18770xd1a110d4.mo55332x76847179(), new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18770xd1a110d4.f256837i)));
        intent.setType("text/plain");
        com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18770xd1a110d4 activityC18770xd1a110d42 = this.f256865d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC18770xd1a110d42, arrayList2.toArray(), "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC18770xd1a110d42.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC18770xd1a110d42, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
