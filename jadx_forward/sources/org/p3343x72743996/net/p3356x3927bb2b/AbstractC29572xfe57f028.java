package org.p3343x72743996.net.p3356x3927bb2b;

/* renamed from: org.chromium.net.apihelpers.InMemoryTransformCronetCallback */
/* loaded from: classes7.dex */
public abstract class AbstractC29572xfe57f028<T> extends org.p3343x72743996.net.p3356x3927bb2b.AbstractC29571x6b0776f {

    /* renamed from: CONTENT_LENGTH_HEADER_NAME */
    private static final java.lang.String f74364x681bd6ca = "Content-Length";

    /* renamed from: MAX_ARRAY_SIZE */
    private static final int f74365x3b510c22 = 2147483639;

    /* renamed from: mListeners */
    private final java.util.Set<org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442<? super T>> f74366x32131c52 = new java.util.LinkedHashSet();

    /* renamed from: mResponseBodyChannel */
    private java.nio.channels.WritableByteChannel f74367xdc74053;

    /* renamed from: mResponseBodyStream */
    private java.io.ByteArrayOutputStream f74368xbebe230;

    /* renamed from: getBodyLength */
    private static long m153732xd844d71e(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e) {
        java.util.List<java.lang.String> list = abstractC29564x6974077e.mo153680x70925e9b().get(f74364x681bd6ca);
        if (list == null || list.size() != 1) {
            return -1L;
        }
        try {
            return java.lang.Long.parseLong(list.get(0));
        } catch (java.lang.NumberFormatException unused) {
            return -1L;
        }
    }

    /* renamed from: addCompletionListener */
    public org.p3343x72743996.net.p3356x3927bb2b.AbstractC29571x6b0776f mo153714x45901f31(org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442<? super T> interfaceC29569x80e9f442) {
        this.f74366x32131c52.add(interfaceC29569x80e9f442);
        return this;
    }

    @Override // org.p3343x72743996.net.p3356x3927bb2b.AbstractC29571x6b0776f
    /* renamed from: onBodyChunkRead */
    public final void mo49578x67a67282(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, java.nio.ByteBuffer byteBuffer) {
        this.f74367xdc74053.write(byteBuffer);
    }

    @Override // org.p3343x72743996.net.p3356x3927bb2b.AbstractC29571x6b0776f
    /* renamed from: onCanceled */
    public final void mo49579x9dc2a798(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e) {
        java.util.Iterator<org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442<? super T>> it = this.f74366x32131c52.iterator();
        while (it.hasNext()) {
            it.next().mo49258x9dc2a798(abstractC29564x6974077e);
        }
    }

    @Override // org.p3343x72743996.net.p3356x3927bb2b.AbstractC29571x6b0776f
    /* renamed from: onFailed */
    public final void mo49580x428b6afc(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, org.p3343x72743996.net.AbstractC29501x119930f2 abstractC29501x119930f2) {
        java.util.Iterator<org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442<? super T>> it = this.f74366x32131c52.iterator();
        while (it.hasNext()) {
            it.next().mo49259x428b6afc(abstractC29564x6974077e, abstractC29501x119930f2);
        }
    }

    @Override // org.p3343x72743996.net.p3356x3927bb2b.AbstractC29571x6b0776f
    /* renamed from: onResponseStarted */
    public final void mo49581x5d21f921(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e) {
        long m153732xd844d71e = m153732xd844d71e(abstractC29564x6974077e);
        if (m153732xd844d71e > 2147483639) {
            throw new java.lang.IllegalArgumentException("The body is too large and wouldn't fit in a byte array!");
        }
        if (m153732xd844d71e >= 0) {
            this.f74368xbebe230 = new java.io.ByteArrayOutputStream((int) m153732xd844d71e);
        } else {
            this.f74368xbebe230 = new java.io.ByteArrayOutputStream();
        }
        this.f74367xdc74053 = java.nio.channels.Channels.newChannel(this.f74368xbebe230);
    }

    @Override // org.p3343x72743996.net.p3356x3927bb2b.AbstractC29571x6b0776f
    /* renamed from: onSucceeded */
    public final void mo49582x3688ff42(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e) {
        T mo153715xf8d119dd = mo153715xf8d119dd(abstractC29564x6974077e, this.f74368xbebe230.toByteArray());
        java.util.Iterator<org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442<? super T>> it = this.f74366x32131c52.iterator();
        while (it.hasNext()) {
            it.next().mo49260x3688ff42(abstractC29564x6974077e, mo153715xf8d119dd);
        }
    }

    /* renamed from: transformBodyBytes */
    public abstract T mo153715xf8d119dd(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, byte[] bArr);
}
