package org.p3363xbe4143f1;

/* renamed from: org.libpag.PAGFile */
/* loaded from: classes13.dex */
public class C29690xfae77312 extends org.p3363xbe4143f1.C29687x78413754 {

    /* renamed from: org.libpag.PAGFile$LoadListener */
    /* loaded from: classes13.dex */
    public interface LoadListener {
        /* renamed from: onLoad */
        void m154741xc39c3f65(org.p3363xbe4143f1.C29690xfae77312 c29690xfae77312);
    }

    static {
        b56.a.a("pag");
        m154723xb90145c7();
    }

    private C29690xfae77312(long j17) {
        super(j17);
    }

    /* renamed from: Load */
    public static org.p3363xbe4143f1.C29690xfae77312 m154716x243906(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str) && (str.startsWith("http://") || str.startsWith("https://"))) {
            byte[] a17 = org.p3363xbe4143f1.b.a(str);
            if (a17 == null) {
                return null;
            }
            return m154720x76efa07b(a17, a17.length, str);
        }
        return m154721xc1e4215(str);
    }

    /* renamed from: LoadAsync */
    public static void m154718xc89e8d16(final java.lang.String str, final org.p3363xbe4143f1.C29690xfae77312.LoadListener loadListener) {
        org.p3363xbe4143f1.C29685x2fd7f25c.Run(new java.lang.Runnable() { // from class: org.libpag.PAGFile$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.p3363xbe4143f1.C29690xfae77312.a(str, loadListener);
            }
        });
    }

    /* renamed from: LoadFromAssets */
    private static native org.p3363xbe4143f1.C29690xfae77312 m154719x64fa9573(android.content.res.AssetManager assetManager, java.lang.String str);

    /* renamed from: LoadFromBytes */
    private static native org.p3363xbe4143f1.C29690xfae77312 m154720x76efa07b(byte[] bArr, int i17, java.lang.String str);

    /* renamed from: LoadFromPath */
    private static native org.p3363xbe4143f1.C29690xfae77312 m154721xc1e4215(java.lang.String str);

    /* renamed from: MaxSupportedTagLevel */
    public static native int m154722x8de509f4();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(java.lang.String str, org.p3363xbe4143f1.C29690xfae77312.LoadListener loadListener) {
        org.p3363xbe4143f1.C29690xfae77312 m154716x243906 = m154716x243906(str);
        if (loadListener != null) {
            loadListener.m154741xc39c3f65(m154716x243906);
        }
    }

    /* renamed from: nativeInit */
    private static final native void m154723xb90145c7();

    /* renamed from: copyOriginal */
    public native org.p3363xbe4143f1.C29690xfae77312 m154724xd3635866();

    /* renamed from: getEditableIndices */
    public native int[] m154725x315b0e6d(int i17);

    /* renamed from: getLayersByEditableIndex */
    public native org.p3363xbe4143f1.C29697x62580a7b[] m154726x11cb1a5f(int i17, int i18);

    /* renamed from: getTextData */
    public native org.p3363xbe4143f1.C29704xfaedc2c3 m154727x400087ed(int i17);

    /* renamed from: nativeReplaceImage */
    public native void m154728x721dd0be(int i17, long j17);

    /* renamed from: nativeReplaceImageByName */
    public native void m154729x72cfade0(java.lang.String str, long j17);

    /* renamed from: numImages */
    public native int m154730x3817dd9e();

    /* renamed from: numTexts */
    public native int m154731x8eca0900();

    /* renamed from: numVideos */
    public native int m154732x4e0fd67e();

    /* renamed from: path */
    public native java.lang.String m154733x346425();

    /* renamed from: replaceImage */
    public void m154734x1a429707(int i17, org.p3363xbe4143f1.C29693x6232de85 c29693x6232de85) {
        if (c29693x6232de85 == null) {
            m154728x721dd0be(i17, 0L);
        } else {
            m154728x721dd0be(i17, c29693x6232de85.f75015xffae8598);
        }
    }

    /* renamed from: replaceImageByName */
    public void m154735x976ed969(java.lang.String str, org.p3363xbe4143f1.C29693x6232de85 c29693x6232de85) {
        if (c29693x6232de85 == null) {
            m154729x72cfade0(str, 0L);
        } else {
            m154729x72cfade0(str, c29693x6232de85.f75015xffae8598);
        }
    }

    /* renamed from: replaceText */
    public native void m154736x19a3f201(int i17, org.p3363xbe4143f1.C29704xfaedc2c3 c29704xfaedc2c3);

    /* renamed from: setDuration */
    public native void m154737xffd6ec16(long j17);

    /* renamed from: setTimeStretchMode */
    public native void m154738xae5a7879(int i17);

    /* renamed from: tagLevel */
    public native int m154739xd1669c0a();

    /* renamed from: timeStretchMode */
    public native int m154740x93220d3b();

    /* renamed from: Load */
    public static org.p3363xbe4143f1.C29690xfae77312 m154717x243906(byte[] bArr) {
        return m154720x76efa07b(bArr, bArr.length, "");
    }

    /* renamed from: Load */
    public static org.p3363xbe4143f1.C29690xfae77312 m154715x243906(android.content.res.AssetManager assetManager, java.lang.String str) {
        return m154719x64fa9573(assetManager, str);
    }
}
