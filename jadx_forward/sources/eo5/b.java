package eo5;

/* loaded from: classes10.dex */
public final class b extends h.b {
    @Override // h.b
    public android.content.Intent a(android.content.Context context, java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent();
        if (str == null) {
            str = "";
        }
        intent.putExtra("kintent_talker", str);
        intent.putExtra("key_media_type", 2);
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 3);
        intent.setClassName(context, "com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI");
        return intent;
    }

    @Override // h.b
    public java.lang.Object c(int i17, android.content.Intent intent) {
        if (i17 == -1 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1);
            java.lang.String stringExtra2 = intent.getStringExtra("fileExt");
            java.lang.String stringExtra3 = intent.getStringExtra(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207);
            if (stringExtra != null && stringExtra2 != null && stringExtra3 != null) {
                return new jz5.o(stringExtra, stringExtra2, stringExtra3);
            }
        }
        return null;
    }
}
