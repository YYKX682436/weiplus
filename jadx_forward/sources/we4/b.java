package we4;

/* loaded from: classes11.dex */
public class b implements r35.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.ui.ActivityC18458x8428a09d f526820a;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.ui.ActivityC18458x8428a09d activityC18458x8428a09d) {
        this.f526820a = activityC18458x8428a09d;
    }

    @Override // r35.d2
    public void a(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.ui.ActivityC18458x8428a09d activityC18458x8428a09d = this.f526820a;
        java.lang.String c17 = lz.a.c(activityC18458x8428a09d.f253363d, i17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
            return;
        }
        ((java.util.ArrayList) activityC18458x8428a09d.f253364e).remove(c17);
        activityC18458x8428a09d.f253363d.Q(activityC18458x8428a09d.f253364e);
        lz.f fVar = activityC18458x8428a09d.f253363d.M;
        if (fVar != null) {
            ((r35.u1) fVar).f450807f.h();
        }
        c01.e2.E0(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(c17, true));
        ve4.g.a(40);
    }

    @Override // r35.d2
    public void b(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
    }

    @Override // r35.d2
    public void c(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.ui.ActivityC18458x8428a09d activityC18458x8428a09d = this.f526820a;
        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC18458x8428a09d.f253364e, ",");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", activityC18458x8428a09d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571467fx));
        intent.putExtra("list_type", 1);
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288315c, 1024));
        intent.putExtra("always_select_contact", c17);
        j45.l.v(activityC18458x8428a09d, ".ui.contact.SelectContactUI", intent, 0);
    }

    @Override // r35.d2
    public void d(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        this.f526820a.f253363d.N();
    }

    @Override // r35.d2
    public void e(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.ui.ActivityC18458x8428a09d activityC18458x8428a09d = this.f526820a;
        java.lang.String c17 = lz.a.c(activityC18458x8428a09d.f253363d, i17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", c17);
        j45.l.j(activityC18458x8428a09d, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
    }
}
