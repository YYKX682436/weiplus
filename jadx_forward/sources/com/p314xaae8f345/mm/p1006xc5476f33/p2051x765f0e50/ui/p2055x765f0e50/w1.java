package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ViewOnClickListenerC17386xd1d83869 f243214d;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ViewOnClickListenerC17386xd1d83869 viewOnClickListenerC17386xd1d83869) {
        this.f243214d = viewOnClickListenerC17386xd1d83869;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ViewOnClickListenerC17386xd1d83869 viewOnClickListenerC17386xd1d83869 = this.f243214d;
        if (!com.p314xaae8f345.mm.vfs.w6.j(viewOnClickListenerC17386xd1d83869.f241702h)) {
            dp.a.m125854x26a183b(viewOnClickListenerC17386xd1d83869.mo55332x76847179(), viewOnClickListenerC17386xd1d83869.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ipv), 1).show();
            return;
        }
        java.lang.String str = q75.c.d() + "hdImg_" + kk.k.g(viewOnClickListenerC17386xd1d83869.f241701g.getBytes()) + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
        com.p314xaae8f345.mm.vfs.w6.c(viewOnClickListenerC17386xd1d83869.f241702h, str);
        q75.c.f(str, viewOnClickListenerC17386xd1d83869.mo55332x76847179());
        dp.a.m125854x26a183b(viewOnClickListenerC17386xd1d83869.mo55332x76847179(), viewOnClickListenerC17386xd1d83869.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.frx, q75.c.d()), 1).show();
    }
}
