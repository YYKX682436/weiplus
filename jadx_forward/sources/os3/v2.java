package os3;

/* loaded from: classes8.dex */
public class v2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429765e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f429766f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429767g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f429768h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16937x774df189 f429769i;

    public v2(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16937x774df189 c16937x774df189, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, boolean z17) {
        this.f429769i = c16937x774df189;
        this.f429764d = str;
        this.f429765e = str2;
        this.f429766f = i17;
        this.f429767g = str3;
        this.f429768h = z17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/MailAttachListLinearLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16937x774df189 c16937x774df189 = this.f429769i;
        android.content.Intent intent = new android.content.Intent(c16937x774df189.f236424d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16930x4222da3c.class);
        intent.putExtra("attach_name", this.f429764d);
        intent.putExtra("mail_id", c16937x774df189.f236426f);
        intent.putExtra("attach_id", this.f429765e);
        intent.putExtra("total_size", this.f429766f);
        java.lang.String str = this.f429767g;
        intent.putExtra("attach_url", str);
        c16937x774df189.getClass();
        intent.putExtra("is_compress", str != null && str.contains("/cgi-bin/viewcompress"));
        intent.putExtra("is_preview", 0);
        intent.putExtra("qqmail_cookie", com.p314xaae8f345.p3210x3857dc.d.g().a(ks3.k0.c()));
        intent.putExtra("is_big_attach", this.f429768h);
        android.content.Context context = c16937x774df189.f236424d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/qqmail/ui/MailAttachListLinearLayout$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/qqmail/ui/MailAttachListLinearLayout$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/MailAttachListLinearLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
