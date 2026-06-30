package cc1;

/* loaded from: classes7.dex */
public final class n extends java.lang.Exception {

    /* renamed from: d, reason: collision with root package name */
    public final jc1.d f121971d;

    public n(jc1.d errorInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorInfo, "errorInfo");
        this.f121971d = errorInfo;
    }

    public n(int i17, java.lang.String str) {
        this(new jc1.d(i17, str));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(jc1.d errorInfo, java.lang.String errMsg) {
        this(new jc1.d(errorInfo.f380436a, errMsg));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorInfo, "errorInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
    }
}
