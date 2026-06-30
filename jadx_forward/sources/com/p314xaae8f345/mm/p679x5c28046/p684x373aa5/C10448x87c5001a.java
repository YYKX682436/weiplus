package com.p314xaae8f345.mm.p679x5c28046.p684x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u001d\b\u0016\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0018\u0010\u001aJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R.\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/emoji/view/BaseEmojiView;", "Lcom/tencent/mm/plugin/gif/MMAnimateView;", "", "bytes", "Ljz5/f0;", "setMMGIFFileByteArray", "Landroid/graphics/Bitmap;", "bm", "setImageBitmap", "Lcom/tencent/mm/api/IEmojiInfo;", "value", "o", "Lcom/tencent/mm/api/IEmojiInfo;", "getEmojiInfo", "()Lcom/tencent/mm/api/IEmojiInfo;", "setEmojiInfo", "(Lcom/tencent/mm/api/IEmojiInfo;)V", "emojiInfo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "emojisdk-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.emoji.view.BaseEmojiView */
/* loaded from: classes12.dex */
public class C10448x87c5001a extends com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f146468n;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo;

    public C10448x87c5001a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f146468n = "MicroMsg.BaseEmojiView";
    }

    /* renamed from: setMMGIFFileByteArray */
    private final void m43717x1e163453(byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.gif.b bVar;
        java.lang.String str = this.f146468n;
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.h(bArr) && ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.p1) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.f6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.f6.class))).Ai()) {
                    bVar = new com.p314xaae8f345.mm.p1006xc5476f33.gif.u(bArr);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.gif.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.gif.k(bArr, false);
                    if (kVar.f223672f != 0) {
                        bVar = kVar;
                    } else {
                        android.graphics.Bitmap G = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(bArr);
                        if (G != null) {
                            G.setDensity(m64928x7ab78438());
                            setImageBitmap(G);
                            return;
                        }
                        bVar = null;
                    }
                }
                if (bVar != null && !bVar.isRunning()) {
                    bVar.c();
                }
                setImageDrawable(bVar);
                return;
            }
        } catch (com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab e17) {
            s(e17);
            if (e17.m64939x130a215f() == 103) {
                android.graphics.Bitmap G2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(bArr);
                if (G2 != null) {
                    G2.setDensity(m64928x7ab78438());
                    setImageBitmap(G2);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "setMMGIFFileByteArray failed bitmap is null. bytes %s", java.lang.String.valueOf(bArr));
                com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo = getEmojiInfo();
                if (emojiInfo != null) {
                    emojiInfo.w();
                }
                n();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "setMMGIFFileByteArray failed. %s", e17.toString());
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo2 = getEmojiInfo();
            if (emojiInfo2 != null) {
                emojiInfo2.w();
            }
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "setMMGIFFileByteArray failed. %s", e18.toString());
        } catch (java.lang.NullPointerException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "setMMGIFFileByteArray failed. %s", e19.toString());
        }
        n();
    }

    public com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb getEmojiInfo() {
        return this.emojiInfo;
    }

    /* renamed from: setEmojiInfo */
    public void m43719xc040f7d2(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        com.p314xaae8f345.mm.p1006xc5476f33.gif.b kVar;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.emojiInfo, interfaceC4987x84e327cb)) {
            return;
        }
        this.emojiInfo = interfaceC4987x84e327cb;
        if (interfaceC4987x84e327cb != null) {
            if (interfaceC4987x84e327cb.mo42929x747e9cc9() == 18 || interfaceC4987x84e327cb.mo42929x747e9cc9() == 50 || interfaceC4987x84e327cb.mo42929x747e9cc9() == 49) {
                setImageBitmap(interfaceC4987x84e327cb.a0(getContext(), 300));
                return;
            }
            if (!interfaceC4987x84e327cb.I1()) {
                com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.f6 f6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.f6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.f6.class);
                com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo = getEmojiInfo();
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.p1) f6Var).getClass();
                m43717x1e163453(((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().z((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) emojiInfo));
                return;
            }
            java.io.InputStream a17 = h12.e.a(getContext(), interfaceC4987x84e327cb.mo42934xfb82e301());
            try {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("")) {
                    kVar = new com.p314xaae8f345.mm.p1006xc5476f33.gif.k(a17);
                } else {
                    m64935x5cbbcdff("");
                    kVar = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j5.class))).wi(m64927x62036cf3(), a17);
                }
                setImageDrawable(kVar);
            } catch (com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab e17) {
                s(e17);
                if (e17.m64939x130a215f() != 103) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileInputStream failed. %s", e17.toString());
                    n();
                }
                android.graphics.Bitmap O = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.O(a17);
                if (O != null) {
                    O.setDensity(m64928x7ab78438());
                    setImageBitmap(O);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileInputStream failedbitmap is null. bytes %s");
                    n();
                }
            } catch (java.io.IOException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileInputStream failed. %s", e18.toString());
                n();
            }
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd, android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            bitmap.setDensity(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e);
        }
        super.setImageBitmap(bitmap);
    }

    public C10448x87c5001a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
