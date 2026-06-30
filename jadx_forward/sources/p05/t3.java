package p05;

/* loaded from: classes5.dex */
public final class t3 {
    public t3(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(java.lang.String name, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ui("ilinkres_c42c04f5", name);
        if (Ui == null) {
            return null;
        }
        int intValue = num != null ? num.intValue() : 0;
        if (Ui.f299123e >= intValue) {
            if (com.p314xaae8f345.mm.vfs.w6.j(Ui.m117639xfb83cc9b())) {
                return Ui.m117639xfb83cc9b();
            }
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeVisUDRService", "Resource version unmatched, name: " + name + ", curVer: " + Ui.f299123e + ", requiredVer: " + intValue);
        return null;
    }
}
