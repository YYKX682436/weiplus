package st3;

/* loaded from: classes10.dex */
public final class b implements gt0.a {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f494053d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea f494054e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f494055f;

    public b(com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d recordVideoTransPara, com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea previewPlugin, java.lang.String videoPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordVideoTransPara, "recordVideoTransPara");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewPlugin, "previewPlugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        this.f494053d = recordVideoTransPara;
        this.f494054e = previewPlugin;
        this.f494055f = videoPath;
    }

    @Override // gt0.a
    public boolean g() {
        return false;
    }

    @Override // gt0.a
    /* renamed from: getCameraPreviewView */
    public et0.q mo54891x9333e172() {
        return this.f494054e;
    }

    @Override // gt0.a
    /* renamed from: getContext */
    public android.content.Context mo132348x76847179() {
        android.content.Context context = this.f494054e.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return context;
    }

    @Override // gt0.a
    /* renamed from: getEncodeConfig */
    public ct0.a mo54894x11cfd76e() {
        return new st3.a(this);
    }

    @Override // gt0.d
    /* renamed from: getRecordScene */
    public int mo54898x27ac0d85() {
        return 9;
    }

    @Override // gt0.d
    /* renamed from: getResolutionLimit */
    public int mo54901x6fcd4039() {
        return st3.t.f494134e ? st3.t.f494132c : this.f494053d.f152724d;
    }

    @Override // gt0.a
    /* renamed from: getVideoTransPara */
    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d mo54902x402de963() {
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d;
        if (st3.t.f494134e && (c11120x15dce88d = st3.t.f494131b) != null) {
            int i17 = c11120x15dce88d.f152724d;
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d2 = this.f494053d;
            if (i17 != c11120x15dce88d2.f152724d || c11120x15dce88d.f152725e != c11120x15dce88d2.f152725e) {
                c11120x15dce88d2.f152724d = i17;
                c11120x15dce88d2.f152725e = c11120x15dce88d.f152725e;
            }
        }
        return this.f494053d;
    }
}
