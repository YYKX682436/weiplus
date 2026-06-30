package td4;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final td4.a f499162a = new td4.a();

    public final void a(android.content.Context context, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showReachLimitAlert", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerAlert");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String str = null;
        if (i17 == 11) {
            android.content.res.Resources resources = context.getResources();
            if (resources != null) {
                str = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j99, java.lang.String.valueOf(i18));
            }
        } else {
            android.content.res.Resources resources2 = context.getResources();
            if (resources2 != null) {
                str = resources2.getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571225a2, i18, java.lang.Integer.valueOf(i18));
            }
        }
        db5.e1.T(context, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showReachLimitAlert", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerAlert");
    }
}
