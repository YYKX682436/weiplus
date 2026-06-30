package uw5;

/* loaded from: classes8.dex */
public final class c {
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.lang.String tag, java.lang.String format, java.lang.Object... obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b(format, java.util.Arrays.copyOf(obj, obj.length)));
    }

    public final java.lang.String b(java.lang.String str, java.lang.Object... objArr) {
        return objArr.length == 0 ? str : java.lang.String.format(str, java.util.Arrays.copyOf(objArr, objArr.length));
    }
}
