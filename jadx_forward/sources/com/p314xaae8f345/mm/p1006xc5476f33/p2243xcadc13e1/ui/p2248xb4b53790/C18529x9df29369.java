package com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790;

/* renamed from: com.tencent.mm.plugin.subapp.ui.openapi.AppHeaderPreference */
/* loaded from: classes8.dex */
public class C18529x9df29369 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.widget.TextView L;
    public android.widget.ImageView M;
    public android.widget.TextView N;
    public android.widget.TextView P;
    public fg4.f Q;
    public boolean R;
    public boolean S;

    public C18529x9df29369(android.content.Context context) {
        super(context);
        this.R = false;
        this.S = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        java.lang.String str;
        this.M = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.cav);
        this.N = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cdv);
        this.L = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cdf);
        this.P = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565422cd0);
        this.S = true;
        fg4.f fVar = this.Q;
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.HeaderPreference", "initView : bindView = " + this.S);
        } else {
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.ActivityC18531x33cf9cfc activityC18531x33cf9cfc = ((fg4.i) fVar).f344009a;
            android.graphics.Bitmap Di = ((kt.c) i0Var).Di(activityC18531x33cf9cfc.f253936d.f67370x28d45f97, 1, i65.a.g(activityC18531x33cf9cfc));
            if (this.M != null && Di != null && !Di.isRecycled()) {
                this.M.setImageBitmap(Di);
            }
            fg4.i iVar = (fg4.i) this.Q;
            iVar.getClass();
            lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.ActivityC18531x33cf9cfc activityC18531x33cf9cfc2 = iVar.f344009a;
            java.lang.String Ui = ((kt.c) i0Var2).Ui(activityC18531x33cf9cfc2.mo55332x76847179(), activityC18531x33cf9cfc2.f253936d);
            if (this.L != null && Ui != null && Ui.length() > 0) {
                this.L.setText(Ui);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.ActivityC18531x33cf9cfc activityC18531x33cf9cfc3 = ((fg4.i) this.Q).f344009a;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC18531x33cf9cfc3.mo55332x76847179();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = activityC18531x33cf9cfc3.f253936d;
            if (mo55332x76847179 == null || mVar == null) {
                str = null;
            } else {
                java.lang.String m17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.m(mo55332x76847179);
                str = m17.equalsIgnoreCase("zh_CN") ? mVar.f67366xc9d6017c : (m17.equalsIgnoreCase("zh_TW") || m17.equalsIgnoreCase("zh_HK")) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f67368xdf183026) ? mVar.f67366xc9d6017c : mVar.f67368xdf183026 : m17.equalsIgnoreCase("en") ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f67367xdf182e4c) ? mVar.f67366xc9d6017c : mVar.f67367xdf182e4c : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f67367xdf182e4c) ? mVar.f67366xc9d6017c : mVar.f67367xdf182e4c;
            }
            if (str != null) {
                this.P.setText(str);
                this.P.setVisibility(0);
            } else {
                this.P.setVisibility(8);
            }
            boolean z17 = this.R;
            if (this.N != null) {
                fg4.i iVar2 = (fg4.i) this.Q;
                iVar2.getClass();
                java.lang.String string = iVar2.f344009a.mo55332x76847179().getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.iwo : com.p314xaae8f345.mm.R.C30867xcad56011.iwu);
                android.content.Context context = this.f279303d;
                if (z17) {
                    if (string == null || string.length() <= 0) {
                        this.N.setVisibility(8);
                    } else {
                        android.widget.TextView textView = this.N;
                        iz5.a.g(null, context != null);
                        textView.setTextColor(new com.p314xaae8f345.mm.ui.p2740x696c9db.gd(context).f291981a[0]);
                        this.N.setText(string);
                        this.N.setCompoundDrawablesWithIntrinsicBounds(com.p314xaae8f345.mm.R.C30861xcebc809e.bni, 0, 0, 0);
                    }
                } else if (string == null || string.length() <= 0) {
                    this.N.setVisibility(8);
                } else {
                    this.N.setTextColor(com.p314xaae8f345.mm.ui.p2740x696c9db.gd.a(context));
                    this.N.setText(string);
                    this.N.setCompoundDrawablesWithIntrinsicBounds(com.p314xaae8f345.mm.R.C30861xcebc809e.bnh, 0, 0, 0);
                }
            }
        }
        super.t(view);
    }

    public C18529x9df29369(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.R = false;
        this.S = false;
    }

    public C18529x9df29369(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.R = false;
        this.S = false;
    }
}
