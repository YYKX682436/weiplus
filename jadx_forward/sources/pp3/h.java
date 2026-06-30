package pp3;

/* loaded from: classes5.dex */
public class h implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.util.Pair f439008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pp3.j f439010f;

    public h(pp3.j jVar, android.util.Pair pair, java.lang.String str) {
        this.f439010f = jVar;
        this.f439008d = pair;
        this.f439009e = str;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 547) {
            ((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).Di(this.f439008d, 2, this.f439009e);
            pp3.j jVar = this.f439010f;
            android.content.Context context = ((android.view.View) jVar.f439015a).getContext();
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bre);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            e4Var.c();
            mp3.m mVar = jVar.f439016b;
            if (mVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui.C16784x72b881cf) mVar).f234428i.dismiss();
            }
            jVar.a();
            jVar.b();
        }
    }
}
