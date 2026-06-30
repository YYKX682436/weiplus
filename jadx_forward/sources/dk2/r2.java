package dk2;

/* loaded from: classes.dex */
public final class r2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f315531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f315532e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315533f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f315534g;

    public r2(int i17, int i18, dk2.r4 r4Var, android.content.Context context) {
        this.f315531d = i17;
        this.f315532e = i18;
        this.f315533f = r4Var;
        this.f315534g = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        java.lang.String str = "qqmusic://qq.com/media/playSonglist?p=%7b%22song%22%3a%5b%7b%22type%22%3a%220%22%2c%22songid%22%3a%22" + this.f315531d + "%22%2c%22songmid%22%3a%22" + this.f315532e + "%22%7d%5d%2c%22action%22%3a%22play%22%7d&source=https%3a%2f%2fi.y.qq.com%2fv8%2fplaysong.html%3fADTAG%3dhz_nb_wxzhibo1";
        android.net.Uri parse = android.net.Uri.parse(str);
        dk2.r4 r4Var = this.f315533f;
        if (parse == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r4Var.f315542d, "goQQMusic parse qq music action url fail, url %s", str);
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", parse);
        intent.addFlags(268435456);
        android.content.Context context = this.f315534g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/FinderLiveAssistant$goQQMusic$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/live/model/FinderLiveAssistant$goQQMusic$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4Var.f315542d, "goQQMusic qqMusicActionUrl: %s", str);
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        ml2.j3[] j3VarArr = ml2.j3.f409144d;
        r0Var.Kk(3);
    }
}
