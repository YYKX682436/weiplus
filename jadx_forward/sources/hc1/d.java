package hc1;

/* loaded from: classes7.dex */
public final class d extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o0 {

    /* renamed from: CTRL_INDEX */
    private static final int f69824x366c91de = 1505;

    /* renamed from: NAME */
    public static final java.lang.String f69825x24728b = "onGetSmiley";

    public final void x(java.lang.String emoticonText, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 service) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emoticonText, "emoticonText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        if (service.mo50262x39e05d35()) {
            java.util.HashMap hashMap = new java.util.HashMap(2);
            hashMap.put("errMsg", "ok");
            hashMap.put("smiley", emoticonText);
            t(hashMap);
            u(service);
            m();
        }
    }
}
