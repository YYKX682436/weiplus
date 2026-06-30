package com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/tencent/pigeon/settings/FlutterError;", "", "code", "", com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "details", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getCode", "()Ljava/lang/String;", "getDetails", "()Ljava/lang/Object;", "getMessage", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.settings.FlutterError */
/* loaded from: classes11.dex */
public final class C24734x7709af6c extends java.lang.Throwable {
    private final java.lang.String code;
    private final java.lang.Object details;
    private final java.lang.String message;

    public /* synthetic */ C24734x7709af6c(java.lang.String str, java.lang.String str2, java.lang.Object obj, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, (i17 & 2) != 0 ? null : str2, (i17 & 4) != 0 ? null : obj);
    }

    public final java.lang.String getCode() {
        return this.code;
    }

    public final java.lang.Object getDetails() {
        return this.details;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        return this.message;
    }

    public C24734x7709af6c(java.lang.String code, java.lang.String str, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(code, "code");
        this.code = code;
        this.message = str;
        this.details = obj;
    }
}
