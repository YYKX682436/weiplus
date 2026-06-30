package hr3;

/* loaded from: classes11.dex */
public class ma implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.oa f365332d;

    public ma(hr3.oa oaVar) {
        this.f365332d = oaVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        hr3.oa oaVar = this.f365332d;
        if (itemId == 1) {
            hr3.va vaVar = oaVar.f365392f;
            vaVar.a(vaVar.f365642e.L.d1());
            return;
        }
        if (itemId == 5) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668 = oaVar.f365392f.f365642e;
            android.content.Context context = c16861xdcf09668.f279303d;
            db5.e1.u(context, context.getString(com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(c16861xdcf09668.L.d1()) ? com.p314xaae8f345.mm.R.C30867xcad56011.bfe : com.p314xaae8f345.mm.R.C30867xcad56011.bfd), oaVar.f365392f.f365642e.f279303d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bfc), new hr3.la(this), null);
        } else {
            if (itemId != 8) {
                return;
            }
            hr3.va vaVar2 = oaVar.f365392f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf096682 = vaVar2.f365642e;
            c01.e2.F0(c16861xdcf096682.L);
            c16861xdcf096682.L.r3();
            if (c16861xdcf096682.X) {
                c16861xdcf096682.H1.setVisibility(8);
                vaVar2.f();
            }
        }
    }
}
