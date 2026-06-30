package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9;

/* loaded from: classes5.dex */
public class t implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f256781a;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l lVar, java.lang.ref.WeakReference weakReference) {
        this.f256781a = weakReference;
    }

    @Override // k70.f0
    public void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        android.content.Context context = (android.content.Context) this.f256781a.get();
        if (context == null || android.text.TextUtils.isEmpty(str2) || !com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_kemdia_path", str2);
        intent.putExtra("KFilterId", -1);
        intent.putExtra("Ksnsupload_source", 1);
        intent.putExtra("KBlockAdd", true);
        j45.l.j(context, "sns", ".ui.SnsUploadUI", intent, null);
    }
}
