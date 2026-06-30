package com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd;

/* loaded from: classes11.dex */
public final class d implements yq5.h {

    /* renamed from: d, reason: collision with root package name */
    public final yq5.k f296461d;

    /* renamed from: e, reason: collision with root package name */
    public final yq5.f f296462e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f296463f;

    /* renamed from: g, reason: collision with root package name */
    public java.io.BufferedInputStream f296464g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.BitmapRegionDecoder f296465h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f296466i;

    public d(yq5.k subsamplingImage, yq5.f imageSource, yq5.c cVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subsamplingImage, "subsamplingImage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageSource, "imageSource");
        this.f296461d = subsamplingImage;
        this.f296462e = imageSource;
        this.f296463f = jz5.h.b(new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.b(this));
        this.f296466i = jz5.h.b(new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.c(cVar, this));
    }

    public void a() {
        java.lang.Object m143895xf1229813;
        android.graphics.BitmapRegionDecoder newInstance;
        if (this.f296464g == null || this.f296465h == null) {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(((yq5.b) this.f296462e).f546122a);
            java.lang.String str = a17.f294812f;
            if (str != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            java.io.InputStream D = com.p314xaae8f345.mm.vfs.w6.D(a17, com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D, "openRead(...)");
            java.io.BufferedInputStream bufferedInputStream = D instanceof java.io.BufferedInputStream ? (java.io.BufferedInputStream) D : new java.io.BufferedInputStream(D, 8192);
            this.f296464g = bufferedInputStream;
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    newInstance = android.graphics.BitmapRegionDecoder.newInstance(bufferedInputStream);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(newInstance);
                } else {
                    newInstance = android.graphics.BitmapRegionDecoder.newInstance((java.io.InputStream) bufferedInputStream, false);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(newInstance);
                }
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(newInstance);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            if (!p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(m143895xf1229813);
                this.f296465h = (android.graphics.BitmapRegionDecoder) m143895xf1229813;
                return;
            }
            try {
                bufferedInputStream.close();
            } catch (java.lang.RuntimeException e17) {
                throw e17;
            } catch (java.lang.Exception unused) {
            }
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m143898xd4a2fc34);
            throw m143898xd4a2fc34;
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        android.graphics.BitmapRegionDecoder bitmapRegionDecoder = this.f296465h;
        if (bitmapRegionDecoder != null) {
            bitmapRegionDecoder.recycle();
        }
        java.io.BufferedInputStream bufferedInputStream = this.f296464g;
        if (bufferedInputStream != null) {
            try {
                bufferedInputStream.close();
            } catch (java.lang.RuntimeException e17) {
                throw e17;
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* renamed from: equals */
    public boolean m83900xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.d.class != obj.getClass()) {
            return false;
        }
        com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.d dVar = (com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f296461d, dVar.f296461d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f296462e, dVar.f296462e);
    }

    /* renamed from: hashCode */
    public int m83901x8cdac1b() {
        return (this.f296461d.m177527x8cdac1b() * 31) + this.f296462e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m83902x9616526c() {
        return "AndroidRegionDecoder(subsamplingImage=" + this.f296461d + ", imageSource=" + this.f296462e + ')';
    }
}
