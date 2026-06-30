package b12;

/* loaded from: classes4.dex */
public final class a extends java.lang.Exception {

    /* renamed from: d, reason: collision with root package name */
    public final int f17037d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.protobuf.f f17038e;

    public a(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar) {
        super("Cgi exception: errorType=" + i17 + ", errorCode=" + i18 + ", message=" + str);
        this.f17037d = i18;
        this.f17038e = fVar;
    }
}
