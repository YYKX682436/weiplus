package ku4;

/* loaded from: classes7.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final ku4.c f394041d = new ku4.c();

    @Override // java.lang.Runnable
    public final void run() {
        ku4.i iVar = ku4.i.f394047a;
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList((java.util.LinkedList) ((jz5.n) ku4.i.f394048b).mo141623x754a37bb());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebCanvasPackageDownManager", "init appId size = " + linkedList.size());
        for (java.lang.String str : linkedList) {
            ku4.i iVar2 = ku4.i.f394047a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 a17 = iVar2.a(str, 0);
            if (a17 != null) {
                iVar2.b(str, a17.f67185x8987ca93);
                int o17 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) ku4.i.f394049c).mo141623x754a37bb()).o("LastUseVersion_".concat(str), a17.f67185x8987ca93);
                if (!(o17 == a17.f67185x8987ca93)) {
                    iVar2.b(str, o17);
                }
            }
        }
    }
}
