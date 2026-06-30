package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ck implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl f215556d;

    public ck(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar) {
        this.f215556d = blVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.f03 f03Var;
        r45.vs2 vs2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar = this.f215556d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gi X6 = blVar.X6(1);
        if (X6 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[registerRedDot] TAB_TYPE_FRIEND isShow=");
            sb6.append(z9Var != null ? java.lang.Boolean.valueOf(z9Var.f186860a) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HomeActionBarUIC", sb6.toString());
            boolean z17 = z9Var != null && z9Var.f186860a;
            android.widget.ImageView imageView = X6.f216064h;
            android.widget.ImageView imageView2 = X6.f216063g;
            if (!z17) {
                blVar.f215432o = "";
                if (imageView2 != null) {
                    imageView2.setVisibility(4);
                }
                if (imageView == null) {
                    return;
                }
                imageView.setVisibility(4);
                return;
            }
            r45.f03 f03Var2 = z9Var.f186861b;
            if (f03Var2 != null && f03Var2.f455420d == 15) {
                if (imageView != null) {
                    imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79236x2de5f313);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(4);
                }
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
            } else {
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                if (imageView != null) {
                    imageView.setVisibility(4);
                }
                if (imageView2 != null) {
                    imageView2.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b8i);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = z9Var.f186862c;
            java.lang.String str = jbVar != null ? jbVar.f65880x11c19d58 : null;
            java.lang.String str2 = str != null ? str : "";
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(blVar.f215432o, str2) || !blVar.f215430m) {
                return;
            }
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
            long j17 = (jbVar == null || (vs2Var = jbVar.f65874xb5f7102a) == null) ? 0L : vs2Var.C;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = blVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = blVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f435481a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.uj(o3Var, "2", 8, 1, 1, 0, 0, str2, null, j17, V6, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).S6(), 0, 2176, null);
            blVar.f215432o = str2;
            if (jbVar == null || (f03Var = z9Var.f186861b) == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context2 = blVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            r45.qt2 V62 = nyVar2 != null ? nyVar2.V6() : null;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = blVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.i(x2Var, "2", jbVar, f03Var, 1, V62, 0, null, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).S6(), 0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.r.f34562x366c91de, null);
        }
    }
}
