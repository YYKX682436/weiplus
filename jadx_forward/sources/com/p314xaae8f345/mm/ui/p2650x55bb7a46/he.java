package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class he implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f f283229d;

    public he(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f activityC21642xe60a98f) {
        this.f283229d = activityC21642xe60a98f;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        r15.g a17;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f activityC21642xe60a98f = this.f283229d;
        if (itemId == 0) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.lang.CharSequence charSequence = activityC21642xe60a98f.f279865n;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(context, charSequence, charSequence, null);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f.X6(activityC21642xe60a98f);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = activityC21642xe60a98f.f279872u;
            java.lang.CharSequence charSequence2 = activityC21642xe60a98f.f279865n;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f.W6(f9Var, 8, charSequence2 == null ? 0 : charSequence2.length());
            dp.a.m125853x26a183b(activityC21642xe60a98f.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f571894st, 0).show();
            return;
        }
        if (itemId == 1) {
            wl5.x xVar = activityC21642xe60a98f.f279863i;
            if (xVar != null) {
                xVar.i();
                activityC21642xe60a98f.f279863i.f();
                activityC21642xe60a98f.f279863i.l(0, activityC21642xe60a98f.f279858d.getText().length());
                wl5.x xVar2 = activityC21642xe60a98f.f279863i;
                xVar2.M = false;
                xVar2.N = false;
                xVar2.o();
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f.W6(activityC21642xe60a98f.f279872u, 10, 0);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.ge(this), 100L);
            return;
        }
        if (itemId == 2) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f.W6(activityC21642xe60a98f.f279872u, 9, 0);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f.U6(activityC21642xe60a98f, activityC21642xe60a98f.mo55332x76847179(), activityC21642xe60a98f.f279865n);
            return;
        }
        if (itemId != 3) {
            if (itemId != 101) {
                return;
            }
            android.widget.TextView textView = activityC21642xe60a98f.f279858d;
            boolean z17 = textView == null || textView.getText() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(activityC21642xe60a98f.f279865n) || activityC21642xe60a98f.f279858d.getText().length() == activityC21642xe60a98f.f279865n.length();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f activityC21642xe60a98f2 = this.f283229d;
            te5.x0.b(activityC21642xe60a98f2, activityC21642xe60a98f2.f279865n, activityC21642xe60a98f2.f279872u.Q0(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u1(activityC21642xe60a98f.f279872u.V1(), activityC21642xe60a98f.f279872u.Q0()), activityC21642xe60a98f.f279872u.I0(), 4, z17);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(activityC21642xe60a98f.f279865n) && (a17 = r15.h.a(activityC21642xe60a98f.f279860f.toString(), activityC21642xe60a98f.f279865n, ((java.lang.Integer) activityC21642xe60a98f.f279863i.e().first).intValue(), ((java.lang.Integer) activityC21642xe60a98f.f279863i.e().second).intValue())) != null) {
            ok5.d.b(intent, "kPartialQuoteContent", a17, new ok5.h());
        }
        activityC21642xe60a98f.setResult(101, intent);
        activityC21642xe60a98f.finish();
    }
}
