package uj3;

/* loaded from: classes14.dex */
public final class b0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f509749d;

    /* renamed from: e, reason: collision with root package name */
    public final uj3.b f509750e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f509751f;

    /* renamed from: g, reason: collision with root package name */
    public uj3.z f509752g;

    /* renamed from: h, reason: collision with root package name */
    public final uj3.a0 f509753h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f509754i;

    /* renamed from: m, reason: collision with root package name */
    public int f509755m;

    public b0(android.content.Context context, uj3.b statusManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusManager, "statusManager");
        this.f509749d = context;
        this.f509750e = statusManager;
        this.f509753h = new uj3.a0(this, statusManager);
        this.f509755m = -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a0
    public void a(java.lang.String userName, android.graphics.Bitmap bm6, int i17, int i18) {
        uj3.z zVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bm6, "bm");
        uj3.z zVar2 = this.f509752g;
        if ((zVar2 != null ? zVar2.f509933g : null) != null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(userName, zVar2 != null ? zVar2.f509933g : null)) {
                if ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().o().c(userName) == 100 || com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().o().c(userName) == 104) && (zVar = this.f509752g) != null) {
                    synchronized (zVar) {
                        if (zVar.f509929c == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenProjectAvatarCellLayout", "drawVideo view is null");
                            return;
                        }
                        if (zVar.f509940n) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenProjectAvatarCellLayout", "renderVideoBitmap img false cause isDoingAnimationChange");
                            return;
                        }
                        if (zVar.c(userName, bm6, i17, i18, 1)) {
                            return;
                        }
                        android.widget.ImageView imageView = zVar.f509930d;
                        if (imageView != null) {
                            imageView.setVisibility(8);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a c18930xb402610a = zVar.f509929c;
                        if (c18930xb402610a != null) {
                            c18930xb402610a.setVisibility(0);
                        }
                        zVar.e(bm6, i17, i18, 1);
                        ((ku5.t0) ku5.t0.f394148d).B(new uj3.w(zVar, userName));
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a0
    public void b() {
    }

    public final void c(boolean z17) {
        uj3.z zVar;
        java.lang.Integer valueOf;
        uj3.z zVar2;
        java.lang.Integer valueOf2;
        if (!z17) {
            uj3.z zVar3 = this.f509752g;
            if (((zVar3 == null || (valueOf = java.lang.Integer.valueOf(zVar3.f509927a.getVisibility())) == null || valueOf.intValue() != 4) ? false : true) || (zVar = this.f509752g) == null) {
                return;
            }
            zVar.f509931e = 0;
            android.widget.RelativeLayout relativeLayout = zVar.f509927a;
            relativeLayout.setAlpha(1.0f);
            relativeLayout.setVisibility(0);
            relativeLayout.clearAnimation();
            relativeLayout.animate().alpha(0.0f).setDuration(300L).setListener(new uj3.x(zVar)).start();
            return;
        }
        uj3.z zVar4 = this.f509752g;
        if (((zVar4 == null || (valueOf2 = java.lang.Integer.valueOf(zVar4.f509927a.getVisibility())) == null || valueOf2.intValue() != 0) ? false : true) || (zVar2 = this.f509752g) == null) {
            return;
        }
        zVar2.f();
        zVar2.a(zVar2.f509928b.e());
        android.widget.RelativeLayout relativeLayout2 = zVar2.f509927a;
        relativeLayout2.setAlpha(0.0f);
        relativeLayout2.setVisibility(0);
        relativeLayout2.clearAnimation();
        relativeLayout2.animate().alpha(1.0f).setDuration(300L).setListener(new uj3.y(zVar2)).start();
    }

    public final java.lang.String d() {
        java.lang.String str;
        uj3.z zVar = this.f509752g;
        return (zVar == null || (str = zVar.f509933g) == null) ? "" : str;
    }

    public final void e(android.view.ViewGroup rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.f509754i = rootView;
        android.view.View inflate = android.view.View.inflate(this.f509749d, com.p314xaae8f345.mm.R.C30864xbddafb2a.c3j, rootView);
        this.f509751f = inflate;
        android.widget.RelativeLayout relativeLayout = inflate != null ? (android.widget.RelativeLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.a9w) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(relativeLayout, "null cannot be cast to non-null type android.widget.RelativeLayout");
        this.f509752g = new uj3.z(relativeLayout, this.f509750e);
    }

    public final boolean f(java.util.ArrayList speakers) {
        java.lang.String d17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(speakers, "speakers");
        uj3.a0 a0Var = this.f509753h;
        a0Var.getClass();
        uj3.b0 b0Var = a0Var.f509743d;
        uj3.z zVar = b0Var.f509752g;
        java.lang.Long l17 = null;
        java.lang.Long l18 = zVar != null ? zVar.f509935i : null;
        if (l18 == null) {
            d17 = (java.lang.String) speakers.get(e06.p.j(e06.p.m(0, speakers.size()), c06.e.f119249d));
        } else {
            long longValue = l18.longValue();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            d17 = android.os.SystemClock.elapsedRealtime() - longValue >= 3000 ? speakers.contains(b0Var.d()) ? b0Var.d() : (java.lang.String) speakers.get(e06.p.j(e06.p.m(0, speakers.size()), c06.e.f119249d)) : b0Var.d();
        }
        uj3.z zVar2 = b0Var.f509752g;
        if (zVar2 != null) {
            if (d17 != null) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                l17 = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
            }
            zVar2.f509935i = l17;
            zVar2.f509933g = d17;
        }
        b0Var.c(true);
        return true;
    }

    public final void g() {
        uj3.a0 a0Var = this.f509753h;
        uj3.h1 h1Var = a0Var.f509745f;
        if (h1Var != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = h1Var.f509817b;
            if (b4Var != null) {
                b4Var.mo50302x6b17ad39(null);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = h1Var.f509817b;
            if (b4Var2 != null) {
                b4Var2.d();
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var3 = h1Var.f509817b;
            if (b4Var3 != null) {
                b4Var3.m77787xbe88f509();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().q().h(a0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a0
    /* renamed from: getAvatarIv */
    public android.widget.ImageView getF231874g() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a0
    /* renamed from: getUsername */
    public java.lang.String getF231877m() {
        java.lang.String str;
        uj3.z zVar = this.f509752g;
        return (zVar == null || (str = zVar.f509933g) == null) ? "" : str;
    }

    public final void h(java.lang.String userName) {
        uj3.z zVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        uj3.z zVar2 = this.f509752g;
        boolean z17 = false;
        if (zVar2 != null && zVar2.f509931e == 1) {
            z17 = true;
        }
        if ((z17 && com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231707q.contains(userName)) || (zVar = this.f509752g) == null) {
            return;
        }
        zVar.d(userName);
    }

    public final void i(boolean z17) {
        uj3.z zVar;
        java.lang.Integer valueOf;
        uj3.z zVar2 = this.f509752g;
        if (((zVar2 == null || (valueOf = java.lang.Integer.valueOf(zVar2.f509927a.getVisibility())) == null || valueOf.intValue() != 0) ? false : true) && (!r26.n0.N(d())) && (zVar = this.f509752g) != null) {
            zVar.a(zVar.f509928b.e());
            android.view.View view = zVar.f509938l;
            if (view == null) {
                return;
            }
            int i17 = z17 ? 0 : 4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectAvatarCellLayout", "doShowOrHideSpeakerVoice", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectAvatarCellLayout", "doShowOrHideSpeakerVoice", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
