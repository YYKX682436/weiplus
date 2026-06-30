package hc2;

/* loaded from: classes.dex */
public abstract class y0 {
    public static final java.lang.String a(long j17, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (j17 < 3600000) {
            return "";
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        if (currentTimeMillis < 600000) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573592f34);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return string;
        }
        if (600000 <= currentTimeMillis && currentTimeMillis < 3600000) {
            java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573593f35, java.lang.Long.valueOf(currentTimeMillis / 60000));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            return string2;
        }
        if (3600000 <= currentTimeMillis && currentTimeMillis < 86400000) {
            java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573591f33, java.lang.Long.valueOf(currentTimeMillis / 3600000));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            return string3;
        }
        if (86400000 <= currentTimeMillis && currentTimeMillis < 604800000) {
            long j18 = currentTimeMillis / 86400000;
            java.lang.String string4 = j18 == 1 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f38) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573590f32, java.lang.Long.valueOf(j18));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string4);
            return string4;
        }
        if (604800000 <= currentTimeMillis && currentTimeMillis < 2592000000L) {
            java.lang.String string5 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f37, java.lang.Long.valueOf(currentTimeMillis / 604800000));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
            return string5;
        }
        if (!(2592000000L <= currentTimeMillis && currentTimeMillis < 31536000000L)) {
            return "";
        }
        java.lang.String string6 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573594f36, java.lang.Long.valueOf(currentTimeMillis / 2592000000L));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string6, "getString(...)");
        return string6;
    }
}
