package wt1;

/* loaded from: classes15.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f530835a;

    /* renamed from: b, reason: collision with root package name */
    public tt1.j f530836b;

    /* renamed from: c, reason: collision with root package name */
    public int f530837c = 3;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f530838d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public xt1.b f530839e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f530840f;

    public k(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f530835a = abstractActivityC21394xb3d2c0cf;
    }

    public final void a() {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        int i17 = this.f530836b.s0().f470098x;
        java.util.List list = this.f530838d;
        if (i17 >= 1 && this.f530840f == null) {
            xt1.b bVar = new xt1.b();
            bVar.f537976t = 1;
            if (android.text.TextUtils.isEmpty(this.f530836b.s0().Y)) {
                bVar.f461376d = c(com.p314xaae8f345.mm.R.C30867xcad56011.ari);
            } else {
                bVar.f461376d = this.f530836b.s0().Y;
            }
            bVar.f461377e = "";
            bVar.f461378f = "";
            bVar.f461379g = "card://jump_shop_list";
            ((java.util.ArrayList) list).add(bVar);
            return;
        }
        if (this.f530836b.s0().f470098x < 1 || (arrayList = this.f530840f) == null || arrayList.size() < 1) {
            return;
        }
        xt1.b bVar2 = new xt1.b();
        bVar2.f537976t = 1;
        r45.nu nuVar = (r45.nu) this.f530840f.get(0);
        if (!android.text.TextUtils.isEmpty(this.f530836b.s0().Y)) {
            bVar2.f461376d = this.f530836b.s0().Y;
        } else if (this.f530836b.o()) {
            bVar2.f461376d = c(com.p314xaae8f345.mm.R.C30867xcad56011.ari);
        } else if (nuVar.f463212n >= 5000.0f) {
            bVar2.f461376d = c(com.p314xaae8f345.mm.R.C30867xcad56011.ari);
        } else {
            if (this.f530836b.s0().f470098x == 1 || this.f530840f.size() == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailDataMgr", "shop_count is 1 or mShopList size is 1");
                return;
            }
            bVar2.f461376d = c(com.p314xaae8f345.mm.R.C30867xcad56011.aro);
        }
        if (!this.f530836b.o() || nuVar.f463212n >= 2000.0f) {
            bVar2.f461377e = "";
        } else {
            int i18 = this.f530836b.s0().f470098x;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f530835a;
            if (i18 > 1 || ((arrayList2 = this.f530840f) != null && arrayList2.size() > 1)) {
                bVar2.f461377e = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572334au5, lu1.a0.D(abstractActivityC21394xb3d2c0cf, nuVar.f463212n));
            } else {
                bVar2.f461377e = lu1.a0.D(abstractActivityC21394xb3d2c0cf, nuVar.f463212n);
            }
        }
        bVar2.f461378f = "";
        bVar2.f461379g = "card://jump_shop_list";
        ((java.util.ArrayList) list).add(bVar2);
    }

    public xt1.b b() {
        int i17;
        xt1.b bVar = new xt1.b();
        bVar.f537976t = 1;
        boolean z17 = lu1.a0.u(this.f530837c) || lu1.a0.w(this.f530837c) || (i17 = this.f530837c) == 23 ? !(!this.f530836b.d0() || this.f530836b.s0().P == null || android.text.TextUtils.isEmpty(this.f530836b.s0().P.f456400d) || android.text.TextUtils.isEmpty(this.f530836b.s0().f470081g)) : !(i17 != 6 || !this.f530836b.y() || this.f530836b.s0().P == null || android.text.TextUtils.isEmpty(this.f530836b.s0().P.f456400d) || android.text.TextUtils.isEmpty(this.f530836b.s0().f470081g));
        bVar.f537978v = z17;
        if (!z17 && !android.text.TextUtils.isEmpty(this.f530836b.s0().H)) {
            bVar.f461376d = this.f530836b.s0().H;
        } else if (c01.e2.J(this.f530836b.s0().f470081g)) {
            bVar.f461376d = c(com.p314xaae8f345.mm.R.C30867xcad56011.au8);
            bVar.f537978v = false;
        } else {
            bVar.f461376d = c(com.p314xaae8f345.mm.R.C30867xcad56011.au7);
            if (this.f530836b.s0().P == null || this.f530836b.s0().P.f456401e != 1) {
                bVar.f537979w = false;
            } else {
                bVar.f537979w = true;
            }
        }
        if (!android.text.TextUtils.isEmpty(this.f530836b.s0().f470077J)) {
            bVar.f461377e = this.f530836b.s0().f470077J;
        }
        bVar.f461378f = "";
        bVar.f461379g = "card://jump_service";
        this.f530839e = bVar;
        return bVar;
    }

    public final java.lang.String c(int i17) {
        return this.f530835a.getString(i17);
    }

    public java.lang.String d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!android.text.TextUtils.isEmpty(this.f530836b.s0().f470101y)) {
            sb6.append(this.f530836b.s0().f470101y);
        } else if (this.f530836b.o()) {
            sb6.append(c(com.p314xaae8f345.mm.R.C30867xcad56011.f572332au3));
        } else if (this.f530836b.d()) {
            sb6.append(c(com.p314xaae8f345.mm.R.C30867xcad56011.f572320as3));
        } else if (this.f530836b.X()) {
            sb6.append(c(com.p314xaae8f345.mm.R.C30867xcad56011.arm));
        } else if (this.f530836b.Q()) {
            sb6.append(c(com.p314xaae8f345.mm.R.C30867xcad56011.asa));
        } else if (this.f530836b.m0()) {
            sb6.append(c(com.p314xaae8f345.mm.R.C30867xcad56011.atc));
        }
        return sb6.toString();
    }
}
