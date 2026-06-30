package yf2;

/* loaded from: classes10.dex */
public final class v0 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.z0 f543333d;

    public v0(yf2.z0 z0Var) {
        this.f543333d = z0Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        android.content.Intent intent;
        ya2.p1 p1Var;
        android.content.Intent intent2;
        android.content.Intent intent3;
        android.content.Intent intent4;
        android.content.Intent intent5;
        r45.ze2 ze2Var = (r45.ze2) obj;
        yf2.z0 z0Var = this.f543333d;
        ya2.p1 p1Var2 = z0Var.f543357m;
        if (p1Var2 == null) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = z0Var.N6();
            if (N6 != null && (intent5 = N6.getIntent()) != null) {
                intent5.putExtra("saveLocation", false);
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N62 = z0Var.N6();
            if (N62 != null && (intent4 = N62.getIntent()) != null) {
                intent4.putExtra("show_city", false);
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N63 = z0Var.N6();
            if (N63 != null && (intent3 = N63.getIntent()) != null) {
                intent3.putExtra("poi_show_none", true);
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N64 = z0Var.N6();
            if (N64 != null && (intent2 = N64.getIntent()) != null) {
                intent2.putExtra("can_show_create_poi_tips", false);
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N65 = z0Var.N6();
            android.view.View S6 = z0Var.S6(com.p314xaae8f345.mm.R.id.l0q);
            if (N65 != null && S6 != null) {
                ya2.p1 p1Var3 = (ya2.p1) pf5.u.f435469a.a(ya2.p1.class);
                yv2.b bVar = (yv2.b) p1Var3;
                bVar.f547731d = N65;
                bVar.f547732e = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14333x5924cb6c) S6;
                bVar.f547733f = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059;
                bVar.f547734g = 0;
                z0Var.f543357m = p1Var3;
            }
            ya2.p1 p1Var4 = z0Var.f543357m;
            if (p1Var4 != null) {
                ((yv2.b) p1Var4).a().mo57381x7541828(z0Var.O6().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            }
            ya2.p1 p1Var5 = z0Var.f543357m;
            if (p1Var5 != null) {
                ((yv2.b) p1Var5).a().mo57398x1c5c5ff4(z0Var.O6().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            }
            ya2.p1 p1Var6 = z0Var.f543357m;
            if (p1Var6 != null) {
                ((yv2.b) p1Var6).a().mo57379x8a507638(z0Var.O6().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
            }
            ya2.p1 p1Var7 = z0Var.f543357m;
            if (p1Var7 != null) {
                ((yv2.b) p1Var7).a().mo57380x9f58be04(z0Var.O6().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            }
            ya2.p1 p1Var8 = z0Var.f543357m;
            if (p1Var8 != null) {
                ((yv2.b) p1Var8).a().mo57377x3f69f363(z0Var.O6().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            }
            ya2.p1 p1Var9 = z0Var.f543357m;
            if (p1Var9 != null) {
                ((yv2.b) p1Var9).a().mo57378xa6b17b65(z0Var.O6().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N66 = z0Var.N6();
            if (N66 != null && (intent = N66.getIntent()) != null && (p1Var = z0Var.f543357m) != null) {
                ((yv2.b) p1Var).c(intent, new android.os.Bundle());
            }
            ya2.p1 p1Var10 = z0Var.f543357m;
            if (p1Var10 != null) {
                ((yv2.b) p1Var10).a().b(com.p314xaae8f345.mm.R.raw.f79237x607f3a5e);
            }
            pm0.v.K(null, new yf2.u0(ze2Var, z0Var));
        } else {
            yv2.b bVar2 = (yv2.b) p1Var2;
            bVar2.f547735h = ze2Var;
            bVar2.d(true);
        }
        return jz5.f0.f384359a;
    }
}
