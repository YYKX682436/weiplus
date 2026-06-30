package org.p3343x72743996.net.p3358x316220;

/* renamed from: org.chromium.net.impl.NativeCronetEngineBuilderWithLibraryLoaderImpl */
/* loaded from: classes13.dex */
public class C29621x2ebb8843 extends org.p3343x72743996.net.p3358x316220.C29620x75649445 {

    /* renamed from: mLibraryLoader */
    private org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.LibraryLoader f74800xe3729141;

    public C29621x2ebb8843(android.content.Context context) {
        super(context);
    }

    @Override // org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c
    /* renamed from: libraryLoader */
    public org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.LibraryLoader mo154053x886488ae() {
        return this.f74800xe3729141;
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29620x75649445, org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c, org.p3343x72743996.net.AbstractC29520xf01d5733
    /* renamed from: setLibraryLoader */
    public org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c mo153260xd89aab6c(org.p3343x72743996.net.AbstractC29500x62bc147f.Builder.LibraryLoader libraryLoader) {
        this.f74800xe3729141 = new org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.LibraryLoader(libraryLoader);
        return this;
    }
}
