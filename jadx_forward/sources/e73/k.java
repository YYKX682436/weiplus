package e73;

/* loaded from: classes15.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public int f331485a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.Collection f331486b;

    public k(int i17, java.util.Collection items, long j17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 1) != 0 ? 0 : i17;
        items = (i18 & 2) != 0 ? kz5.p0.f395529d : items;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        this.f331485a = i17;
        this.f331486b = items;
    }

    public final java.lang.String a(java.lang.String deviceId, java.lang.String networkStatus, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(networkStatus, "networkStatus");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<handofflist opcode=\"");
        sb6.append(this.f331485a);
        sb6.append("\" seq=\"<![CSEQ]>\" devicevirtualid=\"");
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(deviceId.getBytes()));
        sb6.append("\" networkstatus=\"");
        java.lang.String lowerCase = networkStatus.toLowerCase();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        sb6.append(lowerCase);
        sb6.append("\" availablecount=\"");
        sb6.append(i17);
        sb6.append("\">");
        java.lang.String sb7 = sb6.toString();
        java.nio.charset.Charset charset = r26.c.f450398a;
        byte[] bytes = sb7.getBytes(charset);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        int length = bytes.length;
        byte[] bytes2 = "</handofflist>".getBytes(charset);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
        int length2 = length + bytes2.length;
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        java.util.Iterator it = this.f331486b.iterator();
        while (it.hasNext()) {
            java.lang.String m65020x59bc66e = ((com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260) it.next()).m65020x59bc66e();
            byte[] bytes3 = m65020x59bc66e.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes3, "getBytes(...)");
            length2 += bytes3.length;
            if (length2 > i18) {
                break;
            }
            sb8.append(m65020x59bc66e);
        }
        return sb7 + '\n' + ((java.lang.Object) sb8) + "\n</handofflist>";
    }
}
