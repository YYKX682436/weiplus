package rj;

/* loaded from: classes10.dex */
public class l extends qk.o9 {

    /* renamed from: b, reason: collision with root package name */
    public ym5.h f477672b;

    /* renamed from: c, reason: collision with root package name */
    public qk.v7 f477673c;

    @Override // qk.o9
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPhotoEditorImpl", "cleanAllCache: ");
        com.p314xaae8f345.mm.p647x5a0af82.C10322x22f91ed2.a().b();
    }

    @Override // qk.o9
    public qk.v7 b() {
        if (this.f477673c == null) {
            this.f477673c = new f65.r(this.f477672b.m177317xc879b3f2());
        }
        return this.f477673c;
    }

    @Override // qk.o9
    public qk.s c(android.content.Context context) {
        ym5.h hVar = this.f477672b;
        if (hVar == null) {
            qk.n9 n9Var = this.f445835a.f445764a;
            if (n9Var == qk.n9.VIDEO) {
                this.f477672b = new ym5.o6(context);
            } else if (n9Var == qk.n9.PHOTO) {
                this.f477672b = new ym5.x2(context);
            } else if (n9Var == qk.n9.SCREEN) {
                this.f477672b = new ym5.w2(context);
            } else if (n9Var == qk.n9.VIDEO_COVER) {
                this.f477672b = new ym5.n6(context);
            } else if (n9Var == qk.n9.LIVE_STICKER) {
                this.f477672b = new ym5.y5(context);
            } else if (n9Var == qk.n9.SNS_COVER) {
                this.f477672b = new ym5.m5(context);
            }
        } else if (hVar.getParent() != null) {
            ((android.view.ViewGroup) this.f477672b.getParent()).removeView(this.f477672b);
        }
        this.f477672b.m177321x6843a7d(this.f445835a);
        return this.f477672b;
    }

    @Override // qk.o9
    public void d(qk.l9 l9Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPhotoEditorImpl", "init: ");
        this.f445835a = l9Var;
        com.p314xaae8f345.mm.p647x5a0af82.C10322x22f91ed2 a17 = com.p314xaae8f345.mm.p647x5a0af82.C10322x22f91ed2.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ArtistCacheManager", "[%s] makeCacheAlive: ", java.lang.Integer.valueOf(a17.hashCode()));
        a17.f145166b = true;
        com.p314xaae8f345.mm.p647x5a0af82.C10322x22f91ed2 a18 = com.p314xaae8f345.mm.p647x5a0af82.C10322x22f91ed2.a();
        java.lang.String str = this.f445835a.f445767d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "MicroMsg.MMPhotoEditorImpl";
        }
        a18.f(str);
        um.f fVar = um.f.f510211c;
        java.lang.String str2 = this.f445835a.f445767d;
        fVar.b(str2 != null ? str2 : "MicroMsg.MMPhotoEditorImpl");
    }

    @Override // qk.o9
    public boolean e() {
        l45.n nVar = (l45.n) this.f477672b.m177317xc879b3f2();
        if (nVar.f397993a.mo177319xb073c692().getVisibility() == 0) {
            nVar.y(false);
            nVar.f397993a.mo160423x2f328115(true);
        } else {
            if (nVar.f397993a.m177313xe6828c7b() == null || nVar.f397993a.m177313xe6828c7b().getVisibility() != 0) {
                return false;
            }
            nVar.f397993a.c(true);
            nVar.f397993a.mo160423x2f328115(true);
        }
        return true;
    }

    @Override // qk.o9
    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPhotoEditorImpl", "onDestroy: ");
        com.p314xaae8f345.mm.p647x5a0af82.C10322x22f91ed2.a().e();
        qk.l9 l9Var = this.f445835a;
        if (l9Var != null && !l9Var.f445765b) {
            com.p314xaae8f345.mm.p647x5a0af82.C10322x22f91ed2 a17 = com.p314xaae8f345.mm.p647x5a0af82.C10322x22f91ed2.a();
            java.lang.String str = this.f445835a.f445767d;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "MicroMsg.MMPhotoEditorImpl";
            }
            a17.g(str);
        }
        ym5.h hVar = this.f477672b;
        if (hVar != null) {
            ((l45.n) hVar.m177317xc879b3f2()).p();
        }
        try {
            this.f477672b.m177313xe6828c7b().a();
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMPhotoEditorImpl", "[onDestroy] may be has destory!");
        }
    }

    @Override // qk.o9
    public void g(qk.p7 p7Var, boolean z17) {
        l45.q m177317xc879b3f2 = this.f477672b.m177317xc879b3f2();
        boolean z18 = !((f65.r) b()).g();
        l45.n nVar = (l45.n) m177317xc879b3f2;
        nVar.getClass();
        s75.d.b(new l45.l(nVar, p7Var, z18, z17), "onFinalGenerate_" + p7Var.hashCode());
    }
}
