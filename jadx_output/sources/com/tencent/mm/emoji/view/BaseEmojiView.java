package com.tencent.mm.emoji.view;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u001d\b\u0016\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0018\u0010\u001aJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R.\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/emoji/view/BaseEmojiView;", "Lcom/tencent/mm/plugin/gif/MMAnimateView;", "", "bytes", "Ljz5/f0;", "setMMGIFFileByteArray", "Landroid/graphics/Bitmap;", "bm", "setImageBitmap", "Lcom/tencent/mm/api/IEmojiInfo;", "value", "o", "Lcom/tencent/mm/api/IEmojiInfo;", "getEmojiInfo", "()Lcom/tencent/mm/api/IEmojiInfo;", "setEmojiInfo", "(Lcom/tencent/mm/api/IEmojiInfo;)V", "emojiInfo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "emojisdk-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public class BaseEmojiView extends com.tencent.mm.plugin.gif.MMAnimateView {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f64935n;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.api.IEmojiInfo emojiInfo;

    public BaseEmojiView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f64935n = "MicroMsg.BaseEmojiView";
    }

    private final void setMMGIFFileByteArray(byte[] bArr) {
        com.tencent.mm.plugin.gif.b bVar;
        java.lang.String str = this.f64935n;
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
                if (com.tencent.mm.sdk.platformtools.y1.h(bArr) && ((com.tencent.mm.feature.emoji.p1) ((com.tencent.mm.feature.emoji.api.f6) i95.n0.c(com.tencent.mm.feature.emoji.api.f6.class))).Ai()) {
                    bVar = new com.tencent.mm.plugin.gif.u(bArr);
                } else {
                    com.tencent.mm.plugin.gif.k kVar = new com.tencent.mm.plugin.gif.k(bArr, false);
                    if (kVar.f142139f != 0) {
                        bVar = kVar;
                    } else {
                        android.graphics.Bitmap G = com.tencent.mm.sdk.platformtools.x.G(bArr);
                        if (G != null) {
                            G.setDensity(getEmojiDensity());
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
        } catch (com.tencent.mm.plugin.gif.MMGIFException e17) {
            s(e17);
            if (e17.getErrorCode() == 103) {
                android.graphics.Bitmap G2 = com.tencent.mm.sdk.platformtools.x.G(bArr);
                if (G2 != null) {
                    G2.setDensity(getEmojiDensity());
                    setImageBitmap(G2);
                    return;
                }
                com.tencent.mars.xlog.Log.w(str, "setMMGIFFileByteArray failed bitmap is null. bytes %s", java.lang.String.valueOf(bArr));
                com.tencent.mm.api.IEmojiInfo emojiInfo = getEmojiInfo();
                if (emojiInfo != null) {
                    emojiInfo.w();
                }
                n();
                return;
            }
            com.tencent.mars.xlog.Log.e(str, "setMMGIFFileByteArray failed. %s", e17.toString());
            com.tencent.mm.api.IEmojiInfo emojiInfo2 = getEmojiInfo();
            if (emojiInfo2 != null) {
                emojiInfo2.w();
            }
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.e(str, "setMMGIFFileByteArray failed. %s", e18.toString());
        } catch (java.lang.NullPointerException e19) {
            com.tencent.mars.xlog.Log.e(str, "setMMGIFFileByteArray failed. %s", e19.toString());
        }
        n();
    }

    public com.tencent.mm.api.IEmojiInfo getEmojiInfo() {
        return this.emojiInfo;
    }

    public void setEmojiInfo(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        com.tencent.mm.plugin.gif.b kVar;
        if (kotlin.jvm.internal.o.b(this.emojiInfo, iEmojiInfo)) {
            return;
        }
        this.emojiInfo = iEmojiInfo;
        if (iEmojiInfo != null) {
            if (iEmojiInfo.getGroup() == 18 || iEmojiInfo.getGroup() == 50 || iEmojiInfo.getGroup() == 49) {
                setImageBitmap(iEmojiInfo.a0(getContext(), 300));
                return;
            }
            if (!iEmojiInfo.I1()) {
                com.tencent.mm.feature.emoji.api.f6 f6Var = (com.tencent.mm.feature.emoji.api.f6) i95.n0.c(com.tencent.mm.feature.emoji.api.f6.class);
                com.tencent.mm.api.IEmojiInfo emojiInfo = getEmojiInfo();
                ((com.tencent.mm.feature.emoji.p1) f6Var).getClass();
                setMMGIFFileByteArray(((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().z((com.tencent.mm.storage.emotion.EmojiInfo) emojiInfo));
                return;
            }
            java.io.InputStream a17 = h12.e.a(getContext(), iEmojiInfo.getName());
            try {
                if (com.tencent.mm.sdk.platformtools.t8.K0("")) {
                    kVar = new com.tencent.mm.plugin.gif.k(a17);
                } else {
                    setCacheKey("");
                    kVar = ((com.tencent.mm.feature.emoji.e) ((com.tencent.mm.feature.emoji.api.j5) i95.n0.c(com.tencent.mm.feature.emoji.api.j5.class))).wi(getCacheKey(), a17);
                }
                setImageDrawable(kVar);
            } catch (com.tencent.mm.plugin.gif.MMGIFException e17) {
                s(e17);
                if (e17.getErrorCode() != 103) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileInputStream failed. %s", e17.toString());
                    n();
                }
                android.graphics.Bitmap O = com.tencent.mm.sdk.platformtools.x.O(a17);
                if (O != null) {
                    O.setDensity(getEmojiDensity());
                    setImageBitmap(O);
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileInputStream failedbitmap is null. bytes %s");
                    n();
                }
            } catch (java.io.IOException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileInputStream failed. %s", e18.toString());
                n();
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            bitmap.setDensity(com.tencent.mapsdk.internal.km.f50100e);
        }
        super.setImageBitmap(bitmap);
    }

    public BaseEmojiView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
