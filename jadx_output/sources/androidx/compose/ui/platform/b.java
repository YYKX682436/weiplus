package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public abstract class b implements androidx.compose.ui.platform.g {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f10511a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f10512b = new int[2];

    public final int[] c(int i17, int i18) {
        if (i17 < 0 || i18 < 0 || i17 == i18) {
            return null;
        }
        int[] iArr = this.f10512b;
        iArr[0] = i17;
        iArr[1] = i18;
        return iArr;
    }

    public final java.lang.String d() {
        java.lang.String str = this.f10511a;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
        throw null;
    }
}
