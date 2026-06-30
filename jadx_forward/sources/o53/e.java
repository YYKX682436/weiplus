package o53;

/* loaded from: classes8.dex */
public final class e extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui.d {
    public final android.content.Context E;
    public final android.os.Bundle F;
    public android.widget.ImageView G;
    public android.widget.TextView H;
    public final java.util.ArrayList I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f424652J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public boolean P;
    public java.lang.String Q;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context mcontext, android.os.Bundle params) {
        super(mcontext, params);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mcontext, "mcontext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.E = mcontext;
        this.F = params;
        this.I = new java.util.ArrayList();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.R = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5625x88b37a55>(a0Var) { // from class: com.tencent.mm.plugin.game.ui.liteapp.GameLiteSettingActionBar$getUnreadGameMsgListener$1
            {
                this.f39173x3fe91575 = 98332773;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5625x88b37a55 c5625x88b37a55) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5625x88b37a55 event = c5625x88b37a55;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.ug ugVar = event.f135952g;
                int i17 = ugVar.f89613a;
                int i18 = ugVar.f89615c;
                int i19 = ugVar.f89614b;
                boolean z17 = ugVar.f89616d;
                ((ku5.t0) ku5.t0.f394148d).B(new o53.a(o53.e.this, i17, i19, i18, z17));
                return false;
            }
        };
    }

    public static final void c(o53.e eVar, int i17, int i18, int i19, boolean z17) {
        android.widget.ImageView imageView;
        eVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLiteSettingActionBar", "get chat unread count: %d,  notifyUnreadCount:%d,gameLifeUnreadCount:%d, hasChatRoomUnreadMsg:%b", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(z17));
        int i27 = i17 + i19;
        boolean z18 = i27 + i18 > 0 || z17;
        if (z18) {
            android.widget.TextView textView = eVar.H;
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.widget.ImageView imageView2 = eVar.G;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            if (i27 > 0) {
                android.widget.ImageView imageView3 = eVar.G;
                if (imageView3 != null) {
                    imageView3.setVisibility(8);
                }
                android.widget.TextView textView2 = eVar.H;
                if (textView2 != null) {
                    if (i27 >= 100) {
                        textView2.setText("99+");
                        textView2.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(eVar.getContext(), i27));
                        textView2.setTextSize(0, i65.a.f(eVar.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561170bc) * i65.a.m(eVar.getContext()));
                        textView2.setVisibility(0);
                    } else {
                        textView2.setText(java.lang.String.valueOf(i27));
                        textView2.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(eVar.getContext(), i27));
                        textView2.setTextSize(0, i65.a.f(eVar.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561170bc) * i65.a.m(eVar.getContext()));
                        textView2.setVisibility(0);
                    }
                }
            } else {
                android.widget.TextView textView3 = eVar.H;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                if ((z18 || i18 > 0) && (imageView = eVar.G) != null) {
                    imageView.setVisibility(0);
                }
            }
        } else {
            android.widget.TextView textView4 = eVar.H;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            android.widget.ImageView imageView4 = eVar.G;
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
        }
        if (eVar.P) {
            return;
        }
        eVar.L = z18;
        eVar.M = i17 + i18 + i19;
        eVar.P = true;
        if (!eVar.N || eVar.f424652J) {
            return;
        }
        eVar.f424652J = true;
        eVar.f(false, eVar.Q);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui.e
    public void a(boolean z17) {
        android.widget.ImageView imageView = this.f221359n;
        android.widget.ImageView imageView2 = this.f221356h;
        android.widget.TextView textView = this.f221357i;
        if (z17) {
            textView.setTextColor(-1);
            imageView2.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui.j(this), 100L);
            if (!this.f221363r) {
                imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78360x4cb28642);
            }
        } else {
            textView.setTextColor(-16777216);
            imageView2.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui.i(this), 100L);
            if (!this.f221363r) {
                imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78355x20db789a);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b c19258xc2f2ab2b = this.f221351z;
        if (c19258xc2f2ab2b != null) {
            c19258xc2f2ab2b.m74210xde5590bb(z17);
        }
        for (android.widget.ImageView imageView3 : this.I) {
            android.graphics.drawable.Drawable drawable = imageView3.getDrawable();
            if (drawable != null) {
                com.p314xaae8f345.mm.ui.uk.f(drawable, z17 ? b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.aaz) : b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560249f7));
                imageView3.setImageDrawable(drawable);
            }
        }
    }

    public final void d(android.widget.ImageView imageView, int i17) {
        android.graphics.drawable.Drawable m9707x4a96be14 = b3.l.m9707x4a96be14(getContext(), i17);
        if (m9707x4a96be14 != null) {
            com.p314xaae8f345.mm.ui.uk.f(m9707x4a96be14, b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
            imageView.setImageDrawable(m9707x4a96be14);
        }
    }

    public final long e(android.net.Uri uri, java.lang.String str) {
        try {
            return java.lang.Long.parseLong(uri.getQueryParameter(str));
        } catch (java.lang.NumberFormatException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameLiteSettingActionBar", "gamelog parse long error key = " + str + " uri = " + uri);
            return 0L;
        }
    }

    public final void f(boolean z17, java.lang.String str) {
        if (str == null) {
            str = this.F.getString("game_tab_key");
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("isred", this.L ? "1" : "2");
        hashMap.put("TotalNum", java.lang.String.valueOf(this.M));
        hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f, java.lang.String.valueOf(str));
        android.content.Context context = getContext();
        int i17 = z17 ? 6 : 1;
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(context, 37, 3701, z17 ? 1 : 0, i17, this.K, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.b(hashMap));
    }

    /* renamed from: getGetUnreadGameMsgListener */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<?> m150648xef1b8414() {
        return this.R;
    }

    /* renamed from: getMcontext */
    public final android.content.Context m150649xef718e18() {
        return this.E;
    }

    /* renamed from: getParams */
    public final android.os.Bundle m150650x29c21c7c() {
        return this.F;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui.d, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui.e, android.view.View
    public void setAlpha(float f17) {
        super.setAlpha(f17);
        if (f17 == 0.0f) {
            f17 = 1.0f;
        }
        if (f17 < 0.0f || f17 > 1.0f) {
            return;
        }
        int i17 = (int) (f17 * 255);
        java.util.Iterator it = this.I.iterator();
        while (it.hasNext()) {
            ((android.widget.ImageView) it.next()).setImageAlpha(i17);
        }
    }
}
