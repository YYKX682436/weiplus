package hw2;

/* loaded from: classes5.dex */
public final class c implements com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hw2.e f367040a;

    public c(hw2.e eVar) {
        this.f367040a = eVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void a() {
        this.f367040a.b();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("EDIT_VLOG_SEARCH_MUSIC_FINISH_PARCELABLE", info);
        this.f367040a.f367046e.w(ju3.c0.f383402b2, bundle);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void c(boolean z17, java.util.List lyricsInfos) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lyricsInfos, "lyricsInfos");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void d() {
        ju3.d0.k(this.f367040a.f367046e, ju3.c0.f383403c2, null, 2, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void g(boolean z17) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_EDIT_ORIGIN_VOICE_MUTE_BOOLEAN", z17);
        this.f367040a.f367046e.w(ju3.c0.X, bundle);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void m(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a) {
        hw2.e eVar = this.f367040a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eVar.f367052n, c16997xb0aa383a)) {
            if (eVar.f367052n != null) {
                eVar.c();
                return;
            }
            return;
        }
        ju3.d0 d0Var = eVar.f367046e;
        if (c16997xb0aa383a == null) {
            eVar.f367052n = c16997xb0aa383a;
            iu3.i iVar = eVar.f367047f;
            if (iVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(iVar.f376540b, "reset music");
                kk4.v vVar = iVar.f376541c;
                if (vVar != null) {
                    vVar.mo143591x360802();
                }
                kk4.v vVar2 = iVar.f376541c;
                if (vVar2 != null) {
                    vVar2.mo143590x408b7293();
                }
                iVar.f376541c = null;
            }
            ju3.d0.k(d0Var, ju3.c0.Y, null, 2, null);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("EDIT_SELECT_MUSIC_LYRICS_BOOLEAN", false);
            d0Var.w(ju3.c0.Z, bundle);
            d0Var.w(ju3.c0.f383444x, null);
            return;
        }
        if (c16997xb0aa383a.f237251o == 2) {
            eVar.b();
            ju3.d0.k(d0Var, ju3.c0.U, null, 2, null);
            return;
        }
        eVar.f367052n = c16997xb0aa383a;
        ju3.d0.k(d0Var, ju3.c0.Y, null, 2, null);
        if (eVar.f367054p) {
            eVar.f367054p = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e = eVar.f367048g;
            if (c17040x9d8b708e != null) {
                c17040x9d8b708e.postDelayed(eVar.f367057s, eVar.f367055q);
            }
        } else if (eVar.f367053o) {
            iu3.i iVar2 = eVar.f367047f;
            if (iVar2 != null) {
                iVar2.b(eVar.f367052n);
            }
        } else {
            iu3.i iVar3 = eVar.f367047f;
            if (iVar3 != null) {
                iVar3.c(eVar.f367052n);
            }
        }
        wt3.v vVar3 = wt3.v.f531038i;
        if (vVar3 != null) {
            vVar3.d(c16997xb0aa383a.f237244e, c16997xb0aa383a.f237252p);
        }
    }
}
