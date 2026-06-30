package qk;

/* loaded from: classes2.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f445545a;

    /* renamed from: b, reason: collision with root package name */
    public final bw5.g80 f445546b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f445547c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f445548d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View.OnClickListener f445549e;

    public aa(android.app.Activity context, bw5.g80 listenLikeRequest, boolean z17, java.lang.String str, android.view.View.OnClickListener onClickListener, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 4) != 0 ? false : z17;
        str = (i17 & 8) != 0 ? null : str;
        onClickListener = (i17 & 16) != 0 ? null : onClickListener;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenLikeRequest, "listenLikeRequest");
        this.f445545a = context;
        this.f445546b = listenLikeRequest;
        this.f445547c = z17;
        this.f445548d = str;
        this.f445549e = onClickListener;
    }

    /* renamed from: equals */
    public boolean m160284xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk.aa)) {
            return false;
        }
        qk.aa aaVar = (qk.aa) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f445545a, aaVar.f445545a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f445546b, aaVar.f445546b) && this.f445547c == aaVar.f445547c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f445548d, aaVar.f445548d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f445549e, aaVar.f445549e);
    }

    /* renamed from: hashCode */
    public int m160285x8cdac1b() {
        int hashCode = ((((this.f445545a.hashCode() * 31) + this.f445546b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f445547c)) * 31;
        java.lang.String str = this.f445548d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        android.view.View.OnClickListener onClickListener = this.f445549e;
        return hashCode2 + (onClickListener != null ? onClickListener.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m160286x9616526c() {
        return "TingLikeMusicRequest(context=" + this.f445545a + ", listenLikeRequest=" + this.f445546b + ", showSuccessToast=" + this.f445547c + ", successToastWording=" + this.f445548d + ", sucessToastJumpDetailClickListener=" + this.f445549e + ')';
    }
}
