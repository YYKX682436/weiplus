package e3;

/* loaded from: classes13.dex */
public class m extends e3.p {
    public static int h(android.graphics.fonts.FontStyle fontStyle, android.graphics.fonts.FontStyle fontStyle2) {
        return (java.lang.Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // e3.p
    public android.graphics.Typeface a(android.content.Context context, d3.g gVar, android.content.res.Resources resources, int i17) {
        try {
            android.graphics.fonts.FontFamily.Builder builder = null;
            for (d3.h hVar : gVar.f307619a) {
                try {
                    android.graphics.fonts.Font build = new android.graphics.fonts.Font.Builder(resources, hVar.f307625f).setWeight(hVar.f307621b).setSlant(hVar.f307622c ? 1 : 0).setTtcIndex(hVar.f307624e).setFontVariationSettings(hVar.f307623d).build();
                    if (builder == null) {
                        builder = new android.graphics.fonts.FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (java.io.IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            android.graphics.fonts.FontFamily build2 = builder.build();
            return new android.graphics.Typeface.CustomFallbackBuilder(build2).setStyle(g(build2, i17).getStyle()).build();
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    @Override // e3.p
    public android.graphics.Typeface b(android.content.Context context, android.os.CancellationSignal cancellationSignal, k3.n[] nVarArr, int i17) {
        android.os.ParcelFileDescriptor openFileDescriptor;
        android.content.ContentResolver contentResolver = context.getContentResolver();
        try {
            android.graphics.fonts.FontFamily.Builder builder = null;
            for (k3.n nVar : nVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(nVar.f385336a, "r", cancellationSignal);
                } catch (java.io.IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        android.graphics.fonts.Font build = new android.graphics.fonts.Font.Builder(openFileDescriptor).setWeight(nVar.f385338c).setSlant(nVar.f385339d ? 1 : 0).setTtcIndex(nVar.f385337b).build();
                        if (builder == null) {
                            builder = new android.graphics.fonts.FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (java.lang.Throwable th6) {
                        try {
                            openFileDescriptor.close();
                        } catch (java.lang.Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                        throw th6;
                        break;
                    }
                } else if (openFileDescriptor == null) {
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            android.graphics.fonts.FontFamily build2 = builder.build();
            return new android.graphics.Typeface.CustomFallbackBuilder(build2).setStyle(g(build2, i17).getStyle()).build();
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    @Override // e3.p
    public android.graphics.Typeface c(android.content.Context context, java.io.InputStream inputStream) {
        throw new java.lang.RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // e3.p
    public android.graphics.Typeface d(android.content.Context context, android.content.res.Resources resources, int i17, java.lang.String str, int i18) {
        try {
            android.graphics.fonts.Font build = new android.graphics.fonts.Font.Builder(resources, i17).build();
            return new android.graphics.Typeface.CustomFallbackBuilder(new android.graphics.fonts.FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // e3.p
    public k3.n f(k3.n[] nVarArr, int i17) {
        throw new java.lang.RuntimeException("Do not use this function in API 29 or later.");
    }

    public final android.graphics.fonts.Font g(android.graphics.fonts.FontFamily fontFamily, int i17) {
        android.graphics.fonts.FontStyle fontStyle = new android.graphics.fonts.FontStyle((i17 & 1) != 0 ? 700 : 400, (i17 & 2) != 0 ? 1 : 0);
        android.graphics.fonts.Font font = fontFamily.getFont(0);
        int h17 = h(fontStyle, font.getStyle());
        for (int i18 = 1; i18 < fontFamily.getSize(); i18++) {
            android.graphics.fonts.Font font2 = fontFamily.getFont(i18);
            int h18 = h(fontStyle, font2.getStyle());
            if (h18 < h17) {
                font = font2;
                h17 = h18;
            }
        }
        return font;
    }
}
