package x5;

/* loaded from: classes14.dex */
public final class c implements x5.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f533475a;

    public c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f533475a = context;
    }

    @Override // x5.g
    public boolean a(java.lang.Object obj) {
        android.net.Uri data = (android.net.Uri) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(data.getScheme(), "content");
    }

    @Override // x5.g
    public java.lang.Object b(s5.a aVar, java.lang.Object obj, p135x2eae8f.p138x35e001.AbstractC1421x275421 abstractC1421x275421, v5.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.io.InputStream openInputStream;
        android.net.Uri data = (android.net.Uri) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        boolean z17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(data.getAuthority(), "com.android.contacts") && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(data.getLastPathSegment(), "display_photo");
        android.content.Context context = this.f533475a;
        if (z17) {
            android.content.res.AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(data, "r");
            openInputStream = openAssetFileDescriptor == null ? null : openAssetFileDescriptor.createInputStream();
            if (openInputStream == null) {
                throw new java.lang.IllegalStateException(("Unable to find a contact photo associated with '" + data + "'.").toString());
            }
        } else {
            openInputStream = context.getContentResolver().openInputStream(data);
            if (openInputStream == null) {
                throw new java.lang.IllegalStateException(("Unable to open '" + data + "'.").toString());
            }
        }
        return new x5.n(x36.v.b(x36.v.f(openInputStream)), context.getContentResolver().getType(data), v5.d.DISK);
    }

    @Override // x5.g
    public java.lang.String c(java.lang.Object obj) {
        android.net.Uri data = (android.net.Uri) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String uri = data.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uri, "data.toString()");
        return uri;
    }
}
