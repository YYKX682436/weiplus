package lu1;

/* loaded from: classes15.dex */
public abstract class r {
    public static void a(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, lu1.q qVar) {
        db5.e1.K(abstractActivityC21394xb3d2c0cf, true, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.arq), "", abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new lu1.i(qVar), new lu1.j());
    }

    public static void b(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, java.lang.String str, java.lang.String str2, lu1.q qVar) {
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571902t2);
        }
        db5.e1.K(abstractActivityC21394xb3d2c0cf, true, str2, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new lu1.g(qVar, str), new lu1.h());
    }

    public static void c(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aw9);
        }
        e(abstractActivityC21394xb3d2c0cf, str, false);
    }

    public static void d(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, java.lang.String str, int i17) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = "errcode = " + i17;
        }
        e(abstractActivityC21394xb3d2c0cf, str, false);
    }

    public static void e(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, java.lang.String str, boolean z17) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aw9);
        }
        db5.e1.G(abstractActivityC21394xb3d2c0cf, str, null, false, new lu1.k(z17, abstractActivityC21394xb3d2c0cf));
    }

    public static void f(android.content.Context context, int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 r17;
        if (i17 == -1) {
            return;
        }
        if (i17 == com.p314xaae8f345.mm.R.C30864xbddafb2a.ra) {
            java.lang.String string = context.getResources().getString(i18);
            java.lang.String string2 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.at8);
            lu1.n nVar = new lu1.n();
            android.view.View inflate = ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(i17, (android.view.ViewGroup) null);
            if (i17 == com.p314xaae8f345.mm.R.C30864xbddafb2a.r_) {
                ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565118bc2)).setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.arf, android.text.TextUtils.isEmpty(str) ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572320as3) : str));
            } else if (i17 == com.p314xaae8f345.mm.R.C30864xbddafb2a.f569896r9) {
                ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565118bc2)).setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.are, android.text.TextUtils.isEmpty(str) ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572320as3) : str));
            }
            r17 = db5.e1.w(context, string, string2, inflate, nVar);
        } else {
            java.lang.String string3 = context.getResources().getString(i18);
            java.lang.String string4 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ati);
            java.lang.String string5 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.at8);
            lu1.o oVar = new lu1.o(context);
            lu1.f fVar = new lu1.f();
            android.view.View inflate2 = ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(i17, (android.view.ViewGroup) null);
            if (i17 == com.p314xaae8f345.mm.R.C30864xbddafb2a.r_) {
                ((android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.f565118bc2)).setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.arf, android.text.TextUtils.isEmpty(str) ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572320as3) : str));
            } else if (i17 == com.p314xaae8f345.mm.R.C30864xbddafb2a.f569896r9) {
                ((android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.f565118bc2)).setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.are, android.text.TextUtils.isEmpty(str) ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572320as3) : str));
            }
            r17 = db5.e1.r(context, string3, inflate2, string4, string5, oVar, fVar);
        }
        if (r17 != null) {
            r17.show();
        }
    }
}
