package androidx.camera.extensions;

/* loaded from: classes14.dex */
public final /* synthetic */ class ExtensionsInfo$$a implements androidx.camera.extensions.VendorExtenderFactory {
    @Override // androidx.camera.extensions.VendorExtenderFactory
    public final androidx.camera.extensions.internal.VendorExtender createVendorExtender(int i17) {
        androidx.camera.extensions.internal.VendorExtender vendorExtender;
        vendorExtender = androidx.camera.extensions.ExtensionsInfo.getVendorExtender(i17);
        return vendorExtender;
    }
}
