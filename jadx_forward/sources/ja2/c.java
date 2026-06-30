package ja2;

/* loaded from: classes.dex */
public final class c {
    public final void a(r45.f96 location, int i17, int i18, java.lang.Long l17, java.lang.String str, boolean z17, r45.qt2 qt2Var, yz5.l onSucceed, yz5.a onFailed) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSucceed, "onSucceed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onFailed, "onFailed");
        java.lang.String m75945x2fec8307 = location.m75945x2fec8307(5);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        java.lang.String str2 = m75945x2fec8307;
        if (!(str2.length() == 0)) {
            new db2.j2(str2, i17, i18, l17, str, z17, qt2Var).l().h(new ja2.a(onSucceed, onFailed, str2, location, i17, i18));
            return;
        }
        r45.c35 c35Var = new r45.c35();
        c35Var.set(6, location.m75945x2fec8307(4));
        c35Var.set(4, location.m75945x2fec8307(3));
        c35Var.set(2, java.lang.Long.valueOf(i17));
        c35Var.set(3, java.lang.Long.valueOf(i18));
        c35Var.set(11, java.lang.Float.valueOf(location.m75938x746dc8a6(1)));
        c35Var.set(12, java.lang.Float.valueOf(location.m75938x746dc8a6(0)));
        onSucceed.mo146xb9724478(c35Var);
    }
}
