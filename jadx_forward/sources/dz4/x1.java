package dz4;

/* loaded from: classes12.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final ih0.p f326984a;

    /* renamed from: b, reason: collision with root package name */
    public dz4.k0 f326985b;

    public x1(ih0.p holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        this.f326984a = holder;
    }

    public final android.net.Uri a(android.content.Context context, java.lang.String str) {
        try {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.a(context, new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str)));
        } catch (java.lang.IllegalArgumentException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeNoteFlutterFileHelper", "safeGetUriForExportableFile, warning for path: " + str, e17);
            return null;
        }
    }
}
