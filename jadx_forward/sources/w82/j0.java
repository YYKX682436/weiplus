package w82;

/* loaded from: classes11.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f525423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w82.k0 f525424e;

    public j0(w82.k0 k0Var, android.view.View view) {
        this.f525424e = k0Var;
        this.f525423d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        w82.l0 l0Var = this.f525424e.f525437d.N;
        java.lang.String charSequence = ((android.widget.TextView) this.f525423d).getText().toString();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13620xa33772de c13620xa33772de = ((w82.c0) l0Var).f525363d;
        c13620xa33772de.f183083e.getClass();
        c13620xa33772de.c(c13620xa33772de.f183083e.m79118xdb574fcd());
        java.util.List list = c13620xa33772de.f183084f;
        android.content.Context context = c13620xa33772de.getContext();
        int i17 = -1;
        if (context != null) {
            if (context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cd9).equals(charSequence)) {
                i17 = 21;
            } else if (context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cdf).equals(charSequence)) {
                i17 = 5;
            } else if (context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572744cd1).equals(charSequence)) {
                i17 = 8;
            } else if (context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cda).equals(charSequence)) {
                i17 = 7;
            } else if (context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cde).equals(charSequence)) {
                i17 = 17;
            } else if (context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cdh).equals(charSequence)) {
                i17 = 3;
            } else if (context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cdc).equals(charSequence)) {
                i17 = 18;
            } else if (context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cd_).equals(charSequence)) {
                i17 = 6;
            }
        }
        ((java.util.LinkedList) list).remove(i17);
        c13620xa33772de.b();
        w82.e0 e0Var = c13620xa33772de.f183087i;
        if (e0Var == null) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.j5) e0Var).a(list, c13620xa33772de.f183086h, c13620xa33772de.f183085g, true);
    }
}
