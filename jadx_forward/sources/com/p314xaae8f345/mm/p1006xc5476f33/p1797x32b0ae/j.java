package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae;

/* loaded from: classes.dex */
public final class j implements kd.a {
    @Override // kd.a
    public void d(java.lang.String str, java.lang.String format, java.lang.Object... objects) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objects, "objects");
        if (objects.length == 0) {
            return;
        }
        java.lang.String.format(format, java.util.Arrays.copyOf(objects, objects.length));
    }

    @Override // kd.a
    public void e(java.lang.String str, java.lang.String format, java.lang.Object... objects) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objects, "objects");
        if (objects.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, format);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, java.lang.String.format(format, java.util.Arrays.copyOf(objects, objects.length)));
        }
    }

    @Override // kd.a
    public void i(java.lang.String str, java.lang.String format, java.lang.Object... objects) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objects, "objects");
        if (objects.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, format);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, java.lang.String.format(format, java.util.Arrays.copyOf(objects, objects.length)));
        }
    }

    @Override // kd.a
    public void v(java.lang.String str, java.lang.String format, java.lang.Object... objects) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objects, "objects");
        if (objects.length == 0) {
            return;
        }
        java.lang.String.format(format, java.util.Arrays.copyOf(objects, objects.length));
    }

    @Override // kd.a
    public void w(java.lang.String str, java.lang.String format, java.lang.Object... objects) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objects, "objects");
        if (objects.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, format);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, java.lang.String.format(format, java.util.Arrays.copyOf(objects, objects.length)));
        }
    }
}
