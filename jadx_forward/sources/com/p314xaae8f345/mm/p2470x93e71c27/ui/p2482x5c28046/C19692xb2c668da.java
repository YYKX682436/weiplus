package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046;

/* renamed from: com.tencent.mm.pluginsdk.ui.emoji.PopEmojiView */
/* loaded from: classes12.dex */
public class C19692xb2c668da extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19691x1ed8864b f272349d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f272350e;

    public C19692xb2c668da(android.content.Context context) {
        super(context);
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.c_u, null);
        this.f272350e = viewGroup;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19691x1ed8864b c19691x1ed8864b = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19691x1ed8864b) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.h88);
        this.f272349d = c19691x1ed8864b;
        c19691x1ed8864b.m75575x50e2c682(true);
        this.f272349d.m75576xe38e30c3(context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561924wm) - (context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx) * 3));
        addView(this.f272350e, -1, -1);
    }

    /* renamed from: setEmojiInfo */
    public void m75578xc040f7d2(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4) {
        com.p314xaae8f345.mm.p1006xc5476f33.gif.b uVar;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19691x1ed8864b c19691x1ed8864b = this.f272349d;
        if (c19691x1ed8864b != null) {
            c19691x1ed8864b.f272345n = c21053xdbf1e5f4;
            java.lang.String N0 = c21053xdbf1e5f4.N0();
            if ((c21053xdbf1e5f4.f68678x13320507 & 1) != 1) {
                c19691x1ed8864b.v(N0, true, "");
                return;
            }
            lt0.f fVar = (lt0.f) com.p314xaae8f345.mm.p1006xc5476f33.gif.d.c().f223662b;
            if ((fVar.get("") != null ? (com.p314xaae8f345.mm.p1006xc5476f33.gif.b) ((java.lang.ref.WeakReference) fVar.get("")).get() : null) != null) {
                lt0.f fVar2 = (lt0.f) com.p314xaae8f345.mm.p1006xc5476f33.gif.d.c().f223662b;
                c19691x1ed8864b.setImageDrawable(fVar2.get("") != null ? (com.p314xaae8f345.mm.p1006xc5476f33.gif.b) ((java.lang.ref.WeakReference) fVar2.get("")).get() : null);
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f42 = c19691x1ed8864b.f272345n;
            byte[] z17 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().z(c19691x1ed8864b.f272345n);
            c19691x1ed8864b.f272345n = c21053xdbf1e5f42;
            try {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(z17)) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("")) {
                        uVar = (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.h(z17) && ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().e()) ? new com.p314xaae8f345.mm.p1006xc5476f33.gif.u(z17) : new com.p314xaae8f345.mm.p1006xc5476f33.gif.k(z17, false);
                        if (!uVar.isRunning()) {
                            uVar.c();
                        }
                    } else {
                        c19691x1ed8864b.m64935x5cbbcdff("");
                        uVar = com.p314xaae8f345.mm.p1006xc5476f33.gif.d.c().b(c19691x1ed8864b.m64927x62036cf3(), z17);
                    }
                    c19691x1ed8864b.setImageDrawable(uVar);
                    return;
                }
            } catch (com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab e17) {
                c19691x1ed8864b.s(e17);
                if (e17.m64939x130a215f() == 103) {
                    android.graphics.Bitmap G = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(z17);
                    if (G != null) {
                        G.setDensity(c19691x1ed8864b.m64928x7ab78438());
                        c19691x1ed8864b.setImageBitmap(G);
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray failed bitmap is null. bytes %s", z17.toString());
                    com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f43 = c19691x1ed8864b.f272345n;
                    if (c21053xdbf1e5f43 != null) {
                        c21053xdbf1e5f43.w();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.MMEmojiView", "delete file.");
                    }
                    c19691x1ed8864b.n();
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray failed. %s", e17.toString());
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f44 = c19691x1ed8864b.f272345n;
                if (c21053xdbf1e5f44 != null) {
                    c21053xdbf1e5f44.w();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.MMEmojiView", "delete file.");
                }
            } catch (java.io.IOException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray failed. %s", e18.toString());
            } catch (java.lang.NullPointerException e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray failed. %s", e19.toString());
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f45 = c19691x1ed8864b.f272345n;
            if (c21053xdbf1e5f45 != null) {
                c21053xdbf1e5f45.w();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.MMEmojiView", "delete file.");
            }
            c19691x1ed8864b.n();
        }
    }

    /* renamed from: setImageBitmap */
    public void m75579xd44890a8(android.graphics.Bitmap bitmap) {
        if (this.f272349d == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.setDensity(this.f272349d.m64928x7ab78438());
        this.f272349d.setImageBitmap(bitmap);
    }

    /* renamed from: setImageResource */
    public void m75580x8d516947(int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19691x1ed8864b c19691x1ed8864b = this.f272349d;
        if (c19691x1ed8864b != null) {
            c19691x1ed8864b.setImageResource(i17);
        }
    }

    public C19692xb2c668da(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public C19692xb2c668da(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context);
    }
}
